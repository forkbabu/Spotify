package defpackage;

import io.reactivex.functions.g;
import java.util.Map;

/* renamed from: ri3  reason: default package */
public final /* synthetic */ class ri3 implements g {
    public final /* synthetic */ gj3 a;
    public final /* synthetic */ String b;

    public /* synthetic */ ri3(gj3 gj3, String str) {
        this.a = gj3;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.A(this.b, (Map) obj);
    }
}
