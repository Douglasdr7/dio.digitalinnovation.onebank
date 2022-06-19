package Dio.digitalinnovation.onebank

class Pessoa {

    var nome: String = "Douglas"
    var cpf:String = "347.023.648-80"
    private set
}
fun main(){
    val Douglas = Pessoa()
    println(Douglas.nome)
    println(Douglas.cpf)

   }
