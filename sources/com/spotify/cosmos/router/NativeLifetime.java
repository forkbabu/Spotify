package com.spotify.cosmos.router;

import java.util.concurrent.atomic.AtomicBoolean;

class NativeLifetime implements Lifetime {
    private final AtomicBoolean mDestroyed = new AtomicBoolean();
    private final long nPtr;

    private NativeLifetime(long j) {
        this.nPtr = j;
    }

    private native void release();

    @Override // com.spotify.cosmos.router.Lifetime
    public void destroy() {
        if (this.mDestroyed.compareAndSet(false, true)) {
            release();
        }
    }
}
