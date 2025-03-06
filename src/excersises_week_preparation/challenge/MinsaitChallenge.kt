package excersises_week_preparation.challenge

fun main() {
    val repeated = countWords("Hola, mi nombre es brais. Mi nombre completo es Brais Moure (MoureDev).")
    //TODO: Print the word an the times of this word appears on the string
    for (str in repeated) {
        println(str)
    }
}

/* Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y lo retorne de la funcion
*  y que muestre el recuento final de todas ellas.
* - Los signos de puntuación no forman parte de la palabra.
* - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
*
*/

//Not allow modify the declaration of the func or its parameters or its return value
fun countWords(text: String): Map<String, Int> {
    //TODO: Add your code here
    var resMap: MutableMap<String, Int> = mutableMapOf()

    /*
    val new = text.filterNot { it == '.' || it == '(' || it == ')' || it == ',' }
    new.forEach { word -> println(word) }
     */

    text.replace(Regex("[^\\w\\s]"), "")
        .split(" ")
        .map { it.lowercase() }
        .forEach { palabra ->
            resMap[palabra] = resMap.getOrDefault(palabra, 0) + 1
        }
    return resMap
}