package com.spotify.music.nowplaying.podcast.mixedmedia.model;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class a {
    public static final C0313a b = new C0313a(null);
    private final String a;

    /* renamed from: com.spotify.music.nowplaying.podcast.mixedmedia.model.a$a  reason: collision with other inner class name */
    public static final class C0313a {
        public C0313a(f fVar) {
        }

        public static a b(C0313a aVar, String str, nmf nmf, int i) {
            PodcastSegmentsUri$Companion$of$1 podcastSegmentsUri$Companion$of$1 = (i & 2) != 0 ? PodcastSegmentsUri$Companion$of$1.a : null;
            h.e(str, "uri");
            h.e(podcastSegmentsUri$Companion$of$1, "fn");
            if (!aVar.a(str)) {
                return null;
            }
            a aVar2 = new a(str, null);
            podcastSegmentsUri$Companion$of$1.invoke(aVar2);
            return aVar2;
        }

        public final boolean a(String str) {
            h.e(str, "uri");
            l0 z = l0.z(str);
            h.d(z, "SpotifyLink.of(uri)");
            return z.q() == LinkType.SHOW_EPISODE;
        }
    }

    public a(String str, f fVar) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (true ^ h.a(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return h.a(this.a, ((a) obj).a);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.nowplaying.podcast.mixedmedia.model.PodcastSegmentsUri");
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}
