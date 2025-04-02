package excersises_week_preparation.leetcode

fun main() {
    /*val l11 = ListNode(1)
    val l12 = ListNode(2)
    val l13 = ListNode(4)
    l11.next = l12
    l12.next = l13

    val l21 = ListNode(1)
    val l22 = ListNode(3)
    val l23 = ListNode(4)
    l21.next = l22
    l22.next = l23*/

    val l11: ListNode? = null

    val l21 = ListNode(0)

    var res = mergeTwoLists(l11, l21)
    while (res != null) {
        println(res.`val`)
        res = res.next
    }
}

// BEST WAY TO RESOLVE
fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var resListNode: ListNode? = null
    var resAux: ListNode? = null

    var l1Aux = list1
    var l2Aux = list2
    while (l1Aux != null || l2Aux != null) {
        val num1 = l1Aux?.`val` ?: Int.MAX_VALUE
        val num2 = l2Aux?.`val` ?: Int.MAX_VALUE

        val newNode = if (num1 <= num2) {
            l1Aux = l1Aux?.next
            ListNode(num1)
        } else {
            l2Aux = l2Aux?.next
            ListNode(num2)
        }

        if (resListNode == null) {
            resListNode = newNode
            resAux = resListNode
        } else {
            resAux?.next = newNode
            resAux = newNode
        }
    }
    return resListNode
}

// NOT THE BETTER WAY TO RESOLVE
/*fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var resListNode: ListNode? = null
    var resAux: ListNode? = null

    var l1Aux = list1
    var l2Aux = list2
    while (l1Aux != null || l2Aux != null) {
        var newNode1: ListNode? = null
        var newNode2: ListNode? = null

        val num1 = l1Aux?.`val` ?: Int.MAX_VALUE
        val num2 = l2Aux?.`val` ?: Int.MAX_VALUE
        if (num1 == num2) {
            l1Aux = l1Aux?.next
            l2Aux = l2Aux?.next
            newNode1 = ListNode(num1)
            newNode2 = ListNode(num2)
        } else if (num1 > num2) {
            l2Aux = l2Aux?.next
            newNode2 = ListNode(num2)
        } else {
            l1Aux = l1Aux?.next
            newNode1 = ListNode(num1)
        }
        when {
            resListNode == null -> {
                when {
                    newNode1 != null && newNode2 == null -> {
                        resListNode = newNode1
                    }
                    newNode1 == null && newNode2 != null -> {
                        resListNode = newNode2
                    }
                    else -> {
                        newNode1?.next = newNode2
                        resListNode = newNode1
                        resAux = newNode2
                    }
                }
            }
            resAux == null -> {
                when {
                    newNode1 != null && newNode2 == null -> {
                        resListNode.next = newNode1
                        resAux = newNode1
                    }
                    newNode1 == null && newNode2 != null -> {
                        resListNode.next = newNode2
                        resAux = newNode2
                    }
                    else -> {
                        newNode1?.next = newNode2
                        resListNode.next = newNode1
                        resAux = newNode2
                    }
                }

            }
            else -> {
                when {
                    newNode1 != null && newNode2 == null -> {
                        resAux.next = newNode1
                        resAux = newNode1
                    }
                    newNode1 == null && newNode2 != null -> {
                        resAux.next = newNode2
                        resAux = newNode2
                    }
                    else -> {
                        newNode1?.next = newNode2
                        resAux.next = newNode1
                        resAux = newNode2
                    }
                }
            }
        }
    }
    return resListNode
}*/

// WOST WAY TO RESOLVE
/*fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    fun getNumbers(list: ListNode?): ArrayList<Int> {
        val res = arrayListOf<Int>()
        var auxList = list
        while (auxList != null) {
            res.add(auxList.`val`)
            auxList = auxList.next
        }
        return res
    }

    val l1Array = getNumbers(list1)
    val l2Array = getNumbers(list2)

    l1Array.addAll(l2Array)

    if (l1Array.isEmpty()) return null

    l1Array.sort()

    var resListNode: ListNode? = null
    var aux: ListNode? = null

    for (num in l1Array) {
        if (resListNode == null) {
            resListNode = ListNode(num)
            aux = resListNode
            continue
        }
        aux?.next = ListNode(num)
        aux = aux?.next
    }
    return resListNode
}*/