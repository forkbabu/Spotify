package defpackage;

import io.reactivex.functions.g;
import java.util.List;

/* renamed from: qne  reason: default package */
public final /* synthetic */ class qne implements g {
    public final /* synthetic */ zne a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ qne(zne zne, String str, List list) {
        this.a = zne;
        this.b = str;
        this.c = list;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(this.b, this.c, (Throwable) obj);
    }
}
