/**
 * Faça um algoritmo que leia o salário de um funcionário,
 * calcule e mostre o seu novo salário, com 15% de aumento.
 */

fun main(){
    println("Salário:")
    val sal = readln().toDouble()

    val desc = 0.15
    val soma = sal * desc
    println("Seu salário de $sal, com o novo reajuste irá para R$${sal + soma}")
}