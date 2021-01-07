package com.spotify.mobius.android;

import java.util.Queue;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ MutableLiveQueue a;
    public final /* synthetic */ Queue b;

    public /* synthetic */ c(MutableLiveQueue mutableLiveQueue, Queue queue) {
        this.a = mutableLiveQueue;
        this.b = queue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(this.b);
    }
}
