package defpackage;

import io.reactivex.functions.g;
import java.util.List;

/* renamed from: rq0  reason: default package */
public final /* synthetic */ class rq0 implements g {
    public final /* synthetic */ yq0 a;

    public /* synthetic */ rq0(yq0 yq0) {
        this.a = yq0;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        yq0.b(this.a, (List) obj);
    }
}
