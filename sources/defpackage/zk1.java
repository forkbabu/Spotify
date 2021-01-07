package defpackage;

import io.reactivex.functions.l;
import java.util.HashSet;

/* renamed from: zk1  reason: default package */
public final /* synthetic */ class zk1 implements l {
    public final /* synthetic */ sxd a;

    public /* synthetic */ zk1(sxd sxd) {
        this.a = sxd;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c((HashSet) obj);
    }
}
