///Crie um programa que preencha automaticamente um vetor
//numérico com 7 números gerados aleatoriamente pelo
//computador e depois mostre os valores gerados na tela.

import kotlin.random.Random
import kotlin.random.nextInt

fun main(){

    val vetor = IntArray(7)

    var sorteioVetor = Random.nextInt()
    for (i in vetor.indices){
        vetor[i] = Random.nextInt(1, 10)
    }
    for (num in vetor){
        print("${num} ")
    }
}

