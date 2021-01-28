package cs.mad.flashcards.entities

data class FlashcardSet(val term: String, val definition: String) {
    fun hard_ten(): Array<FlashcardSet> {
        return arrayOf(
            FlashcardSet("one", "one"),
            FlashcardSet("two", "two"),
            FlashcardSet("three", "three"),
            FlashcardSet("four", "four"),
            FlashcardSet("five", "five"),
            FlashcardSet("six", "six"),
            FlashcardSet("seven", "seven"),
            FlashcardSet("eight", "eight"),
            FlashcardSet("nine", "nine"),
            FlashcardSet("ten", "ten")
        )
    }
}