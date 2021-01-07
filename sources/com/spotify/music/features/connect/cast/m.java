package com.spotify.music.features.connect.cast;

import com.google.protobuf.u;
import com.spotify.messages.CastSDKErrors;

public class m implements l {
    private final gl0<u> a;

    public m(gl0<u> gl0) {
        this.a = gl0;
    }

    private void d(String str, int i) {
        CastSDKErrors.b l = CastSDKErrors.l();
        l.n(str);
        l.m(i);
        this.a.c(l.build());
    }

    @Override // com.spotify.music.features.connect.cast.l
    public void a(int i) {
        d("suspend_session", i);
    }

    @Override // com.spotify.music.features.connect.cast.l
    public void b(int i) {
        d("failed_to_start_session", i);
    }

    @Override // com.spotify.music.features.connect.cast.l
    public void c(int i) {
        d("end_session", i);
    }
}
