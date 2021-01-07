package com.google.android.play.core.assetpacks;

import android.content.Context;

public final class a0 implements com.google.android.play.core.internal.a0<z> {
    private final com.google.android.play.core.internal.a0<Context> a;
    private final com.google.android.play.core.internal.a0<c2> b;

    public a0(com.google.android.play.core.internal.a0<Context> a0Var, com.google.android.play.core.internal.a0<c2> a0Var2) {
        this.a = a0Var;
        this.b = a0Var2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.internal.a0
    public final /* bridge */ /* synthetic */ z e() {
        return new z(((b3) this.a).e(), this.b.e());
    }
}
