package com.spotify.android.glue.patterns.prettylist;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* access modifiers changed from: package-private */
public class e extends d {
    public e(PrettyHeaderView prettyHeaderView, ImageView imageView, View view, int i) {
        super(prettyHeaderView, imageView, view, i);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public int a() {
        if (this.d) {
            return 0 + this.c.getMeasuredHeight();
        }
        return 0;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public ImageView b() {
        View view = this.c;
        if (view instanceof r) {
            return ((r) view).getBackgroundImageView();
        }
        return this.b;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public boolean c() {
        return false;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public void d(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        this.j = 0;
        if (this.d) {
            i5 = this.c.getMeasuredHeight() + 0;
            this.c.layout(0, 0, i6, i5);
        } else {
            i5 = 0;
        }
        View view = this.f;
        if (view != null) {
            int measuredWidth = (i6 - view.getMeasuredWidth()) / 2;
            int measuredHeight = i5 - (this.f.getMeasuredHeight() / 2);
            View view2 = this.f;
            view2.layout(measuredWidth, measuredHeight, view2.getMeasuredWidth() + measuredWidth, this.f.getMeasuredHeight() + measuredHeight);
        }
        if (this.g != null) {
            int a = a();
            View view3 = this.g;
            view3.layout(0, a, i6, view3.getMeasuredHeight() + a);
        }
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (View.MeasureSpec.getMode(i) == 0) {
            i = View.MeasureSpec.makeMeasureSpec(200, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        View view = this.f;
        int i7 = 0;
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
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            View view4 = this.g;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            if (layoutParams == null) {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            }
            view4.measure(makeMeasureSpec, i6);
            i4 = this.g.getMeasuredHeight();
        } else {
            i4 = 0;
        }
        if (this.d) {
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                i2 = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - (i3 / 2)) - i4, 1073741824);
            }
            this.c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            if (this.f == null && this.c.getMeasuredHeight() < (i5 = this.m)) {
                this.c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((i5 - (i3 / 2)) - i4, 1073741824));
            }
            i7 = this.c.getMeasuredHeight();
        }
        this.o = size;
        this.n = (i3 / 2) + i7 + i4;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public void f(int i) {
        View view = this.c;
        if (view instanceof r) {
            ((r) view).getBackgroundImageView().setColorFilter(i);
        } else {
            this.b.setColorFilter(i);
        }
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public void g(int i) {
        this.r = i;
        ((a) this.c).setCoordinatorAccessoryOffset(i);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public void h(int i) {
        ((b) this.c).setColor(i);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public void i(boolean z) {
        View view = this.c;
        if (view instanceof r) {
            ((r) view).setHasFixedSize(true);
        }
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public void j(int i, float f) {
        int measuredHeight = this.a.getMeasuredHeight() - this.i;
        if (measuredHeight != 0) {
            this.p.o(0.0f);
            this.k = i;
            int i2 = this.h;
            float f2 = (float) measuredHeight;
            float o = nud.o((float) i2, f2, 0.0f, (float) (measuredHeight - i2), (float) nud.d(this.h, measuredHeight, i));
            float f3 = ((float) this.h) / f2;
            ((b) this.c).a((int) o, nud.o(f3, 1.0f, 0.0f, 1.0f, nud.c(f3, 1.0f, f)));
        }
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public void k(int i) {
        this.h = i;
        ((b) this.c).setTopOffset(this.i + i);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.d
    public void l(int i) {
        this.i = i;
        ((b) this.c).setTopOffset(i + this.h);
    }
}
