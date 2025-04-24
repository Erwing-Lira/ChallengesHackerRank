package dataStructuresExamples.tree

class BinarySearchTree<T: Comparable<T>> {

    var root: BinaryNode<T>? = null

    override fun toString(): String {
        return root?.toString() ?: "Empty"
    }

    fun insert(value: T) {
        root = insert(root, value)
    }

    private fun insert(
        node: BinaryNode<T>?,
        value: T
    ): BinaryNode<T> {
        node ?: return BinaryNode(value = value)

        if (value < node.value) {
            node.leftChild = insert(node.leftChild, value)
        } else {
            node.rightChild = insert(node.rightChild, value)
        }
        return node
    }

}