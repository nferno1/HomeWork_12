package nferno1.homework_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import nferno1.homework_12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var repository: Repository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        repository = RepositoryV(this)
        binding.apply {

            tView.text = repository.getText()
            bSave.setOnClickListener {

                val text = editText.text.toString()
                repository.saveText(text)
                tView.text = repository.getText()
            }
            bClear.setOnClickListener {

                repository.clearText()
                tView.text = null
            }
        }
    }
}