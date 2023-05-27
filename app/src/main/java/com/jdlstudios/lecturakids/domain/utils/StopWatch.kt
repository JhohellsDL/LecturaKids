package com.jdlstudios.lecturakids.domain.utils

import android.os.Handler
import android.os.SystemClock

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

    fun reset() {
        startTime = 0
        running = false
        handler.removeCallbacks(tickRunnable) // Detener el seguimiento del tiempo
    }

    private fun getElapsedTime(): Long {
        return if (running) {
            SystemClock.elapsedRealtime() - startTime
        } else {
            0
        }
    }
}


    /*private var startTime: Long = 0
    private var isRunning = false

    fun start() {
        if (!isRunning) {
            startTime = System.nanoTime()
            isRunning = true
        }
    }

    fun stop() {
        if (isRunning) {
            isRunning = false
        }
    }

    fun getElapsedTime(): Long {
        if (isRunning) {
            return System.nanoTime() - startTime
        } else {
            return 0
        }
    }

    fun printElapsedTime() {
        if (isRunning) {
            Log.i("lectura","Elapsed time: ${getElapsedTime() / 1_000_000} seconds")
        } else {
            println("Elapsed time: 0 seconds")
        }
    }*/

    /*private var startTime: Long = 0
    private var running: Boolean = false

    fun start() {
        if (!running) {
            startTime = SystemClock.elapsedRealtime()
            running = true
        }
    }

    fun stop() {
        if (running) {
            running = false
        }
    }

    fun reset() {
        startTime = 0
        running = false
    }

    fun getElapsedTime(): Long {
        return if (running) {
            SystemClock.elapsedRealtime() - startTime
        } else {
            0
        }
    }*/

