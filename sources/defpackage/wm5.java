package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: wm5  reason: default package */
public final class wm5 implements vd3 {
    private final a71 a;
    private final a71 b;
    private final vp9 c;

    public wm5(a71 a71, a71 a712, vp9 vp9) {
        h.e(a71, "playFromContextCommandHandler");
        h.e(a712, "contextMenuCommandHandler");
        h.e(vp9, "hubsNavigateOnClickEventHandler");
        this.a = a71;
        this.b = a712;
        this.c = vp9;
    }

    @Override // defpackage.vd3
    public void a(s81 s81) {
        h.e(s81, "model");
        o81 o81 = (o81) s81.events().get("rightAccessoryClick");
        n61 b2 = n61.b("rightAccessoryClick", s81);
        if (o81 != null) {
            this.b.b(o81, b2);
        }
    }

    @Override // defpackage.vd3
    public void b() {
    }

    @Override // defpackage.vd3
    public void c(s81 s81) {
        h.e(s81, "model");
        o81 o81 = (o81) s81.events().get("click");
        n61 b2 = n61.b("click", s81);
        if (o81 == null) {
            return;
        }
        if (h.a(o81.name(), "navigate")) {
            this.c.a(s81);
        } else if (h.a(o81.name(), "playFromContext")) {
            this.a.b(o81, b2);
        }
    }
}
