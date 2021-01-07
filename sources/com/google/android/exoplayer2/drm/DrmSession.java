package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.q;
import java.io.IOException;

public interface DrmSession<T extends q> {

    public static class DrmSessionException extends IOException {
        public DrmSessionException(Throwable th) {
            super(th);
        }
    }

    void a();

    boolean b();

    T c();

    void d();

    byte[] e();

    DrmSessionException f();

    int getState();
}
