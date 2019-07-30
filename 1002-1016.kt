//1016
fun main() {
    val km = readLine()!!.toInt()
    println("${km * 2} minutos")
}

//1015
//fun main() {
//    val p1 = readLine()!!.split(" ")
//    val p2 = readLine()!!.split(" ")
//    val x1 = p1[0].toDouble()
//    val y1 = p1[1].toDouble()
//    val x2 = p2[0].toDouble()
//    val y2 = p2[1].toDouble()
//    val a = x2 - x1
//    val b = y2 - y1
//    println(String.format("%.4f", kotlin.math.sqrt((a * a) + (b * b))))
//}

//1014
//fun main() {
//    val km = readLine()!!.toInt()
//    val litros = readLine()!!.toDouble()
//    println(String.format("%.3f km/l", km / litros))
//}

//1013
//fun main() {
//
//    fun maiorAB(a: Int, b: Int): Int{
//        var minus = a - b
//        if (minus < 0){
//            minus = minus * -1
//        }
//        return (a + b + minus)/2
//    }
//
//    val linha = readLine()!!
//    val lista = linha.split(" ")
//    val a = lista[0].toInt()
//    val b = lista[1].toInt()
//    val c = lista[2].toInt()
//    var maior = maiorAB(a, b)
//    if (maior == a){
//        println("${maiorAB(a, c)} eh o maior")
//    }else{
//        println("${maiorAB(b, c)} eh o maior")
//    }
//}



//1012
//fun main() {
//    val linha = readLine()!!
//    val lista = linha.split(" ")
//    val a = lista[0].toDouble()
//    val b = lista[1].toDouble()
//    val c = lista[2].toDouble()
//    println(String.format("TRIANGULO: %.3f", (a * c) / 2))
//    println(String.format("CIRCULO: %.3f", 3.14159  * (c * c)))
//    println(String.format("TRAPEZIO: %.3f", ((a + b) * c)/2))
//    println(String.format("QUADRADO: %.3f", b * b))
//    println(String.format("RETANGULO: %.3f", a * b))
//}

//1011
//fun main() {
//    val pi = 3.14159
//    val r = readLine()!!.toDouble()
//    val volume = (4.0/3) * pi * (r * r * r)
//    println(String.format("VOLUME = %.3f", volume))
//}

//1010
//fun main() {
//    val linha1 = readLine()!!
//    val linha2 = readLine()!!
//    val lista1 = linha1.split(" ")
//    val lista2 = linha2.split(" ")
//    val qtd1 = lista1[1].toInt()
//    val valor1 = lista1[2].toDouble()
//    val qtd2 = lista2[1].toInt()
//    val valor2 = lista2[2].toDouble()
//    println(String.format("VALOR A PAGAR: R\$ %.2f", (qtd1 * valor1) + (qtd2 * valor2)))
//}

//1009
//fun main() {
//    val nome = readLine()
//    val fixo = readLine()!!.toDouble()
//    var variavel = readLine()!!.toDouble()
//    variavel = variavel * 0.15
////    variavel = String.format("%.2f", variavel * 0.15).toDouble()
////    println("TOTAL = R\$ ${fixo + variavel}")
//    println(String.format("TOTAL = R\$ %.2f", variavel + fixo))
//}

//1008
//fun main() {
//    val number = readLine()!!.toInt()
//    val valor = readLine()!!.toInt()
//    val horas = readLine()!!.toDouble()
//    println("NUMBER = $number")
//    println(String.format("SALARY = U\$ %.2f", valor * horas))
//}

//1007
//fun main() {
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val c = readLine()!!.toInt()
//    val d = readLine()!!.toInt()
//    println("DIFERENCA = ${(a * b) - (c * d)}")
//}

//1006
//fun main() {
//    val nota1 = readLine()!!.toDouble()
//    val nota2 = readLine()!!.toDouble()
//    val nota3 = readLine()!!.toDouble()
//    var mPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10
//    println(String.format("MEDIA = %.1f", mPonderada))
//}

//1005
//fun main() {
//    val nota1 = readLine()!!.toDouble()
//    val nota2 = readLine()!!.toDouble()
//    var mPonderada = ((nota1 * 3.5) + (nota2 * 7.5)) / 11
//    if (mPonderada > 10){
//        mPonderada = 10.0000
//    }
//    println(String.format("MEDIA = %.5f", mPonderada))
//}

//1004
//fun main() {
//    val var1 = readLine()!!.toInt()
//    val var2 = readLine()!!.toInt()
//    println("PROD = ${var1 * var2}")
//}

//1003
//fun main() {
//    val A = readLine()!!.toInt()
//    val B = readLine()!!.toInt()
//    val SOMA = A + B
//    println("SOMA = $SOMA")
//}

//1002
//fun main(args: Array<String>){
//    val n = 3.14159
//    val raio: Double = readLine()!!.toDouble()
//    println(String.format("A=%.4f", n * (raio * raio)))
//}
