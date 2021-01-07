package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.spotify.cosmos.android.ResolverCallbackReceiver;
import com.spotify.cosmos.router.Response;

public abstract class ParsingCallbackReceiver<T> extends ResolverCallbackReceiver<Response> {

    public enum ErrorCause {
        RESOLVING,
        PARSING,
        UNKNOWN
    }

    public static class ParserException extends Exception {
        private static final long serialVersionUID = -6133574440765179179L;

        public ParserException(String str) {
            super(str);
        }

        public ParserException(Throwable th) {
            super(th);
        }

        public ParserException(String str, Throwable th) {
            super(str, th);
        }
    }

    public ParsingCallbackReceiver(Handler handler) {
        super(handler);
    }

    private void postError(final Throwable th, final ErrorCause errorCause) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() {
                /* class com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.AnonymousClass2 */

                @Override // java.lang.Runnable
                public void run() {
                    ParsingCallbackReceiver.this.onError(th, errorCause);
                }
            });
        } else {
            onError(th, errorCause);
        }
    }

    private void postResult(final Response response, final T t) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() {
                /* class com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.AnonymousClass1 */

                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.mobile.android.cosmos.ParsingCallbackReceiver */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    ParsingCallbackReceiver.this.onResolved(response, t);
                }
            });
        } else {
            onResolved(response, t);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.cosmos.android.ResolverCallbackReceiver
    public final void onError(Throwable th) {
        postError(th, ErrorCause.RESOLVING);
    }

    /* access modifiers changed from: protected */
    public abstract void onError(Throwable th, ErrorCause errorCause);

    /* access modifiers changed from: protected */
    public abstract void onResolved(Response response, T t);

    /* access modifiers changed from: protected */
    public abstract T parseResponse(Response response);

    /* access modifiers changed from: protected */
    public void verifyResponse(Response response) {
    }

    /* access modifiers changed from: protected */
    public final void onResolved(Response response) {
        try {
            verifyResponse(response);
            postResult(response, parseResponse(response));
        } catch (ParserException e) {
            postError(e, ErrorCause.PARSING);
        }
    }

    public void sendOnResolved(Response response) {
        onResolved(response);
    }
}
