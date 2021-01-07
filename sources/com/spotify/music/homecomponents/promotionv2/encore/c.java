package com.spotify.music.homecomponents.promotionv2.encore;

import kotlin.jvm.internal.h;

public final class c implements b {
    private final vp9 a;
    private final a71 b;

    public c(vp9 vp9, a71 a71) {
        h.e(vp9, "hubsNavigateOnClickEventHandler");
        h.e(a71, "playClickCommandHandler");
        this.a = vp9;
        this.b = a71;
    }

    @Override // com.spotify.music.homecomponents.promotionv2.encore.b
    public void a(s81 s81) {
        h.e(s81, "model");
        this.a.a(s81);
    }

    @Override // com.spotify.music.homecomponents.promotionv2.encore.b
    public void b(s81 s81) {
        h.e(s81, "model");
        o81 o81 = (o81) s81.events().get("promotionPlayClick");
        n61 b2 = n61.b("click", s81);
        if (o81 != null && h.a(o81.name(), "promotionPlayClick")) {
            this.b.b(o81, b2);
        }
    }
}
