package defpackage;

import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: a75  reason: default package */
public final /* synthetic */ class a75 implements l {
    public final /* synthetic */ g75 a;
    public final /* synthetic */ String b;

    public /* synthetic */ a75(g75 g75, String str) {
        this.a = g75;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (Map) obj);
    }
}
