package defpackage;

import defpackage.o17;
import io.reactivex.functions.g;
import io.reactivex.subjects.a;

/* renamed from: g17  reason: default package */
public final /* synthetic */ class g17 implements g {
    public final /* synthetic */ a a;

    public /* synthetic */ g17(a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onNext((o17.a) obj);
    }
}
