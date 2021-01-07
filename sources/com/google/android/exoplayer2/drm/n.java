package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.q;

public interface n<T extends q> {
    public static final n<q> a = new a();

    static class a implements n<q> {
        a() {
        }

        @Override // com.google.android.exoplayer2.drm.n
        public boolean a(l lVar) {
            return false;
        }

        @Override // com.google.android.exoplayer2.drm.n
        public Class<q> b(l lVar) {
            return null;
        }

        /* Return type fixed from 'com.google.android.exoplayer2.drm.DrmSession' to match base method */
        @Override // com.google.android.exoplayer2.drm.n
        public /* synthetic */ DrmSession<q> c(Looper looper, int i) {
            return m.a(this, looper, i);
        }

        @Override // com.google.android.exoplayer2.drm.n
        public /* synthetic */ void d() {
            m.c(this);
        }

        @Override // com.google.android.exoplayer2.drm.n
        public DrmSession<q> e(Looper looper, l lVar) {
            return new p(new DrmSession.DrmSessionException(new UnsupportedDrmException(1)));
        }

        @Override // com.google.android.exoplayer2.drm.n
        public /* synthetic */ void k() {
            m.b(this);
        }
    }

    boolean a(l lVar);

    Class<? extends q> b(l lVar);

    DrmSession<T> c(Looper looper, int i);

    void d();

    DrmSession<T> e(Looper looper, l lVar);

    void k();
}
