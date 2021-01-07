package com.spotify.android.glue.patterns.prettylist.compat;

import android.widget.LinearLayout;

/* access modifiers changed from: package-private */
public class x implements h {
    final /* synthetic */ LinearLayout a;
    final /* synthetic */ y b;

    x(y yVar, LinearLayout linearLayout) {
        this.b = yVar;
        this.a = linearLayout;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.h
    public LinearLayout b() {
        return this.a;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.g
    public void setText(CharSequence charSequence) {
        this.b.e.setTitle(charSequence);
        this.b.a.setTitle(String.valueOf(charSequence));
    }
}
