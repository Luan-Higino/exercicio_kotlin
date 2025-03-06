///Desenvolva um programa que faça o sorteio de 20 números
//entre 0 e 10 e mostre na tela:
//• Quais foram os números sorteados
//
//• Quantos números estão acima de 5
//• Quantos números são divisíveis por 3

import kotlin.random.Random

fun main(){
    var acimadeCinco = 0
    var divisiveisPortres = 0
    val lista = mutableListOf<Int>()

    for (i in 1..20){
        val numero = Random.nextInt(0,11)
        lista.add(numero)

        if (numero > 5){
            acimadeCinco ++
        }
        if (numero % 3 == 0){
            divisiveisPortres ++
        }
    }

    println("Números sorteados: ${lista.joinToString(" , ")}")
    println("Quantos números estão acima de 5: $acimadeCinco")
    println("Quantos números são divisíveis por 3: $divisiveisPortres")

}