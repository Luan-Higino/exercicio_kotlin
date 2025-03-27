///Faça um algoritmo que leia o nome, o sexo e o salário de 5
//funcionários e guarde esses dados em três vetores. No final,
//mostre uma listagem contendo apenas os dados das funcionárias
//mulheres que ganham mais de R$5 mil.

fun main(){
    val nomes = mutableListOf<String>()
    val sexos = mutableListOf<String>()
    val salarios = mutableListOf<Double>()

    for (i in 1..5){
        print("Qual seu nome: ")
        var nome = readln()
        nomes.add(nome)
        print("Qual seu sexo: ")
        var sexo = readln().lowercase()
        sexos.add(sexo)
        println("Qual seu salario: ")
        var salario = readln().toDouble()
        salarios.add(salario)
    }
    for (i in salarios.indices){
        if (salarios[i] > 5000 && sexos[i] == "feminino"){
            println("Nome: ${nomes[i]}, salario: ${salarios[i]}")
        }
    }
}
