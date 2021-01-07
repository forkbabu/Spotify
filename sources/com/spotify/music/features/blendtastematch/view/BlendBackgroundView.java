package com.spotify.music.features.blendtastematch.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class BlendBackgroundView extends View {
    private final Path a;
    private final Paint b;
    private LinearGradient c;
    private LinearGradient f;
    private LinearGradient n;
    private final float o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;

    public BlendBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f == null || isDirty()) {
            this.f = new LinearGradient(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.q, this.p, Shader.TileMode.MIRROR);
        }
        this.b.setShader(this.f);
        if (canvas != null) {
            canvas.drawPaint(this.b);
        }
        if (this.n == null || isDirty()) {
            this.n = new LinearGradient(0.0f, 0.0f, ((float) getWidth()) / 2.0f, 0.0f, this.r, this.s, Shader.TileMode.CLAMP);
        }
        this.b.setShader(this.n);
        if (canvas != null) {
            canvas.save();
        }
        if (canvas != null) {
            canvas.drawRect(0.0f, ((float) getHeight()) / 2.0f, ((float) getWidth()) / 2.0f, (float) getHeight(), this.b);
        }
        if (canvas != null) {
            canvas.rotate(180.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        }
        if (canvas != null) {
            canvas.drawRect(0.0f, ((float) getHeight()) / 2.0f, ((float) getWidth()) / 2.0f, (float) getHeight(), this.b);
        }
        if (canvas != null) {
            canvas.restore();
        }
        if (this.c == null || isDirty()) {
            this.c = new LinearGradient(-((float) getWidth()), -((float) getWidth()), (float) getWidth(), (float) getWidth(), this.p, this.q, Shader.TileMode.CLAMP);
        }
        this.b.setShader(this.c);
        this.a.reset();
        if (canvas != null) {
            canvas.save();
        }
        if (canvas != null) {
            canvas.translate(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        }
        this.a.moveTo(((float) getWidth()) / 2.0f, (((float) getWidth()) / 2.0f) - this.o);
        this.a.lineTo(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        this.a.lineTo((((float) getHeight()) / 2.0f) - this.o, ((float) getHeight()) / 2.0f);
        this.a.lineTo(((float) (-getWidth())) / 2.0f, (((float) (-getWidth())) / 2.0f) + this.o);
        this.a.lineTo(((float) (-getWidth())) / 2.0f, ((float) (-getHeight())) / 2.0f);
        this.a.lineTo((((float) (-getHeight())) / 2.0f) + this.o, ((float) (-getHeight())) / 2.0f);
        this.a.close();
        if (canvas != null) {
            canvas.drawPath(this.a, this.b);
        }
        if (canvas != null) {
            canvas.restore();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlendBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.a = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.b = paint;
        Context context2 = getContext();
        h.d(context2, "context");
        double dimension = (double) (context2.getResources().getDimension(C0707R.dimen.taste_match_bar_width) / 2.0f);
        this.o = (float) Math.hypot(dimension, dimension);
        this.p = a.b(context, R.color.royal_blue);
        this.q = a.b(context, R.color.violet);
        this.r = a.b(context, R.color.black_30);
        this.s = a.b(context, R.color.black_0);
    }
}
