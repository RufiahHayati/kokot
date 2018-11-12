package comw.example.rplrus26.kokot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registrasi.*

class Registrasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        btnRegistrasi_Registrasi.setOnClickListener {
            var username = edUsername_Regis.text.toString()
            var nama = edNama_Regis.text.toString()
            var password = edPassword_Regis.text.toString()
            if (username.equals("")&&nama.equals("")&&password.equals(""))
                Toast.makeText(applicationContext, "Isi semua kolom ", Toast.LENGTH_SHORT).show()
            else Toast.makeText(applicationContext,"Registrasi Sukses username anda "+username, Toast.LENGTH_SHORT).show()


        }
    }
}
