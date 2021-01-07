package defpackage;

import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: f62  reason: default package */
public final /* synthetic */ class f62 implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ f62(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((Map) obj).get(this.a);
    }
}
