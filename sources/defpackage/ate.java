package defpackage;

import io.reactivex.b;
import io.reactivex.d;

/* renamed from: ate  reason: default package */
public final /* synthetic */ class ate implements d {
    public final /* synthetic */ cte a;
    public final /* synthetic */ int b;

    public /* synthetic */ ate(cte cte, int i) {
        this.a = cte;
        this.b = i;
    }

    @Override // io.reactivex.d
    public final void subscribe(b bVar) {
        this.a.a(this.b, bVar);
    }
}
