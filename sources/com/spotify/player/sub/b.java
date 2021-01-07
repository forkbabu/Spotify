package com.spotify.player.sub;

import com.google.common.base.Supplier;

public final /* synthetic */ class b implements Supplier {
    public final /* synthetic */ g a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ b(g gVar, int i, int i2) {
        this.a = gVar;
        this.b = i;
        this.c = i2;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return this.a.b(this.b, this.c);
    }
}
