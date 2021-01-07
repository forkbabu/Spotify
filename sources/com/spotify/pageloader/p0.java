package com.spotify.pageloader;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.s;

public class p0<T> implements t0<T> {
    private final a<T> a;
    private final t0<T> b;
    private final LiveData<l0<T>> c;

    public interface a<T> {
        void a();

        void b(l0<T> l0Var);

        void onStart();

        void onStop();
    }

    public p0(t0<T> t0Var, a<T> aVar) {
        this.b = t0Var;
        this.a = aVar;
        s sVar = new s();
        sVar.o(((y0) t0Var).a(), new d(aVar, sVar));
        this.c = sVar;
    }

    @Override // com.spotify.pageloader.t0
    public LiveData<l0<T>> a() {
        return this.c;
    }

    @Override // com.spotify.pageloader.t0
    public void b() {
        this.a.a();
        this.b.b();
    }

    @Override // com.spotify.pageloader.t0
    public void start() {
        this.a.onStart();
        this.b.start();
    }

    @Override // com.spotify.pageloader.t0
    public void stop() {
        this.a.onStop();
        this.b.stop();
    }
}
