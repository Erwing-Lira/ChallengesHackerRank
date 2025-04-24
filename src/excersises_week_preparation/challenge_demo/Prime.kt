package excersises_week_preparation.challenge_demo

import kotlin.math.sqrt

fun isPrime(num: Int): Boolean {
    if (num < 2) return false

    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }

    return true
}

fun getPrime(num: Int): Int {
    var i = 0
    var prime = 1

    while (i < num) {
        prime++
        if (isPrime(prime)) {
            i++
        }
    }
    return prime
}

fun main() {
    println(isPrime(2))
    println(isPrime(25))
    println(isPrime(16))
    println(isPrime(3))
    println("-----")
    println(getPrime(1))
    println(getPrime(2))
    println(getPrime(3))
    println(getPrime(4))
}