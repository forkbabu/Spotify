package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.cast.e;
import com.google.android.gms.cast.internal.d0;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.c;

/* access modifiers changed from: package-private */
public final class o1 extends a.AbstractC0094a<d0, e.b> {
    o1() {
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.c, java.lang.Object, com.google.android.gms.common.api.c$a, com.google.android.gms.common.api.c$b] */
    @Override // com.google.android.gms.common.api.a.AbstractC0094a
    public final /* synthetic */ d0 a(Context context, Looper looper, c cVar, e.b bVar, c.a aVar, c.b bVar2) {
        e.b bVar3 = bVar;
        g.k(bVar3, "Setting the API options is required.");
        return new d0(context, looper, cVar, bVar3.a, (long) 0, bVar3.b, bVar3.c, aVar, bVar2);
    }
}
