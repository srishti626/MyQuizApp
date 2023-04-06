package eu.tutorials.myquizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWER:String="correct_answer"

    fun getQuestions():ArrayList<Question>{
        val questionList=ArrayList<Question>()

        val que1=Question(
            1,"what country does this flag belong to?",
            R.drawable.a1,"argentina","" +
                    "australia","armenia","austria",1

        )
        questionList.add(que1)

        val que2=Question(
            1,"what country does this flag belong to?",
            R.drawable.a2,"argentina","" +
                    "australia","armenia","austria",3

        )
        questionList.add(que2)

        val que3=Question(
            1,"what country does this flag belong to?",
            R.drawable.a3,"argentina","" +
                    "australia","belgium","austria",4

        )
        questionList.add(que3)

        val que4=Question(
            1,"what country does this flag belong to?",
            R.drawable.a4,"argentina","" +
                    "denmark","armenia","austria",2

        )
        questionList.add(que4)

        val que5=Question(
            1,"what country does this flag belong to?",
            R.drawable.a5,"fiji","" +
                    "australia","armenia","austria",1

        )
        questionList.add(que5)

        val que6=Question(
            1,"what country does this flag belong to?",
            R.drawable.a6,"argentina","" +
                    "germany","armenia","austria",2

        )
        questionList.add(que6)

        val que7=Question(
            1,"what country does this flag belong to?",
            R.drawable.a7,"argentina","" +
                    "australia","armenia","india",4

        )
        questionList.add(que7)

        val que8=Question(
            1,"what country does this flag belong to?",
            R.drawable.a8,"argentina","" +
                    "australia","new_zealand","austria",3

        )
        questionList.add(que8)

        return questionList
    }
}