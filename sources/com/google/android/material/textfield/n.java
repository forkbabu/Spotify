package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.c;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class n {
    private final Context a;
    private final TextInputLayout b;
    private LinearLayout c;
    private int d;
    private FrameLayout e;
    private int f;
    private Animator g;
    private final float h;
    private int i;
    private int j;
    private CharSequence k;
    private boolean l;
    private TextView m;
    private CharSequence n;
    private int o;
    private ColorStateList p;
    private CharSequence q;
    private boolean r;
    private TextView s;
    private int t;
    private ColorStateList u;
    private Typeface v;

    /* access modifiers changed from: package-private */
    public class a extends AnimatorListenerAdapter {
        final /* synthetic */ int a;
        final /* synthetic */ TextView b;
        final /* synthetic */ int c;
        final /* synthetic */ TextView f;

        a(int i, TextView textView, int i2, TextView textView2) {
            this.a = i;
            this.b = textView;
            this.c = i2;
            this.f = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            n.this.i = this.a;
            n.this.g = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.c == 1 && n.this.m != null) {
                    n.this.m.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public n(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.h = (float) context.getResources().getDimensionPixelSize(C0707R.dimen.design_textinput_caption_translate_y);
    }

    private boolean B(TextView textView, CharSequence charSequence) {
        return q4.w(this.b) && this.b.isEnabled() && (this.j != this.i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void E(int i2, int i3, boolean z) {
        TextView i4;
        TextView i5;
        if (i2 != i3) {
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.g = animatorSet;
                ArrayList arrayList = new ArrayList();
                g(arrayList, this.r, this.s, 2, i2, i3);
                g(arrayList, this.l, this.m, 1, i2, i3);
                rw.q(animatorSet, arrayList);
                animatorSet.addListener(new a(i3, i(i2), i2, i(i3)));
                animatorSet.start();
            } else if (i2 != i3) {
                if (!(i3 == 0 || (i5 = i(i3)) == null)) {
                    i5.setVisibility(0);
                    i5.setAlpha(1.0f);
                }
                if (!(i2 == 0 || (i4 = i(i2)) == null)) {
                    i4.setVisibility(4);
                    if (i2 == 1) {
                        i4.setText((CharSequence) null);
                    }
                }
                this.i = i3;
            }
            this.b.C();
            this.b.F(z);
            this.b.N();
        }
    }

    private void g(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView != null && z) {
            if (i2 == i4 || i2 == i3) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, i4 == i2 ? 1.0f : 0.0f);
                ofFloat.setDuration(167L);
                ofFloat.setInterpolator(qw.a);
                list.add(ofFloat);
                if (i4 == i2) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.h, 0.0f);
                    ofFloat2.setDuration(217L);
                    ofFloat2.setInterpolator(qw.d);
                    list.add(ofFloat2);
                }
            }
        }
    }

    private TextView i(int i2) {
        if (i2 == 1) {
            return this.m;
        }
        if (i2 != 2) {
            return null;
        }
        return this.s;
    }

    /* access modifiers changed from: package-private */
    public void A(Typeface typeface) {
        if (typeface != this.v) {
            this.v = typeface;
            TextView textView = this.m;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
            TextView textView2 = this.s;
            if (textView2 != null) {
                textView2.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void C(CharSequence charSequence) {
        f();
        this.k = charSequence;
        this.m.setText(charSequence);
        int i2 = this.i;
        if (i2 != 1) {
            this.j = 1;
        }
        E(i2, this.j, B(this.m, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void D(CharSequence charSequence) {
        f();
        this.q = charSequence;
        this.s.setText(charSequence);
        int i2 = this.i;
        if (i2 != 2) {
            this.j = 2;
        }
        E(i2, this.j, B(this.s, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void d(TextView textView, int i2) {
        if (this.c == null && this.e == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            this.b.addView(this.c, -1, -2);
            this.e = new FrameLayout(this.a);
            this.c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.b.getEditText() != null) {
                e();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.e.setVisibility(0);
            this.e.addView(textView);
            this.f++;
        } else {
            this.c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        this.d++;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if ((this.c == null || this.b.getEditText() == null) ? false : true) {
            q4.Q(this.c, q4.r(this.b.getEditText()), 0, q4.q(this.b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        if (this.j != 1 || this.m == null || TextUtils.isEmpty(this.k)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public CharSequence j() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public CharSequence k() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public int l() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList m() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence n() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public int o() {
        TextView textView = this.s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.k = null;
        f();
        if (this.i == 1) {
            if (!this.r || TextUtils.isEmpty(this.q)) {
                this.j = 0;
            } else {
                this.j = 2;
            }
        }
        E(this.i, this.j, B(this.m, null));
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public void s(TextView textView, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.c;
        if (linearLayout != null) {
            if (!(i2 == 0 || i2 == 1) || (frameLayout = this.e) == null) {
                linearLayout.removeView(textView);
            } else {
                int i3 = this.f - 1;
                this.f = i3;
                if (i3 == 0) {
                    frameLayout.setVisibility(8);
                }
                this.e.removeView(textView);
            }
            int i4 = this.d - 1;
            this.d = i4;
            LinearLayout linearLayout2 = this.c;
            if (i4 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t(CharSequence charSequence) {
        this.n = charSequence;
        TextView textView = this.m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(boolean z) {
        if (this.l != z) {
            f();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.a);
                this.m = appCompatTextView;
                appCompatTextView.setId(C0707R.id.textinput_error);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.m.setTextAlignment(5);
                }
                Typeface typeface = this.v;
                if (typeface != null) {
                    this.m.setTypeface(typeface);
                }
                int i2 = this.o;
                this.o = i2;
                TextView textView = this.m;
                if (textView != null) {
                    this.b.x(textView, i2);
                }
                ColorStateList colorStateList = this.p;
                this.p = colorStateList;
                TextView textView2 = this.m;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = this.n;
                this.n = charSequence;
                TextView textView3 = this.m;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                this.m.setVisibility(4);
                q4.K(this.m, 1);
                d(this.m, 0);
            } else {
                p();
                s(this.m, 0);
                this.m = null;
                this.b.C();
                this.b.N();
            }
            this.l = z;
        }
    }

    /* access modifiers changed from: package-private */
    public void v(int i2) {
        this.o = i2;
        TextView textView = this.m;
        if (textView != null) {
            this.b.x(textView, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        this.p = colorStateList;
        TextView textView = this.m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void x(int i2) {
        this.t = i2;
        TextView textView = this.s;
        if (textView != null) {
            c.n(textView, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void y(boolean z) {
        if (this.r != z) {
            f();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.a);
                this.s = appCompatTextView;
                appCompatTextView.setId(C0707R.id.textinput_helper_text);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.s.setTextAlignment(5);
                }
                Typeface typeface = this.v;
                if (typeface != null) {
                    this.s.setTypeface(typeface);
                }
                this.s.setVisibility(4);
                q4.K(this.s, 1);
                int i2 = this.t;
                this.t = i2;
                TextView textView = this.s;
                if (textView != null) {
                    c.n(textView, i2);
                }
                ColorStateList colorStateList = this.u;
                this.u = colorStateList;
                TextView textView2 = this.s;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                d(this.s, 1);
            } else {
                f();
                int i3 = this.i;
                if (i3 == 2) {
                    this.j = 0;
                }
                E(i3, this.j, B(this.s, null));
                s(this.s, 1);
                this.s = null;
                this.b.C();
                this.b.N();
            }
            this.r = z;
        }
    }

    /* access modifiers changed from: package-private */
    public void z(ColorStateList colorStateList) {
        this.u = colorStateList;
        TextView textView = this.s;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
