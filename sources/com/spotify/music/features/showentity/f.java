package com.spotify.music.features.showentity;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;

public final /* synthetic */ class f implements w {
    public final /* synthetic */ qna a;
    public final /* synthetic */ y b;
    public final /* synthetic */ y c;

    public /* synthetic */ f(qna qna, y yVar, y yVar2) {
        this.a = qna;
        this.b = yVar;
        this.c = yVar2;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.W(new g(this.a, this.b, this.c), false, Integer.MAX_VALUE);
    }
}
