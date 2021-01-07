package com.spotify.music.yourlibrary.quickscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.spotify.music.C0707R;
import com.spotify.music.yourlibrary.quickscroll.h;

/* access modifiers changed from: package-private */
public abstract class k {

    /* access modifiers changed from: package-private */
    public interface a {
    }

    /* access modifiers changed from: package-private */
    public static class b {
        private final int a;
        private final Context b;
        private final AttributeSet c;
        private final int d;
        private final int e;

        b(int i, Context context, AttributeSet attributeSet, int i2, int i3) {
            this.a = i;
            this.b = context;
            this.c = attributeSet;
            this.d = i2;
            this.e = i3;
        }

        private boolean a(TypedArray typedArray, int i, int i2) {
            return typedArray.getBoolean(i, this.b.getResources().getBoolean(i2));
        }

        private int b(TypedArray typedArray, int i, int i2) {
            return typedArray.getInt(i, this.b.getResources().getInteger(i2));
        }

        /* access modifiers changed from: package-private */
        public k c() {
            TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(this.c, b0.a, this.d, this.e);
            boolean z = this.a == 1;
            boolean a2 = a(obtainStyledAttributes, 7, C0707R.bool.quickscroll_default_initially_visible);
            boolean a3 = a(obtainStyledAttributes, 12, C0707R.bool.quickscroll_default_with_handler);
            int b2 = b(obtainStyledAttributes, 0, C0707R.integer.quickscroll_default_alpha_animation_duration);
            int b3 = b(obtainStyledAttributes, 9, C0707R.integer.quickscroll_default_padding_animation_duration);
            int color = obtainStyledAttributes.getColor(2, androidx.core.content.a.b(this.b, C0707R.color.quickscroll_default_handler_background_color));
            int color2 = obtainStyledAttributes.getColor(1, androidx.core.content.a.b(this.b, C0707R.color.quickscroll_default_handler_arrows_color));
            int color3 = obtainStyledAttributes.getColor(4, androidx.core.content.a.b(this.b, C0707R.color.quickscroll_default_indicator_background_color));
            int color4 = obtainStyledAttributes.getColor(5, androidx.core.content.a.b(this.b, C0707R.color.quickscroll_default_indicator_text_color));
            boolean a4 = a(obtainStyledAttributes, 11, C0707R.bool.quickscroll_default_should_disappear_on_top);
            boolean a5 = a(obtainStyledAttributes, 10, C0707R.bool.quickscroll_default_should_disappear_on_bottom);
            h.b bVar = new h.b();
            bVar.j(z);
            bVar.i(a2);
            bVar.o(a3);
            bVar.e((long) b(obtainStyledAttributes, 3, C0707R.integer.quickscroll_default_inactivity_duration));
            bVar.h((int) obtainStyledAttributes.getDimension(6, this.b.getResources().getDimension(C0707R.dimen.quickscroll_default_initial_indicator_padding)));
            bVar.k((int) obtainStyledAttributes.getDimension(8, this.b.getResources().getDimension(C0707R.dimen.quickscroll_default_offset_indicator_padding)));
            bVar.a(b2);
            bVar.l(b3);
            bVar.d(color);
            bVar.c(color2);
            bVar.f(color3);
            bVar.g(color4);
            bVar.n(a4);
            bVar.m(a5);
            k b4 = bVar.b();
            obtainStyledAttributes.recycle();
            return b4;
        }
    }

    k() {
    }

    /* access modifiers changed from: package-private */
    public abstract int a();

    /* access modifiers changed from: package-private */
    public abstract int b();

    /* access modifiers changed from: package-private */
    public abstract int c();

    /* access modifiers changed from: package-private */
    public abstract long d();

    /* access modifiers changed from: package-private */
    public abstract int e();

    /* access modifiers changed from: package-private */
    public abstract int f();

    /* access modifiers changed from: package-private */
    public abstract int g();

    /* access modifiers changed from: package-private */
    public abstract boolean h();

    /* access modifiers changed from: package-private */
    public abstract boolean i();

    /* access modifiers changed from: package-private */
    public abstract int j();

    /* access modifiers changed from: package-private */
    public abstract int k();

    /* access modifiers changed from: package-private */
    public abstract boolean l();

    /* access modifiers changed from: package-private */
    public abstract boolean m();

    /* access modifiers changed from: package-private */
    public abstract a n();

    /* access modifiers changed from: package-private */
    public abstract boolean o();
}
