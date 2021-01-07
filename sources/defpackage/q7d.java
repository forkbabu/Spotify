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

/* renamed from: q7d  reason: default package */
public class q7d implements da2<i6d> {
    private final y a;
    private final List<i6d> b = new ArrayList();
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final PublishSubject<i6d> d = PublishSubject.h1();

    public q7d(y yVar) {
        this.a = yVar;
    }

    /* renamed from: a */
    public void accept(i6d i6d) {
        this.a.b(new f7d(this, i6d));
    }

    public s<i6d> b() {
        return s.B(new g7d(this)).I0(this.a);
    }

    public /* synthetic */ void c(i6d i6d) {
        if (this.c.get()) {
            this.d.onNext(i6d);
        } else {
            this.b.add(i6d);
        }
    }

    public v d() {
        this.c.set(true);
        ImmutableList copyOf = ImmutableList.copyOf((Collection) this.b);
        this.b.clear();
        return this.d.F0(copyOf).M(Functions.f(), new e7d(this));
    }

    public /* synthetic */ void e() {
        this.c.set(false);
    }
}
