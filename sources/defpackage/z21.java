package defpackage;

import defpackage.q21;
import io.reactivex.functions.l;

/* renamed from: z21  reason: default package */
public final /* synthetic */ class z21 implements l {
    public final /* synthetic */ q21.a a;

    public /* synthetic */ z21(q21.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return r21.g(this.a.b(), "", s21.d(((Throwable) obj).getMessage()));
    }
}
