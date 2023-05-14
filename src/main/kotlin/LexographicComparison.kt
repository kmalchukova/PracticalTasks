fun main() {
    val string1 = "абвг"
    val string2 = "абвгчк"
    val resultLexographicComparison = compareString(string1,string2)
    if(resultLexographicComparison<0)
    {
        println("Строка '${string1}' меньше строки '${string2}'")
    }
    if(resultLexographicComparison>0)
    {
        println("Строка '${string1}' больше строки'${string2}'")
    }
    if(resultLexographicComparison==0)
    {
        println("Строка '${string1}' равна строке '${string2}'")
    }
    println("Разница: ${resultLexographicComparison}")
}
fun compareString(string1:String, string2:String):Int {
    val minLenghtString = minOf(string1.length,string2.length)
    for(i in 0 until minLenghtString)
    {
        val difference = string1[i]-string2[i]
        if(difference!=0)
        {
            return difference
        }
    }
    return string1.length-string2.length
}