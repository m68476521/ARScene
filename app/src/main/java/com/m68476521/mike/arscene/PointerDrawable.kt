package com.m68476521.mike.arscene

import android.graphics.*
import android.graphics.drawable.Drawable

class PointerDrawable : Drawable() {

    private val paint = Paint()
    var enabled: Boolean = false
    override fun draw(p0: Canvas) {
        val cx = bounds.width() / 2
        val cy = bounds.height() / 2
        if (enabled) {
            paint.color = Color.GREEN
            p0.drawCircle(cx.toFloat(), cy.toFloat(), 10.toFloat(), paint)
        } else {
            paint.color = Color.GRAY
            p0.drawText("X", cx.toFloat(), cy.toFloat(), paint)
        }
    }

    override fun setAlpha(p0: Int) {

    }

    override fun getOpacity(): Int {
        return PixelFormat.TRANSLUCENT
    }

    override fun setColorFilter(p0: ColorFilter?) {

    }
}