import  java.util.Scanner
import java.util.Random

fun main() {
    /*
    1 - Faça um loop do-while que imprima
    todos os números de 1 a 10:
     */
    var contador = 1
    do{
        print("$contador ")
        contador++
    }while (contador<=10)

    /*
    2 - Faça um loop do-while que peça ao usuário
    para digitar um número até que ele digite um
    número negativo:
     */
    val entrada=Scanner(System.`in`)

    var number:Int
    do{
        println("Informe um número: ")
        number=entrada.nextInt()
    }while(number>=0)

    /*
    3 - Faça um loop do-while que peça ao usuário
    para digitar um número de 1 a 10 até que ele
    acerte o número sorteado:
     */
    val random =Random()

    var number1 : Int
    val randomNumber =random.nextInt(1,10)

    do{
        println("Informe um número de 1 a 10: ")
        number1=entrada.nextInt()
    }while(number1!=randomNumber)
    println("Correto! O número secreto era $randomNumber")


}