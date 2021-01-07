package com.spotify.http;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.y;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class j implements t {
    private final PublishSubject<RequestInfo> a;
    private final s<List<RequestInfo>> b;
    private final i c;
    private b d = EmptyDisposable.INSTANCE;

    public j(i iVar, y yVar) {
        this.c = iVar;
        PublishSubject<RequestInfo> h1 = PublishSubject.h1();
        this.a = h1;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ArrayListSupplier arrayListSupplier = ArrayListSupplier.INSTANCE;
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (yVar != null) {
            a.d(50, "count");
            this.b = new io.reactivex.internal.operators.observable.b(h1, 1, 1, timeUnit, yVar, arrayListSupplier, 50, false).Q(a.a);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }

    @Override // com.spotify.http.t
    public void a(RequestInfo requestInfo) {
        this.a.onNext(requestInfo);
    }

    public void b() {
        this.d.dispose();
        s<List<RequestInfo>> sVar = this.b;
        i iVar = this.c;
        iVar.getClass();
        this.d = sVar.subscribe(new e(iVar), b.a);
    }

    public void c() {
        this.d.dispose();
    }
}
