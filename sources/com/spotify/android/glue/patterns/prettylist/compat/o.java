package com.spotify.android.glue.patterns.prettylist.compat;

/* access modifiers changed from: package-private */
public class o implements g {
    final /* synthetic */ q a;

    o(q qVar) {
        this.a = qVar;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.g
    public void setText(CharSequence charSequence) {
        this.a.d.setText(charSequence);
        this.a.c.setTitle(charSequence);
        this.a.a.setTitle(String.valueOf(charSequence));
    }
}
