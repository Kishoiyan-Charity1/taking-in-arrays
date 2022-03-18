fun main() {
    var product=IntArray(arrayOf(7,8,9))
    println(product)

    var add=sumDecimalsArray(arrayOf("ritty", false, 5.5,8,5.0,true,"jimmy",12,6.6))
    println(add)
    var total = nameArray(arrayOf('w', 'r', 'o', 'p', 'a','i'))
    println(total)


}
//Write a function that takes in an array of integers and returns the product of
//all the elements
fun IntArray(numbers:Array<Int>):Int {
    var x=1
    numbers.forEach{number->
        x*=number
    }
    return x

}
fun sumDecimalsArray(mixedtypes:Array<Any>) :Double{
    var  sum=0.0
    mixedtypes.forEach { num->
        if(num is Double){
            sum+=num
        }

    }

    return sum
}
fun nameArray(vowels:Array<Char>):Int{
    var sum=0
    vowels.forEach { char->
        if (char == 'a' || char =='o' || char == 'i') {
            sum++
        }
    }
    return sum


}