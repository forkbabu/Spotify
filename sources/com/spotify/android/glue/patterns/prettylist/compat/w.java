package com.spotify.android.glue.patterns.prettylist.compat;

import android.widget.TextView;

/* access modifiers changed from: package-private */
public class w implements i {
    final /* synthetic */ TextView a;
    final /* synthetic */ y b;

    w(y yVar, TextView textView, TextView textView2) {
        this.b = yVar;
        this.a = textView2;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.i
    public void a(CharSequence charSequence) {
        this.b.e.setTitle(charSequence);
        this.b.a.setTitle(String.valueOf(charSequence));
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.i
    public TextView c() {
        return this.a;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.i
    public void f(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
