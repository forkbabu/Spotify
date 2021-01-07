package defpackage;

import com.spotify.ubi.specification.factories.l1;
import kotlin.jvm.internal.h;

/* renamed from: mhb  reason: default package */
public final class mhb {
    private final ere a;
    private final l1 b;

    public mhb(ere ere, l1 l1Var) {
        h.e(ere, "userBehaviourEventLogger");
        h.e(l1Var, "mobileHubsNewMarketingFormatEventFactory");
        this.a = ere;
        this.b = l1Var;
    }

    public final void a(String str, String str2, int i) {
        h.e(str, "pageUri");
        h.e(str2, "slideId");
        this.a.a(this.b.b(str).b(str2, Integer.valueOf(i)).d());
    }

    public final void b(String str, String str2, int i, String str3) {
        je.x(str, "pageUri", str2, "slideId", str3, "destination");
        this.a.a(this.b.b(str).b(str2, Integer.valueOf(i)).b(str3));
    }

    public final void c(String str, String str2, int i) {
        h.e(str, "pageUri");
        h.e(str2, "slideId");
        this.a.a(this.b.b(str).b(str2, Integer.valueOf(i)).a());
    }

    public final void d(String str, String str2, int i) {
        h.e(str, "pageUri");
        h.e(str2, "slideId");
        this.a.a(this.b.b(str).b(str2, Integer.valueOf(i)).c());
    }
}
