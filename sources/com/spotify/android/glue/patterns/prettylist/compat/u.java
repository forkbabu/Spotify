package com.spotify.android.glue.patterns.prettylist.compat;

/* access modifiers changed from: package-private */
public class u implements g {
    final /* synthetic */ y a;

    u(y yVar) {
        this.a = yVar;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.g
    public void setText(CharSequence charSequence) {
        this.a.e.setTitle(charSequence);
        this.a.a.setTitle(String.valueOf(charSequence));
    }
}
