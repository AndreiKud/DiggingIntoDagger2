package ru.andreikud.diggingintodagger2.di.subcomponent

import dagger.Subcomponent
import ru.andreikud.diggingintodagger2.di.scope.LoggedUserScope
import ru.andreikud.diggingintodagger2.main.MainActivity
import ru.andreikud.diggingintodagger2.settings.SettingsActivity

@Subcomponent
@LoggedUserScope
interface UserComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)
}