package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobius.e0;
import com.spotify.mobius.g0;
import com.spotify.music.email.f;
import defpackage.ev8;
import defpackage.fv8;
import defpackage.hv8;
import defpackage.zu8;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: wu8  reason: default package */
public final class wu8<M, E, F> implements g0<yu8, ev8, zu8> {
    public static final wu8 a = new wu8();

    wu8() {
    }

    /* Return type fixed from 'com.spotify.mobius.e0' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.spotify.mobius.g0
    public e0<yu8, zu8> a(yu8 yu8, ev8 ev8) {
        e0<yu8, zu8> e0Var;
        e0<yu8, zu8> e0Var2;
        Object obj;
        yu8 yu82 = yu8;
        ev8 ev82 = ev8;
        h.d(yu82, "model");
        h.d(ev82, "event");
        h.e(yu82, "model");
        h.e(ev82, "event");
        if (ev82 instanceof ev8.b) {
            ev8.b bVar = (ev8.b) ev82;
            String a2 = bVar.a();
            fv8 orNull = yu82.b().orNull();
            if (h.a(a2, orNull instanceof fv8.c ? ((fv8.c) orNull).a() : "")) {
                obj = f.a.b.a;
            } else if (!v3.i.matcher(a2).matches()) {
                obj = f.a.C0212a.a;
            } else {
                obj = f.b.a;
            }
            String a3 = bVar.a();
            Optional of = Optional.of(obj);
            h.d(of, "Optional.of(validationState)");
            e0<yu8, zu8> f = e0.f(yu8.a(yu82, a3, null, null, null, null, of, 30));
            h.d(f, "next(\n        model.copy…f(validationState))\n    )");
            return f;
        } else if (ev82 instanceof ev8.e) {
            if (!yu82.g().isPresent() || !(yu82.g().get() instanceof f.b)) {
                Optional absent = Optional.absent();
                h.d(absent, "Optional.absent()");
                e0Var2 = e0.f(yu8.a(yu82, null, null, null, null, absent, null, 47));
            } else {
                Optional of2 = Optional.of(hv8.b.a);
                h.d(of2, "Optional.of(UpdateEmailSaveState.InProgress)");
                e0Var2 = e0.g(yu8.a(yu82, null, null, null, null, of2, null, 47), d.G(new zu8.c(yu82.d())));
            }
            h.d(e0Var2, "if (model.validationStat…          )\n            }");
            return e0Var2;
        } else if (ev82 instanceof ev8.a) {
            Optional of3 = Optional.of(((ev8.a) ev82).a());
            h.d(of3, "Optional.of(event.fetchState)");
            e0<yu8, zu8> f2 = e0.f(yu8.a(yu82, null, null, null, of3, null, null, 55));
            h.d(f2, "next(\n            model.…)\n            )\n        )");
            return f2;
        } else if (ev82 instanceof ev8.d) {
            ev8.d dVar = (ev8.d) ev82;
            if (dVar.a() instanceof hv8.c) {
                Optional of4 = Optional.of(dVar.a());
                h.d(of4, "Optional.of(event.saveState)");
                e0Var = e0.g(yu8.a(yu82, null, null, null, null, of4, null, 47), d.G(new zu8.b(yu82.d())));
            } else {
                Optional of5 = Optional.of(dVar.a());
                h.d(of5, "Optional.of(event.saveState)");
                e0Var = e0.f(yu8.a(yu82, null, null, null, null, of5, null, 47));
            }
            h.d(e0Var, "if (event.saveState is U…          )\n            }");
            return e0Var;
        } else if (ev82 instanceof ev8.c) {
            Optional of6 = Optional.of(((ev8.c) ev82).a());
            h.d(of6, "Optional.of(event.inputType)");
            e0<yu8, zu8> f3 = e0.f(yu8.a(yu82, null, null, of6, null, null, null, 59));
            h.d(f3, "next(\n            model.…)\n            )\n        )");
            return f3;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
