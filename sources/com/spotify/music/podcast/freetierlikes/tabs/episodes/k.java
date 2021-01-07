package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.google.common.collect.ImmutableList;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import java.util.List;
import kotlin.jvm.internal.h;

public final class k implements i<Episode> {
    private final ImmutableList<Episode> a;
    private final boolean b;
    private final int c;
    private final int f;
    final /* synthetic */ i n;
    final /* synthetic */ i o;

    k(i<Episode> iVar, i iVar2) {
        this.n = iVar;
        this.o = iVar2;
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.addAll((Iterable) iVar.getItems());
        builder.addAll((Iterable) iVar2.getItems());
        ImmutableList<Episode> build = builder.build();
        h.d(build, "ImmutableList.builder<Ep…                 .build()");
        this.a = build;
        this.b = iVar.isLoading() || iVar2.isLoading();
        this.c = iVar2.getUnfilteredLength() + iVar.getUnfilteredLength();
        this.f = iVar2.getUnrangedLength() + iVar.getUnrangedLength();
    }

    /* Return type fixed from 'java.util.List' to match base method */
    @Override // com.spotify.playlist.models.i
    public List<Episode> getItems() {
        return this.a;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnfilteredLength() {
        return this.c;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnrangedLength() {
        return this.f;
    }

    @Override // com.spotify.playlist.models.i
    public boolean isLoading() {
        return this.b;
    }
}
