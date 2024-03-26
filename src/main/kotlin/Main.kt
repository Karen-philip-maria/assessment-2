//fun main() {
//    isPalindrome("bravo")
//    information("Barnie bakes bagel and buns")
//    numBers(23, 4,3)
//    volumeSphere()
//}
//// no.1
//
//fun information(name:String){
//    var sentence= "Barnie bakes brown bagels and buns"
//    println(sentence.removeSuffix(buildString{}))
//
//    // no.2
//    fun numBers(num1: Int, num2: Int, num3: Int): Array<Int> {
//        var a = num1
//        var b = num2
//        var c = num3
//        return arrayOf(a + b + c)
//        return arrayOf(numBers(num1, num2, num3.countOneBits())
//            return arrayOf(num1, num2, num3)
//
//
//
//
//    }
//
//    // no.3
//
//    fun volumeSphere(num:Int){
//        var volume= 4/3 * 3.14159 *2*2*2
//        println(volume)
//
//    }    }
//
//
//// no.4
//
//fun isPalindrome(word:String):Boolean {
//    var word = "bravo"
//    if (word == "bravo"){
//        return true
//    } else {
//        return false
//    }
//}
fun main(){
   var  human= Human("karen", 23, 23.0)
    human.speak("i love dancing")
    human.birthday()
    var user= User("karen","philip","karenphilip@gmail.com","079878654","k234trr")
    println(user.email)
    println(user.phoneNumber)
    println(user.password)







    var message=names ("karen",12,12.0)
    println(message.name)
    println(message.age)
    println(message.weight)

}

class Human(var name:String, var age:Int, var weight:Double) {
    fun speak(speech: String) {
        println(speech)

    }
    fun birthday () {
        age += 1
        println (age)
    }}
data class User(var firstName:String, var lastNane:String, var email: String, var phoneNumber:String, var password:String)

class names (var name:String, var age:Int, var weight: Double )



