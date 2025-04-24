package excersises_week_preparation.challenge


fun main() {

    val a = intArrayOf(1, 2, 3, 4)
    val b = intArrayOf(5, 6, 7, 8)
    val b1 = intArrayOf()
    val c = intArrayOf(9, 10, 11, 12)
    val c1 = intArrayOf()
    //
    val iterA = Iterator(a)
    val iterB = Iterator(b)
    val iterB1 = Iterator(b1)
    val iterC = Iterator(c)
    val iterC1 = Iterator(c1)

    val iterator2 = Iterator2(arrayOf(iterA, iterB, iterB1, iterC, iterC1))

    while (true) {
        println(iterator2.next())
    }
}


interface Iterable {
    fun hasNext(): Boolean
    fun next(): Int
}

class Iterator(private val values: IntArray) : Iterable {
    private var index: Int = 0
    override fun hasNext(): Boolean {
        return index < values.size
    }

    override fun next(): Int {
        return values[index++]
    }
}

class Iterator2(private val values: Array<Iterable>) : Iterable {
    private var index = 0

    override fun hasNext(): Boolean {
        while (index < values.size) {
            if (values[index].hasNext()) return true
            index++
        }
        return false
    }

    override fun next(): Int {
        if (!hasNext()) throw IndexOutOfBoundsException()
        return values[index].next()
    }
}
