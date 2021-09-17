package ru.andreikud.diggingintodagger2.di.subcomponent

import dagger.Subcomponent
import ru.andreikud.diggingintodagger2.di.scope.ActivityScope
import ru.andreikud.diggingintodagger2.login.LoginActivity

@ActivityScope
@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(activity: LoginActivity)
}