package be.tftic.web2023.demo06_persistence

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import be.tftic.web2023.demo06_persistence.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMainDemoBundle.setOnClickListener { openDemoBundle() }
        binding.btnMainDemoPref.setOnClickListener { openDemoPref() }
        binding.btnMainDemoDatastore.setOnClickListener { openDemoDatastore() }
        binding.btnMainDemoFile.setOnClickListener { openDemoFile() }
    }

    private fun openDemoDatastore() {
        val intent : Intent = Intent(this, PersistanceDataStoreActivity::class.java)
        startActivity(intent)
    }

    private fun openDemoFile() {
        val intent : Intent = Intent(this, PersistanceFileActivity::class.java)
        startActivity(intent)
    }

    private fun openDemoPref() {
        val intent : Intent = Intent(this, PersistancePrefActivity::class.java)
        startActivity(intent)
    }

    private fun openDemoBundle() {
        val intent : Intent = Intent(this, PersistenceBundleActivity::class.java)
        startActivity(intent)
    }

}