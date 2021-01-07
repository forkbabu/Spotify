package defpackage;

import defpackage.rga;
import io.reactivex.functions.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.u;
import io.reactivex.j;
import io.reactivex.processors.BehaviorProcessor;
import kotlin.jvm.internal.h;

/* renamed from: aha  reason: default package */
public final class aha implements sga {
    private final BehaviorProcessor<rga> a;
    private final vga b;

    /* renamed from: aha$a */
    static final class a<T> implements g<vpf> {
        final /* synthetic */ aha a;

        a(aha aha) {
            this.a = aha;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(vpf vpf) {
            this.a.b();
        }
    }

    public aha(vga vga) {
        h.e(vga, "api");
        this.b = vga;
        BehaviorProcessor<rga> r0 = BehaviorProcessor.r0();
        h.d(r0, "BehaviorProcessor.create…ogleAssistantLinkState>()");
        this.a = r0;
    }

    @Override // defpackage.sga
    public io.reactivex.g<rga> a() {
        io.reactivex.g<rga> z = this.a.z(new a(this), Functions.f, Functions.c);
        h.d(z, "processor.doOnSubscribe { refresh() }");
        return z;
    }

    @Override // defpackage.sga
    public void b() {
        io.reactivex.g<R> N = this.b.a().v(wga.a).Q(xga.a).j0(yga.a).N0(1).A0((R) rga.b.a).E(zga.a).N();
        int i = io.reactivex.g.b;
        io.reactivex.g.m(N, u.c).subscribe((j) this.a);
    }
}
