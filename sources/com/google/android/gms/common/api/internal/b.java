package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.m;
import java.util.Arrays;

public final class b<O extends a.d> {
    private final int a;
    private final a<O> b;
    private final O c;
    private final String d;

    private b(a<O> aVar, O o, String str) {
        this.b = aVar;
        this.c = o;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{aVar, o, str});
    }

    @RecentlyNonNull
    public static <O extends a.d> b<O> a(@RecentlyNonNull a<O> aVar, O o, String str) {
        return new b<>(aVar, o, str);
    }

    @RecentlyNonNull
    public final String b() {
        return this.b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.b, bVar.b) && m.a(this.c, bVar.c) && m.a(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
