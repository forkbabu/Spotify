package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: wp9  reason: default package */
public final class wp9 implements vp9 {
    private final a71 a;

    public wp9(a71 a71) {
        h.e(a71, "navigationCommandHandler");
        this.a = a71;
    }

    @Override // defpackage.vp9
    public void a(s81 s81) {
        h.e(s81, "model");
        o81 o81 = (o81) s81.events().get("click");
        n61 b = n61.b("click", s81);
        if (h.a(o81 != null ? o81.name() : null, "navigate")) {
            this.a.b(o81, b);
        }
    }
}
