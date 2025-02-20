/*Numa promoção exclusiva para o Dia da Mulher, uma loja quer
dar descontos para todos, mas especialmente para mulheres. Faça
um programa que leia nome, sexo e o valor das compras do cliente
e calcule o preço com desconto. Sabendo que:
• Homens ganham 5% de desconto
• Mulheres ganham 13% de desconto
 */

fun main() {
    println("Qual seu nome:")
    val nome = readLine().toString().lowercase()
    println("Digite seu sexo, masculino/feminino:")
    val sexo = readln().toString()
    println("Qual o valor das compras:")
    val compras = readln().toDouble()


    if (sexo == "masculino") {
        val descontoh = compras * 0.05
        val valorTotal = compras - descontoh
        println("$nome, o valor da compra de R$$compras, com desconto ficou, R$$valorTotal")
    } else if (sexo == "feminino"){
    val descontof = compras * 0.13
    val valorTotalf = compras - descontof
    println("$nome, o valor da compra de R\$$compras, com desconto ficou, R$$valorTotalf")
    }

}