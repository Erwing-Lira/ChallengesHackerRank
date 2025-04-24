package dataStructuresExamples.tree

import kotlin.math.max

class AVLNode<T> {
    var leftChild: AVLNode<T>? = null
    var rightChild: AVLNode<T>? = null

    var height = 0

    val leftHeight: Int
        get() = leftChild?.height ?: -1
    val rightHeight: Int
        get() = rightChild?.height ?: -1
    val balanceFactor: Int
        get() = leftHeight - rightHeight

    private fun leftRotate(node: AVLNode<T>): AVLNode<T> {
        val pivot = node.rightChild!!

        node.rightChild = pivot.leftChild

        pivot.leftChild = node

        node.height = max(node.leftHeight, node.rightHeight) + 1
        pivot.height = max(pivot.leftHeight, pivot.rightHeight) + 1

        return pivot
    }

}