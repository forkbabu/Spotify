package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.cast.x;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.tasks.g;

public final class v extends b<a.d.c> {
    private static final a.g<b0> k;
    private static final a.AbstractC0094a<b0, a.d.c> l;
    private static final a<a.d.c> m;

    static {
        a.g<b0> gVar = new a.g<>();
        k = gVar;
        z zVar = new z();
        l = zVar;
        m = new a<>("CastApi.API", zVar, gVar);
    }

    public v(Context context) {
        super(context, m, (a.d) null, b.a.c);
    }

    public final g<Bundle> u(String[] strArr) {
        s.a a = s.a();
        a.b(new y(this, strArr));
        a.d(x.d);
        a.c(false);
        return g(a.a());
    }

    public final g<Bundle> v(String[] strArr) {
        s.a a = s.a();
        a.b(new x(this, strArr));
        a.d(x.g);
        a.c(false);
        return g(a.a());
    }
}
