package defpackage;

import com.google.common.collect.ImmutableSet;
import io.reactivex.t;
import io.reactivex.u;
import java.util.HashMap;

/* renamed from: ys7  reason: default package */
public final /* synthetic */ class ys7 implements u {
    public final /* synthetic */ at7 a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ImmutableSet c;

    public /* synthetic */ ys7(at7 at7, HashMap hashMap, ImmutableSet immutableSet) {
        this.a = at7;
        this.b = hashMap;
        this.c = immutableSet;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        this.a.d(this.b, this.c, tVar);
    }
}
