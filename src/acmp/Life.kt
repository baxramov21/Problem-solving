package acmp

class Life {
    fun ourLife(hardships: String) {
        val our_words_to_opponents = "Fuck off"
        print(our_words_to_opponents)

        if (hardships == "Hard") {
            print("It doesn't matter")
        } else if (hardships == "Really hard") {
            print("It will make us even stronger")
        }

        val we_are_alive = true

        while (we_are_alive) {
            print("It will continue")
        }

        val time_we_are_waiting_for = false
        do {
            print("Stand, tolerate, fight")
        } while (time_we_are_waiting_for == false)

        val what_we_do = "Love, Travel, Success"
        val what_they_do = "Suffer, Cry, Jealous"

        when (time_we_are_waiting_for) {
            true -> {
                print(what_we_do)
                print(what_they_do)
            }
        }
        val only_rule = "IT'S NOT OVER UNTIL WE WIN"
        print(only_rule)
    }
}