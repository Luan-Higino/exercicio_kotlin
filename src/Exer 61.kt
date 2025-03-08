///Desenvolva um algoritmo que leia o nome, a idade e o sexo de
//várias pessoas. O programa vai perguntar se o usuário quer ou não
//continuar. No final, mostre:
//• O nome da pessoa mais velha
//• O nome da mulher mais jovem
//• A média de idade do grupo
//• Quantos homens tem mais de 30 anos
//• Quantas mulheres tem menos de 18 anos

fun main(){

    var nomeMaisVelha = ""
    var mulherJovem = ""
    var idadeMulherJovem = Int.MAX_VALUE
    var idadeMaisVelha = Int.MIN_VALUE
    var idadeGeral = 0
    var homemMaisTrinta = 0
    var mulherMenosDezoito = 0
    var totalPessoa = 0

    while (true){
        print("Insira seu nome: ")
        val nome = readln()

        print("Insira sua idade: ")
        val idade = readln().toInt()
        idadeGeral += idade
        totalPessoa ++

        print("Insira seu sexo(Masculino/Feminino): ")
        val sexo = readln().lowercase().replaceFirstChar { it.uppercase() }

        if (sexo == "Masculino" && idade > 30) homemMaisTrinta ++
        if (sexo == "Feminino" && idade < 18) mulherMenosDezoito ++
        if (idade > idadeMaisVelha){
            idadeMaisVelha = idade
            nomeMaisVelha = nome
        }
        if (idade < idadeMulherJovem && sexo == "Feminino"){
            idadeMulherJovem = idade
            mulherJovem = nome
        }

        println("Deseja continuar (Sim/Não)")
        val programa = readln().lowercase().replaceFirstChar { it.uppercase() }

        if (programa == "Não"){
            break
        }
    }
    val somaMedia = if (totalPessoa > 0) idadeGeral / totalPessoa else 0
    println("\n===== RESULTADOS =====")
    println("O nome da pessoa mais velha é: $nomeMaisVelha")
    println("O nome da mulher mais jovem é: $mulherJovem")
    println("A media da idade do grupo é: $somaMedia")
    println("A quantidade de homens, maiores que 30 é: $homemMaisTrinta")
    println("A quantidade de mulheres, menos que 18 é: $mulherMenosDezoito")



}
