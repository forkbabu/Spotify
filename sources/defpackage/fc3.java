package defpackage;

import com.google.common.collect.ImmutableSet;
import com.squareup.picasso.a0;
import java.util.Set;

/* renamed from: fc3  reason: default package */
public final class fc3 implements fjf<Set<a0>> {

    /* access modifiers changed from: private */
    /* renamed from: fc3$a */
    public static final class a {
        private static final fc3 a = new fc3();
    }

    public static fc3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        ImmutableSet of = ImmutableSet.of();
        yif.g(of, "Cannot return null from a non-@Nullable @Provides method");
        return of;
    }
}
