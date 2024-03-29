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
//fun main(){
//   var  human= Human("karen", 23, 23.0)
//    human.speak("i love dancing")
//    human.birthday()
//    var user= User("karen","philip","karenphilip@gmail.com","079878654","k234trr")
//    println(user.email)
//    println(user.phoneNumber)
//    println(user.password)
//
//
//
//
//
//
//
//    var message=names ("karen",12,12.0)
//    println(message.name)
//    println(message.age)
//    println(message.weight)
//
//
//    var information= car ("isuzu","mazda","blue",12)
//     information.carry(23)
//    information.identity()
//    information. calculateParkingFees(23)
//    information.calculateParkingFees((2))
//
//}
//
//class Human(var name:String, var age:Int, var weight:Double) {
//    fun speak(speech: String) {
//        println(speech)
//
//    }
//    fun birthday () {
//        age += 1
//        println (age)
//    }}
//data class User(var firstName:String, var lastNane:String, var email: String, var phoneNumber:String, var password:String)
//
//class names (var name:String, var age:Int, var weight: Double )
//
//// 27/ 03/2024 morning
//class car (var make:String, var model:String, var color:String, var capacity:Int ){
//    fun carry (people:Int){
//        var x = people- capacity
//        if(people <= capacity){
//        println("carrying $people passenger")
//
//        }
//     else{
//         println("over capacity by $x people")
//        }
//    }
//    fun identity(){
//        println("I am a $color $make $model")
//    }
//    fun calculateParkingFees(hours:Int):Int{
//        var parkingFees= hours*20
//        println(parkingFees)
//        return parkingFees
//    }
//}

// CONTROL FLOW
// binary decision
//fun main(){
//printNationality("Morocco")
//    printNationality("Djibouti")
//    printNationality("egypt")
//    printNationalityWhen("Eritrean")
//    calculate(7,9,"/")
//    calculate(7,9,"x")
//    assignSchool(390)
//}
//
//fun printNationality(country:String){
//    if(country=="Eritrea"){
//        println("Eritrean")
//    }
//    else if(country=="Djibout"){
//        println("Djiboutian")
//    }
//    else if(country=="Egypt") {
//        println("Egyptian")
//    }
//    else{
//        println("Foreigner")
//    }
//}
//// how to use when statement
//fun printNationalityWhen(country: String){
//    when(country){
//        "Eritrea" -> println("Eritrean")
//        "Djibouti" -> println("Djiboutian")
//        "Egypt" -> println("Djiboutian")
//        else -> println("foreigner")
//    }
//}
//
//fun calculate(x:Int, y:Int, sign:String):Int {
//    var result = 0
//    when (sign) {
//        "+" -> {
//            result = x + y
//        }
//
//        "-" -> {
//            result = x - y
//        }
//
//        "/" -> {
//            result = x / y
//        }
//
//        "%" -> {
//            result = x % y
//        }
//
//        "*" -> {
//            result = x * y
//        }
//        "x",".","*" -> {
//            result = x * y
//        }
//        "." -> {
//            result = x * y
//        }
//    }
//    println(result)
//        return result
//}
//
//
////logical operators (&&)
//fun assignSchool(marks:Int){
//    if(marks>390){
//        println("National")
//    }else if(marks >=390 && marks >389){
//        println("Provincial")
//    }else{
//        println("District")
//    }
//}


fun main() {
    // printing numbers respectively by recriminating in y-loop
    //printSquare2()
    var num = 9
    while (num > 0) {
        println(num)
        num--

        val noiseMakers = arrayOf("karen","faith","glory","pearl","betty","brian")
        for (noisy in noiseMakers) {
            val myFriends = arrayOf("brian", "pearl", "glory")
            if (noisy in myFriends)


//            //if(noisy == "pearl" || noisy=="brian" || noisy =="glory"){
//                continue
//        }
////        else {
////            println(noisy)
//        }
//    }

////    do{
////        var num =
////            println(num)
////            num--
////    }
//    while
//    (num > 0)
//    (num > 0)


//}
//    val fruits = arrayListOf("mango", "juice", "apple", "banana")
//    for(fruits in fruits) {
//        println(letter)
//        println(fruits.reverse())
//    }
//}
//shortening an array in strings and ranges
//fun printSquare() {
//    for (num in 1..100) {
//        val square = num * num
//        if (square < 1000) {
//            println(square)
//        }
//    }
//}}
// break is used to shorten a code  when your code is greater than or less than the given number according to the operation you are evaluating
//fun printSquare2(){
//    for(num in 1..100){
//        val square = num*num
//        if (square<1000){
//            println(square)
//    }else{
//        break
//    }
//}
//}


