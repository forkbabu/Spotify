package com.google.android.play.core.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* access modifiers changed from: package-private */
public final class l<ResultT> {
    private final Object a = new Object();
    private Queue<k<ResultT>> b;
    private boolean c;

    l() {
    }

    public final void a(c<ResultT> cVar) {
        k<ResultT> poll;
        synchronized (this.a) {
            if (this.b != null) {
                if (!this.c) {
                    this.c = true;
                }
            }
            return;
        }
        while (true) {
            synchronized (this.a) {
                poll = this.b.poll();
                if (poll == null) {
                    this.c = false;
                    return;
                }
            }
            poll.a(cVar);
        }
    }

    public final void b(k<ResultT> kVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(kVar);
        }
    }
}
