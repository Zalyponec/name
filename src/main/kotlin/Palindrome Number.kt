fun main(args: Array<String>) {
    var x = 4545454

    println(isPalindrome(x))

}
fun isPalindrome(x: Int): Boolean {

    var list = mutableListOf<Int>()

    for (i in x.toString()) {
        list.add(i.digitToInt())
    }
    if (list == list.reversed()) {
        return true
    }
    return false
}