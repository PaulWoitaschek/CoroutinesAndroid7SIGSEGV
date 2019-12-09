@file:Suppress("EXPERIMENTAL_API_USAGE")

package com.example.weirdcrash

import android.app.Activity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GlobalScope.launch {
            while (true) {
                delay(100)
                combine(flowOf(Unit), flowOf(Unit)) { _ -> Unit }.collect()
            }
        }
    }
}
