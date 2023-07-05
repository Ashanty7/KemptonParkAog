/*
 * //By Shantell Nkwana
 * //2023
 */
package com.example.kemptonparkaog.View

import android.os.Bundle
import android.view.View
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.kemptonparkaog.R
import com.example.kemptonparkaog.databinding.WelcomeActivityBinding

class WelcomeActivity : AppCompatActivity(R.layout.welcome_activity) {
    private lateinit var binding: WelcomeActivityBinding
    private lateinit var navController: NavController
    private val toolbar: Toolbar
        get() = findViewById(R.id.toolbar)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setSupportActionBar(toolbar)
        onBackPressedDispatcher()

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.kemptonParkAOGNavigationGraph) as NavHostFragment
        navController = navHostFragment.navController
        setupActionBarWithNavController(navController)
    }

    private fun onBackPressedDispatcher() {
        onBackPressedDispatcher.addCallback {
            findNavController(R.id.kemptonParkAOGNavigationGraph).popBackStack()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    fun showToolBar() {
        toolbar.visibility = View.VISIBLE
    }

    fun hideToolBar() {
        toolbar.visibility = View.GONE
    }

    fun setToolBarTitle(title: String) {
        toolbar.title = title
    }
}