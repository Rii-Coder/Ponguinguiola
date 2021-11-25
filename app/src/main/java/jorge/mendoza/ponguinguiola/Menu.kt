package jorge.mendoza.ponguinguiola

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var salir: ImageView = findViewById(R.id.SalirImg)
        var perfil: ImageView = findViewById(R.id.PerfilImg)
        var realizarDonativo: Button = findViewById(R.id.btnRealizarDonativo)
        var estadoCuenta: Button = findViewById(R.id.btnEstadoCuenta)
        var misDonaciones: Button = findViewById(R.id.btnMisDonaciones)

        salir.setOnClickListener {
            var intent: Intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }
        perfil.setOnClickListener {
            var intent: Intent = Intent(this, RegistrarseActivity::class.java)
            startActivity(intent)
        }
        realizarDonativo.setOnClickListener {
            var intent: Intent = Intent(this, RegistrarseActivity::class.java)
            startActivity(intent)
        }
        estadoCuenta.setOnClickListener {
            var intent: Intent = Intent(this, RegistrarseActivity::class.java)
            startActivity(intent)
        }
        misDonaciones.setOnClickListener {
            var intent: Intent = Intent(this, RegistrarseActivity::class.java)
            startActivity(intent)
        }

    }
}