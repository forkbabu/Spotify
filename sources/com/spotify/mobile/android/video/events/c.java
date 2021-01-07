package com.spotify.mobile.android.video.events;

import com.spotify.mobile.android.video.drm.EncryptionType;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ EncryptionType b;
    public final /* synthetic */ long c;

    public /* synthetic */ c(e0 e0Var, EncryptionType encryptionType, long j) {
        this.a = e0Var;
        this.b = encryptionType;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.i(this.b, this.c);
    }
}
