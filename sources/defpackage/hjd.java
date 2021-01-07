package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.ubi.specification.factories.a4;

/* renamed from: hjd  reason: default package */
public class hjd {
    private final jz1 a;
    private final wlf<LegacyPlayerState> b;
    private final ere c;

    public hjd(jz1 jz1, wlf<LegacyPlayerState> wlf, ere ere) {
        this.a = jz1;
        this.b = wlf;
        this.c = ere;
    }

    private static a4 a(String str) {
        return new a4("nowplaying/scroll", str);
    }

    private void g(String str, String str2, String str3, String str4, int i, double d) {
        String str5;
        jz1 jz1 = this.a;
        LegacyPlayerState legacyPlayerState = this.b.get();
        if (legacyPlayerState == null) {
            str5 = null;
        } else {
            str5 = legacyPlayerState.playbackId();
        }
        jz1.a(new fa1(str5, "nowplaying/scroll", str2, "storylines", (long) i, str, str3, str4, d));
    }

    public void b(String str, String str2, int i, double d) {
        g(str, str2, "hit", "go_to_artist_profile", i, d);
        this.c.a(a(str2).b().b().a(str));
    }

    public void c(String str, int i, double d) {
        String str2;
        jz1 jz1 = this.a;
        LegacyPlayerState legacyPlayerState = this.b.get();
        if (legacyPlayerState == null) {
            str2 = null;
        } else {
            str2 = legacyPlayerState.playbackId();
        }
        jz1.a(new da1(str2, "nowplaying/scroll", str, "storylines", (long) i, "", "storylines_card", "", d));
        if (d == 100.0d) {
            this.c.a(a(str).c(Integer.valueOf(i)).d());
        }
    }

    public void d(String str, String str2, int i, double d) {
        g(str, str2, "hit", "follow_artist", i, d);
        this.c.a(a(str2).b().c().a(str));
    }

    public void e(String str, int i, double d) {
        g("", str, "hit", "go_to_next_storylines_card", i, d);
        this.c.a(a(str).c(Integer.valueOf(i)).b().a(String.valueOf(i)));
    }

    public void f(String str, int i, double d) {
        g("", str, "hit", "go_to_previous_storylines_card", i, d);
        this.c.a(a(str).c(Integer.valueOf(i)).c().a(String.valueOf(i)));
    }

    public void h(String str, int i, double d) {
        g("", str, "hold", "pause_storylines_card", i, d);
        this.c.a(a(str).c(Integer.valueOf(i)).e(String.valueOf(i)));
    }

    public void i(String str, String str2, int i, double d) {
        g(str, str2, "hit", "unfollow_artist", i, d);
        this.c.a(a(str2).b().c().b(str));
    }
}
