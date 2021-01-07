package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class k<TResult, TContinuationResult> implements z<TResult> {
    private final Executor a;
    private final a<TResult, TContinuationResult> b;
    private final b0<TContinuationResult> c;

    public k(Executor executor, a<TResult, TContinuationResult> aVar, b0<TContinuationResult> b0Var) {
        this.a = executor;
        this.b = aVar;
        this.c = b0Var;
    }

    @Override // com.google.android.gms.tasks.z
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.z
    public final void c(g<TResult> gVar) {
        this.a.execute(new m(this, gVar));
    }
}
