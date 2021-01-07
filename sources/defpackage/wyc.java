package defpackage;

import io.reactivex.functions.g;
import java.util.List;

/* renamed from: wyc  reason: default package */
public final /* synthetic */ class wyc implements g {
    public final /* synthetic */ nzc a;
    public final /* synthetic */ rzc b;
    public final /* synthetic */ pzc c;
    public final /* synthetic */ List f;
    public final /* synthetic */ String n;

    public /* synthetic */ wyc(nzc nzc, rzc rzc, pzc pzc, List list, String str) {
        this.a = nzc;
        this.b = rzc;
        this.c = pzc;
        this.f = list;
        this.n = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e(this.b, this.c, this.f, this.n, (u3) obj);
    }
}
