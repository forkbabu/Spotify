package defpackage;

import defpackage.gu4;
import io.reactivex.functions.g;

/* renamed from: zt4  reason: default package */
public final /* synthetic */ class zt4 implements g {
    public final /* synthetic */ gu4 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ zt4(gu4 gu4, boolean z, String str) {
        this.a = gu4;
        this.b = z;
        this.c = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.h(this.b, this.c, (gu4.a) obj);
    }
}
