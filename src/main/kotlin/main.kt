package ru.netology

fun main() {
    val amount = 5000
    val minfee = 35

    val transferfee = amount * 75 / 10000
    val result = if (transferfee > minfee) transferfee else minfee
    println(result)
}
