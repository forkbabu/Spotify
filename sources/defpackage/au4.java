package defpackage;

import defpackage.eu4;
import io.reactivex.functions.l;

/* renamed from: au4  reason: default package */
public final /* synthetic */ class au4 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ au4(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        eu4.b bVar = new eu4.b();
        bVar.c((String) obj);
        bVar.b(str);
        return bVar.a();
    }
}
