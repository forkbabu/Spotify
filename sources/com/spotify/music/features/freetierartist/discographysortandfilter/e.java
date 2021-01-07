package com.spotify.music.features.freetierartist.discographysortandfilter;

import io.reactivex.internal.operators.observable.x;
import io.reactivex.s;
import io.reactivex.subjects.a;
import kotlin.jvm.internal.h;

public final class e implements d {
    private final a<String> a;

    public e() {
        a<String> i1 = a.i1("");
        h.d(i1, "BehaviorSubject.createDefault(\"\")");
        this.a = i1;
    }

    @Override // com.spotify.music.features.freetierartist.discographysortandfilter.d
    public s<String> a() {
        a<String> aVar = this.a;
        aVar.getClass();
        x xVar = new x(aVar);
        h.d(xVar, "filterCriteriaSubject.hide()");
        return xVar;
    }

    @Override // com.spotify.music.features.freetierartist.discographysortandfilter.d
    public void b(String str) {
        h.e(str, "criteria");
        this.a.onNext(str);
    }
}
