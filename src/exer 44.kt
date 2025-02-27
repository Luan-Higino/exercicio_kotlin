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
///!!! Continuação!!!
///O programa acima vai ter um problema quando digitarmos o
//primeiro valor maior que o último. Resolva esse problema com um
//código que funcione em qualquer situação.

fun main(){
    print("Primeiro valor: ")
    val numeroA = readln().toInt()
    print("Segundo valor: ")
    val numeroB = readln().toInt()
    print("Digite o incremento : ")
    val incremento = readln().toInt()

    print("Contagem: ")
    if (numeroA < numeroB) {
        for (i in numeroA..numeroB step incremento) {
            print("$i ")
        }

    }else{
        for (i in numeroA downTo numeroB step incremento){
            print("$i ")
        }

    }
    print("Acabou!")
}
