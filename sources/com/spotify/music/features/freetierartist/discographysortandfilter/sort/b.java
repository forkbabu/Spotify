package com.spotify.music.features.freetierartist.discographysortandfilter.sort;

import io.reactivex.internal.operators.observable.x;
import io.reactivex.s;
import io.reactivex.subjects.a;
import kotlin.jvm.internal.h;

public final class b {
    private final a<SortCriteria> a;

    public b() {
        a<SortCriteria> i1 = a.i1(SortCriteria.DEFAULT);
        h.d(i1, "BehaviorSubject.createDe…ult(SortCriteria.DEFAULT)");
        this.a = i1;
    }

    public final void a(SortCriteria sortCriteria) {
        h.e(sortCriteria, "criteria");
        this.a.onNext(sortCriteria);
    }

    public final SortCriteria b() {
        SortCriteria j1 = this.a.j1();
        return j1 != null ? j1 : SortCriteria.DEFAULT;
    }

    public final s<SortCriteria> c() {
        a<SortCriteria> aVar = this.a;
        aVar.getClass();
        x xVar = new x(aVar);
        h.d(xVar, "sortCriteriaSubject.hide()");
        return xVar;
    }
}
