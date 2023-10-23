package iamreach.kingtect.tosbbicouter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import iamreach.kingtect.tosbbicouter.databinding.ActivityMain2Binding
import iamreach.kingtect.tosbbicouter.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.button.setOnClickListener {View ->
            intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("text1","সুবাহানআল্লাহ" )
            startActivity(intent)
        }
        binding.button2.setOnClickListener {View ->
            intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("text1","আলহামদুল্লাহ" )
            startActivity(intent)
        }
        binding.button3.setOnClickListener {View ->
            intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("text1","আল্লাহুকবার" )
            startActivity(intent)
        }
    }
}