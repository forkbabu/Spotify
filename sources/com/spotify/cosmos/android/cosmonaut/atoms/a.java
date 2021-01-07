package com.spotify.cosmos.android.cosmonaut.atoms;

import com.google.common.base.Function;

public final /* synthetic */ class a implements Function {
    public final /* synthetic */ Object[] a;

    public /* synthetic */ a(Object[] objArr) {
        this.a = objArr;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return (byte[]) ((sg0) obj).apply(this.a);
    }
}
