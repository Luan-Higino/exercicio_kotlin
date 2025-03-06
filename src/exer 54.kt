///Faça um programa que leia a idade e o sexo de 5 pessoas,
//mostrando no final:
//• Quantos homens foram cadastrados
//• Quantas mulheres foram cadastradas
//• A média de idade do grupo
//• A média de idade dos homens
//• Quantas mulheres tem mais de 20 anos

fun main(){

    var cadastroHomem = 0
    var cadastroMulher = 0
    var somaIdade = 0
    var idadeHomem = 0
    var mulherMaiorqueVinte = 0


    for (i in 1..5){
        print("Digite a idade da ${i} pessoa: ")
        var idade = readln().toInt()
        print("Digite o !!sexo!! da ${i} pessoa (Masculino/Feminino): ")
        var sexo = readln().lowercase().replaceFirstChar { it.uppercase() }
        println()
        somaIdade += idade

        if (sexo == "Masculino"){
            cadastroHomem ++
        }
        if (sexo == "Masculino" && idade > 0){
            idadeHomem += idade
        }
        if (sexo == "Feminino"){
            cadastroMulher ++
        }
        if (sexo == "Feminino" && idade > 20){
            mulherMaiorqueVinte ++
        }

    }
    var soma = somaIdade / 5
    var somahomem = idadeHomem / cadastroHomem
    println()
    println("Total  de homens cadastrados: $cadastroHomem")
    println("Total de mulheres cadastradas: $cadastroMulher")
    println("A media total do grupo é de: $soma")
    println("A média de idade dos homens é de: $somahomem")
    println("Total de mulheres maiores que 20: $mulherMaiorqueVinte")

}