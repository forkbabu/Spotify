package defpackage;

import com.google.common.base.Function;
import com.spotify.searchview.proto.EntityType;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: qta  reason: default package */
public final /* synthetic */ class qta implements Function {
    public final /* synthetic */ oua a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ jua c;

    public /* synthetic */ qta(oua oua, AtomicInteger atomicInteger, jua jua) {
        this.a = oua;
        this.b = atomicInteger;
        this.c = jua;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return this.a.b(this.b, this.c, (EntityType) obj);
    }
}
