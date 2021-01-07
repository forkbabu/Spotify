package com.spotify.android.stories.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import com.spotify.music.C0707R;

public final class PausableProgressBar extends FrameLayout {
    private final View a;
    private final View b;
    private final View c;
    private c f;
    private long n;
    private b o;

    /* access modifiers changed from: package-private */
    public class a extends k62 {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (PausableProgressBar.this.o != null) {
                a aVar = (a) PausableProgressBar.this.o;
                aVar.a.d(aVar.b);
            }
        }

        @Override // defpackage.k62, android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            PausableProgressBar.this.c.setVisibility(8);
            PausableProgressBar.this.b.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
    }

    /* access modifiers changed from: private */
    public static class c extends ScaleAnimation {
        private long a;
        private boolean b;

        c(float f, float f2, float f3, float f4, int i, float f5, int i2, float f6) {
            super(f, f2, f3, f4, i, f5, i2, f6);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (!this.b) {
                this.a = 0;
                this.b = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.b = false;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            if (this.b && this.a == 0) {
                this.a = j - getStartTime();
            }
            if (this.b) {
                setStartTime(j - this.a);
            }
            return super.getTransformation(j, transformation, f);
        }
    }

    public PausableProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void d() {
        c cVar = this.f;
        if (cVar != null) {
            cVar.b();
        }
    }

    public void e() {
        c cVar = this.f;
        if (cVar != null) {
            cVar.c();
        }
    }

    public void f() {
        this.b.setAnimation(null);
        c cVar = this.f;
        if (cVar != null) {
            cVar.setAnimationListener(null);
            this.f.cancel();
            this.f = null;
        }
        this.b.setVisibility(4);
        this.c.setVisibility(0);
    }

    public void g() {
        this.b.setAnimation(null);
        c cVar = this.f;
        if (cVar != null) {
            cVar.setAnimationListener(null);
            this.f.cancel();
            this.f = null;
        }
        this.b.setVisibility(4);
        this.c.setVisibility(8);
    }

    public View getCurrentProgressBar() {
        return this.b;
    }

    public View getMaxProgressBar() {
        return this.c;
    }

    public void h() {
        c cVar = new c(0.0f, 1.0f, 1.0f, 1.0f, 1, q4.o(this) == 1 ? 1.0f : 0.0f, 1, 0.0f);
        this.f = cVar;
        cVar.setDuration(this.n);
        this.f.setInterpolator(new LinearInterpolator());
        this.f.setAnimationListener(new a());
        this.f.setFillAfter(true);
        this.b.startAnimation(this.f);
    }

    public void setCallback(b bVar) {
        this.o = bVar;
    }

    public void setDuration(long j) {
        this.n = j;
    }

    public void setProgressBackgroundColor(int i) {
        this.a.setBackgroundColor(i);
    }

    public void setProgressColor(int i) {
        this.b.setBackgroundColor(i);
        this.c.setBackgroundColor(i);
    }

    public PausableProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = 6000;
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.pausable_progress, this);
        this.a = q4.G(inflate, C0707R.id.progress_background);
        this.b = q4.G(inflate, C0707R.id.progress_current);
        this.c = q4.G(inflate, C0707R.id.progress_max);
    }
}
