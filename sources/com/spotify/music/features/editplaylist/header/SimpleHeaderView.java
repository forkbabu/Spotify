package com.spotify.music.features.editplaylist.header;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.android.glue.patterns.header.behavior.e;
import com.spotify.android.glue.patterns.header.headers.v2.a;
import com.spotify.music.C0707R;

public class SimpleHeaderView extends FrameLayout implements c {
    public static final /* synthetic */ int n = 0;
    private final FrameLayout a;
    private qc0 b;
    private e c;
    private int f;

    public SimpleHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static void b(int i, float f2, Drawable drawable) {
        if (drawable instanceof a) {
            ((a) drawable).a(i, f2);
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            for (int i2 = 0; i2 < layerDrawable.getNumberOfLayers(); i2++) {
                b(i, f2, layerDrawable.getDrawable(i2));
            }
        }
    }

    private void c() {
        if (q4.w(this)) {
            if (!(Build.VERSION.SDK_INT >= 18 ? isInLayout() : false)) {
                requestLayout();
            }
        }
    }

    private FrameLayout.LayoutParams getContentLayoutParams() {
        return (FrameLayout.LayoutParams) this.a.getLayoutParams();
    }

    @Override // com.spotify.android.glue.patterns.header.headers.v2.a
    public void a(int i, float f2) {
        setTranslationY((float) i);
        this.a.setTranslationY((float) (-i));
        qc0 qc0 = this.b;
        if (qc0 instanceof tc0) {
            ((tc0) qc0).e0(i, f2);
        }
        b(i, f2, getBackground());
        b(i, f2, getForeground());
        this.c.a(f2);
    }

    @Override // com.spotify.music.features.editplaylist.header.c
    public int getStickyAreaSize() {
        return this.f;
    }

    @Override // com.spotify.android.glue.patterns.header.headers.a
    public int getTotalScrollRange() {
        return getMeasuredHeight() - this.f;
    }

    @Override // com.spotify.android.glue.patterns.header.headers.a
    public View getView() {
        return this;
    }

    public void setContentBottomMargin(int i) {
        getContentLayoutParams().bottomMargin = i;
        c();
    }

    public void setContentTopMargin(int i) {
        getContentLayoutParams().topMargin = i;
        c();
    }

    public void setContentViewBinder(qc0 qc0) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        qc0 qc02 = this.b;
        if (qc02 != null) {
            this.a.removeView(qc02.getView());
        }
        this.b = qc0;
        if (qc0 != null) {
            this.a.addView(qc0.getView(), layoutParams);
        }
    }

    public void setScrollObserver(e eVar) {
        if (eVar == null) {
            eVar = b.a;
        }
        this.c = eVar;
    }

    public void setStickyAreaSize(int i) {
        this.f = i;
    }

    public SimpleHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = b.a;
        LayoutInflater.from(context).inflate(C0707R.layout.simple_header_view, (ViewGroup) this, true);
        this.a = (FrameLayout) findViewById(C0707R.id.header_content);
    }
}
