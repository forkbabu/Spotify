package defpackage;

import io.reactivex.functions.g;
import java.util.Map;

/* renamed from: nyb  reason: default package */
public final /* synthetic */ class nyb implements g {
    public final /* synthetic */ xyb a;

    public /* synthetic */ nyb(xyb xyb) {
        this.a = xyb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        xyb.a(this.a, (Map) obj);
    }
}
