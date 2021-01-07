package defpackage;

import io.reactivex.functions.g;
import io.reactivex.subjects.a;

/* renamed from: dba  reason: default package */
public final /* synthetic */ class dba implements g {
    public final /* synthetic */ a a;

    public /* synthetic */ dba(a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onNext((gba) obj);
    }
}
