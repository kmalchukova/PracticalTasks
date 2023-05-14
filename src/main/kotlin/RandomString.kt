fun randomString (n:Int, f:Boolean, k:Boolean): String {
    val listOfSymbol = mutableListOf<Char>()
    if (f && !k){
        listOfSymbol.addAll(('a'..'z')+('A'..'Z'))
    }
    else if (k && !f){
        listOfSymbol.addAll('0'..'9')
    }
    else{
        listOfSymbol.addAll(('a'..'z')+('A'..'Z')+('0'..'9'))
    }
    return (1..n)
        .map{listOfSymbol.random()}
        .joinToString ( "" )
}

fun main (){
    val resultString = randomString(5,true,false)
    println(resultString)
}
