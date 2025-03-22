///Desenvolva um programa que leia 10 números inteiros e guarde-os
//em um vetor. No final, mostre quais são os números pares que foram
//digitados e em que posições eles estão armazenados.

fun main(){
    val numeros = mutableListOf<Int>()

    for (i in 1..10){
        print("Digite o $i numero: ")
        val numero = readln().toInt()
        numeros.add(numero)
    }

    println("Os numeros pares digitados foram: ")
    for (i in numeros.indices){
        if (numeros[i] %2 == 0){
            println("Posição do vetor: ${i}, Par: ${numeros[i]}")
        }
    }

}
