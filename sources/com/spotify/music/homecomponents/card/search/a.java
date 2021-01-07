package com.spotify.music.homecomponents.card.search;

import com.spotify.music.features.playlistentity.homemix.l;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class a implements a71 {
    public static final C0275a b = new C0275a(null);
    private final l a;

    /* renamed from: com.spotify.music.homecomponents.card.search.a$a  reason: collision with other inner class name */
    public static final class C0275a {
        public C0275a(f fVar) {
        }
    }

    public a(l lVar) {
        h.e(lVar, "activityHelper");
        this.a = lVar;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        h.e(o81, "command");
        h.e(n61, "event");
        if (((o81) n61.d().events().get("findMoreArtistsClick")) != null) {
            this.a.a(true);
        }
    }
}
