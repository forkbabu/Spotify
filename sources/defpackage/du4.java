package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: du4  reason: default package */
public final /* synthetic */ class du4 implements l {
    public final /* synthetic */ gu4 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Optional f;

    public /* synthetic */ du4(gu4 gu4, boolean z, List list, Optional optional) {
        this.a = gu4;
        this.b = z;
        this.c = list;
        this.f = optional;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.g(this.b, this.c, this.f, (String) obj);
    }
}
