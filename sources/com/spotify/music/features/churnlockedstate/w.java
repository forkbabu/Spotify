package com.spotify.music.features.churnlockedstate;

import com.google.protobuf.u;
import com.spotify.messages.ChurnLockedStateMessage;

public class w {
    private final gl0<u> a;

    w(gl0<u> gl0) {
        this.a = gl0;
    }

    public void a(String str) {
        ChurnLockedStateMessage.b i = ChurnLockedStateMessage.i();
        i.m(str);
        this.a.c(i.build());
    }
}
