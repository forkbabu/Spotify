package com.spotify.music.features.nowplayingbar.view.carousel;

import android.content.res.Resources;
import androidx.recyclerview.widget.m;
import com.google.common.collect.ImmutableList;

/* access modifiers changed from: package-private */
public class f extends m.b {
    private final Resources a;
    private final ImmutableList<ou5> b;
    private final ImmutableList<ou5> c;

    f(Resources resources, ImmutableList<ou5> immutableList, ImmutableList<ou5> immutableList2) {
        this.a = resources;
        this.b = immutableList;
        this.c = immutableList2;
    }

    @Override // androidx.recyclerview.widget.m.b
    public boolean a(int i, int i2) {
        ou5 ou5 = this.c.get(i2);
        ou5 ou52 = this.b.get(i);
        return ou5.f(this.a).equals(ou52.f(this.a)) && ou5.h(this.a).equals(ou52.h(this.a));
    }

    @Override // androidx.recyclerview.widget.m.b
    public boolean b(int i, int i2) {
        return this.c.get(i2).i().equals(this.b.get(i).i());
    }

    @Override // androidx.recyclerview.widget.m.b
    public int d() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.m.b
    public int e() {
        return this.b.size();
    }
}
