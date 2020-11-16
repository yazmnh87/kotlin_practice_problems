//Create a function that takes a number x and a character y ("m" for male, "f" for female)
// and returns the name of an ancestor (m/f) or descendant (m/f).

fun generation(x: Int, y: String): String {
    if (y == "m") {
         return when (x) {
            -3 -> "great grandfather";
            -2 -> "grandfather"
            -1 -> "father"
            0 -> "me!"
            1 -> "son"
            2 -> "grandson"
            3 -> "great grandson"
            else -> "else"
        }
    }
    if (y == "m") {
       return when (x) {
            -3 -> "great grandfather";
            -2 -> "grandmother"
            -1 -> "mother"
            0 ->  "me!"
            1 ->  "daughter"
            2 ->"granddaughter"
            3 -> "great granddaughter"
           else -> "else"
        }
    }
    return "else"
}