
enum class Color(
 val r: Int , val g: Int , val b: Int
) {

    RED(25,5, 0), ORANGE(25,5, 165),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIG0(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b


}
fun raduga(color: Color) {
    when (color) {
        Color.RED -> "Каждый"
        Color.ORANGE -> "Каждый"
        Color. YELLOW -> "Кажды"
        Color.GREEN -> "Кажды"
        Color.BLUE -> "Кажды"
        Color.INDIG0 -> "Кажды"
        Color.VIOLET -> "Кажды"
    }
}


fun main() {
   // println(Color.GREEN.rgb())
    var raduga = raduga(Color.ORANGE)
    println(raduga)

}