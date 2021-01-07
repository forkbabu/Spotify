package defpackage;

import io.reactivex.functions.g;

/* renamed from: hu3  reason: default package */
public final /* synthetic */ class hu3 implements g {
    public final /* synthetic */ ku3 a;

    public /* synthetic */ hu3(ku3 ku3) {
        this.a = ku3;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ku3.a(this.a, ((Boolean) obj).booleanValue());
    }
}
