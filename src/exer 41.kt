///Desenvolva um programa que mostre na tela a seguinte contagem:
//
//100 95 90 85 80 ... 0 Acabou!

fun main(){
    for (i in 100 downTo 0 step 5){
        print("$i ")
    }
    print("Acabou!")
}