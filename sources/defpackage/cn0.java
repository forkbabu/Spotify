package defpackage;

import java.util.Collections;
import java.util.Set;
import okhttp3.v;

/* renamed from: cn0  reason: default package */
public final class cn0 implements fjf<Set<v>> {

    /* access modifiers changed from: private */
    /* renamed from: cn0$a */
    public static final class a {
        private static final cn0 a = new cn0();
    }

    public static cn0 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        Set emptySet = Collections.emptySet();
        yif.g(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
