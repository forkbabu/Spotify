package defpackage;

import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: z0e  reason: default package */
public class z0e extends a1e {
    private final y f;

    public z0e(int i, long j, y yVar) {
        super(i, j);
        this.f = yVar;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.a1e
    public final s<Long> b() {
        return s.X0(a(), TimeUnit.MILLISECONDS, this.f);
    }
}
