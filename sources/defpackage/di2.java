package defpackage;

import io.reactivex.functions.g;
import java.util.List;

/* renamed from: di2  reason: default package */
public final /* synthetic */ class di2 implements g {
    public final /* synthetic */ ti2 a;

    public /* synthetic */ di2(ti2 ti2) {
        this.a = ti2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((List) obj);
    }
}
