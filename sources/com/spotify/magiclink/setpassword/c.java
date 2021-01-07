package com.spotify.magiclink.setpassword;

import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class c implements w92 {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Thread b;

    public /* synthetic */ c(AtomicBoolean atomicBoolean, Thread thread) {
        this.a = atomicBoolean;
        this.b = thread;
    }

    @Override // defpackage.w92
    public final void dispose() {
        AtomicBoolean atomicBoolean = this.a;
        Thread thread = this.b;
        atomicBoolean.set(false);
        thread.interrupt();
    }
}
