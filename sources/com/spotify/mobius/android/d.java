package com.spotify.mobius.android;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ MutableLiveQueue a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(MutableLiveQueue mutableLiveQueue, Object obj) {
        this.a = mutableLiveQueue;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d(this.b);
    }
}
