package dataStructuresExamples.tree

import com.sun.source.tree.Tree
import java.util.PriorityQueue
import java.util.Queue

typealias Visitor<T> = (TreeNode<T>) -> Unit

class TreeNode<T>(val value: T) {
    private val children: MutableList<TreeNode<T>> = mutableListOf()

    fun add(child: TreeNode<T>) = children.add(child)

    fun forEachDepthfirst(visit: Visitor<T>) {
        visit(this)
        children.forEach {
            it.forEachDepthfirst(visit)
        }
    }

    fun forEachLevelOrder(visit: Visitor<T>) {
        visit(this)
        val queue = PriorityQueue<TreeNode<T>>()
        children.forEach { queue.add(it) }

        var node = queue.remove()

        while(node != null) {
            visit(node)
            node.children.forEach {
                queue.add(it)
            }
            node = queue.remove()
        }
    }
}