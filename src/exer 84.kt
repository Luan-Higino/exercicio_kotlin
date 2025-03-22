
///Crie uma lógica que preencha um vetor de 20 posições
//com números aleatórios (entre 0 e 99) gerados pelo computador.
//Logo em seguida, mostre os números gerados e depois coloque o
//vetor em ordem crescente, mostrando no final os valores ordenados.

import kotlin.random.Random

fun main(){

    val numerosSorteio = mutableListOf<Int>()

    for (i in 1..20){
        val sorteio = Random.nextInt(1,99)
        numerosSorteio.add(sorteio)
    }
    println("$numerosSorteio")
    val ordemCrescente = numerosSorteio.sorted()
    print("${ordemCrescente} ")

}
