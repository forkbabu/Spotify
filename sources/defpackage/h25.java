package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: h25  reason: default package */
public final class h25 {
    public static final g25 a(String str) {
        h.e(str, "artistUri");
        return l("artist-profile-button", str);
    }

    public static final g25 b(String str) {
        h.e(str, "artistUri");
        return l("artist-recommendation-card", str);
    }

    public static final f25 c(int i, String str) {
        return g((long) i, "automated_messaging_item", str);
    }

    public static final g25 d() {
        return l("back-button", null);
    }

    public static final g25 e(String str) {
        h.e(str, "entityUri");
        return l("entity-card", str);
    }

    public static final g25 f() {
        return l("feed-entry-button", null);
    }

    private static final f25 g(long j, String str, String str2) {
        return new f25("feed-item-impression", j, str, str2);
    }

    public static final i25 h() {
        return m("feed-not-visible");
    }

    public static final i25 i() {
        return m("feed-visible");
    }

    public static final f25 j(int i, String str) {
        return g((long) i, "artist-recommendation-item-impression", str);
    }

    public static final f25 k(int i, String str) {
        return g((long) i, "music_release", str);
    }

    private static final g25 l(String str, String str2) {
        return new g25("navigate", str, str2);
    }

    private static final i25 m(String str) {
        return new i25("followfeed", str);
    }

    public static final i25 n() {
        return m("feed-session-started");
    }

    public static final i25 o() {
        return m("feed-session-terminated");
    }
}
