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

/* renamed from: hn7  reason: default package */
public class hn7 implements da2<lm7> {
    private final y a;
    private final List<lm7> b = new ArrayList();
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final PublishSubject<lm7> d = PublishSubject.h1();

    public hn7(y yVar) {
        this.a = yVar;
    }

    /* renamed from: a */
    public void accept(lm7 lm7) {
        this.a.b(new gn7(this, lm7));
    }

    public s<lm7> b() {
        return s.B(new en7(this)).I0(this.a);
    }

    public /* synthetic */ void c(lm7 lm7) {
        if (this.c.get()) {
            this.d.onNext(lm7);
        } else {
            this.b.add(lm7);
        }
    }

    public v d() {
        this.c.set(true);
        ImmutableList copyOf = ImmutableList.copyOf((Collection) this.b);
        this.b.clear();
        return this.d.F0(copyOf).M(Functions.f(), new fn7(this));
    }

    public /* synthetic */ void e() {
        this.c.set(false);
    }
}
