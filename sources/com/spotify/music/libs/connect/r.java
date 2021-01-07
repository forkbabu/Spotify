package com.spotify.music.libs.connect;

import com.spotify.mobile.android.observablestates.localspeaker.LocalSpeakerStatus;
import io.reactivex.s;

public final class r implements fjf<DefaultConnectHeadsetPluggedStatusProvider> {
    private final wlf<s<LocalSpeakerStatus>> a;

    public r(wlf<s<LocalSpeakerStatus>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new DefaultConnectHeadsetPluggedStatusProvider(this.a.get());
    }
}
