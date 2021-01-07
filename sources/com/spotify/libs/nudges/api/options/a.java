package com.spotify.libs.nudges.api.options;

import kotlin.f;
import kotlin.jvm.internal.h;

public class a {
    private nmf<? super ov0, f> a;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: nmf<? super ov0, kotlin.f>, nmf<ov0, kotlin.f> */
    public final nmf<ov0, f> a() {
        return this.a;
    }

    public final a b(nmf<? super ov0, f> nmf) {
        h.e(nmf, "listener");
        this.a = nmf;
        return this;
    }

    public final void c(nmf<? super ov0, f> nmf) {
        this.a = nmf;
    }
}
