package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class c {
    int a = Integer.MAX_VALUE;
    int b = Integer.MAX_VALUE;
    int c = Integer.MIN_VALUE;
    int d = Integer.MIN_VALUE;
    int e;
    int f;
    int g;
    int h;
    int i;
    float j;
    float k;
    int l;
    int m;
    List<Integer> n = new ArrayList();
    int o;
    int p;
    boolean q;
    boolean r;

    c() {
    }

    public int a() {
        return this.h - this.i;
    }

    /* access modifiers changed from: package-private */
    public void b(View view, int i2, int i3, int i4, int i5) {
        b bVar = (b) view.getLayoutParams();
        this.a = Math.min(this.a, (view.getLeft() - bVar.z1()) - i2);
        this.b = Math.min(this.b, (view.getTop() - bVar.h0()) - i3);
        this.c = Math.max(this.c, view.getRight() + bVar.X1() + i4);
        this.d = Math.max(this.d, view.getBottom() + bVar.w1() + i5);
    }
}
