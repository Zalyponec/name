fun main(args: Array<String>) {
    var s = "abcabcbb"
    lengthOfLongestSubstring(s)
}
fun lengthOfLongestSubstring(s: String): Int {
    val set = mutableSetOf<Char>()
    var currentMax = 0

    for (i in s.indices) {
        currentMax = maxOf(currentMax, set.size)
        set.clear()
        for (j in i..s.lastIndex) {
            if (!set.add(s[j])) {
                break
            }
        }
    }
    return maxOf(currentMax, set.size)
}