package defpackage;

import com.google.common.collect.ImmutableList;
import io.reactivex.functions.g;

/* renamed from: vz3  reason: default package */
public final /* synthetic */ class vz3 implements g {
    public final /* synthetic */ yz3 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ vz3(yz3 yz3, boolean z) {
        this.a = yz3;
        this.b = z;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.n(this.b, (ImmutableList) obj);
    }
}
