///Crie um algoritmo que leia o valor inicial da contagem, o
//valor final e o incremento, mostrando em seguida todos os
//valores no intervalo:
//Ex: Digite o
//primeiro Valor: 3
//Digite o último
//Valor: 10 Digite o
//incremento: 2
//Contagem: 3 5 7 9
//Acabou!

fun main(){
    print("Primeiro valor: ")
    val numeroA = readln().toInt()
    print("Segundo valor: ")
    val numeroB = readln().toInt()
    print("Digite o incremento : ")
    val incremento = readln().toInt()

    print("Contagem: ")
    for (i in numeroA .. numeroB step incremento){
        print("$i ")
    }
    print("Acabou!")
}