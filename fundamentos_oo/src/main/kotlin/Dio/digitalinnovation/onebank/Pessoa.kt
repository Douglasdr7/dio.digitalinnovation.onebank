package Dio.digitalinnovation.onebank

class Pessoa {

    var nome: String = "Douglas"
    var cpf:String = "347.023.648-80"
    private set

    constructor ()

    fun pessoaInfo() = "$nome e $cpf"
}
fun main(){
    val Douglas = Pessoa()
    println(Douglas.pessoaInfo())
   }
