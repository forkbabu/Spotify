package com.spotify.android.glue.patterns.prettylist.compat;

import android.widget.TextView;

/* access modifiers changed from: package-private */
public class b0 implements i {
    final /* synthetic */ TextView a;
    final /* synthetic */ c0 b;

    b0(c0 c0Var, TextView textView, TextView textView2) {
        this.b = c0Var;
        this.a = textView;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.i
    public void a(CharSequence charSequence) {
        this.b.e.setText(charSequence);
        this.b.d.setTitle(charSequence);
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
