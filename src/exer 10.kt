/**
 * • Faça um algoritmo que leia a largura e altura de uma parede,
 * calcule e mostre a área a ser pintada e a quantidade de tinta
 * necessária para o serviço, sabendo que cada litro de tinta pinta
 * uma área de 2metros quadrados.
 */

fun main(){
    println("Largura:")
    var largura = readln().toDouble()
    println("Altura:")
    var altura = readln().toDouble()

    val area = altura * largura
    val quantidadeTinta = area / 2
    println("Área total da parede: $area")
    println("Quantidade de tinta necessária: $quantidadeTinta litros.")

}