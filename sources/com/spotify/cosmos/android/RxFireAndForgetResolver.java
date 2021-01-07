package com.spotify.cosmos.android;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.c;
import io.reactivex.disposables.a;
import io.reactivex.disposables.b;
import io.reactivex.s;
import io.reactivex.x;
import io.reactivex.z;

public class RxFireAndForgetResolver implements FireAndForgetResolver {
    private static final Request EMPTY_REQUEST = new Request("", "sp://dummy");
    private static final ResolverCallbackReceiver<Response> NO_OP = ResolverCallbackReceiver.forAny(null, i.a, g.a);
    public static final /* synthetic */ int a = 0;
    private final a mDisposables = new a();
    private boolean mDisposed;
    private final RxResolver mRxResolver;

    /* access modifiers changed from: private */
    public class SubscribeWithCallback<T> implements x<T>, c {
        private final String mAction;
        private b mDisposable;
        private final ResolverCallbackReceiver<T> mReceiver;
        private final String mUri;

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            Logger.g("%s %s completed", this.mUri, this.mAction);
            this.mDisposable.dispose();
            RxFireAndForgetResolver.this.mDisposables.a(this.mDisposable);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            Logger.g("%s %s failed with message: %s", this.mUri, this.mAction, th.getMessage());
            this.mReceiver.sendOnError(th);
            this.mDisposable.dispose();
            RxFireAndForgetResolver.this.mDisposables.a(this.mDisposable);
        }

        @Override // io.reactivex.x
        public void onNext(T t) {
            this.mReceiver.sendOnResolved(t);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(b bVar) {
            this.mDisposable = bVar;
            RxFireAndForgetResolver.this.mDisposables.b(bVar);
        }

        private SubscribeWithCallback(RxFireAndForgetResolver rxFireAndForgetResolver, Request request, ResolverCallbackReceiver<T> resolverCallbackReceiver) {
            this(request.getAction(), request.getUri(), resolverCallbackReceiver);
        }

        private SubscribeWithCallback(String str, String str2, ResolverCallbackReceiver<T> resolverCallbackReceiver) {
            this.mAction = str;
            this.mUri = str2;
            this.mReceiver = resolverCallbackReceiver;
        }
    }

    public RxFireAndForgetResolver(RxResolver rxResolver) {
        this.mRxResolver = rxResolver;
    }

    private static String composeErrorMessage(Request request, Response response) {
        return request.getAction() + ' ' + request.getUri() + " : failed with " + response.getStatus() + " status code.";
    }

    /* access modifiers changed from: private */
    public static s<Response> processResponseStatus(u3<Request, Response> u3Var) {
        F f = u3Var.a;
        S s = u3Var.b;
        if (s.getStatus() >= 400) {
            return s.P(new CosmosException(composeErrorMessage(f, s)));
        }
        return s.i0(s);
    }

    private void verifyIsDisposed() {
        if (this.mDisposed) {
            Logger.e(new IllegalStateException(), "Trying to resolve when FireAndForgetResolver is disposed", new Object[0]);
        }
    }

    @Override // com.spotify.cosmos.android.FireAndForgetResolver
    public void detached(z<? extends Response> zVar) {
        detached(zVar.P());
    }

    @Override // com.spotify.cosmos.android.FireAndForgetResolver
    public synchronized void dispose() {
        this.mDisposables.f();
        this.mDisposed = true;
    }

    @Override // com.spotify.cosmos.android.FireAndForgetResolver
    public synchronized void reset() {
        this.mDisposed = false;
    }

    @Override // com.spotify.cosmos.android.FireAndForgetResolver
    public synchronized void resolve(Request request) {
        verifyIsDisposed();
        this.mRxResolver.resolve(request).B0().A(new j(request)).v(h.a).subscribe(new SubscribeWithCallback(request, NO_OP));
    }

    @Override // com.spotify.cosmos.android.FireAndForgetResolver
    public void detached(z<? extends Response> zVar, ResolverCallbackReceiver<? extends Response> resolverCallbackReceiver) {
        detached(zVar.P(), resolverCallbackReceiver);
    }

    @Override // com.spotify.cosmos.android.FireAndForgetResolver
    public void detached(s<? extends Response> sVar) {
        detached(sVar, (ResolverCallbackReceiver<? extends Response>) null);
    }

    @Override // com.spotify.cosmos.android.FireAndForgetResolver
    public synchronized void detached(s<? extends Response> sVar, ResolverCallbackReceiver<? extends Response> resolverCallbackReceiver) {
        Request request = EMPTY_REQUEST;
        if (resolverCallbackReceiver == null) {
            resolverCallbackReceiver = NO_OP;
        }
        sVar.j0(new k(request)).W(h.a, false, Integer.MAX_VALUE).subscribe(new SubscribeWithCallback(request, resolverCallbackReceiver));
    }

    @Override // com.spotify.cosmos.android.FireAndForgetResolver
    public synchronized void resolve(Request request, ResolverCallbackReceiver<? extends Response> resolverCallbackReceiver) {
        verifyIsDisposed();
        if (resolverCallbackReceiver == null) {
            resolverCallbackReceiver = NO_OP;
        }
        this.mRxResolver.resolve(request).subscribe(new SubscribeWithCallback(request, resolverCallbackReceiver));
    }
}
