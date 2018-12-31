import java.util.*

fun dayOfWeek(){
    println("What day is it today?")
    println("Today is " + when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        1 -> "Sunday Morning"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}

fun main(args: Array<String>) {
    // println("Hello, world!")
    dayOfWeek()
}