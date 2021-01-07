package defpackage;

import io.reactivex.functions.g;
import io.reactivex.subjects.a;

/* renamed from: o86  reason: default package */
public final /* synthetic */ class o86 implements g {
    public final /* synthetic */ a a;

    public /* synthetic */ o86(a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onNext((h76) obj);
    }
}
