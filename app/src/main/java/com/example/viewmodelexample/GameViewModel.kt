package com.example.viewmodelexample

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class GameViewModel: ViewModel() {
    var word=""
    var score=0
    private lateinit var wordList: MutableList<String>

    private  fun resetList(){
        wordList= mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar",
            "sad",
            "desk",
            "guitar",
            "home",
            "railway",
            "zebra",
            "jelly",
            "car",
            "crow",
            "trade",
            "bag",
            "roll",
            "bubble"
        )
        wordList.shuffle()
    }
    init {
        resetList()
        nextWord()
        Log.i("gameViewModel","created game model")

    }

    private fun nextWord() {
        if(wordList.isNotEmpty()){
            word=wordList.removeAt(0)

        }
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("gameViewModel","created game model")
    }
}