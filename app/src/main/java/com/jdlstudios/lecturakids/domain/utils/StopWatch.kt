package com.jdlstudios.lecturakids.domain.utils

import android.os.Handler
import android.os.SystemClock

@Suppress("DEPRECATION")
class StopWatch(private val onTick: (Long) -> Unit) {
    private var startTime: Long = 0
    private var running: Boolean = false
    private val handler = Handler()
    private val tickRunnable = object : Runnable {
        override fun run() {
            val elapsedTime = getElapsedTime()
            onTick(elapsedTime)
            handler.postDelayed(this, 1000) // Programar la siguiente ejecución después de 1 segundo
        }
    }

    fun start() {
        if (!running) {
            startTime = SystemClock.elapsedRealtime()
            running = true
            handler.post(tickRunnable) // Iniciar el seguimiento del tiempo cada segundo
        }
    }

    fun stop() {
        if (running) {
            running = false
            handler.removeCallbacks(tickRunnable) // Detener el seguimiento del tiempo
        }
    }

    private fun getElapsedTime(): Long {
        return if (running) {
            SystemClock.elapsedRealtime() - startTime
        } else {
            0
        }
    }
}