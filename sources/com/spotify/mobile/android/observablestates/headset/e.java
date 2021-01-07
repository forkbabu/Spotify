package com.spotify.mobile.android.observablestates.headset;

import android.content.Context;
import io.reactivex.s;
import io.reactivex.y;

public class e {
    private final s<HeadsetPluggedStatus> a;

    e(Context context, y yVar) {
        this.a = s.y(new b(context)).E().I0(yVar).v0(1).h1();
    }

    public s<HeadsetPluggedStatus> a() {
        return this.a;
    }
}
