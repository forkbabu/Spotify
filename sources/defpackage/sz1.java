package defpackage;

import io.reactivex.functions.l;
import retrofit2.v;

/* renamed from: sz1  reason: default package */
public final /* synthetic */ class sz1 implements l {
    public static final /* synthetic */ sz1 a = new sz1();

    private /* synthetic */ sz1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        v vVar = (v) obj;
        return Boolean.valueOf(vVar.b() >= 200 && vVar.b() < 299);
    }
}
