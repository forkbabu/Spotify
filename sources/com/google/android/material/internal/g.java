package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

public final class g {
    private final ArrayList<b> a = new ArrayList<>();
    private b b = null;
    ValueAnimator c = null;
    private final Animator.AnimatorListener d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g gVar = g.this;
            if (gVar.c == animator) {
                gVar.c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {
        final int[] a;
        final ValueAnimator b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(bVar);
    }

    public void b() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.c = null;
        }
    }

    public void c(int[] iArr) {
        b bVar;
        ValueAnimator valueAnimator;
        int size = this.a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.a.get(i);
            if (StateSet.stateSetMatches(bVar.a, iArr)) {
                break;
            }
            i++;
        }
        b bVar2 = this.b;
        if (bVar != bVar2) {
            if (!(bVar2 == null || (valueAnimator = this.c) == null)) {
                valueAnimator.cancel();
                this.c = null;
            }
            this.b = bVar;
            if (bVar != null) {
                ValueAnimator valueAnimator2 = bVar.b;
                this.c = valueAnimator2;
                valueAnimator2.start();
            }
        }
    }
}
