package defpackage;

import io.reactivex.functions.g;
import io.reactivex.subjects.a;

/* renamed from: cba  reason: default package */
public final /* synthetic */ class cba implements g {
    public final /* synthetic */ a a;

    public /* synthetic */ cba(a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onError((Throwable) obj);
    }
}
