package defpackage;

import io.reactivex.functions.g;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: ml6  reason: default package */
public final /* synthetic */ class ml6 implements g {
    public final /* synthetic */ CompletableSubject a;

    public /* synthetic */ ml6(CompletableSubject completableSubject) {
        this.a = completableSubject;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onError((Throwable) obj);
    }
}
