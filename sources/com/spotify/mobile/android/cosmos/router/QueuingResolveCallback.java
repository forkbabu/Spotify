package com.spotify.mobile.android.cosmos.router;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.ResolveCallback;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.Router;
import com.spotify.mobile.android.util.Assertion;

public class QueuingResolveCallback implements ResolveCallback {
    private final CosmosRequestQueue mCosmosRequestQueue;
    protected boolean mIsCosmosReady;
    private final Router mRouter;

    public QueuingResolveCallback(Router router) {
        this(router, new CosmosRequestQueue());
    }

    private static boolean parseResponseForReadiness(Response response) {
        if (response.getStatus() != 200) {
            return false;
        }
        Logger.b("Got cosmos session", new Object[0]);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void destroy() {
        setCosmosReady(false);
        this.mCosmosRequestQueue.destroy();
    }

    /* access modifiers changed from: package-private */
    public boolean isCosmosReady() {
        return this.mIsCosmosReady;
    }

    @Override // com.spotify.cosmos.router.ResolveCallback
    public void onError(Throwable th) {
        Assertion.i("Could not subscribe to cosmos session state", th);
    }

    @Override // com.spotify.cosmos.router.ResolveCallback
    public void onResolved(Response response) {
        if (!parseResponseForReadiness(response)) {
            setCosmosReady(false);
        } else if (!isCosmosReady()) {
            setCosmosReady(true);
        }
    }

    /* access modifiers changed from: protected */
    public Lifetime queue(Request request, ResolveCallback resolveCallback) {
        return this.mCosmosRequestQueue.queue(request, resolveCallback);
    }

    /* access modifiers changed from: package-private */
    public void setCosmosReady(boolean z) {
        this.mIsCosmosReady = z;
        if (z) {
            this.mCosmosRequestQueue.replayRequests(this.mRouter);
        }
    }

    protected QueuingResolveCallback(Router router, CosmosRequestQueue cosmosRequestQueue) {
        router.getClass();
        this.mRouter = router;
        cosmosRequestQueue.getClass();
        this.mCosmosRequestQueue = cosmosRequestQueue;
    }
}
