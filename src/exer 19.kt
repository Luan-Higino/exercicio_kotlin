/**
 * Crie um algoritmo que leia o nome e as duas notas de um aluno,
 * calcule a sua média e mostre na tela. No final, analise a média e
 * mostre se o aluno teve ou não um bom aproveitamento (se ficou acima
 * da média 7.0).
 */

fun main(){
    println("Qual seu nome:")
    val nome = readLine().toString()
    println("Qual sua primeira nota:")
    val nota1 = readln().toDouble()
    println("Qual sua segunda nota:")
    val nota2 = readln().toDouble()

    val soma = (nota1 + nota2) / 2

    if (soma >= 7){
        println("$nome você teve um bom aproveitamento $soma")
    }else if(soma < 7)
        println("$nome você teve um mal aproveitamento $soma")
}