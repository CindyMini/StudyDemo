package com.mini.cindy.ciciapplication.ui.login
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mini.cindy.ciciapplication.databinding.ActivityLoginKtBinding


class LoginKt : AppCompatActivity() {

    private lateinit var binding: ActivityLoginKtBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginKtBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }


}
