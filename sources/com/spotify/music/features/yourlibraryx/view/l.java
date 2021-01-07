package com.spotify.music.features.yourlibraryx.view;

import android.view.View;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class l implements m4 {
    final /* synthetic */ nmf a;
    final /* synthetic */ View b;

    l(nmf nmf, View view) {
        this.a = nmf;
        this.b = view;
    }

    @Override // defpackage.m4
    public final b5 onApplyWindowInsets(View view, b5 b5Var) {
        nmf nmf = this.a;
        h.d(b5Var, "insets");
        nmf.invoke(b5Var);
        q4.P(this.b, null);
        return b5Var;
    }
}
