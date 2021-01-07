package com.spotify.music.libs.collection.service;

import java.util.concurrent.Semaphore;

public final /* synthetic */ class a implements io.reactivex.functions.a {
    public final /* synthetic */ Semaphore a;

    public /* synthetic */ a(Semaphore semaphore) {
        this.a = semaphore;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.release();
    }
}
