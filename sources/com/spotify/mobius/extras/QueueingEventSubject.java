package com.spotify.mobius.extras;

import com.spotify.mobius.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public final class QueueingEventSubject<E> implements q<E>, da2<E> {
    private final BlockingQueue<E> a;
    private State b = State.NO_SUBSCRIBER;
    private da2<E> c;

    /* access modifiers changed from: private */
    public enum State {
        NO_SUBSCRIBER,
        SUBSCRIBED
    }

    private class b implements w92 {
        private boolean a = false;

        b(a aVar) {
        }

        @Override // defpackage.w92
        public synchronized void dispose() {
            if (!this.a) {
                this.a = true;
                QueueingEventSubject.b(QueueingEventSubject.this);
            }
        }
    }

    public QueueingEventSubject(int i) {
        this.a = new ArrayBlockingQueue(i);
    }

    static void b(QueueingEventSubject queueingEventSubject) {
        synchronized (queueingEventSubject) {
            queueingEventSubject.b = State.NO_SUBSCRIBER;
            queueingEventSubject.c = null;
        }
    }

    @Override // com.spotify.mobius.q
    public w92 a(da2<E> da2) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            State state = this.b;
            State state2 = State.SUBSCRIBED;
            if (state != state2) {
                this.b = state2;
                this.c = da2;
                this.a.drainTo(arrayList);
            } else {
                throw new IllegalStateException("Only a single subscription is supported, previous subscriber is: " + this.c);
            }
        }
        Iterator<E> it = arrayList.iterator();
        while (it.hasNext()) {
            da2.accept(it.next());
        }
        return new b(null);
    }

    @Override // defpackage.da2
    public void accept(E e) {
        da2<E> da2;
        synchronized (this) {
            int ordinal = this.b.ordinal();
            if (ordinal == 0) {
                this.a.add(e);
            } else if (ordinal == 1) {
                da2 = this.c;
            }
            da2 = null;
        }
        if (da2 != null) {
            da2.accept(e);
        }
    }
}
