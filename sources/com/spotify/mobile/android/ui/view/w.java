package com.spotify.mobile.android.ui.view;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

public class w extends PaintDrawable {

    class a extends ShapeDrawable.ShaderFactory {
        final /* synthetic */ int[] a;
        final /* synthetic */ float[] b;

        a(w wVar, int[] iArr, float[] fArr) {
            this.a = iArr;
            this.b = fArr;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i, int i2) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, (float) i2, this.a, this.b, Shader.TileMode.REPEAT);
        }
    }

    public w(int[] iArr, float[] fArr) {
        if (iArr.length == fArr.length) {
            a aVar = new a(this, iArr, fArr);
            setShape(new RectShape());
            setShaderFactory(aVar);
            return;
        }
        throw new IllegalArgumentException("Colors and positions must be the same size");
    }
}
