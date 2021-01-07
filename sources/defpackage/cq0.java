package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.inappmessaging.TriggerType;
import com.spotify.mobius.e0;
import defpackage.dq0;
import defpackage.gq0;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: cq0  reason: default package */
public final /* synthetic */ class cq0 implements ti0 {
    public final /* synthetic */ hq0 a;

    public /* synthetic */ cq0(hq0 hq0) {
        this.a = hq0;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        Map map;
        hq0 hq0 = this.a;
        gq0.c cVar = (gq0.c) obj;
        TriggerType j = cVar.j();
        String i = cVar.i();
        if (hq0.d().isEmpty()) {
            map = new EnumMap(TriggerType.class);
        } else {
            map = hq0.d();
        }
        EnumMap enumMap = new EnumMap(map);
        enumMap.put((EnumMap) j, (TriggerType) i);
        dq0.b bVar = (dq0.b) hq0.e();
        bVar.e(ImmutableMap.builder().putAll(enumMap).build());
        return e0.f(bVar.a());
    }
}
