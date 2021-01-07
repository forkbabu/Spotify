package com.spotify.android.glue.patterns.prettylist.compat;

import android.widget.TextView;

/* access modifiers changed from: package-private */
public class l implements i {
    final /* synthetic */ TextView a;
    final /* synthetic */ n b;

    l(n nVar, TextView textView) {
        this.b = nVar;
        this.a = textView;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.i
    public void a(CharSequence charSequence) {
        this.b.c.setTitle(charSequence);
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
