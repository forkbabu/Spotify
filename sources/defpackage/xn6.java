package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: xn6  reason: default package */
public final /* synthetic */ class xn6 implements l {
    public final /* synthetic */ qo6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ xn6(qo6 qo6, boolean z, String str) {
        this.a = qo6;
        this.b = z;
        this.c = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.o(this.b, this.c, (Optional) obj);
    }
}
