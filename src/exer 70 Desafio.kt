///Desenvolva um programa que leia o primeiro termo e a
//razão de uma PA (Progressão Aritmética), mostrando na tela os 10
//primeiros elementos da PA e a soma entre todos os valores da
//sequência.

fun main() {

    print("Digite o primeiro termo(PA): ")
    val termo = readln().toInt()
    print("Digite a razão de uma(PA): ")
    val razao = readln().toInt()

    var soma = 0
    var caixa = termo
    for (i in 1..10){
        print("${caixa} " )
        soma += caixa
        caixa += razao
    }
    println("\nA soma de todos os termos é: $soma")
}
