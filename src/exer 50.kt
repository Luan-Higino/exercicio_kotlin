///Desenvolva um programa que faça o sorteio de 20 números
//entre 0 e 10 e mostre na tela:
//• Quais foram os números sorteados

import kotlin.random.Random

fun main(){

    val lista = mutableListOf<Int>()

    for (i in 1..20)
        lista.add(Random.nextInt(0,11))

        print("Números sorteados: ${lista.joinToString(" , ")}")
}