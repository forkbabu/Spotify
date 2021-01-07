package com.spotify.mobile.android.util.decorator;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;

public final /* synthetic */ class a implements w {
    public final /* synthetic */ c a;
    public final /* synthetic */ y b;
    public final /* synthetic */ y c;

    public /* synthetic */ a(c cVar, y yVar, y yVar2) {
        this.a = cVar;
        this.b = yVar;
        this.c = yVar2;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        c cVar = this.a;
        y yVar = this.b;
        y yVar2 = this.c;
        cVar.getClass();
        return sVar.I0(yVar).j0(new b(cVar)).o0(yVar2);
    }
}
