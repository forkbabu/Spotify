package com.spotify.cosmos.router.internal;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.rxjava2.y;

class RouterLifecycleObserver implements m {
    private boolean mEntered;
    private final CosmosServiceRxRouter mServiceRxRouter;

    RouterLifecycleObserver(CosmosServiceRxRouter cosmosServiceRxRouter) {
        this.mServiceRxRouter = cosmosServiceRxRouter;
    }

    private void unsubscribeAndReportLeaks() {
        for (y yVar : this.mServiceRxRouter.unsubscribeAndReturnLeaks()) {
            Assertion.t(yVar.a(String.format("Leaked subscription detected during lifecycle stop: %s. Subscription was originally created here:", yVar.b()), "The observable of the leaked subscription was originally created here:"));
        }
    }

    @w(Lifecycle.Event.ON_START)
    public void enterScope() {
        z42.a("Not called on main looper");
        if (!this.mEntered) {
            Logger.g("Starting CosmosServiceRxRouter", new Object[0]);
            this.mServiceRxRouter.start();
            this.mEntered = true;
        }
    }

    @w(Lifecycle.Event.ON_STOP)
    public void leaveScope() {
        z42.a("Not called on main looper");
        if (this.mEntered) {
            this.mServiceRxRouter.stop();
            this.mEntered = false;
            unsubscribeAndReportLeaks();
        }
    }
}
