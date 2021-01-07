package com.spotify.android.glue.patterns.prettylist.compat;

/* access modifiers changed from: package-private */
public class z implements g {
    final /* synthetic */ c0 a;

    z(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.g
    public void setText(CharSequence charSequence) {
        this.a.e.setText(charSequence);
        this.a.d.setTitle(charSequence);
        this.a.a.setTitle(String.valueOf(charSequence));
    }
}
