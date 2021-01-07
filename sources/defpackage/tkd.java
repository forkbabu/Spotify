package defpackage;

import io.reactivex.functions.g;
import java.util.List;

/* renamed from: tkd  reason: default package */
public final /* synthetic */ class tkd implements g {
    public final /* synthetic */ bld a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ tkd(bld bld, String str, List list) {
        this.a = bld;
        this.b = str;
        this.c = list;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.j(this.b, this.c, (Throwable) obj);
    }
}
