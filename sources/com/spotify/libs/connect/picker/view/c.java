package com.spotify.libs.connect.picker.view;

import android.widget.ImageView;

public class c implements k {
    private final ImageView a;
    private final m b;
    private boolean c = false;

    public c(ImageView imageView, m mVar) {
        this.a = imageView;
        this.b = mVar;
    }

    public void a() {
        this.a.setVisibility(0);
        if (!this.c) {
            ImageView imageView = this.a;
            imageView.setImageDrawable(this.b.d(imageView));
            this.c = true;
        }
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
        this.a.setVisibility(0);
        this.a.setImageDrawable(this.b.c());
        this.c = false;
    }

    @Override // com.spotify.libs.connect.picker.view.j
    public boolean isVisible() {
        return this.a.getVisibility() == 0;
    }
}
