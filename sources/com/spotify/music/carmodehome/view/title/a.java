package com.spotify.music.carmodehome.view.title;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.h;

public final class a extends ViewPager2.g {
    private boolean a;
    private int b;
    private final ViewPager2 c;
    private final HomeTitleView d;

    public a(ViewPager2 viewPager2, HomeTitleView homeTitleView) {
        h.e(viewPager2, "viewPager");
        h.e(homeTitleView, "titleView");
        this.c = viewPager2;
        this.d = homeTitleView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void a(int i) {
        if (i == 0) {
            this.a = false;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void b(int i, float f, int i2) {
        boolean z = true;
        if (this.c.getCurrentItem() == i) {
            f = ((float) 1) - f;
        } else if (this.c.getCurrentItem() - i != 1) {
            f = 0.0f;
        }
        if (!this.a) {
            if (i >= this.c.getCurrentItem()) {
                z = false;
            }
            this.d.m(f, z);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public void c(int i) {
        int i2 = this.b;
        if (i2 < i) {
            this.a = true;
            this.d.k();
        } else if (i2 > i) {
            this.a = true;
            this.d.l();
        }
        this.b = i;
    }
}
