package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: rl1  reason: default package */
public final /* synthetic */ class rl1 implements l {
    public final /* synthetic */ wl1 a;
    public final /* synthetic */ yda b;
    public final /* synthetic */ int c;

    public /* synthetic */ rl1(wl1 wl1, yda yda, int i) {
        this.a = wl1;
        this.b = yda;
        this.c = i;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, this.c, (Optional) obj);
    }
}
