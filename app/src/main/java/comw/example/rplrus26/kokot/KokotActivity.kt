package comw.example.rplrus26.kokot

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kokot.*

class KokotActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kokot)

        btnlogin_home.setOnClickListener {
            var login = Intent (applicationContext,Login::class.java)
            startActivity(login)
        }
        btnregistrasi.setOnClickListener {
            var registrasi = Intent(applicationContext,Registrasi::class.java)
            startActivity(registrasi)
        }
    }
}
