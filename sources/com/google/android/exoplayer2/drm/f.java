package com.google.android.exoplayer2.drm;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.r;

public final /* synthetic */ class f implements MediaDrm.OnEventListener {
    public final /* synthetic */ t a;
    public final /* synthetic */ r.b b;

    public /* synthetic */ f(t tVar, r.b bVar) {
        this.a = tVar;
        this.b = bVar;
    }

    @Override // android.media.MediaDrm.OnEventListener
    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        t tVar = this.a;
        r.b bVar = this.b;
        tVar.getClass();
        DefaultDrmSessionManager<T>.d dVar = DefaultDrmSessionManager.this.u;
        dVar.getClass();
        dVar.obtainMessage(i, bArr).sendToTarget();
    }
}
