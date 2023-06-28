/*
 * //By Shantell Nkwana
 * //2023
 */
package com.example.kemptonparkaog

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.kemptonparkaog.databinding.WelcomeActivityBinding
import kotlinx.android.synthetic.main.welcome_activity.toolbar

class WelcomeActivity : AppCompatActivity(R.layout.welcome_activity) {
    private lateinit var binding: WelcomeActivityBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = WelcomeActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setSupportActionBar(toolbar)
    }

    fun showToolbar() {
        findViewById<Toolbar>(R.id.toolbar).visibility = View.VISIBLE
    }

    fun setToolbarTitle(title: String) {
        findViewById<Toolbar>(R.id.toolbar).title = title
    }
}