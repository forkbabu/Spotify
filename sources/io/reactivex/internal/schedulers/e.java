package io.reactivex.internal.schedulers;

import io.reactivex.y;
import java.util.concurrent.ThreadFactory;

public final class e extends y {
    private static final RxThreadFactory c = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    final ThreadFactory b = c;

    @Override // io.reactivex.y
    public y.c a() {
        return new f(this.b);
    }
}
