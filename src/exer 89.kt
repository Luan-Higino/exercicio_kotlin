///Crie um programa que melhore o procedimento Gerador() da
//questão anterior para que mostre uma mensagem vário
//Ex: Ao chamar Gerador(&quot;Aprendendo Portugol&quot;, 4) aparece:
//+ ======= +
//Aprendendo
//Portug
//ol
//Aprend
//endo
//Portug
//ol
//Aprend
//endo
//Portug
//ol
//Aprend
//endo
//Portug
//ol
//+ ======= +

fun Gerador(mensagem:String){

    val linha = "+ " + "=".repeat(mensagem.length)
    println(linha)
    repeat(4){ println(mensagem)}
    println(linha)
}
fun main(){
    Gerador("Aprendendo Portugol")
}
