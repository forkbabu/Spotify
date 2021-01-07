package defpackage;

import io.reactivex.functions.g;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: z96  reason: default package */
public final /* synthetic */ class z96 implements g {
    public final /* synthetic */ CompletableSubject a;

    public /* synthetic */ z96(CompletableSubject completableSubject) {
        this.a = completableSubject;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onError((Throwable) obj);
    }
}
