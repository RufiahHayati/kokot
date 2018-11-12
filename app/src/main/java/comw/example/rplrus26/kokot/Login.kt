package comw.example.rplrus26.kokot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin_Login.setOnClickListener {
            var username = edUsername_Login.text.toString()
            var password = edPassword_Login.text.toString()
            if (username.equals("Rufiah")&&password.equals("1028"))
                Toast.makeText(applicationContext, "Sukses Login username kamu $username", Toast.LENGTH_SHORT).show()
            else Toast.makeText(applicationContext,"Gagal Login", Toast.LENGTH_SHORT).show()
        }
    }
}
