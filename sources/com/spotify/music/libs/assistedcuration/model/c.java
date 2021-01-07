package com.spotify.music.libs.assistedcuration.model;

import com.google.common.base.Function;

public final /* synthetic */ class c implements Function {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return ((RecsItem) obj).name();
    }
}
