package dataStructuresExamples.tree

import excersises_week_preparation.challenge.row

typealias Visitor2<T> = (T) -> Unit

class BinaryNode<T>(val value: T) {
    var leftChild: BinaryNode<T>? = null
    var rightChild: BinaryNode<T>? = null

    override fun toString() = diagram(this)
    private fun diagram(
        node: BinaryNode<T>?,
        top: String = "",
        root: String = "",
        bottom: String = ""
    ): String {
        return node?.let {
            if (node.leftChild == null && node.rightChild == null) {
                "$root${node.value}\n"
            } else {
                diagram(node.rightChild, "$top ", "$top┌── ", "$top│ ") + root + "${node.value}\n" + diagram(node.leftChild, "$bottom│ ", "$bottom└──", "$bottom ")
            }
        } ?: "${root}null\n"
    }

    fun traverseInOrder(visitor2: Visitor2<T>) {
        leftChild?.traverseInOrder(visitor2)
        visitor2(value)
        rightChild?.traverseInOrder(visitor2)
    }

    fun traversePreOrder(visitor2: Visitor2<T>) {
        visitor2(value)
        leftChild?.traversePreOrder(visitor2)
        rightChild?.traversePreOrder(visitor2)
    }

    fun traversePostOrder(visitor2: Visitor2<T>) {
        leftChild?.traversePostOrder(visitor2)
        rightChild?.traversePostOrder(visitor2)
        visitor2(value)
    }
}