///Crie um programa que mostre na tela a seguinte contagem,
//usando a estrutura “faça enquanto”
//
//0 3 6 9 12 15 18 21 24 27 30 Acabou!

fun main(){
    var contagem = 0

    do {
        print("${contagem} ")
        contagem += 3
    }while (contagem <=30)
    println("Acabou!")
}
