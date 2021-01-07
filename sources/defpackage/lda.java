package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.g;

/* renamed from: lda  reason: default package */
public final /* synthetic */ class lda implements g {
    public final /* synthetic */ oda a;

    public /* synthetic */ lda(oda oda) {
        this.a = oda;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c((Optional) obj);
    }
}
