package dataStructuresExamples.stack

interface IStack<Element> {
    fun push(element: Element)
    fun pop(): Element?
}