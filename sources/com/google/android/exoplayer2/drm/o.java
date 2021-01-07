package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.drm.q;
import com.google.android.exoplayer2.drm.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class o<T extends q> implements r<T> {
    @Override // com.google.android.exoplayer2.drm.r
    public Class<T> a() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.r
    public Map<String, String> b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.r
    public T c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.r
    public void d() {
    }

    @Override // com.google.android.exoplayer2.drm.r
    public r.d e() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.r
    public byte[] f() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.r
    public void g(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.r
    public void h(r.b<? super T> bVar) {
    }

    @Override // com.google.android.exoplayer2.drm.r
    public void i(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.r
    public void j(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.r
    public byte[] k(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.r
    public r.a l(byte[] bArr, List<l.b> list, int i, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }
}
