package defpackage;

import com.google.common.base.Function;
import com.spotify.searchview.assistedcuration.proto.EntityType;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kva  reason: default package */
public final /* synthetic */ class kva implements Function {
    public final /* synthetic */ pva a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ hva c;

    public /* synthetic */ kva(pva pva, AtomicInteger atomicInteger, hva hva) {
        this.a = pva;
        this.b = atomicInteger;
        this.c = hva;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return this.a.a(this.b, this.c, (EntityType) obj);
    }
}
