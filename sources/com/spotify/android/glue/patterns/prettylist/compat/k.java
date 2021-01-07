package com.spotify.android.glue.patterns.prettylist.compat;

/* access modifiers changed from: package-private */
public class k implements g {
    final /* synthetic */ n a;

    k(n nVar) {
        this.a = nVar;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.g
    public void setText(CharSequence charSequence) {
        this.a.c.setTitle(charSequence);
        this.a.a.setTitle(String.valueOf(charSequence));
    }
}
