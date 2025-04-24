package dataStructuresExamples.stack

class Stack<T: Any>(): IStack<T> {
    private val storage = arrayListOf<T>()
    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        if (storage.size == 0) {
            return null
        }

        return storage.removeAt(storage.size - 1)
    }

    override fun toString(): String = buildString {
        append("----- TOP ------")
        storage.asReversed().forEach {
            append("$it")
        }
        append("----------")
    }
}