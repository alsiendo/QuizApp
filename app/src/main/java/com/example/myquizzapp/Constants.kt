package com.example.myquizzapp

object Constants{

    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANSWER: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "Find the correct Answer for this image :",
                R.drawable.a, "a", "i", "u", "e", 1)

        questionList.add(que1)

        val que2 = Question(
            2, "Find the correct Answer for this image :",
            R.drawable.i, "a", "i", "u", "e", 2)

        questionList.add(que2)

        val que3 = Question(
            3, "Find the correct Answer for this image :",
            R.drawable.u, "a", "i", "u", "e", 3)

        questionList.add(que3)

        val que4 = Question(
            4, "Find the correct Answer for this image :",
            R.drawable.e, "a", "i", "u", "e", 4)

        questionList.add(que4)

        val que5 = Question(
            5, "Find the correct Answer for this image :",
            R.drawable.o, "a", "o", "u", "e", 2)

        questionList.add(que5)
        return questionList
    }
}