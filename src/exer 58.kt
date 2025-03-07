///Desenvolva um aplicativo que leia o salário e o sexo de vários
//funcionários. No final, mostre o total de salários pagos aos homens
//e o total pago às mulheres. O programa vai perguntar ao usuário se
//ele quer continuar ou não sempre que ler os dados de um
//funcionário.

fun main(){

    var salarioHomem = 0.0
    var salarioMulher = 0.0

    while (true){
        print("Qual seu salario? R$: ")
        val salario = readln().toDouble()
        print("Qual seu sexo (Masculino/Feminino): ")
        val sexo = readln().lowercase().replaceFirstChar { it.uppercase() }

        if (sexo != "Masculino" && sexo != "Feminino"){
            println("Sexo invalido!, Insira sexo novamente (Masculino/Feminino)")
            continue
        }
        if (sexo == "Masculino"){
            salarioHomem += salario
        }
        if (sexo == "Feminino"){
            salarioMulher += salario
        }
        print("Deseja continuar (Sim/Não): ")
        val programa = readln().lowercase().replaceFirstChar { it.uppercase() }

        if (programa == "Não"){
            break
        }

    }
    println()
    println("Salário pago aos homens foi de: R$$salarioHomem")
    println()
    println("Salário pago às mulheres foi de: R$$salarioMulher")
}
