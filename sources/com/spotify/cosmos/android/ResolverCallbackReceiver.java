package com.spotify.cosmos.android;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.functions.g;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ResolverCallbackReceiver<T> {
    private static final AtomicInteger ID_GEN = new AtomicInteger(0);
    protected final Handler mHandler;
    private final int mId = createId();

    /* JADX WARN: Field signature parse error: mResponse */
    protected class LocalRunnable implements Runnable {
        private final Object mResponse;

        /* JADX WARN: Failed to parse method signature: (TT)V */
        public LocalRunnable(Object obj) {
            this.mResponse = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.cosmos.android.ResolverCallbackReceiver */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            ResolverCallbackReceiver.this.onResolved(this.mResponse);
        }
    }

    public ResolverCallbackReceiver(Handler handler) {
        this.mHandler = handler;
    }

    private static int createId() {
        return ID_GEN.getAndIncrement();
    }

    public static <T> ResolverCallbackReceiver<T> forAny(Handler handler, final g<T> gVar, final g<Throwable> gVar2) {
        return new ResolverCallbackReceiver<T>(handler) {
            /* class com.spotify.cosmos.android.ResolverCallbackReceiver.AnonymousClass1 */

            /* access modifiers changed from: protected */
            @Override // com.spotify.cosmos.android.ResolverCallbackReceiver
            public void onError(Throwable th) {
                try {
                    gVar2.accept(th);
                } catch (Exception e) {
                    throw ExceptionHelper.e(e);
                }
            }

            /* access modifiers changed from: protected */
            @Override // com.spotify.cosmos.android.ResolverCallbackReceiver
            public void onResolved(T t) {
                try {
                    gVar.accept(t);
                } catch (Exception e) {
                    throw ExceptionHelper.e(e);
                }
            }
        };
    }

    public static <T> ResolverCallbackReceiver<T> forUI(g<T> gVar, g<Throwable> gVar2) {
        return forAny(new Handler(Looper.getMainLooper()), gVar, gVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ResolverCallbackReceiver) && ((ResolverCallbackReceiver) obj).mId == this.mId) {
            return true;
        }
        return false;
    }

    public final int getId() {
        return this.mId;
    }

    public int hashCode() {
        return this.mId;
    }

    /* access modifiers changed from: protected */
    public abstract void onError(Throwable th);

    /* access modifiers changed from: protected */
    public abstract void onResolved(T t);

    public final void sendOnError(Throwable th) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new e(this, th));
        } else {
            onError(th);
        }
    }

    public void sendOnResolved(T t) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new LocalRunnable(t));
        } else {
            onResolved(t);
        }
    }
}
