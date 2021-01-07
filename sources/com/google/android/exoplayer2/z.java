package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.i;

@Deprecated
public final class z {
    @Deprecated
    public static u0 a(Context context, s0 s0Var, jq jqVar) {
        v vVar = new v();
        Looper p = f0.p();
        i iVar = i.a;
        return new u0(context, s0Var, jqVar, vVar, null, o.k(context), new zi(iVar), iVar, p);
    }
}
