package defpackage;

import com.google.common.collect.FluentIterable;
import defpackage.b91;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: gk9  reason: default package */
public final /* synthetic */ class gk9 implements l {
    public static final /* synthetic */ gk9 a = new gk9();

    private /* synthetic */ gk9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        b91 b91 = (b91) obj;
        b91.a builder = b91.toBuilder();
        s81 header = b91.header();
        if (header != null) {
            header = header.toBuilder().m(FluentIterable.from(header.children()).transform(fk9.a).toList()).l();
        }
        b91.a j = builder.j(header);
        List<? extends s81> body = b91.body();
        if (!body.isEmpty()) {
            body = FluentIterable.from(body).transform(hk9.a).toList();
        }
        return j.e(body).g();
    }
}
