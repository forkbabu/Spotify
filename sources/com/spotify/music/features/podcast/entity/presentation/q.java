package com.spotify.music.features.podcast.entity.presentation;

import defpackage.sna;
import kotlin.jvm.internal.h;

public final class q implements sna {
    private final yhc a;
    private final t8a b;
    private final tna c;
    private final v57 d;
    private final boolean e;

    public q(yhc yhc, t8a t8a, tna tna, v57 v57, boolean z) {
        h.e(yhc, "followActionListener");
        h.e(t8a, "likedContent");
        h.e(tna, "navigator");
        h.e(v57, "podcastEntityLogger");
        this.a = yhc;
        this.b = t8a;
        this.c = tna;
        this.d = v57;
        this.e = z;
    }

    @Override // defpackage.sna
    public void a(sna.a aVar) {
        h.e(aVar, "model");
        if (this.e) {
            if (!aVar.c()) {
                this.b.a(aVar.b(), aVar.b(), false);
                this.d.a();
            }
            this.c.a(aVar.b(), aVar.a());
            return;
        }
        this.a.a(aVar.b(), aVar.c());
    }
}
