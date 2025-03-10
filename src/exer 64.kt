///Crie um programa usando a estrutura “faça enquanto” que leia
//vários números. A cada laço, pergunte se o usuário quer continuar
//ou não. No final, mostre na tela:
//• O somatório entre todos os valores
//• Qual foi o menor valor digitado
//• A média entre todos os valores
//• Quantos valores são pares

fun main(){

    var digitado = 0
    var valoresPares = 0
    var valores = 0
    var menorNumero = Int.MAX_VALUE
    do {
        print("Digite um número: ")
        val numero = readln().toInt()
        valores += numero
        digitado ++

        if (numero < menorNumero) menorNumero = numero
        if (numero %2 == 0){
            valoresPares ++
        }

        println("Deseja continuar? (Sim/Não): ")
    }while (readln().lowercase() == "sim")
    val soma = if (digitado > 0) valores / digitado else 0
    println("\n==========RESULTADOS==========")
    println("O somatório dos números digitados: $valores ")
    println("O menor número digitado: $menorNumero")
    println("A média dos valores digitados é : $soma")
    println("Valores pares: $valoresPares")
}
