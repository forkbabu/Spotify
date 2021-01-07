package defpackage;

import defpackage.r27;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;

/* renamed from: v27  reason: default package */
public final class v27 implements fjf<Map<String, Boolean>> {

    /* access modifiers changed from: private */
    /* renamed from: v27$a */
    public static final class a {
        private static final v27 a = new v27();
    }

    public static v27 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        r27.a aVar = r27.a;
        Boolean bool = Boolean.TRUE;
        return d.y(new Pair("link", bool), new Pair("inCollection", bool), new Pair("name", bool), new Pair("trailerUri", bool));
    }
}
