package defpackage;

import defpackage.b91;
import defpackage.r81;
import defpackage.s81;
import io.reactivex.functions.l;

/* renamed from: ak2  reason: default package */
public class ak2 implements l<b91, b91> {
    static final p81 a = z81.a().b("verified", true).d();

    /* renamed from: a */
    public b91 apply(b91 b91) {
        b91.a builder = b91.toBuilder();
        s81 header = b91.header();
        if (header != null && header.custom().boolValue("verified", false)) {
            s81.a builder2 = header.toBuilder();
            r81 images = header.images();
            r81.a builder3 = images.toBuilder();
            x81 main = images.main();
            header = builder2.u(builder3.g(main != null ? main.toBuilder().a(a).c() : null).b()).l();
        }
        return builder.j(header).g();
    }
}
