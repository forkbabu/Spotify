package com.spotify.music.behindthelyrics.service;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import io.reactivex.z;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ f a;

    public /* synthetic */ b(f fVar) {
        this.a = fVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        f fVar = this.a;
        fVar.getClass();
        if (((Optional) obj).isPresent()) {
            return z.z(Boolean.FALSE).P();
        }
        return fVar.a.J0(new a(fVar));
    }
}
