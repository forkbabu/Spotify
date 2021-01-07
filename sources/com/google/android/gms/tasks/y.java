package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* access modifiers changed from: package-private */
public final class y<TResult> {
    private final Object a = new Object();
    private Queue<z<TResult>> b;
    private boolean c;

    y() {
    }

    public final void a(g<TResult> gVar) {
        z<TResult> poll;
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
            poll.c(gVar);
        }
    }

    public final void b(z<TResult> zVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(zVar);
        }
    }
}
