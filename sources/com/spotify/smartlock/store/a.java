package com.spotify.smartlock.store;

import com.google.android.gms.tasks.c;
import com.google.android.gms.tasks.g;

public final /* synthetic */ class a implements c {
    public final /* synthetic */ f a;
    public final /* synthetic */ SmartlockProviderCallback b;
    public final /* synthetic */ String c;

    public /* synthetic */ a(f fVar, SmartlockProviderCallback smartlockProviderCallback, String str) {
        this.a = fVar;
        this.b = smartlockProviderCallback;
        this.c = str;
    }

    @Override // com.google.android.gms.tasks.c
    public final void a(g gVar) {
        this.a.h(this.b, this.c, gVar);
    }
}
