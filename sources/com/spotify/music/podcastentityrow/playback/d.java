package com.spotify.music.podcastentityrow.playback;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.podcastentityrow.playback.b;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

public final class d {
    private static final List<Episode> a(List<? extends Episode> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            String header = t.getHeader();
            if (header == null || header.length() == 0) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final List<b.C0333b> b(c cVar, Episode[] episodeArr) {
        ArrayList arrayList;
        String str;
        List<Episode> list;
        String str2;
        h.e(cVar, "viewUri");
        h.e(episodeArr, "episodes");
        if (ViewUris.c2.a(cVar.toString())) {
            List J = kotlin.collections.d.J(a(kotlin.collections.d.R(episodeArr)), new c());
            h.e(J, "$this$reversed");
            if (J.size() <= 1) {
                list = kotlin.collections.d.Q(J);
            } else {
                list = kotlin.collections.d.V(J);
                h.e(list, "$this$reverse");
                Collections.reverse(list);
            }
            arrayList = new ArrayList(kotlin.collections.d.e(list, 10));
            for (Episode episode : list) {
                String uri = episode.getUri();
                Show w = episode.w();
                if (w == null || (str2 = w.h()) == null) {
                    str2 = "";
                }
                arrayList.add(new b.C0333b(uri, str2));
            }
        } else {
            List<Episode> a = a(kotlin.collections.d.R(episodeArr));
            arrayList = new ArrayList(kotlin.collections.d.e(a, 10));
            Iterator it = ((ArrayList) a).iterator();
            while (it.hasNext()) {
                Episode episode2 = (Episode) it.next();
                String uri2 = episode2.getUri();
                Show w2 = episode2.w();
                if (w2 == null || (str = w2.h()) == null) {
                    str = "";
                }
                arrayList.add(new b.C0333b(uri2, str));
            }
        }
        return arrayList;
    }
}
