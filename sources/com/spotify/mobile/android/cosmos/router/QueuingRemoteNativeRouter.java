package com.spotify.mobile.android.cosmos.router;

import com.spotify.cosmos.android.RemoteNativeRouter;
import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.ResolveCallback;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.Router;

public class QueuingRemoteNativeRouter extends RemoteNativeRouter {
    static final String SP_CLIENT_TOKEN_V1_URI = "sp://client-token/v1";
    static final String SP_ORBIT_SESSION_STATE_URI = "sp://orbitsession/v1/state";
    static final String SP_REMOTE_CONFIG_V1_URI = "sp://remote-config/v1";
    static final String SP_SESSION_V1_URI = "sp://session/v1";
    Lifetime mLifetime;
    private final QueuingResolveCallback mQueuingResolveCallback;

    private static class RestartQueueCallback implements ResolveCallback {
        private final QueuingResolveCallback mQueuingResolveCallback;
        private final ResolveCallback mResolveCallback;

        RestartQueueCallback(ResolveCallback resolveCallback, QueuingResolveCallback queuingResolveCallback) {
            this.mResolveCallback = resolveCallback;
            this.mQueuingResolveCallback = queuingResolveCallback;
        }

        @Override // com.spotify.cosmos.router.ResolveCallback
        public void onError(Throwable th) {
            this.mQueuingResolveCallback.setCosmosReady(true);
            this.mResolveCallback.onError(th);
        }

        @Override // com.spotify.cosmos.router.ResolveCallback
        public void onResolved(Response response) {
            this.mResolveCallback.onResolved(response);
        }
    }

    public QueuingRemoteNativeRouter(Router router) {
        this(router, new QueuingResolveCallback(router));
    }

    private static boolean shouldHaltQueue(Request request) {
        return Request.DELETE.equals(request.getAction()) && request.getUri().equals(SP_SESSION_V1_URI);
    }

    private static boolean shouldQueueRequest(Request request) {
        if (request.getHeaders() != null && request.getHeaders().containsKey("force-request") && request.getHeaders().get("force-request").equals("true")) {
            return false;
        }
        String uri = request.getUri();
        if (SP_ORBIT_SESSION_STATE_URI.equals(uri) || uri.startsWith(SP_SESSION_V1_URI) || uri.startsWith(SP_REMOTE_CONFIG_V1_URI) || uri.startsWith(SP_CLIENT_TOKEN_V1_URI)) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.cosmos.android.RemoteNativeRouter
    public void destroy() {
        super.destroy();
        this.mLifetime.destroy();
        this.mQueuingResolveCallback.destroy();
    }

    public void onNativeRouterInitialized() {
        this.mLifetime = super.performNativeResolve(new Request(Request.SUB, SP_SESSION_V1_URI), this.mQueuingResolveCallback);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.cosmos.android.RemoteNativeRouter
    public Lifetime performNativeResolve(Request request, ResolveCallback resolveCallback) {
        if (shouldHaltQueue(request) && this.mQueuingResolveCallback.isCosmosReady()) {
            this.mQueuingResolveCallback.setCosmosReady(false);
            resolveCallback = new RestartQueueCallback(resolveCallback, this.mQueuingResolveCallback);
        }
        if (this.mQueuingResolveCallback.isCosmosReady() || !shouldQueueRequest(request)) {
            return super.performNativeResolve(request, resolveCallback);
        }
        return this.mQueuingResolveCallback.queue(request, resolveCallback);
    }

    public QueuingRemoteNativeRouter(Router router, QueuingResolveCallback queuingResolveCallback) {
        super(router);
        this.mLifetime = Lifetime.UNRESOLVED;
        this.mQueuingResolveCallback = queuingResolveCallback;
    }

    public QueuingRemoteNativeRouter() {
        this.mLifetime = Lifetime.UNRESOLVED;
        this.mQueuingResolveCallback = new QueuingResolveCallback(getNativeRouter());
    }
}
