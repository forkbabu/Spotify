package com.spotify.libs.connect.picker.view;

import android.widget.ImageView;

public class f implements j {
    private final ImageView a;
    private final m b;

    public f(ImageView imageView, m mVar) {
        this.a = imageView;
        this.b = mVar;
    }

    @Override // com.spotify.libs.connect.picker.view.j
    public void b() {
        this.a.setVisibility(8);
    }

    @Override // com.spotify.libs.connect.picker.view.j
    public void c(int i, int i2) {
        this.a.getLayoutParams().width = i;
        this.a.getLayoutParams().height = i2;
        this.a.requestLayout();
    }

    @Override // com.spotify.libs.connect.picker.view.j
    public ImageView d() {
        return this.a;
    }

    @Override // com.spotify.libs.connect.picker.view.j
    public void e() {
        this.a.setImageDrawable(this.b.f());
        this.a.setVisibility(0);
    }

    @Override // com.spotify.libs.connect.picker.view.j
    public boolean isVisible() {
        return this.a.getVisibility() == 0;
    }
}
