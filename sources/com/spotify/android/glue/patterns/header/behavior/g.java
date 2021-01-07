package com.spotify.android.glue.patterns.header.behavior;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* access modifiers changed from: package-private */
public class g {
    private final View a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;

    public g(View view) {
        this.a = view;
    }

    private void e() {
        int i = this.d;
        if (this.h) {
            i = Math.max(this.f, Math.min(this.g, i));
        }
        View view = this.a;
        q4.A(view, i - (view.getTop() - this.b));
        View view2 = this.a;
        q4.z(view2, this.e - (view2.getLeft() - this.c));
        if (Build.VERSION.SDK_INT < 23) {
            View view3 = this.a;
            int i2 = q4.g;
            float translationX = view3.getTranslationX();
            view3.setTranslationX(translationX + 1.0f);
            view3.setTranslationX(translationX);
            ViewParent parent = this.a.getParent();
            if (parent instanceof View) {
                View view4 = (View) parent;
                float translationX2 = view4.getTranslationX();
                view4.setTranslationX(1.0f + translationX2);
                view4.setTranslationX(translationX2);
            }
        }
    }

    public int a() {
        return this.d;
    }

    public void b() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
        e();
    }

    public boolean c(int i) {
        if (this.d == i) {
            return false;
        }
        this.d = i;
        e();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void d(int i, int i2) {
        this.f = i;
        this.g = i2;
        this.h = true;
    }
}
