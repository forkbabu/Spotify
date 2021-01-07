package defpackage;

import io.reactivex.functions.a;
import java.util.List;

/* renamed from: qg2  reason: default package */
public final /* synthetic */ class qg2 implements a {
    public final /* synthetic */ rg2 a;
    public final /* synthetic */ List b;

    public /* synthetic */ qg2(rg2 rg2, List list) {
        this.a = rg2;
        this.b = list;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.b(this.b);
    }
}
