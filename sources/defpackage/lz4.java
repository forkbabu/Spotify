package defpackage;

import com.spotify.music.features.entityselector.proto.EntitySelector$CarePackageEpisode;
import com.spotify.music.features.entityselector.proto.EntitySelector$CarePackageEpisodesResponse;
import defpackage.gz4;
import defpackage.hz4;
import defpackage.iz4;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: lz4  reason: default package */
final class lz4<T, R> implements l<EntitySelector$CarePackageEpisodesResponse, iz4> {
    final /* synthetic */ hz4.b a;

    lz4(hz4.b bVar) {
        this.a = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public iz4 apply(EntitySelector$CarePackageEpisodesResponse entitySelector$CarePackageEpisodesResponse) {
        EntitySelector$CarePackageEpisodesResponse entitySelector$CarePackageEpisodesResponse2 = entitySelector$CarePackageEpisodesResponse;
        h.e(entitySelector$CarePackageEpisodesResponse2, "list");
        List<EntitySelector$CarePackageEpisode> h = entitySelector$CarePackageEpisodesResponse2.h();
        h.d(h, "list.episodesList");
        List<String> a2 = this.a.a();
        if (h.isEmpty()) {
            return new iz4.c(gz4.a.a);
        }
        ArrayList arrayList = new ArrayList(d.e(h, 10));
        for (T t : h) {
            String i = t.i();
            h.d(i, "carePackageEpisode.episodeUri");
            String l = t.l();
            h.d(l, "carePackageEpisode.imageUri");
            String h2 = t.h();
            h.d(h2, "carePackageEpisode.episodeName");
            String m = t.m();
            h.d(m, "carePackageEpisode.showName");
            arrayList.add(new sy4(i, l, h2, m));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!a2.contains(((sy4) next).a())) {
                arrayList2.add(next);
            }
        }
        return new iz4.c(new gz4.c(arrayList2));
    }
}
