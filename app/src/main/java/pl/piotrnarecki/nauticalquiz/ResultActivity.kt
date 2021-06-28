package pl.piotrnarecki.nauticalquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_result)


        val username = intent.getStringExtra(Constans.USER_NAME)
        tv_name.text = username

        val totalQuestions = intent.getIntExtra(Constans.TOTAL_QUESTIONS, 0)

        val correctAnswer = intent.getIntExtra(Constans.CORRECT_ANSWERS, 0)


        tv_score.text = "Your score is $correctAnswer of $totalQuestions"

        btn_finish.text = "FINISH"

        btn_finish.setOnClickListener()
        {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }


    }

}