package com.spotify.music.features.entityselector.pages.search.effecthandlers;

import com.spotify.searchview.assistedcuration.proto.DrillDownViewResponse;
import com.spotify.searchview.assistedcuration.proto.Entity;
import com.spotify.searchview.assistedcuration.proto.RelatedEntity;
import com.spotify.searchview.assistedcuration.proto.Track;
import defpackage.tz4;
import defpackage.uz4;
import defpackage.xz4;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

final class b<T, R> implements l<DrillDownViewResponse, uz4> {
    final /* synthetic */ tz4.c a;

    b(tz4.c cVar) {
        this.a = cVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public uz4 apply(DrillDownViewResponse drillDownViewResponse) {
        uy4 uy4;
        DrillDownViewResponse drillDownViewResponse2 = drillDownViewResponse;
        h.e(drillDownViewResponse2, "acDrillDownViewResponse");
        List<Entity> i = drillDownViewResponse2.i();
        h.d(i, "acDrillDownViewResponse.hitsList");
        String b = this.a.b();
        if (i.isEmpty()) {
            return new uz4.f(new xz4.b(b));
        }
        ArrayList arrayList = new ArrayList();
        for (T t : i) {
            if (t.i() == Entity.EntityCase.TRACK) {
                String o = t.o();
                h.d(o, "entity.uri");
                String l = t.l();
                h.d(l, "entity.imageUri");
                String m = t.m();
                h.d(m, "entity.name");
                Track n = t.n();
                h.d(n, "entity.track");
                List<RelatedEntity> o2 = n.o();
                h.d(o2, "entity.track.trackArtistsList");
                String p = d.p(o2, null, null, null, 0, null, SearchEffectHandlersKt$toTrack$1.a, 31, null);
                Track n2 = t.n();
                h.d(n2, "entity.track");
                String m2 = n2.m();
                h.d(m2, "entity.track.previewId");
                uy4 = new uy4(m, p, l, m2, o, false, 32);
            } else {
                uy4 = null;
            }
            if (uy4 != null) {
                arrayList.add(uy4);
            }
        }
        return new uz4.f(new xz4.c(arrayList));
    }
}
