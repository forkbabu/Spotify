package com.spotify.music.libs.freetiertrackpreview.logging;

import defpackage.nqe;
import defpackage.qqe;
import kotlin.Pair;
import kotlin.jvm.internal.h;

public final class d implements c {
    private final ere a;

    public d(ere ere) {
        h.e(ere, "mUserBehaviourEventLogger");
        this.a = ere;
    }

    private final void g(p81 p81, String str, Pair<String, ? extends Object> pair) {
        rqe d = n81.b(p81, "").d();
        qqe.b b = qqe.b();
        b.b("hit");
        b.c(str);
        b.e(1);
        if (pair != null) {
            b.d(pair.c(), pair.d());
        }
        qqe a2 = b.a();
        h.d(a2, "UbiEventAction.builder()…d) }\n            .build()");
        nqe.b f = nqe.f();
        f.e(d);
        f.h(a2);
        lqe c = f.c();
        h.d(c, "UbiInteractionEvent.buil…ion)\n            .build()");
        this.a.a((nqe) c);
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.logging.c
    public void a(p81 p81, String str) {
        h.e(p81, "hubsComponentBundle");
        h.e(str, "uri");
        g(p81, "hide_song", new Pair<>("item_to_hide", str));
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.logging.c
    public void b(p81 p81, String str) {
        h.e(p81, "hubsComponentBundle");
        h.e(str, "uri");
        g(p81, "play_preview", new Pair<>("item_to_be_previewed", str));
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.logging.c
    public void c(p81 p81, String str) {
        h.e(p81, "hubsComponentBundle");
        h.e(str, "uri");
        g(p81, "remove_hide_song", new Pair<>("item_no_longer_hidden", str));
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.logging.c
    public void d(p81 p81) {
        h.e(p81, "hubsComponentBundle");
        g(p81, "ui_reveal", null);
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.logging.c
    public void e(p81 p81, String str) {
        h.e(p81, "hubsComponentBundle");
        h.e(str, "uri");
        g(p81, "like", new Pair<>("item_to_be_liked", str));
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.logging.c
    public void f(p81 p81, String str) {
        h.e(p81, "hubsComponentBundle");
        h.e(str, "uri");
        g(p81, "remove_like", new Pair<>("item_no_longer_liked", str));
    }
}
