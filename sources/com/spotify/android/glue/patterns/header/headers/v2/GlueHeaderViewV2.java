package com.spotify.android.glue.patterns.header.headers.v2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.header.behavior.e;
import com.spotify.music.C0707R;

@CoordinatorLayout.c(GlueHeaderV2Behavior.class)
public class GlueHeaderViewV2 extends FrameLayout implements com.spotify.android.glue.patterns.header.headers.a {
    private static final e n = new a();
    private final FrameLayout a;
    private qc0 b;
    private int c;
    private e f;

    static class a implements e {
        a() {
        }

        @Override // com.spotify.android.glue.patterns.header.behavior.e
        public void a(float f) {
        }
    }

    public GlueHeaderViewV2(Context context, AttributeSet attributeSet) {
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
        FrameLayout frameLayout = this.a;
        frameLayout.offsetTopAndBottom((i - frameLayout.getTop()) + getContentLayoutParams().topMargin);
        qc0 qc0 = this.b;
        if (qc0 instanceof tc0) {
            ((tc0) qc0).e0(i, f2);
        }
        b(i, f2, getBackground());
        b(i, f2, getForeground());
        this.f.a(f2);
    }

    @Override // com.spotify.android.glue.patterns.header.headers.a
    public int getTotalScrollRange() {
        return getMeasuredHeight() - this.c;
    }

    @Override // com.spotify.android.glue.patterns.header.headers.a
    public View getView() {
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        qc0 qc0 = this.b;
        if (qc0 instanceof sc0) {
            ((sc0) qc0).b();
        }
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
        this.f = (e) MoreObjects.firstNonNull(eVar, n);
    }

    public void setStickyAreaSize(int i) {
        this.c = i;
    }

    public GlueHeaderViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = n;
        LayoutInflater.from(context).inflate(C0707R.layout.glue_header_v2, (ViewGroup) this, true);
        if (Build.VERSION.SDK_INT < 23) {
            setLayerType(1, null);
        }
        View findViewById = findViewById(C0707R.id.header_content);
        findViewById.getClass();
        this.a = (FrameLayout) findViewById;
    }
}
