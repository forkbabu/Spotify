package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.util.l0;
import defpackage.lp7;
import io.reactivex.functions.l;

/* renamed from: bq7  reason: default package */
public final /* synthetic */ class bq7 implements l {
    public final /* synthetic */ at7 a;

    public /* synthetic */ bq7(at7 at7) {
        this.a = at7;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        at7 at7 = this.a;
        lp7.c cVar = (lp7.c) obj;
        String B = l0.J(cVar.b()).B();
        B.getClass();
        ct7 a2 = cVar.a();
        at7.getClass();
        return at7.f(ImmutableSet.of(B), ImmutableMap.of(B, a2)).j0(new us7(B)).j0(pp7.a);
    }
}
