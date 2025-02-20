/*[DESAFIO] Crie um programa que leia o tamanho de três segmentos
de reta. Analise seus comprimentos e diga se é possível formar um
triângulo com essas retas. Matematicamente, para três segmentos
formarem um triângulo, o comprimento de cada lado deve ser menor
que a soma dos outros dois.*/

fun main(){
    println("Digite o comprimento do primeiro segmento:")
    val a = readln().toDouble()
    println("Digite o comprimento do segundo segmento:")
    val b = readln().toDouble()
    println("Digite o comprimento do terceiro segmento:")
    val c = readln().toDouble()

    if(a + b > c && b + c > a && c + a > b ){
        println("Os segmentos podem formatar um triangulo!")
    }else{
        println("Os segmentos não podem formatar um triangulo!")
    }
}