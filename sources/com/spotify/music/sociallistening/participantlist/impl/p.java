package com.spotify.music.sociallistening.participantlist.impl;

import android.content.Context;
import com.spotify.music.sociallistening.participantlist.impl.o;
import kotlin.jvm.internal.h;

public final class p implements fjf<scd> {
    private final wlf<Context> a;

    public p(wlf<Context> wlf) {
        this.a = wlf;
    }

    public static scd a(Context context) {
        o.a aVar = o.a;
        h.e(context, "context");
        return new n(context);
    }

    @Override // defpackage.wlf
    public Object get() {
        Context context = this.a.get();
        o.a aVar = o.a;
        h.e(context, "context");
        return new n(context);
    }
}
