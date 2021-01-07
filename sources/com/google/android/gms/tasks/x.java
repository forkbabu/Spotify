package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class x<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, z<TResult> {
    private final Executor a;
    private final f<TResult, TContinuationResult> b;
    private final b0<TContinuationResult> c;

    public x(Executor executor, f<TResult, TContinuationResult> fVar, b0<TContinuationResult> b0Var) {
        this.a = executor;
        this.b = fVar;
        this.c = b0Var;
    }

    @Override // com.google.android.gms.tasks.z
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.d
    public final void b(Exception exc) {
        this.c.u(exc);
    }

    @Override // com.google.android.gms.tasks.z
    public final void c(g<TResult> gVar) {
        this.a.execute(new w(this, gVar));
    }

    @Override // com.google.android.gms.tasks.b
    public final void d() {
        this.c.w();
    }

    @Override // com.google.android.gms.tasks.e
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.c.v(tcontinuationresult);
    }
}
