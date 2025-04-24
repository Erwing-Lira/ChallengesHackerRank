package dataStructuresExamples.linkedList

import excersises_week_preparation.leetcode.twoSumTwo

fun main() {
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)

    node1.next = node2
    node2.next = node3

    println(node1)

    val list = LinkedList<Int>()
    list.push(3).push(2).push(1)

    println(list)

    list.append(0)
    println(list)

    val node = list.nodeAt(1)!!
    list.insert(1, node)
    println(list)

    val resPop = list.pop()
    println(resPop)
    println(list)

    val resRemoveLast = list.removeLast()
    println(resRemoveLast)
    println(list)

    val nodeRemove = list.nodeAt(1)
    val resRemoveAfter = list.removeAfter(nodeRemove!!)
    println(resRemoveAfter)
    println(list)

    for (item in list) {
        println("Double: ${item}")
    }

}