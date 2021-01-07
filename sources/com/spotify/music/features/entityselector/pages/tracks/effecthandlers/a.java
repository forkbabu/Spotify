package com.spotify.music.features.entityselector.pages.tracks.effecthandlers;

import com.spotify.music.features.entityselector.proto.EntitySelector$CarePackageTrack;
import com.spotify.music.features.entityselector.proto.EntitySelector$CarePackageTrackArtist;
import com.spotify.music.features.entityselector.proto.EntitySelector$CarePackageTracksResponse;
import defpackage.c05;
import defpackage.d05;
import defpackage.g05;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

final class a<T, R> implements l<EntitySelector$CarePackageTracksResponse, d05> {
    final /* synthetic */ c05.b a;

    a(c05.b bVar) {
        this.a = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d05 apply(EntitySelector$CarePackageTracksResponse entitySelector$CarePackageTracksResponse) {
        EntitySelector$CarePackageTracksResponse entitySelector$CarePackageTracksResponse2 = entitySelector$CarePackageTracksResponse;
        h.e(entitySelector$CarePackageTracksResponse2, "list");
        List<EntitySelector$CarePackageTrack> h = entitySelector$CarePackageTracksResponse2.h();
        h.d(h, "list.tracksList");
        List<String> a2 = this.a.a();
        if (h.isEmpty()) {
            return new d05.g(g05.a.a);
        }
        ArrayList arrayList = new ArrayList(d.e(h, 10));
        for (T t : h) {
            String n = t.n();
            h.d(n, "carePackageTrack.trackUri");
            String i = t.i();
            h.d(i, "carePackageTrack.imageUri");
            String m = t.m();
            h.d(m, "carePackageTrack.trackName");
            List<EntitySelector$CarePackageTrackArtist> h2 = t.h();
            h.d(h2, "carePackageTrack.artistsList");
            String p = d.p(h2, null, null, null, 0, null, TracksEffectHandlersKt$toTrack$1.a, 31, null);
            String l = t.l();
            h.d(l, "carePackageTrack.previewIdentifier");
            arrayList.add(new uy4(m, p, i, l, n, false, 32));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!a2.contains(((uy4) next).c())) {
                arrayList2.add(next);
            }
        }
        return new d05.g(new g05.c(arrayList2));
    }
}
