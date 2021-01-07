package com.spotify.music.behindthelyrics.persistence.database;

import com.google.common.collect.ImmutableList;
import com.spotify.music.behindthelyrics.model.business.TracksAndResources;
import io.reactivex.a;
import io.reactivex.d0;
import io.reactivex.y;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class g implements yk2 {
    private final d a;
    private final y b;

    public g(BehindTheLyricsTracksDatabase behindTheLyricsTracksDatabase, y yVar) {
        this.a = behindTheLyricsTracksDatabase.t();
        this.b = yVar;
    }

    @Override // defpackage.yk2
    public boolean a(String str) {
        return ((e) this.a).a(str);
    }

    @Override // defpackage.yk2
    public a b(TracksAndResources tracksAndResources) {
        ArrayList arrayList = new ArrayList(0);
        for (String str : tracksAndResources.getTrackUris()) {
            if (str != null) {
                arrayList.add(new f(str));
            }
        }
        return a.u(new b(this, ImmutableList.copyOf((Collection) arrayList))).G(this.b);
    }

    public /* synthetic */ d0 d() {
        return z.z(((e) this.a).c());
    }

    public /* synthetic */ void e(List list) {
        ((e) this.a).e(list);
    }

    @Override // defpackage.yk2
    public z<TracksAndResources> read() {
        return z.h(new c(this)).H(this.b).A(a.a);
    }
}
