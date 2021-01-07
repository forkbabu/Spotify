package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* compiled from: java-style lambda group */
public final class a<T, R> implements l<i<Episode>, i<Episode>> {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public final i<Episode> apply(i<Episode> iVar) {
        int i = this.a;
        if (i == 0) {
            i<Episode> iVar2 = iVar;
            h.e(iVar2, "it");
            return ((s) this.b).d.a(iVar2);
        } else if (i == 1) {
            i<Episode> iVar3 = iVar;
            h.e(iVar3, "it");
            return ((s) this.b).e.a(iVar3);
        } else {
            throw null;
        }
    }
}
