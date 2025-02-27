///Faça um algoritmo que pergunte ao usuário um número
//inteiro e positivo qualquer e mostre uma contagem até esse
//valor:
//Ex: Digite um valor: 35
//Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!

fun main(){
    print("Digite um numero : ")
    val numero = readln().toInt()
    print("Contagem: ")
    for (i in 1..numero){
        print("$i ")
    }
    print("Acabou!")
}