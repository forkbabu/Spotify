package com.spotify.music.behindthelyrics.persistence.database;

import io.reactivex.functions.a;
import java.util.List;

public final /* synthetic */ class b implements a {
    public final /* synthetic */ g a;
    public final /* synthetic */ List b;

    public /* synthetic */ b(g gVar, List list) {
        this.a = gVar;
        this.b = list;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.e(this.b);
    }
}
