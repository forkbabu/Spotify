package defpackage;

import com.google.common.collect.ImmutableList;
import io.reactivex.internal.functions.Functions;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.v;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: afd  reason: default package */
public class afd implements da2<ied> {
    private final y a;
    private final PublishSubject<ied> b = PublishSubject.h1();
    private final List<ied> c = new ArrayList();
    private final AtomicBoolean d = new AtomicBoolean(false);

    public afd(y yVar) {
        this.a = yVar;
    }

    public void a(ied ied) {
        this.a.b(new xed(this, ied));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.da2
    public void accept(ied ied) {
        this.a.b(new xed(this, ied));
    }

    public s<ied> b() {
        return s.B(new zed(this)).I0(this.a);
    }

    public /* synthetic */ void c(ied ied) {
        if (this.d.get()) {
            this.b.onNext(ied);
        } else {
            this.c.add(ied);
        }
    }

    public v d() {
        this.d.set(true);
        ImmutableList copyOf = ImmutableList.copyOf((Collection) this.c);
        this.c.clear();
        return this.b.F0(copyOf).M(Functions.f(), new yed(this));
    }

    public /* synthetic */ void e() {
        this.d.set(false);
    }
}
