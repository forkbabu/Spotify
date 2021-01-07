package com.spotify.music.features.browse.component.findcard;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.squareup.picasso.f0;

public class d {
    private final View a;
    private final FindCardView b;
    private final c74 c = new c74(this);

    public d(Context context, ViewGroup viewGroup) {
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.find_category_card, viewGroup, false);
        this.a = inflate;
        this.b = (FindCardView) inflate.findViewById(C0707R.id.card);
    }

    public View a() {
        return this.b;
    }

    public int b() {
        return this.b.getCurrentTextColor();
    }

    public f0 c() {
        return this.c;
    }

    public View d() {
        return this.b.getLabelView();
    }

    public View e() {
        return this.a;
    }

    public void f() {
        this.b.c(null, false);
    }

    public void g(Bitmap bitmap, boolean z) {
        this.b.c(bitmap, z);
    }

    public void h(int i, int i2) {
        this.b.b(i, i2);
    }

    public void i(float f) {
        this.b.setInnerImageCornerRadius(f);
    }

    public void j(boolean z) {
        if (z) {
            this.b.setRtl(z);
        }
    }

    public void k(String str) {
        this.b.setLabelText(str);
    }
}
