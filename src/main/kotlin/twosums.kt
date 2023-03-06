fun main(args: Array<String>) {
    var l1 = listOf<Int>(2,4,3)
    var l2 = listOf<Int>(5,6,4)
    addTwoNumbers(l1, l2)
}
fun addTwoNumbers(l1: List<Int>, l2: List<Int>,): List<Int>{
    var result = mutableListOf<Int>()
    var l1string = ""
    var l2string = ""
    var l1int = 0
    var l2int = 0


    for(i in l1.reversed()) {

        l1string += i.toString()
         l1int = l1string.toInt()

        }
    for(i in l2.reversed()) {
        l2string += i.toString()
         l2int = l2string.toInt()

    }
    var resint = l1int+l2int
    println(resint)

    for (i in resint.toString()) {
        result.add(i.digitToInt())


    }
    println(result)
    return result
}












