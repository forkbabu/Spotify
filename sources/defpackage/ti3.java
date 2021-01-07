package defpackage;

import io.reactivex.functions.l;
import java.util.List;

/* renamed from: ti3  reason: default package */
public final /* synthetic */ class ti3 implements l {
    public final /* synthetic */ gj3 a;
    public final /* synthetic */ String b;

    public /* synthetic */ ti3(gj3 gj3, String str) {
        this.a = gj3;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.v(this.b, (List) obj);
    }
}
