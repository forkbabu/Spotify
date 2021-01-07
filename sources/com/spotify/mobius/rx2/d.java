package com.spotify.mobius.rx2;

import io.reactivex.functions.l;
import io.reactivex.internal.functions.Functions;
import io.reactivex.s;
import io.reactivex.w;
import java.util.ArrayList;

class d implements l<s<T>, s<R>> {
    final /* synthetic */ e a;

    d(e eVar) {
        this.a = eVar;
    }

    @Override // io.reactivex.functions.l
    public Object apply(Object obj) {
        s sVar = (s) obj;
        ArrayList arrayList = new ArrayList();
        for (w wVar : this.a.a) {
            arrayList.add(sVar.q(wVar));
        }
        return s.d0(arrayList).W(Functions.g(), false, Integer.MAX_VALUE);
    }
}
