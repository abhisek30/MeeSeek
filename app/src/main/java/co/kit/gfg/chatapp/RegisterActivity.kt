package co.kit.gfg.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    lateinit var handler: DatabaseHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        handler= DatabaseHelper(this)


        btnLogRegister.setOnClickListener {
            onBackPressed()
        }
        reg_button.setOnClickListener{
            handler.insertUserData(reg_bluetooth_name.text.toString(),reg_username.text.toString(),reg_password.text.toString())
                Toast.makeText(this,"Values Inserted", Toast.LENGTH_LONG).show()

        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right)
    }

}
