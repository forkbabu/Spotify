package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;

/* access modifiers changed from: package-private */
public final class x implements c.a {
    private final /* synthetic */ g a;

    x(g gVar) {
        this.a = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z) {
        this.a.w.sendMessage(this.a.w.obtainMessage(1, Boolean.valueOf(z)));
    }
}
