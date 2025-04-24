package excersises_week_preparation.leetcode

import java.math.BigInteger

fun main() {
    /*val l11 = ListNode(9)
    val l12 = ListNode(9)
    val l13 = ListNode(9)
    val l14 = ListNode(9)
    val l15 = ListNode(9)
    val l16 = ListNode(9)
    val l17 = ListNode(9)
    l11.next = l12
    l12.next = l13
    l13.next = l14
    l14.next = l15
    l15.next = l16
    l16.next = l17

    val l21 = ListNode(9)
    val l22 = ListNode(9)
    val l23 = ListNode(9)
    val l24 = ListNode(9)
    l21.next = l22
    l22.next = l23
    l23.next = l24*/

    val l11 = ListNode(5)
    val l21 = ListNode(5)

    var res1 = addTwoNumbersTwo(l11, l21)
    while (res1 != null) {
        print(res1.`val`)
        res1 = res1.next
    }
    println()
    var res2 = addTwoNumbers(l11, l21)
    while (res2 != null) {
        print(res2.`val`)
        res2 = res2.next
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun addTwoNumbersTwo(l1: ListNode?, l2: ListNode?): ListNode? {
    var l1Aux = l1
    var l2Aux = l2
    var carry = 0

    var resNode: ListNode? = null
    var auxNode: ListNode? = null
    while (l1Aux != null || l2Aux != null) {
        var sum = (l1Aux?.`val` ?: 0) + (l2Aux?.`val` ?: 0)
        if (carry > 0) {
            sum += carry
        }
        carry = sum / 10

        val newNode = ListNode(sum % 10)

        l1Aux = l1Aux?.next
        l2Aux = l2Aux?.next

        when {
            resNode == null -> resNode = newNode
            auxNode == null -> {
                resNode.next = newNode
                auxNode = newNode
            }
            else -> {
                auxNode.next = newNode
                auxNode = newNode
            }
        }
        if (carry != 0 && l1Aux == null && l2Aux == null) {
            if (auxNode == null) {
                resNode.next = ListNode(carry)
            } else {
                auxNode.next = ListNode(carry)
            }
        }
    }

    return resNode
}

// NOT THE BEST
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val l1Number = getNumber(l1)
    val l2Number = getNumber(l2)
    val sum = l1Number + l2Number
    val res = sum.toString().reversed().split("").filter { it != "" }

    var resNode: ListNode? = null
    var auxNode: ListNode? = null

    for (num in res) {
        val newNode = ListNode(num.toInt())
        when {
            resNode == null -> resNode = newNode
            auxNode == null -> {
                resNode.next = newNode
                auxNode = newNode
            }
            else -> {
                auxNode.next = newNode
                auxNode = newNode
            }
        }
    }
    return resNode
}

fun getNumber(node: ListNode?): BigInteger {
    val lString: StringBuilder = StringBuilder()

    var auxNode = node
    while(auxNode != null) {
        lString.append(auxNode.`val`)
        auxNode = auxNode.next
    }
    return lString.reverse().toString().toBigInteger()
}