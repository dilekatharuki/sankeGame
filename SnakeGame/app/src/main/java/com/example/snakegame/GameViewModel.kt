package com.example.snakegame

import androidx.lifecycle.MutableLiveData

class GameViewModel {
    // LiveData to hold the score
    val score = MutableLiveData<Int>()

    init {
        // Initialize score with 0
        score.value = 0
    }

    // Function to increment the score
    fun incrementScore() {
        val currentScore = score.value ?: 0
        score.value = currentScore + 1
    }


    }