package com.spotify.cosmos.router.internal;

import com.google.common.base.MoreObjects;
import com.spotify.cosmos.router.RxRouter;

public abstract class RxRouterClient {
    private Listener mListener;
    private boolean mStarted;

    public interface Listener {
        void onConnected(RxRouter rxRouter);

        void onDisconnected();
    }

    public void connect() {
        MoreObjects.checkState(!this.mStarted);
        this.mStarted = true;
    }

    public void disconnect() {
        MoreObjects.checkState(this.mStarted);
        this.mStarted = false;
        notifyOnDisconnected();
    }

    public final boolean isStarted() {
        return this.mStarted;
    }

    /* access modifiers changed from: protected */
    public void notifyOnConnected(RxRouter rxRouter) {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onConnected(rxRouter);
        }
    }

    /* access modifiers changed from: protected */
    public void notifyOnDisconnected() {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onDisconnected();
        }
    }

    public void setListener(Listener listener) {
        this.mListener = listener;
    }
}
