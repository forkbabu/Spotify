package com.spotify.music.homecomponents.card.search;

import kotlin.jvm.internal.h;

public final class d implements c {
    private final a71 a;

    public d(a71 a71) {
        h.e(a71, "navigationCommandHandler");
        this.a = a71;
    }

    @Override // com.spotify.music.homecomponents.card.search.c
    public void a(s81 s81) {
        h.e(s81, "model");
        o81 o81 = (o81) s81.events().get("click");
        n61 b = n61.b("click", s81);
        if (h.a(o81 != null ? o81.name() : null, "navigate")) {
            this.a.b(o81, b);
        }
    }
}
