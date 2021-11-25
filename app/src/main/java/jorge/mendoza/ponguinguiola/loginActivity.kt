package jorge.mendoza.ponguinguiola

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var login: Button = findViewById(R.id.btnIniciarSesion)
        var registrarse: Button = findViewById(R.id.btnRegistrarse)

        login.setOnClickListener {
            var intent: Intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        registrarse.setOnClickListener {
            var intent: Intent = Intent(this, RegistrarseActivity::class.java)
            startActivity(intent)
        }

    }
}