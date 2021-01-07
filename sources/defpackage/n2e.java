package defpackage;

import io.reactivex.functions.g;
import java.util.List;

/* renamed from: n2e  reason: default package */
public final /* synthetic */ class n2e implements g {
    public final /* synthetic */ s2e a;
    public final /* synthetic */ String b;

    public /* synthetic */ n2e(s2e s2e, String str) {
        this.a = s2e;
        this.b = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.d(this.b, (List) obj);
    }
}
