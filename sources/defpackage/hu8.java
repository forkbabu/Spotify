package defpackage;

import com.google.common.base.Function;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hu8  reason: default package */
public final /* synthetic */ class hu8 implements Function {
    public final /* synthetic */ pu8 a;
    public final /* synthetic */ AtomicInteger b;

    public /* synthetic */ hu8(pu8 pu8, AtomicInteger atomicInteger) {
        this.a = pu8;
        this.b = atomicInteger;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return this.a.a(this.b, (s81) obj);
    }
}
