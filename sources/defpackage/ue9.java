package defpackage;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: ue9  reason: default package */
public final /* synthetic */ class ue9 implements w {
    public final /* synthetic */ ye9 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ ue9(ye9 ye9, String str, String str2) {
        this.a = ye9;
        this.b = str;
        this.c = str2;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.J0(new re9(this.a, this.b, this.c));
    }
}
