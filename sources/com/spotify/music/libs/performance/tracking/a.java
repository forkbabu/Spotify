package com.spotify.music.libs.performance.tracking;

import com.google.common.base.Supplier;

public final /* synthetic */ class a implements Supplier {
    public final /* synthetic */ s a;

    public /* synthetic */ a(s sVar) {
        this.a = sVar;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return Boolean.valueOf(this.a.a());
    }
}
