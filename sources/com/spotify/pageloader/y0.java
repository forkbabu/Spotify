package com.spotify.pageloader;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.u;
import io.reactivex.disposables.b;
import io.reactivex.s;

public class y0<T> implements t0<T> {
    private final s<l0<T>> a;
    private final u<l0<T>> b = new u<>();
    private b c;

    public y0(s<l0<T>> sVar) {
        this.a = sVar;
    }

    private void c() {
        if (this.c == null) {
            s<l0<T>> sVar = this.a;
            u<l0<T>> uVar = this.b;
            uVar.getClass();
            this.c = sVar.subscribe(new b(uVar));
            return;
        }
        throw new IllegalStateException("Loader is already running.");
    }

    @Override // com.spotify.pageloader.t0
    public LiveData<l0<T>> a() {
        return this.b;
    }

    @Override // com.spotify.pageloader.t0
    public void b() {
        this.c.dispose();
        this.c = null;
        c();
    }

    @Override // com.spotify.pageloader.t0
    public synchronized void start() {
        c();
    }

    @Override // com.spotify.pageloader.t0
    public synchronized void stop() {
        this.c.dispose();
        this.c = null;
    }
}
