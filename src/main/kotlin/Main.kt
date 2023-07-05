fun main() {
    name()
    number(23)
    largest(arrayOf(12, 94, 45))
    details()
    rest("Sleep eight hours")
    identity("Am female and my name is phelisia")
    val mybook = Book("Clara Auko", "The Mama Da's", 300, 2016)
    println(mybook)
}

fun name(){
    var word = "January"
    println(word[2])

    for(z in word)
        println(z)

    println(word.length)

    var detail = "It's possilbe"
    println(detail.map { it.lowercase() })

    val fruit = "orange"
}

fun number(num: Int){
    if (num ==7){
      println("neutral")
    }
    else if(num != 7){
        println("base")
    }
    else{
        println("acidic")
    }
}

fun largest(num: Array<Int>){
    println(num.max())
}

fun details(){
    var name = arrayOf("anita b", "adalab", "hopperlab", "rwanda", "kenya", "tanzania")
    println(name.sortedArray().contentToString())

}

class Human(var name: String, var gender: String, var color: String, var height: Int, var weight: Int){

    fun rest(Detail: String){
        println(Detail)

        fun idenity(name: String){
            println(name)
        }
    }

}
data class Book(var author: String, var title: String, var pages: Int, var publishedyear: Int ){

}






