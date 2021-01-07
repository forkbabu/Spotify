package com.spotify.wakeword.sensory;

import com.google.protobuf.u;
import com.spotify.messages.WakeWordProviderError;
import com.spotify.messages.WakeWordProviderRunning;
import com.spotify.messages.WakeWordProviderStatus;

/* access modifiers changed from: package-private */
public class f0 implements fif {
    private final gl0<u> a;

    f0(gl0<u> gl0) {
        this.a = gl0;
    }

    @Override // defpackage.fif
    public void a(WakeWordProviderRunning wakeWordProviderRunning) {
        this.a.c(wakeWordProviderRunning);
    }

    @Override // defpackage.fif
    public void b(WakeWordProviderError wakeWordProviderError) {
        this.a.c(wakeWordProviderError);
    }

    @Override // defpackage.fif
    public void c(WakeWordProviderStatus wakeWordProviderStatus) {
        this.a.c(wakeWordProviderStatus);
    }
}
