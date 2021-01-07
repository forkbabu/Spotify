package defpackage;

import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: f17  reason: default package */
public final /* synthetic */ class f17 implements l {
    public final /* synthetic */ q17 a;
    public final /* synthetic */ String b;

    public /* synthetic */ f17(q17 q17, String str) {
        this.a = q17;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (Map) obj);
    }
}
