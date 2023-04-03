package com.manash.classwork

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CustomViewDemo1(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    var circleColor = Color.CYAN
    var borderColor =Color.BLACK
    var borderSize=5.0f
    var size =320

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        drawCircle(canvas)
    }
    fun drawCircle(c: Canvas?){

        paint.color =circleColor
        val radius=size/2f

        c?.drawCircle(size/2f, size/2f, radius,paint)
        paint.color=borderColor
        c?.drawCircle(size/2f, size/2f, radius-borderSize/2f,paint)
    }
}

