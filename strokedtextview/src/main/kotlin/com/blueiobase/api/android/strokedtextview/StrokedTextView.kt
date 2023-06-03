package com.blueiobase.api.android.strokedtextview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import androidx.annotation.ColorInt
import androidx.annotation.Dimension
import androidx.appcompat.widget.AppCompatTextView

/**
 * Textview capable of adding strokes or outlines to texts.
 * @author IO DevBlue
 * @since 1.0.0
 */
class StrokedTextView @JvmOverloads constructor (mContext: Context, attr: AttributeSet? = null, defStyle: Int = 0): AppCompatTextView(mContext, attr, defStyle) {

    /** The stroke color. */
    @ColorInt var strokeColor = 0
        set(value) {
            field = value
            invalidate()
        }

    /** The stroke width. */
    @Dimension var strokeWidth = 0F
        set(value) {
            field = value
            invalidate()
        }

    /** The current text color. */
    @ColorInt private var mTextColor = 0

    init {
       initAttr(attr)
    }

    ///////////////////////////////////////////////////////////////////////////
    // OVERRIDE FUNCTIONS
    ///////////////////////////////////////////////////////////////////////////
    override fun onDraw(canvas: Canvas?) {
        paintToOutline()
        super.onDraw(canvas)
        paintToRegular()
        super.onDraw(canvas)
    }



    ///////////////////////////////////////////////////////////////////////////
    // PRIVATE FUNCTIONS
    ///////////////////////////////////////////////////////////////////////////
    /**
     * Initialize the [StrokedTextView].
     * @param attr [AttributeSet] containing configuration settings.
     */
    private fun initAttr(attr: AttributeSet?) {
        mTextColor = currentTextColor
        attr?.let {
            context.obtainStyledAttributes(it, R.styleable.StrokedTextView).apply {
                strokeColor = getColor(R.styleable.StrokedTextView_textStrokeColor, currentTextColor)
                strokeWidth = getFloat(R.styleable.StrokedTextView_textStrokeWidth, 0F)
            }.recycle()
        }
    }

    /** Applies the stroke to the [StrokedTextView]. */
    private fun paintToOutline() {
        paint.apply {
            style = Paint.Style.STROKE
            strokeWidth = this@StrokedTextView.strokeWidth
            setTextColor(strokeColor)
        }
    }

    /** Removes the stroke from the [StrokedTextView]. */
    private fun paintToRegular() {
        paint.apply {
            style = Paint.Style.FILL
            strokeWidth = 0F
            super.setTextColor(mTextColor)
        }
    }
}