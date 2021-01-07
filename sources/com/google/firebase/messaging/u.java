package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class u {
    private static WeakReference<u> d;
    private final SharedPreferences a;
    private s b;
    private final Executor c;

    private u(SharedPreferences sharedPreferences, Executor executor) {
        this.c = executor;
        this.a = sharedPreferences;
    }

    public static synchronized u a(Context context, Executor executor) {
        u uVar;
        synchronized (u.class) {
            WeakReference<u> weakReference = d;
            uVar = weakReference != null ? weakReference.get() : null;
            if (uVar == null) {
                uVar = new u(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                synchronized (uVar) {
                    uVar.b = s.b(uVar.a, "topic_operation_queue", ",", uVar.c);
                }
                d = new WeakReference<>(uVar);
            }
        }
        return uVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized t b() {
        return t.a(this.b.c());
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean c(t tVar) {
        return this.b.d(tVar.d());
    }
}
