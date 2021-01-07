package com.spotify.music.libs.freetiertrackpreview.logging;

import com.google.protobuf.u;
import com.spotify.music.preview.v;
import com.spotify.remoteconfig.f8;
import io.reactivex.s;

public final class b implements fjf<TrackPreviewEventLoggerImpl> {
    private final wlf<gl0<u>> a;
    private final wlf<v> b;
    private final wlf<f8> c;
    private final wlf<s<Boolean>> d;

    public b(wlf<gl0<u>> wlf, wlf<v> wlf2, wlf<f8> wlf3, wlf<s<Boolean>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new TrackPreviewEventLoggerImpl(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
