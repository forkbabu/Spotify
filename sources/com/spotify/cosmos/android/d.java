package com.spotify.cosmos.android;

import com.spotify.cosmos.android.RemoteNativeRouter;
import com.spotify.cosmos.router.Lifetime;

public final /* synthetic */ class d implements Lifetime {
    public final /* synthetic */ RemoteNativeRouter.SubscriptionResolveCallback a;
    public final /* synthetic */ Lifetime b;

    public /* synthetic */ d(RemoteNativeRouter.SubscriptionResolveCallback subscriptionResolveCallback, Lifetime lifetime) {
        this.a = subscriptionResolveCallback;
        this.b = lifetime;
    }

    @Override // com.spotify.cosmos.router.Lifetime
    public final void destroy() {
        RemoteNativeRouter.SubscriptionResolveCallback subscriptionResolveCallback = this.a;
        Lifetime lifetime = this.b;
        int i = RemoteNativeRouter.INVALID_SUBSCRIPTION_ID;
        subscriptionResolveCallback.destroy();
        lifetime.destroy();
    }
}
