package jorge.mendoza.ponguinguiola

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class EstadoCuentaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estado_cuenta)

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