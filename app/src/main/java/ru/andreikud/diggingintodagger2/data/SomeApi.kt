package ru.andreikud.diggingintodagger2.data

import okhttp3.Response
import retrofit2.http.GET

interface SomeApi {

    @GET
    suspend fun someRequest(): Response

}