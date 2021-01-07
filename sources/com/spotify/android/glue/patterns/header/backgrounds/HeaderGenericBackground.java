package com.spotify.android.glue.patterns.header.backgrounds;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.android.glue.patterns.header.transformations.a;
import com.spotify.android.glue.patterns.header.transformations.f;
import com.spotify.android.glue.patterns.prettylist.c;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

public class HeaderGenericBackground extends FrameLayout implements a {
    private final b a;
    private ImageView b;
    private final VisualStyle c;
    private c f;
    private TransformationSet n;

    public enum VisualStyle {
        COLOR_ONLY(false, true),
        IMAGE_ONLY(true, false),
        IMAGE_AND_COLOR(true, true);
        
        private final boolean mDrawsColorLayer;
        private final boolean mDrawsImage;

        private VisualStyle(boolean z, boolean z2) {
            this.mDrawsImage = z;
            this.mDrawsColorLayer = z2;
        }
    }

    public HeaderGenericBackground(Context context, VisualStyle visualStyle) {
        super(context);
        this.c = visualStyle;
        b bVar = new b(context);
        this.a = bVar;
        if (visualStyle != VisualStyle.COLOR_ONLY) {
            bVar.e(BitmapRenderer.ALPHA_VISIBLE);
            ImageView imageView = new ImageView(context);
            this.b = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(this.b, 0);
            this.f = new c(this.b);
            if (visualStyle == VisualStyle.IMAGE_AND_COLOR) {
                this.n = new f(0.0f, 0.5f).c().d(1.0f, 0.0f).f(a.b(this.b, View.ALPHA)).c().b();
            } else {
                this.n = TransformationSet.c;
            }
        }
        setWillNotDraw(false);
    }

    @Override // com.spotify.android.glue.patterns.header.backgrounds.a
    public void a(int i, float f2) {
        c cVar = this.f;
        if (cVar != null) {
            cVar.f(i);
            this.n.a(f2);
        }
        this.a.g();
        invalidate();
    }

    @Override // com.spotify.android.glue.patterns.header.backgrounds.a
    public void clear() {
        if (this.c.mDrawsImage) {
            this.b.setImageDrawable(null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.b || !this.c.mDrawsImage) {
            return super.drawChild(canvas, view, j);
        }
        if (this.c.mDrawsColorLayer) {
            this.a.a(canvas);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        this.a.b(canvas);
        return drawChild;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.r
    public ImageView getBackgroundImageView() {
        return this.b;
    }

    @Override // com.spotify.android.glue.patterns.header.backgrounds.a
    public View getView() {
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.c.mDrawsImage) {
            this.a.a(canvas);
            this.a.b(canvas);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.c.mDrawsImage) {
            this.f.b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.c(getMeasuredWidth(), getMeasuredHeight());
        if (this.c.mDrawsImage) {
            this.f.c(getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.c(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // com.spotify.android.glue.patterns.prettylist.r
    public void setAvoidCroppingImageWithParallax(boolean z) {
        this.f.d(z);
    }

    public void setColor(int i) {
        setSolidColor(i);
    }

    public void setGradientOffset(int i) {
        this.a.f(i);
        invalidate();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.r
    public void setHasFixedSize(boolean z) {
        this.f.e(z);
    }

    @Override // com.spotify.android.glue.patterns.header.backgrounds.a
    public void setSolidColor(int i) {
        this.a.d(i);
        invalidate();
    }
}
