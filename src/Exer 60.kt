///Crie um programa que leia o sexo e a idade de várias pessoas. O
//programa vai perguntar se o usuário quer continuar ou não a cada
//pessoa. No final, mostre:
//• qual é a maior idade lida
//• quantos homens foram cadastrados
//• qual é a idade da mulher mais jovem
//• qual é a média de idade entre os homens

fun main(){

    var maiorIdade = Int.MIN_VALUE
    var homens = 0
    var mulherJovem = Int.MAX_VALUE
    var idadeHomens = 0

    while (true){
        print("Insira sua idade: ")
        val idade = readln().toInt()

        if (idade < 0){
            println("Idade invalida!! Insira um número positivo.")
            continue
        }
        print("Insira seu sexo (Masculino/Feminino)")
        val sexo = readln().lowercase().replaceFirstChar { it.uppercase() }

        if (sexo != "Masculino" && sexo != "Feminino"){
            println("Sexo invalido!!")
            continue
        }
        if (idade > maiorIdade){
            maiorIdade = idade
        }
        if (sexo == "Feminino" && idade < mulherJovem){
            mulherJovem = idade
        }
        if (sexo == "Masculino"){
            idadeHomens += idade
            homens ++
        }
        print("Deseja continuar ? (Sim/Não): ")
        val continuar = readln().lowercase().replaceFirstChar { it.uppercase() }

        if (continuar == "Não"){
            break
        }
    }
    val mediaHomens = if (homens > 0 ) idadeHomens / homens else 0
    println()
    println("===== RESULTADOS =====")
    println("A maior idade inserida foi: $maiorIdade")
    println("Total de homens cadastrados foi de: $homens")
    println("A idade da mulher mais jovem é de: $mulherJovem")
    println("A media de idade inseridas entre homens é de : $mediaHomens")

}
