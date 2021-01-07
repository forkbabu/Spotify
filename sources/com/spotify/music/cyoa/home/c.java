package com.spotify.music.cyoa.home;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.music.cyoa.model.CyoaGame;
import com.spotify.music.cyoa.model.CyoaGamesResponse;
import defpackage.b91;
import io.reactivex.s;
import java.util.HashSet;
import java.util.List;

public class c {
    private final d a;

    public c(d dVar) {
        this.a = dVar;
    }

    private static List<s81> a(List<CyoaGame> list) {
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (CyoaGame cyoaGame : list) {
            builder.mo53add((ImmutableList.Builder) z81.c().n(HubsGlueRow.NORMAL).j(z81.a().p("uri", cyoaGame.getShowUri()).d()).f("click", z81.b().e("navigate").b("uri", String.format("spotify:cyoa:%s", Integer.valueOf(cyoaGame.getId()))).c()).u(z81.f().b()).z(z81.h().a(cyoaGame.getName()).d(cyoaGame.getDescription()).build()).l());
        }
        return builder.build();
    }

    public static b91 c(CyoaGamesResponse cyoaGamesResponse) {
        b91.a j = z81.i().j(z81.c().n(HubsGlueComponent.HEADER).u(z81.f().g(z81.e().g("https://cyoa.scdn.co/cyoa/logo.png").f("star").c()).b()).z(z81.h().a("Choose Your Own Adventure").d("Interactive audio experiences for your ears").build()).l());
        List<CyoaGame> ongoingGames = cyoaGamesResponse.getOngoingGames();
        if (!ongoingGames.isEmpty()) {
            j = j.b(z81.c().n(HubsGlueSectionHeader.SECTION_HEADER).z(z81.h().a("Ongoing Games").build()).l()).a(a(cyoaGamesResponse.getOngoingGames()));
        }
        List<CyoaGame> allGames = cyoaGamesResponse.getAllGames();
        HashSet hashSet = new HashSet(ongoingGames.size());
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (CyoaGame cyoaGame : ongoingGames) {
            hashSet.add(Integer.valueOf(cyoaGame.getId()));
        }
        for (CyoaGame cyoaGame2 : allGames) {
            if (!hashSet.contains(Integer.valueOf(cyoaGame2.getId()))) {
                builder.mo53add((ImmutableList.Builder) cyoaGame2);
            }
        }
        if (!builder.build().isEmpty()) {
            j = j.b(z81.c().n(HubsGlueSectionHeader.SECTION_HEADER).z(z81.h().a("Available Games").build()).l()).a(a(cyoaGamesResponse.getAllGames()));
        }
        return j.g();
    }

    public s<b91> b() {
        return this.a.a().P().j0(a.a);
    }
}
