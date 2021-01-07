package defpackage;

import io.reactivex.functions.g;

/* renamed from: k9b  reason: default package */
public class k9b implements g<Boolean> {
    private final e9b a;

    public k9b(e9b e9b) {
        e9b.getClass();
        this.a = e9b;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Boolean bool) {
        if (!bool.booleanValue()) {
            this.a.a();
        }
    }
}
