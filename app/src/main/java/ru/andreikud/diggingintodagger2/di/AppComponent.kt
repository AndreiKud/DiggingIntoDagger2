package ru.andreikud.diggingintodagger2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.andreikud.diggingintodagger2.di.module.StorageModule
import ru.andreikud.diggingintodagger2.di.subcomponent.AppSubcomponents
import ru.andreikud.diggingintodagger2.di.subcomponent.LoginComponent
import ru.andreikud.diggingintodagger2.di.subcomponent.RegistrationComponent
import ru.andreikud.diggingintodagger2.di.subcomponent.UserComponent
import ru.andreikud.diggingintodagger2.login.LoginActivity
import ru.andreikud.diggingintodagger2.main.MainActivity
import ru.andreikud.diggingintodagger2.registration.RegistrationActivity
import ru.andreikud.diggingintodagger2.registration.enterdetails.EnterDetailsFragment
import ru.andreikud.diggingintodagger2.registration.termsandconditions.TermsAndConditionsFragment
import ru.andreikud.diggingintodagger2.settings.SettingsActivity
import ru.andreikud.diggingintodagger2.user.UserManager
import javax.inject.Singleton

@Component(modules = [StorageModule::class, AppSubcomponents::class])
@Singleton
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun registrationComponentFactory(): RegistrationComponent.Factory
    fun loginComponentFactory(): LoginComponent.Factory

    fun userManager(): UserManager

    fun inject(activity: LoginActivity)
}