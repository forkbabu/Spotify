package com.spotify.smartlock.store;

import com.google.android.gms.tasks.c;
import com.google.android.gms.tasks.g;

public final /* synthetic */ class d implements c {
    public final /* synthetic */ f a;
    public final /* synthetic */ SmartlockProviderCallback b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d(f fVar, SmartlockProviderCallback smartlockProviderCallback, boolean z) {
        this.a = fVar;
        this.b = smartlockProviderCallback;
        this.c = z;
    }

    @Override // com.google.android.gms.tasks.c
    public final void a(g gVar) {
        this.a.e(this.b, this.c, gVar);
    }
}
