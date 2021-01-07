package com.spotify.mobile.android.util.connectivity;

import android.content.Context;
import android.os.Build;
import io.reactivex.y;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class v {
    private static volatile v b;
    protected final Set<a0> a = Collections.synchronizedSet(new HashSet());

    public static v a(Context context, y yVar) {
        if (b == null) {
            synchronized (v.class) {
                if (b == null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        b = new w(context, yVar);
                    } else {
                        b = new x(context);
                    }
                }
            }
        }
        return b;
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    public abstract ConnectionType c();

    public abstract void d();

    public synchronized void e(a0 a0Var) {
        if (this.a.isEmpty()) {
            f();
        }
        this.a.add(a0Var);
    }

    /* access modifiers changed from: protected */
    public abstract void f();

    public synchronized void g(a0 a0Var) {
        this.a.remove(a0Var);
        if (this.a.isEmpty()) {
            b();
        }
    }
}
