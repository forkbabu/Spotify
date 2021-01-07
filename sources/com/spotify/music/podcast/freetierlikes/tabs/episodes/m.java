package com.spotify.music.podcast.freetierlikes.tabs.episodes;

import com.spotify.music.podcast.freetierlikes.tabs.episodes.i;
import io.reactivex.functions.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

final class m<T1, T2, R> implements c<i, i, i> {
    final /* synthetic */ s a;

    m(s sVar) {
        this.a = sVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public i a(i iVar, i iVar2) {
        i iVar3 = iVar;
        i iVar4 = iVar2;
        h.e(iVar3, "unfinished");
        h.e(iVar4, "unPlayed");
        this.a.getClass();
        boolean z = false;
        List u = d.u(iVar3, iVar4);
        if (!u.isEmpty()) {
            Iterator it = u.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!(((i) it.next()) instanceof i.a)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            List i = d.i(u, i.a.class);
            i.a aVar = new i.a("");
            Iterator it2 = ((ArrayList) i).iterator();
            while (it2.hasNext()) {
                aVar = new i.a(aVar.a() + ", " + ((i.a) it2.next()).a());
            }
            return aVar;
        }
        Iterator it3 = ((ArrayList) d.i(u, i.b.class)).iterator();
        if (it3.hasNext()) {
            Object next = it3.next();
            while (it3.hasNext()) {
                next = new i.b(new k(((i.b) next).a(), ((i.b) it3.next()).a()));
            }
            return (i) next;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
