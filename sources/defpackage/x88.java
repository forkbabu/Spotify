package defpackage;

import com.google.common.base.Optional;

/* renamed from: x88  reason: default package */
public final class x88 implements fjf<String> {
    private final wlf<wd8> a;

    public x88(wlf<wd8> wlf) {
        this.a = wlf;
    }

    public static String a(wd8 wd8) {
        String or = wd8.b().or((Optional<String>) "");
        yif.g(or, "Cannot return null from a non-@Nullable @Provides method");
        return or;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
