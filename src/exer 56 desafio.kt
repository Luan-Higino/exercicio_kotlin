///Vamos melhorar o jogo que fizemos no exercício
//32. A partir de agora, o computador vai sortear um número entre
//1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.

import kotlin.random.Random

fun main(){

    var tentativa = 4

    val sorteioComputador = Random.nextInt(1,11)

    while (tentativa > 0){

        println("Digite um numero entre 1..10: ")
        var numero = readln().toInt()

        if (numero == sorteioComputador){
            println("Você acertou!! O número era $sorteioComputador")
            break
        }
        tentativa -= 1
        println("Tentativas restantes: $tentativa")

        if (tentativa == 0){
            println("Você perdeu!!! O número era $sorteioComputador")
        }

    }

}



