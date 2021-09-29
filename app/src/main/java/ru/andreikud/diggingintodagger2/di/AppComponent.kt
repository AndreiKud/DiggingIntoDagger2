package ru.andreikud.diggingintodagger2.di

import dagger.Component
import ru.andreikud.diggingintodagger2.ui.MainActivity

@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

}