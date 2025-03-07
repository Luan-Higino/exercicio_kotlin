///Crie um programa que leia vários números pelo teclado e
//mostre no final o somatório entre eles.
//Obs: O programa será interrompido quando o número 1111 for digitado


fun main(){
    var caixa = 0

    while (true){
        print("Digite um numero (1111, para sair): ")
        val numero = readln().toInt()

        if (numero == 1111){
            break

        }
        caixa += numero
    }
    println()
    println("A soma dos números digitados é: $caixa")

}


