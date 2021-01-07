package com.spotify.mobile.android.service.media.browser;

import com.spotify.mediaitem.PlayOriginReferrer;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.music.libs.collection.model.d;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.f;
import com.spotify.playlist.models.i;
import com.spotify.playlist.models.j;
import io.reactivex.s;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class q implements qh1 {
    private final s<d> a;
    private final s<i<Episode>> b;
    private final s<f> c;
    private final o d;

    public q(s<d> sVar, s<i<Episode>> sVar2, s<f> sVar3, o oVar) {
        this.a = sVar;
        this.b = sVar2;
        this.c = sVar3;
        this.d = oVar;
    }

    public static List c(q qVar, f fVar) {
        qVar.getClass();
        ArrayList arrayList = new ArrayList(fVar.getUnfilteredLength());
        for (j jVar : fVar.getItems()) {
            arrayList.add(qVar.d.h(jVar, false, PlayOriginReferrer.LIBRARY));
        }
        return arrayList;
    }

    public static List d(q qVar, i iVar) {
        qVar.getClass();
        ArrayList arrayList = new ArrayList(iVar.getUnfilteredLength());
        for (Episode episode : iVar.getItems()) {
            arrayList.add(qVar.d.e(episode, episode.w() != null ? episode.w().getUri() : null, h.a, PlayOriginReferrer.LIBRARY));
        }
        return arrayList;
    }

    public static List e(q qVar, d dVar) {
        qVar.getClass();
        ArrayList arrayList = new ArrayList(dVar.getUnfilteredLength());
        for (a aVar : dVar.getItems()) {
            arrayList.add(qVar.d.a(aVar, false, PlayOriginReferrer.LIBRARY));
        }
        return arrayList;
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        return s.c1(this.c.j0(new g(this)), this.a.j0(new j(this)), this.b.j0(new i(this)), f.a).R(Collections.emptyList());
    }
}
