package com.spotify.android.glue.patterns.prettylist.compat;

import android.widget.ImageView;
import android.widget.TextView;

/* access modifiers changed from: package-private */
public class v implements i {
    final /* synthetic */ TextView a;
    final /* synthetic */ ImageView b;
    final /* synthetic */ ImageView c;
    final /* synthetic */ ImageView d;
    final /* synthetic */ y e;

    v(y yVar, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        this.e = yVar;
        this.a = textView;
        this.b = imageView;
        this.c = imageView2;
        this.d = imageView3;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.i
    public void a(CharSequence charSequence) {
        this.e.e.setTitle(charSequence);
        this.e.a.setTitle(String.valueOf(charSequence));
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.i
    public TextView c() {
        return this.a;
    }

    public void d(boolean z) {
        if (z) {
            this.b.setVisibility(0);
            this.c.setVisibility(0);
            this.d.setVisibility(0);
            return;
        }
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.i
    public void f(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
