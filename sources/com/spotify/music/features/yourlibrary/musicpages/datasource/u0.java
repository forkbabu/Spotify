package com.spotify.music.features.yourlibrary.musicpages.datasource;

import io.reactivex.functions.c;

public final /* synthetic */ class u0 implements c {
    public final /* synthetic */ f4 a;

    public /* synthetic */ u0(f4 f4Var) {
        this.a = f4Var;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        f4 f4Var = this.a;
        x3 x3Var = (x3) obj2;
        f4Var.getClass();
        return Boolean.valueOf(((Boolean) obj).booleanValue() && f4Var.d.a(x3Var));
    }
}
