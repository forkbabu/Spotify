package com.spotify.music.nowplaying.podcast.mixedmedia.ui.util;

import kotlin.f;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class c implements nmf<Boolean, f> {
    private boolean a;
    private final cmf<f> b;

    public c(cmf<f> cmf) {
        h.e(cmf, "onReady");
        this.b = cmf;
    }

    public void a(boolean z) {
        this.a = z;
        if (z) {
            this.b.invoke();
        }
    }

    public final boolean d() {
        return this.a;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        this.a = booleanValue;
        if (booleanValue) {
            this.b.invoke();
        }
        return f.a;
    }
}
