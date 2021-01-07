package com.spotify.mobile.android.util.ui;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import com.google.common.base.MoreObjects;

public class d {
    private static final ArgbEvaluator d = new ArgbEvaluator();
    private int a;
    private final long b;
    private final b c;

    /* access modifiers changed from: package-private */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.c.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public interface b {
        void a(int i);
    }

    public d(int i, long j, b bVar) {
        MoreObjects.checkArgument(j > 0);
        this.a = i;
        this.b = j;
        bVar.getClass();
        this.c = bVar;
    }

    public void b(int i) {
        this.c.a(i);
        this.a = i;
    }

    public void c(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(this.a, i);
        valueAnimator.setEvaluator(d);
        valueAnimator.setDuration(this.b);
        valueAnimator.addUpdateListener(new a());
        valueAnimator.start();
        this.a = i;
    }
}
