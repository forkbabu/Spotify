package com.spotify.cosmos.android;

import android.os.Binder;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.util.CosmosRequestInterceptor;
import com.spotify.cosmos.android.util.CosmosRequestObserver;
import com.spotify.cosmos.router.Lifetime;
import com.spotify.cosmos.router.NativeRouter;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.ResolveCallback;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.Router;
import com.spotify.mobile.android.util.Assertion;
import java.lang.ref.WeakReference;
import java.util.Map;

public class RemoteNativeRouter extends Binder {
    public static final int INVALID_SUBSCRIPTION_ID = -1;
    private static CosmosRequestInterceptor sRequestInterceptor = CosmosRequestInterceptor.NO_OP;
    private static CosmosRequestObserver sRequestObserver = CosmosRequestObserver.NO_OP;
    private final Router mNativeRouter;
    private boolean mRouterDestroyed;

    private class NullResolveCallback extends SubscriptionResolveCallback {
        public NullResolveCallback(String str) {
            super(null, str);
        }

        @Override // com.spotify.cosmos.android.RemoteNativeRouter.SubscriptionResolveCallback
        public int getId() {
            return -1;
        }

        @Override // com.spotify.cosmos.android.RemoteNativeRouter.SubscriptionResolveCallback, com.spotify.cosmos.router.ResolveCallback
        public void onError(Throwable th) {
        }

        @Override // com.spotify.cosmos.android.RemoteNativeRouter.SubscriptionResolveCallback, com.spotify.cosmos.router.ResolveCallback
        public void onResolved(Response response) {
        }
    }

    /* access modifiers changed from: private */
    public class SubscriptionResolveCallback implements ResolveCallback {
        private boolean mIsCancelled;
        private final String mRequestUri;
        private final ResolverCallbackReceiver<Response> mResolverCallbackReceiver;

        public void destroy() {
            this.mIsCancelled = true;
        }

        public int getId() {
            return this.mResolverCallbackReceiver.getId();
        }

        @Override // com.spotify.cosmos.router.ResolveCallback
        public void onError(Throwable th) {
            if (!RemoteNativeRouter.this.mRouterDestroyed && !this.mIsCancelled) {
                this.mResolverCallbackReceiver.sendOnError(th);
            }
        }

        @Override // com.spotify.cosmos.router.ResolveCallback
        public void onResolved(Response response) {
            if (!RemoteNativeRouter.this.mRouterDestroyed && !this.mIsCancelled) {
                RemoteNativeRouter.logIfEmptyResponse(response, this.mRequestUri);
                this.mResolverCallbackReceiver.sendOnResolved(response);
            }
        }

        private SubscriptionResolveCallback(ResolverCallbackReceiver<Response> resolverCallbackReceiver, String str) {
            this.mResolverCallbackReceiver = resolverCallbackReceiver;
            this.mRequestUri = str;
            this.mIsCancelled = false;
        }
    }

    /* access modifiers changed from: private */
    public static class WeakResolveCallbackWrapper implements ResolveCallback {
        private final String mId;
        private final WeakReference<ResolveCallback> mRef;

        public WeakResolveCallbackWrapper(String str, ResolveCallback resolveCallback) {
            this.mId = str;
            this.mRef = new WeakReference<>(resolveCallback);
        }

        @Override // com.spotify.cosmos.router.ResolveCallback
        public void onError(Throwable th) {
            ResolveCallback resolveCallback = this.mRef.get();
            RemoteNativeRouter.sRequestObserver.onError(this.mId, th);
            if (resolveCallback != null) {
                resolveCallback.onError(th);
            }
        }

        @Override // com.spotify.cosmos.router.ResolveCallback
        public void onResolved(Response response) {
            ResolveCallback resolveCallback = this.mRef.get();
            try {
                RemoteNativeRouter.sRequestObserver.onResponse(this.mId, response);
                if (resolveCallback != null) {
                    resolveCallback.onResolved(response);
                }
            } catch (Exception e) {
                Assertion.i("Caught an Exception in ResolveCallback.onResolved", e);
            }
        }
    }

    public RemoteNativeRouter(Router router) {
        this.mRouterDestroyed = false;
        this.mNativeRouter = router;
    }

    static void clearInterceptor() {
        setInterceptor(CosmosRequestInterceptor.NO_OP);
    }

    static CosmosRequestInterceptor getInterceptor() {
        return sRequestInterceptor;
    }

    /* access modifiers changed from: private */
    public static void logIfEmptyResponse(Response response, String str) {
        if (response == null) {
            Logger.d("Null response for %s: ", str);
        } else if (response.getBody() == null) {
            Logger.d("Response code: %d, Null response body for %s: ", Integer.valueOf(response.getStatus()), str);
        } else if (response.getBody().length != 0) {
        } else {
            if (response.getStatus() < 200 || response.getStatus() > 202) {
                Logger.d("Response code: %d, Empty response body for %s: ", Integer.valueOf(response.getStatus()), str);
            }
        }
    }

    static void setInterceptor(CosmosRequestInterceptor cosmosRequestInterceptor) {
        CosmosRequestInterceptor cosmosRequestInterceptor2 = sRequestInterceptor;
        if (cosmosRequestInterceptor != cosmosRequestInterceptor2) {
            cosmosRequestInterceptor2.destroy();
        }
        sRequestInterceptor = cosmosRequestInterceptor;
    }

    static void setObserver(CosmosRequestObserver cosmosRequestObserver) {
        sRequestObserver = cosmosRequestObserver;
    }

    public void destroy() {
        if (!this.mRouterDestroyed) {
            this.mNativeRouter.destroy();
            sRequestInterceptor.destroy();
            this.mRouterDestroyed = true;
            return;
        }
        throw new IllegalStateException("Router already destroyed");
    }

    public Router getNativeRouter() {
        return this.mNativeRouter;
    }

    /* access modifiers changed from: protected */
    public Lifetime performNativeResolve(Request request, ResolveCallback resolveCallback) {
        return this.mNativeRouter.resolve(request, resolveCallback);
    }

    public Lifetime resolve(String str, String str2, Map<String, String> map, byte[] bArr, ResolverCallbackReceiver<Response> resolverCallbackReceiver) {
        SubscriptionResolveCallback subscriptionResolveCallback;
        if (resolverCallbackReceiver == null) {
            subscriptionResolveCallback = new NullResolveCallback(str2);
        } else {
            subscriptionResolveCallback = new SubscriptionResolveCallback(resolverCallbackReceiver, str2);
        }
        return resolve(new Request(str, str2, map, bArr), subscriptionResolveCallback);
    }

    public RemoteNativeRouter() {
        this(new NativeRouter());
    }

    private Lifetime resolve(Request request, SubscriptionResolveCallback subscriptionResolveCallback) {
        if (this.mRouterDestroyed) {
            return Lifetime.UNRESOLVED;
        }
        int id = subscriptionResolveCallback.getId();
        Logger.g("Resolving router with uri = %s", request.getUri());
        sRequestObserver.onRequest(String.valueOf(id), request);
        Lifetime resolve = sRequestInterceptor.resolve(request, subscriptionResolveCallback);
        if (resolve != Lifetime.UNRESOLVED) {
            return new d(subscriptionResolveCallback, resolve);
        }
        return new c(subscriptionResolveCallback, performNativeResolve(request, new WeakResolveCallbackWrapper(String.valueOf(id), subscriptionResolveCallback)));
    }
}
