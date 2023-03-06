fun main(args: Array<String>) {
    var s = "abcabcbb"
    longest("awcnmcmm")








}
fun longest(s: String) : Int {
    var num = 0
    var ressult = 0
    var size = 0
    for (i in s) {

        var l1 = s[size]

        if(l1==i) {
            num++
        }
        if(num<=1) {

           size++
            l1 = s[size]
        }
    }
    println(s[size])
    println(num)



    return ressult

}

