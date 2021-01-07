package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import java.util.List;
import kotlin.jvm.internal.h;

public final class a0 implements z {

    public static final class a implements i<Episode> {
        private final List<Episode> a;
        private final boolean b;
        private final int c;
        private final int f;
        final /* synthetic */ i n;

        a(ImmutableList immutableList, i iVar) {
            this.n = iVar;
            h.d(immutableList, "filtered");
            this.a = immutableList;
            this.b = iVar.isLoading();
            this.c = immutableList.size();
            this.f = immutableList.size();
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

    @Override // com.spotify.music.podcast.freetierlikes.tabs.episodes.z
    public i<Episode> a(i<Episode> iVar) {
        h.e(iVar, "original");
        return new a(FluentIterable.from(iVar.getItems()).filter(new b0(this)).toList(), iVar);
    }
}
