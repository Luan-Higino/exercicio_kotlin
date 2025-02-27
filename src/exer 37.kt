///Uma empresa precisa reajustar o salário dos seus funcionários,
//dando um aumento de acordo com alguns fatores. Faça um programa que
//leia o salário atual, o gênero do funcionário e há quantos anos
//esse funcionário trabalha na empresa. No final, mostre o seu novo
//salário, baseado na tabela a seguir:
//• Mulheres
//• menos de 15 anos de empresa: +5%
//• de 15 até 20 anos de empresa: +12%
//• mais de 20 anos de empresa: +23%
//• Homens
//• menos de 20 anos de empresa: +3%
//• de 20 até 30 anos de empresa: +13%
//• mais de 30 anos de empresa: +25%

fun main(){
    print("Salario atual :")
    val salario = readln().toDouble()
    print("Qual seu genero: Masculino/Femino ?")
    val genero = readln().toString().lowercase().replaceFirstChar { it.uppercase() }
    print("Quantos anos na empresa :")
    val tempo = readln().toInt()

    var aumento = 0.0
    if (genero == "Feminino")
        aumento = when{
            tempo < 15 -> salario * 0.05
            tempo in 15..20 -> salario * 0.12
            else -> salario * 0.23
        }
    if (genero == "Masculino")
        aumento = when{
            tempo < 20 -> salario * 0.03
            tempo in 20..30 -> salario * 0.13
            else -> salario * 0.25
        }

    val novoSalario = salario + aumento

    if(genero == "Masculino" || genero == "Feminino"){
        println("O seu novo salario é de: $novoSalario")
    }else{
        print("Genero invalido")
    }




}