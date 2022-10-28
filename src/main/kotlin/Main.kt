import com.google.gson.Gson

fun main(args: Array<String>) {
    val people = People("Frogo", 25)
    println(Gson().toJson(people))
}