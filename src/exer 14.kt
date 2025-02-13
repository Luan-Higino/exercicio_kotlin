/**
 * A locadora de carros precisa da sua ajuda para cobrar seus
 * serviços. Escreva um programa que pergunte a quantidade de Km
 * percorridos por um carro alugado e a quantidade de dias pelos quais
 * ele foi alugado. Calcule o preço total a pagar, sabendo que o carro
 * custa R$90 por dia e R$0,20 por Km rodado.
 */

fun main(){
    println("Quantidade de Km percorridos:")
    val km = readln().toDouble()
    println("Quantidade de dias alugados:")
    val dias = readln().toInt()
    val custoDia = dias * 90.0
    val custoKm = km * 0.20
    val total = custoKm + custoDia

    println("O custo pelos dias alugados foi R$%.2f".format(custoDia))
    println("O custo pelos quilômetros percorridos foi R$%.2f".format(custoKm))
    println("O valor total a ser pago é R$%.2f".format(total))

}