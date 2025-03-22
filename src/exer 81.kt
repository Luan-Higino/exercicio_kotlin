///Faça um algoritmo que preencha um vetor de 30 posições com
//números entre 1 e
//15 sorteados pelo computador. Depois disso, peça para o usuário
//digitar um número (chave) e seu programa deve mostrar em que
//posições essa chave foi encontrada. Mostre também quantas vezes a
//chave foi sorteada.
import kotlin.random.Random

fun main(){

    val numerosSorteados = mutableListOf<Int>()

    for (i in 1..30){
        val sorteio = Random.nextInt(1,16)
        numerosSorteados.add(sorteio)
    }
    println("Digite um numero(1..15): ")
    val usuario = readln().toInt()


    var contador = 0
    println("Posições onde a chave $usuario foi encontrada:")

    for (i in numerosSorteados.indices){
        if (usuario == numerosSorteados[i]){
            println("Posição: $i")
            contador++
        }
    }
    if (contador > 0) {
        println("A chave $usuario foi sorteada $contador vez(es).")
    } else {
        println("A chave $usuario não foi sorteada.")
    }
}
