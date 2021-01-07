package com.spotify.music.features.yourlibrary.musicpages.pages;

import com.google.common.base.Supplier;
import com.spotify.music.features.yourlibrary.musicpages.datasource.v4;

public final /* synthetic */ class b implements Supplier {
    public final /* synthetic */ p a;
    public final /* synthetic */ v4 b;

    public /* synthetic */ b(p pVar, v4 v4Var) {
        this.a = pVar;
        this.b = v4Var;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return this.a.b(this.b);
    }
}
