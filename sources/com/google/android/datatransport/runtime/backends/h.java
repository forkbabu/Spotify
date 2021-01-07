package com.google.android.datatransport.runtime.backends;

import android.content.Context;

class h {
    private final Context a;
    private final ti b;
    private final ti c;

    h(Context context, ti tiVar, ti tiVar2) {
        this.a = context;
        this.b = tiVar;
        this.c = tiVar2;
    }

    /* access modifiers changed from: package-private */
    public g a(String str) {
        return new c(this.a, this.b, this.c, str);
    }
}
