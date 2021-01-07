package com.spotify.cosmos.android;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ ResolverCallbackReceiver a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ e(ResolverCallbackReceiver resolverCallbackReceiver, Throwable th) {
        this.a = resolverCallbackReceiver;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onError(this.b);
    }
}
