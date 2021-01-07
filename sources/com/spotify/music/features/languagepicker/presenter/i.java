package com.spotify.music.features.languagepicker.presenter;

import android.os.Handler;
import com.google.common.base.MoreObjects;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber;

public abstract class i {
    private final a a;
    private ListSubscriber.SubscriptionState b;
    private ListSubscriber.SubscriptionState c;

    public interface a {
        void a(ListSubscriber.SubscriptionState subscriptionState);
    }

    /* access modifiers changed from: private */
    public static class b extends i implements Runnable {
        private final Handler f = new Handler();
        private final int n;

        public b(a aVar, int i) {
            super(aVar);
            this.n = i;
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.music.features.languagepicker.presenter.i
        public void d() {
            this.f.postDelayed(this, (long) this.n);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.music.features.languagepicker.presenter.i
        public void f() {
            this.f.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    public i(a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    private void b(ListSubscriber.SubscriptionState subscriptionState) {
        MoreObjects.checkState(subscriptionState != this.c);
        this.c = subscriptionState;
        this.a.a(subscriptionState);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        ListSubscriber.SubscriptionState subscriptionState = this.b;
        subscriptionState.getClass();
        this.b = null;
        b(subscriptionState);
    }

    public final ListSubscriber.SubscriptionState c() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public abstract void d();

    public final void e(ListSubscriber.SubscriptionState subscriptionState, boolean z) {
        ListSubscriber.SubscriptionState subscriptionState2 = this.b;
        boolean z2 = true;
        if (subscriptionState2 != null) {
            if (subscriptionState2 != subscriptionState || !z) {
                MoreObjects.checkState(true);
                this.b = null;
                f();
            } else {
                return;
            }
        }
        if (subscriptionState != this.c) {
            if (z) {
                if (this.b != null) {
                    z2 = false;
                }
                MoreObjects.checkState(z2);
                this.b = subscriptionState;
                d();
                return;
            }
            b(subscriptionState);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void f();
}
