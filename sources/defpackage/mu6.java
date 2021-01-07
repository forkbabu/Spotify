package defpackage;

import io.reactivex.functions.l;

/* renamed from: mu6  reason: default package */
public final /* synthetic */ class mu6 implements l {
    public final /* synthetic */ yu6 a;
    public final /* synthetic */ String b;

    public /* synthetic */ mu6(yu6 yu6, String str) {
        this.a = yu6;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.e(this.b, (Boolean) obj);
    }
}
