package defpackage;

import io.reactivex.functions.g;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: x76  reason: default package */
public final /* synthetic */ class x76 implements g {
    public final /* synthetic */ CompletableSubject a;

    public /* synthetic */ x76(CompletableSubject completableSubject) {
        this.a = completableSubject;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onError((Throwable) obj);
    }
}
