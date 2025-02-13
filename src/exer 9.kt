/**
 * • Faça um algoritmo que leia quanto dinheiro uma pessoa tem na
 * carteira (em R$) e mostre quantos dólares ela pode comprar.
 * Considere US$1,00 = R$3,45.
 */

fun main(){
    println("Dinheiro em carteira:")
    var carteira = readln().toDouble()
    val dolar = String.format("%.2f", carteira/3.45)
    println("Sua carteira tem R$$carteira, pode comprar U$$dolar.")
}