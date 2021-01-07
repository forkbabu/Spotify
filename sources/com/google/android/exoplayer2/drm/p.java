package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.q;

public final class p<T extends q> implements DrmSession<T> {
    private final DrmSession.DrmSessionException a;

    public p(DrmSession.DrmSessionException drmSessionException) {
        this.a = drmSessionException;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void a() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean b() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public T c() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void d() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public byte[] e() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public DrmSession.DrmSessionException f() {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
        return 1;
    }
}
