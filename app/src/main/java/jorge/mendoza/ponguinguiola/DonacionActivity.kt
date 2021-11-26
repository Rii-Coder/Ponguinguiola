package jorge.mendoza.ponguinguiola

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DonacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donacion)

        var salir: ImageView = findViewById(R.id.SalirImg)
        var perfil: ImageView = findViewById(R.id.PerfilImg)


        perfil.setOnClickListener {
            var intent: Intent = Intent(this, MiPerfilActivity::class.java)
            startActivity(intent)
        }

        salir.setOnClickListener {
            var intent: Intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}