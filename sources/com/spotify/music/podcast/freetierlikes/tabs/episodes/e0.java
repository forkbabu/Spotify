package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import java.util.List;

public final class e0 implements i<Episode> {
    private final List<Episode> a;
    private final boolean b;
    private final int c;
    private final int f;
    final /* synthetic */ i n;
    final /* synthetic */ List o;

    e0(i<Episode> iVar, List list) {
        this.n = iVar;
        this.o = list;
        this.a = list;
        this.b = iVar.isLoading();
        this.c = list.size();
        this.f = list.size();
    }

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
