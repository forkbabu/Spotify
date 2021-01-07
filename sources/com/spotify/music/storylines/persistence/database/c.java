package com.spotify.music.storylines.persistence.database;

import io.reactivex.functions.a;
import java.util.List;

public final /* synthetic */ class c implements a {
    public final /* synthetic */ g a;
    public final /* synthetic */ List b;

    public /* synthetic */ c(g gVar, List list) {
        this.a = gVar;
        this.b = list;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.d(this.b);
    }
}
