package com.android.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.android.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_thumbs_up_down extends SVGRenderer {

    public ic_thumbs_up_down(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(12.0f, 6.0f);
        mPath.rCubicTo(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.lineTo(5.82f, 5.0f);
        mPath.rLineTo(0.66f, -3.18f);
        mPath.rLineTo(0.02f, -0.23f);
        mPath.rCubicTo(0.0f, -0.31f, -0.13f, -0.59f, -0.33f, -0.8f);
        mPath.lineTo(5.38f, 0.0f);
        mPath.lineTo(0.44f, 4.94f);
        mPath.cubicTo(0.17f, 5.21f, 0.0f, 5.59f, 0.0f, 6.0f);
        mPath.rLineTo(0f, 6.5f);
        mPath.rCubicTo(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        mPath.rLineTo(6.75f, 0f);
        mPath.rCubicTo(0.62f, 0.0f, 1.15f, -0.38f, 1.38f, -0.91f);
        mPath.rLineTo(2.26f, -5.29f);
        mPath.rCubicTo(0.07f, -0.17f, 0.11f, -0.36f, 0.11f, -0.55f);
        mPath.lineTo(12.0f, 6.0f);
        mPath.close();
        mPath.moveTo(12.0f, 6.0f);
        mPath.rMoveTo(10.5f, 4.0f);
        mPath.rLineTo(-6.75f, 0f);
        mPath.rCubicTo(-0.62f, 0.0f, -1.15f, 0.38f, -1.38f, 0.91f);
        mPath.rLineTo(-2.26f, 5.29f);
        mPath.rCubicTo(-0.07f, 0.17f, -0.11f, 0.36f, -0.11f, 0.55f);
        mPath.lineTo(12.0f, 18.0f);
        mPath.rCubicTo(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        mPath.rLineTo(5.18f, 0f);
        mPath.rLineTo(-0.66f, 3.18f);
        mPath.rLineTo(-0.02f, 0.24f);
        mPath.rCubicTo(0.0f, 0.31f, 0.13f, 0.59f, 0.33f, 0.8f);
        mPath.rLineTo(0.79f, 0.78f);
        mPath.rLineTo(4.94f, -4.94f);
        mPath.rCubicTo(0.27f, -0.27f, 0.44f, -0.65f, 0.44f, -1.06f);
        mPath.rLineTo(0f, -6.5f);
        mPath.rCubicTo(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        mPath.close();
        mPath.moveTo(22.5f, 10.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}