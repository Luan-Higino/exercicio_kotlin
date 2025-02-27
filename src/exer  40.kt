///Crie um aplicativo que mostre na tela a seguinte contagem:
//
//0 3 6 9 12 15 18 Acabou!

fun main(){
    for (i in 0..18 step 3){
        print("$i ")
    }
    print("Acabou!")
}