package com.spotify.music.features.podcast.entity.presentation;

import com.spotify.music.podcast.entity.adapter.episoderow.d;
import com.spotify.music.podcast.entity.adapter.episoderow.k;
import com.spotify.playlist.models.Episode;
import defpackage.fic;
import defpackage.lgc;
import java.util.ArrayList;

public class l {
    private final boolean a;
    private final boolean b;
    private final k c;

    public l(boolean z, boolean z2, k kVar) {
        this.a = z;
        this.b = z2;
        this.c = kVar;
    }

    public void a(qyd qyd, esc esc, boolean z) {
        fic.b bVar;
        Episode[] episodeArr = (Episode[]) qyd.getItems().toArray(new Episode[0]);
        int length = episodeArr.length;
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            Episode episode = episodeArr[i];
            boolean z2 = z || !episode.g();
            if (!episode.getUri().equals(qyd.d().j())) {
                if (this.b) {
                    bVar = new d.a(episode, this.c.a(qyd.d().h(), episode, episodeArr, z2, i == length + -1, i));
                } else if (!this.a || episode.v() == null || episode.v().isEmpty()) {
                    lgc.a aVar = new lgc.a();
                    aVar.j(episode);
                    aVar.k(episodeArr);
                    aVar.i(z2);
                    bVar = aVar;
                } else {
                    fic.b bVar2 = new fic.b();
                    bVar2.i(episode);
                    bVar2.j(episodeArr);
                    bVar2.h(z2);
                    bVar = bVar2;
                }
                arrayList.add(bVar == 1 ? 1 : 0);
            }
            i++;
        }
        esc.g(arrayList);
    }
}
