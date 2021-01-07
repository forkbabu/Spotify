package com.spotify.music.features.yourepisodes.interactor;

import com.spotify.music.features.yourepisodes.domain.a;
import com.spotify.music.podcastentityrow.v;
import com.spotify.playlist.models.Episode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class i implements h {
    private final v a;

    public i(v vVar) {
        h.e(vVar, "podcastPlayer");
        this.a = vVar;
    }

    @Override // com.spotify.music.features.yourepisodes.interactor.h
    public void a(List<a> list) {
        h.e(list, "items");
        v vVar = this.a;
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b());
        }
        Object[] array = arrayList.toArray(new Episode[0]);
        if (array != null) {
            vVar.a((Episode[]) array, 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // com.spotify.music.features.yourepisodes.interactor.h
    public void pause() {
        this.a.pause();
    }
}
