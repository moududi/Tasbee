package iamreach.kingtect.tosbbicouter

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import iamreach.kingtect.tosbbicouter.databinding.ActivityMain3Binding


class MainActivity3 : AppCompatActivity() {//============End Appcompact=================

    var count = 0;

    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val ss = intent.getStringExtra("text1").toString()

        binding.textView2.setText(ss)
        binding.button4.setText(ss)

        binding.button4.setOnClickListener { View ->
            count ++
            binding.textView7.setText("$count")
        }

        binding.munis.setOnClickListener { View ->
            if (count > 0) {
                count--
                binding.textView7.setText("-$count")
            }
            binding.rset.setOnClickListener { View ->
                count = 0
                binding.textView7.setText("$count")
            }


        }


    }//===========End Oncreate ==========
        override fun onBackPressed() {
// Build the alert dialog
        val builder = AlertDialog.Builder(this)
                builder.setTitle("Exit Confirmation")
        builder.setIcon(R.drawable.icon)
        builder.setMessage("আপনি কি আপ থেকে বের হতে চান?")
        builder.setPositiveButton("হ্যাঁ") { dialog, which ->
            // Exit the app when "Yes" is clicked
            finishAffinity()
        }
        builder.setNegativeButton("না") { dialog, which ->
            // Dismiss the dialog and do nothing when "No" is clicked
            dialog.dismiss()
        }

        // Show the alert dialog
        val alertDialog: AlertDialog = builder.create()
        alertDialog.show()
    }
}