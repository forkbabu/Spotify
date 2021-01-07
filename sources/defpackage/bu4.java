package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: bu4  reason: default package */
public final /* synthetic */ class bu4 implements l {
    public final /* synthetic */ gu4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Optional c;

    public /* synthetic */ bu4(gu4 gu4, String str, Optional optional) {
        this.a = gu4;
        this.b = str;
        this.c = optional;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f(this.b, this.c, (List) obj);
    }
}
