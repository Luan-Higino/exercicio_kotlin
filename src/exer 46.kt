///Crie um programa que calcule e mostre na tela o resultado da
//soma entre 6 +
//8 + 10 + 12 + 14 + ... + 98 + 100.

fun main(){
    var soma = 0
    for (i in 6 .. 100 step 2){
        soma += i
        if (i != 100 ){
            print(" $i +")
        }else{
            print(" $i")
        }
    }
    println()
    println("Soma total: $soma")
}