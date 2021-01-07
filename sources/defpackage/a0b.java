package defpackage;

import defpackage.xya;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: a0b  reason: default package */
public final /* synthetic */ class a0b implements l {
    public final /* synthetic */ w0b a;
    public final /* synthetic */ xya.g b;

    public /* synthetic */ a0b(w0b w0b, xya.g gVar) {
        this.a = w0b;
        this.b = gVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (Map) obj);
    }
}
