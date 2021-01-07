package defpackage;

import io.reactivex.functions.g;
import java.util.List;

/* renamed from: ip4  reason: default package */
public final /* synthetic */ class ip4 implements g {
    public final /* synthetic */ op4 a;

    public /* synthetic */ ip4(op4 op4) {
        this.a = op4;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d((List) obj);
    }
}
