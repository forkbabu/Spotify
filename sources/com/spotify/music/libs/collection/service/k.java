package com.spotify.music.libs.collection.service;

import io.reactivex.functions.g;
import java.util.concurrent.Semaphore;

public final /* synthetic */ class k implements g {
    public final /* synthetic */ Semaphore a;

    public /* synthetic */ k(Semaphore semaphore) {
        this.a = semaphore;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        this.a.release();
    }
}
