///Crie um programa que leia o nome e a idade de 9 pessoas e
//guarde esses valores em dois vetores, em posições relacionadas. No
//final, mostre uma listagem contendo apenas os dados das pessoas
//menores de idade.

fun main(){

    val nomes = mutableListOf<String>()
    val idades = mutableListOf<Int>()

    for (i in 1..9){
        print("Digite o $i nome: ")
        val nome = readln()
        nomes.add(nome)
        println("Digite a $i idade: ")
        val idade = readln().toInt()
        idades.add(idade)
    }
    println("Pessoas menores de idade:")
    for (i in idades.indices){
        if (idades[i] < 18 ){
            println("Nome: ${nomes[i]}, Idade: ${idades[i]}")
        }
    }

}
