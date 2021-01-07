package com.spotify.android.glue.patterns.prettylist.compat;

import android.widget.TextView;

/* access modifiers changed from: package-private */
public class e0 implements i {
    final /* synthetic */ f0 a;

    e0(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.i
    public void a(CharSequence charSequence) {
        this.a.b.setTitle(charSequence);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.i
    public TextView c() {
        return this.a.b.getSubtitleView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.i
    public void f(CharSequence charSequence) {
        this.a.b.setSubtitle(charSequence);
    }
}
