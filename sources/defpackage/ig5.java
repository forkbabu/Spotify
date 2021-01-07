package defpackage;

import android.content.res.Resources;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.C0707R;
import com.spotify.music.homecomponents.card.g;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.q;
import com.spotify.ubi.specification.factories.g1;
import java.util.List;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: ig5  reason: default package */
public final class ig5 {
    private final Resources a;

    ig5(Resources resources) {
        this.a = resources;
    }

    private static String a(Covers covers) {
        return q.c(covers, Covers.Size.XLARGE);
    }

    private p81 h(String str, int i, String str2, String str3) {
        return n81.a(new g1(str3).d(str, 0).c(null, Integer.valueOf(i), str2).a());
    }

    public s81 b(a aVar, int i, String str) {
        String str2 = (String) MoreObjects.firstNonNull(aVar.d(), aVar.getUri());
        return z81.c().s(String.format(Locale.US, "home-downloaded-music-%d", Integer.valueOf(i))).n(g.o).z(z81.h().a(MoreObjects.nullToEmpty(aVar.g())).build()).t(z81.f().g(z81.e().g(a(aVar.e())).f("album").c())).f("click", d71.a(str2)).d("downloadedBadge", Boolean.TRUE).h(ej5.a("home-downloaded-music", i, "", str2)).h(h("home-downloaded-music", i, str2, str)).l();
    }

    public s81 c(boolean z, List<s81> list, String str) {
        String str2 = z ? "home-downloaded-music" : "home-downloaded-episodes";
        return z81.c().n(uo9.b).a(list).h(ej5.a(str2, 0, "", "")).h(n81.a(new g1(str).d(str2, 0).c(null, 0, "").a())).l();
    }

    public s81 d(int i, String str) {
        String str2 = i == C0707R.string.home_music_downloads ? "home-downloaded-music" : "home-downloaded-episodes";
        return z81.c().n(ip9.a).z(z81.h().a(MoreObjects.nullToEmpty(this.a.getString(i))).build()).h(ej5.a(str2, 0, "", "")).h(n81.a(new g1(str).d(str2, 0).d().a())).d("client-added-header", Boolean.TRUE).l();
    }

    public s81 e(Episode episode, int i, String str) {
        return z81.c().s(String.format(Locale.US, "home-downloaded-episodes-%d", Integer.valueOf(i))).o("podcast:episodeImageCardSmall", "card").z(z81.h().a(MoreObjects.nullToEmpty(episode.n())).c(MoreObjects.nullToEmpty(episode.d())).build()).t(z81.f().g(z81.e().g(a(episode.c())).c())).f("click", d71.a(episode.getUri())).d("downloadedBadge", Boolean.TRUE).h(ej5.a("home-downloaded-episodes", i, "", episode.getUri())).h(h("home-downloaded-episodes", i, episode.getUri(), str)).l();
    }

    public s81 f(int i, String str) {
        return z81.c().s(String.format(Locale.US, "home-downloaded-music-%d", Integer.valueOf(i))).o("home:cardLikedSongs", HubsComponentCategory.CARD.d()).z(z81.h().a(this.a.getString(C0707R.string.home_music_downloads_liked_songs)).build()).f("click", d71.a("spotify:collection:tracks")).d("downloadedBadge", Boolean.TRUE).h(ej5.a("home-downloaded-music", i, "", "spotify:collection:tracks")).h(h("home-downloaded-music", i, "spotify:collection:tracks", str)).l();
    }

    public s81 g(j jVar, int i, String str) {
        return z81.c().s(String.format(Locale.US, "home-downloaded-music-%d", Integer.valueOf(i))).n(g.o).z(z81.h().a(MoreObjects.nullToEmpty(jVar.j())).build()).t(z81.f().g(z81.e().g(a(jVar.c())).f("playlist").c())).f("click", d71.a(jVar.getUri())).d("downloadedBadge", Boolean.TRUE).h(ej5.a("home-downloaded-music", i, "", jVar.getUri())).h(h("home-downloaded-music", i, jVar.getUri(), str)).l();
    }
}
