package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: dx8  reason: default package */
public final /* synthetic */ class dx8 implements l {
    public final /* synthetic */ iy8 a;
    public final /* synthetic */ vx8 b;
    public final /* synthetic */ yda c;
    public final /* synthetic */ Optional f;

    public /* synthetic */ dx8(iy8 iy8, vx8 vx8, yda yda, Optional optional) {
        this.a = iy8;
        this.b = vx8;
        this.c = yda;
        this.f = optional;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.k(this.b, this.c, this.f, (String) obj);
    }
}
