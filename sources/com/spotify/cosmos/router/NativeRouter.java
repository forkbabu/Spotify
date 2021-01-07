package com.spotify.cosmos.router;

public class NativeRouter implements Router {
    private long nPtr;

    public NativeRouter() {
        init();
    }

    private native void init();

    @Override // com.spotify.cosmos.router.Router
    public native void destroy();

    @Override // com.spotify.cosmos.router.Router
    public native Lifetime resolve(Request request, ResolveCallback resolveCallback);
}
