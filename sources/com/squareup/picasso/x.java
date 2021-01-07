package com.squareup.picasso;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.j0;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class x extends ThreadPoolExecutor {

    private static final class a extends FutureTask<e> implements Comparable<a> {
        private final e a;

        a(e eVar) {
            super(eVar, null);
            this.a = eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            e eVar = this.a;
            Picasso.Priority priority = eVar.B;
            e eVar2 = aVar.a;
            Picasso.Priority priority2 = eVar2.B;
            return priority == priority2 ? eVar.a - eVar2.a : priority2.ordinal() - priority.ordinal();
        }
    }

    x() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new j0.b());
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((e) runnable);
        execute(aVar);
        return aVar;
    }
}
