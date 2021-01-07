package com.google.android.gms.common.api;

import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.n;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
public abstract class c {
    private static final Set<c> a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface a extends f {
    }

    @Deprecated
    public interface b extends n {
    }

    @RecentlyNonNull
    public static Set<c> c() {
        Set<c> set = a;
        synchronized (set) {
        }
        return set;
    }

    @RecentlyNonNull
    public <A extends a.b, R extends i, T extends d<R, A>> T a(@RecentlyNonNull T t) {
        throw new UnsupportedOperationException();
    }

    @RecentlyNonNull
    public <A extends a.b, T extends d<? extends i, A>> T b(@RecentlyNonNull T t) {
        throw new UnsupportedOperationException();
    }

    @RecentlyNonNull
    public Looper d() {
        throw new UnsupportedOperationException();
    }
}
