package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: i07  reason: default package */
public final class i07 implements fjf<ImmutableList<String>> {

    /* access modifiers changed from: private */
    /* renamed from: i07$a */
    public static final class a {
        private static final i07 a = new i07();
    }

    public static i07 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        ImmutableList of = ImmutableList.of();
        yif.g(of, "Cannot return null from a non-@Nullable @Provides method");
        return of;
    }
}
