package com.spotify.music;

import com.google.common.base.Supplier;

public final /* synthetic */ class x implements Supplier {
    public final /* synthetic */ MainActivity a;

    public /* synthetic */ x(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return Boolean.valueOf(this.a.P0());
    }
}
