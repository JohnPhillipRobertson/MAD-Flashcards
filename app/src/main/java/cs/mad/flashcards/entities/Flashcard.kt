package cs.mad.flashcards.entities

data class Flashcard(val term: String, val definition: String) {
    fun hard_ten(): Array<Flashcard> {
        return arrayOf(
            Flashcard("one", "one"),
            Flashcard("two", "two"),
            Flashcard("three", "three"),
            Flashcard("four", "four"),
            Flashcard("five", "five"),
            Flashcard("six", "six"),
            Flashcard("seven", "seven"),
            Flashcard("eight", "eight"),
            Flashcard("nine", "nine"),
            Flashcard("ten", "ten")
        )
    }
}