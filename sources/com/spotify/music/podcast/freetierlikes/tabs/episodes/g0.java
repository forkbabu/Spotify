package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.google.common.collect.FluentIterable;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class g0 implements d0 {
    private final c a;

    public g0(c cVar) {
        h.e(cVar, "dateComparator");
        this.a = cVar;
    }

    public static final boolean c(g0 g0Var, Episode episode) {
        g0Var.getClass();
        long millis = TimeUnit.SECONDS.toMillis((long) episode.u());
        return g0Var.a.b(millis) || g0Var.a.c(millis);
    }

    private final void d(String str, List<Episode> list, List<Episode> list2, nmf<? super Episode, Boolean> nmf) {
        if (!list2.isEmpty()) {
            Episode.a a2 = Episode.a();
            a2.f(str);
            a2.i(str);
            a2.F(Episode.MediaType.AUDIO);
            Episode build = a2.build();
            h.d(build, "buildHeader(dateKey)");
            list.add(build);
            boolean z = false;
            while ((!list2.isEmpty()) && nmf.invoke(list2.get(0)).booleanValue()) {
                list.add(list2.remove(0));
                z = true;
            }
            if (!z) {
                list.remove(list.size() - 1);
            }
        }
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.episodes.d0
    public i<Episode> a(i<Episode> iVar) {
        h.e(iVar, "original");
        FluentIterable filter = FluentIterable.from(iVar.getItems()).filter(f0.a);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        h.d(filter, "filteredItems");
        d.a(arrayList2, filter);
        d("today", arrayList, arrayList2, new ReplaceEpisodeHeadersWithDateHeaders$addDateHeaders$1(this));
        d("yesterday", arrayList, arrayList2, new ReplaceEpisodeHeadersWithDateHeaders$addDateHeaders$2(this));
        d("thisWeek", arrayList, arrayList2, new ReplaceEpisodeHeadersWithDateHeaders$addDateHeaders$3(this));
        d("unplayed", arrayList, arrayList2, ReplaceEpisodeHeadersWithDateHeaders$addDateHeaders$4.a);
        return new e0(iVar, arrayList);
    }
}
