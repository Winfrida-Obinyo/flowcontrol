fun main(){
    numbers()
    var length = names(arrayOf("Ways","Delivery","for","Kemunto"))
    println(length)
    robot(4)
    robot(12)
    robot(25)
    multiple()


}
fun numbers(){

    for (i in 1..100) {
        if(i % 2 == 1 ){
            println(i)
        }
    }
    }
fun names(name: Array<String>):Int{
    var a = 0
    name.forEach { b ->
        if (b.length > 5){
            a ++
            }

    }
    return a

}
fun robot(age:Int){
    when (age){
        in 0..6 -> println("serves a glass of milk")
        in 7..15 -> println("serves a bottle of fanta orange")
        else -> println("get a bottle of coca cola")
    }

}
fun multiple() {
    for (num in 1..100) {
        if (num % 3 == 0 && num % 5 == 0) {
            println("FizzBuzz")
        }
        else if (num % 3 == 0) {
            println("Fizz")
        }
        else if (num % 5 == 0) {
            println("Buzz")
        } else {
            println(num)
        }
    }
}


