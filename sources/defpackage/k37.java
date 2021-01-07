package defpackage;

import defpackage.g37;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;

/* renamed from: k37  reason: default package */
public final class k37 implements fjf<Map<String, Boolean>> {

    /* access modifiers changed from: private */
    /* renamed from: k37$a */
    public static final class a {
        private static final k37 a = new k37();
    }

    public static k37 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        g37.a aVar = g37.a;
        Boolean bool = Boolean.TRUE;
        return d.y(new Pair("link", bool), new Pair("inCollection", bool), new Pair("name", bool));
    }
}
