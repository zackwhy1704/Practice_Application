package com.example.android.practice_application

import javax.inject.Inject

class Repository @Inject constructor()  {
    fun getMessage() = "from Repository"
}

