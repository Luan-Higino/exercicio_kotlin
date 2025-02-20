/**
 * Escreva um programa que pergunte a velocidade de um carro.
 * Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário
 * foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por
 * cada Km acima da velocidade permitida.
 */

fun main(){
    println("Qual a velocidade do carro:")
    var velo = readln().toDouble()

    if (velo > 80){
        val multa = (velo - 80) * 5
        println("Você foi multado em R$$multa")
    }

}