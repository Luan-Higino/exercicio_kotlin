/**
 * 08 - Desenvolva um programa em Kotlin que leia uma distância em metros e mostre os
 * valores relativos em outras medidas.
 * Ex:
 * Digite uma distância em metros: 100
 * Distância de 10000 Cm
 */

fun main(){
    println("Digite uma distância em Metros: ")
    var metros = readln().toInt()

    println("A Distância é de: ${metros*100} cm")
}