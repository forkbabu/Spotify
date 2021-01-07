package com.spotify.smartlock.store;

import com.google.android.gms.tasks.g;

public final /* synthetic */ class c implements com.google.android.gms.tasks.c {
    public final /* synthetic */ f a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ SmartlockProviderCallback c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ c(f fVar, String[] strArr, SmartlockProviderCallback smartlockProviderCallback, boolean z) {
        this.a = fVar;
        this.b = strArr;
        this.c = smartlockProviderCallback;
        this.d = z;
    }

    @Override // com.google.android.gms.tasks.c
    public final void a(g gVar) {
        this.a.g(this.b, this.c, this.d, gVar);
    }
}
