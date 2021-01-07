package com.spotify.android.glue.patterns.prettylist;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.mobile.android.util.x;

/* access modifiers changed from: package-private */
public class f extends d {
    private final c t;
    private float u = -1.0f;
    private final int v;
    private int w;

    public f(PrettyHeaderView prettyHeaderView, ImageView imageView, View view, int i, u uVar) {
        super(prettyHeaderView, imageView, view, i);
        this.p = uVar;
        this.t = new c(imageView);
        this.v = nud.h(imageView.getContext(), 16842836);
    }

    private InsetDrawable m(int i) {
        View view = this.f;
        boolean z = view instanceof Button;
        int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{this.v, i});
        if (z) {
            measuredHeight = this.l;
        }
        return new InsetDrawable((Drawable) gradientDrawable, 0, 0, 0, measuredHeight);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public int a() {
        int i = this.h + this.i;
        if (this.d) {
            i += this.c.getMeasuredHeight();
        }
        int i2 = 0;
        View view = this.f;
        if (view != null) {
            i2 = view.getMeasuredHeight();
        }
        return (i2 / 2) + i + this.r;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public boolean c() {
        return true;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public void d(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        this.t.b();
        int i6 = this.i;
        int i7 = this.h;
        int i8 = i6 + i7;
        this.j = i8;
        if (this.d) {
            int max = this.e ? Math.max(this.k - i7, 0) + i8 : i8;
            int measuredHeight = this.c.getMeasuredHeight();
            this.c.layout(0, max, i5, max + measuredHeight);
            i8 += measuredHeight;
        }
        View view = this.f;
        if (view != null) {
            int measuredWidth = (i5 - view.getMeasuredWidth()) / 2;
            View view2 = this.f;
            view2.layout(measuredWidth, i8, view2.getMeasuredWidth() + measuredWidth, this.f.getMeasuredHeight() + i8);
        }
        if (this.g != null) {
            int a = a();
            View view3 = this.g;
            view3.layout(0, a, i5, view3.getMeasuredHeight() + a);
        }
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (View.MeasureSpec.getMode(i) == 0) {
            i = View.MeasureSpec.makeMeasureSpec(200, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        View view = this.f;
        int i6 = 0;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (this.s && this.f.getMeasuredWidth() > size - (this.l * 2)) {
                int paddingLeft = this.f.getPaddingLeft() - ((this.f.getMeasuredWidth() - (size - (this.l * 2))) / 2);
                if (paddingLeft < 0) {
                    paddingLeft = 0;
                }
                this.f.setPadding(paddingLeft, 0, paddingLeft, 0);
                this.f.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            i3 = this.f.getMeasuredHeight();
            View view2 = this.c;
            if (view2 instanceof b) {
                ((b) view2).setAccessoryMargin(i3 / 2);
            }
        } else {
            i3 = 0;
        }
        View view3 = this.g;
        if (view3 != null) {
            view3.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            i4 = this.g.getMeasuredHeight();
        } else {
            i4 = 0;
        }
        if (this.d) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                i2 = View.MeasureSpec.makeMeasureSpec(((((View.MeasureSpec.getSize(i2) - i3) - i4) - this.i) - this.h) - this.r, 1073741824);
            }
            this.c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            if (this.f == null && this.c.getMeasuredHeight() < (i5 = this.m)) {
                this.c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(((((i5 - i3) - i4) - this.i) - this.h) - this.r, 1073741824));
            }
            i6 = this.c.getMeasuredHeight();
        }
        int i7 = this.h + i6 + this.i + i3 + i4 + this.r;
        this.t.c(size, i7, a());
        this.o = size;
        this.n = i7;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public void h(int i) {
        PrettyHeaderView.HeaderInternalImageView headerInternalImageView = (PrettyHeaderView.HeaderInternalImageView) this.b;
        if (headerInternalImageView.a() && this.w != i) {
            this.w = i;
            int a = ovd.a(i, 0.4f);
            if (!q4.w(this.a) || Build.VERSION.SDK_INT < 19) {
                headerInternalImageView.e(m(a));
                return;
            }
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(this.v), m(a)});
            headerInternalImageView.e(transitionDrawable);
            transitionDrawable.startTransition(200);
        }
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public void i(boolean z) {
        this.t.e(true);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public void j(int i, float f) {
        float f2;
        this.k = i;
        if (this.d) {
            int max = Math.max(i - this.h, 0);
            if (this.e) {
                View view = this.c;
                view.offsetTopAndBottom((this.j + max) - view.getTop());
            }
        }
        if (this.d) {
            if (this.e) {
                f2 = Math.max(0.0f, Math.min(9.5f - (10.0f * f), 1.0f));
            } else {
                f2 = Math.max(0.0f, Math.min(1.0f - (2.0f * f), 1.0f));
            }
            this.c.setAlpha(f2);
        }
        this.t.f(i);
        if (this.p != null && !TextUtils.isEmpty(this.q)) {
            float max2 = this.d ? Math.max(0.0f, (f * 4.0f) - 1.0f) / 3.0f : 1.0f;
            if (Math.abs(this.u - max2) >= 0.01f) {
                this.u = max2;
                if (x.f(this.b.getContext())) {
                    this.p.o(1.0f);
                } else {
                    this.p.o(max2);
                }
            }
        }
    }
}
