package ru.andreikud.diggingintodagger2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.andreikud.diggingintodagger2.R
import ru.andreikud.diggingintodagger2.di.MyApp
import ru.andreikud.diggingintodagger2.viewmodel.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as MyApp).appComponent.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}