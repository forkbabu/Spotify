package com.spotify.music.features.podcast.entity.find;

import android.os.Bundle;
import kotlin.jvm.internal.h;

public final class a implements fjf<String> {
    private final wlf<Bundle> a;

    public a(wlf<Bundle> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Bundle bundle = this.a.get();
        h.e(bundle, "arguments");
        String string = bundle.getString("uri", "");
        h.d(string, "arguments.getString(ARGUMENT_URI, \"\")");
        return string;
    }
}
