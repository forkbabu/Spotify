package defpackage;

import com.google.common.base.MoreObjects;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.k;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: h2b  reason: default package */
public final /* synthetic */ class h2b implements l {
    public final /* synthetic */ y a;

    public /* synthetic */ h2b(y yVar) {
        this.a = yVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        y yVar = this.a;
        if (MoreObjects.isNullOrEmpty((String) obj)) {
            return g.m0(10, TimeUnit.MILLISECONDS, yVar);
        }
        int i = g.b;
        return k.c;
    }
}
