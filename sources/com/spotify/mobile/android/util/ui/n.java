package com.spotify.mobile.android.util.ui;

import android.content.Intent;

/* access modifiers changed from: package-private */
public final class n implements qg0<l> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Intent c;

    n(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.qg0
    public void accept(l lVar) {
        lVar.b(this.a, this.b, this.c);
    }

    public String toString() {
        return "Event.ON_ACTIVITY_RESULT";
    }
}
