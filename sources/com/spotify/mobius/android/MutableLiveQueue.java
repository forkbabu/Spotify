package com.spotify.mobius.android;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* access modifiers changed from: package-private */
public final class MutableLiveQueue<T> implements f<T> {
    private final Object a = new Object();
    private final ia2 b;
    private final BlockingQueue<T> c;
    private v<T> d = null;
    private v<Iterable<T>> e = null;
    private boolean f = true;

    /* access modifiers changed from: private */
    public class LifecycleObserverHelper implements m {
        LifecycleObserverHelper(a aVar) {
        }

        /* access modifiers changed from: package-private */
        @w(Lifecycle.Event.ON_ANY)
        public void onAny(n nVar, Lifecycle.Event event) {
            MutableLiveQueue.c(MutableLiveQueue.this, event);
        }
    }

    MutableLiveQueue(ia2 ia2, int i) {
        this.b = ia2;
        this.c = new ArrayBlockingQueue(i);
    }

    static void c(MutableLiveQueue mutableLiveQueue, Lifecycle.Event event) {
        mutableLiveQueue.getClass();
        int ordinal = event.ordinal();
        if (ordinal == 2) {
            synchronized (mutableLiveQueue.a) {
                mutableLiveQueue.f = false;
                mutableLiveQueue.g();
            }
        } else if (ordinal == 3) {
            synchronized (mutableLiveQueue.a) {
                mutableLiveQueue.f = true;
            }
        } else if (ordinal == 5) {
            synchronized (mutableLiveQueue.a) {
                synchronized (mutableLiveQueue.a) {
                    mutableLiveQueue.d = null;
                    mutableLiveQueue.e = null;
                    mutableLiveQueue.f = true;
                    mutableLiveQueue.c.clear();
                }
            }
        }
    }

    private void g() {
        LinkedList linkedList = new LinkedList();
        synchronized (this.a) {
            if (!this.f && this.e != null) {
                if (!this.c.isEmpty()) {
                    this.c.drainTo(linkedList);
                    this.b.a(new c(this, linkedList));
                }
            }
        }
    }

    @Override // com.spotify.mobius.android.f
    public void a(n nVar, v<T> vVar, v<Iterable<T>> vVar2) {
        if (nVar.A().b() != Lifecycle.State.DESTROYED) {
            synchronized (this.a) {
                this.d = vVar;
                this.e = vVar2;
                this.f = true;
                nVar.A().a(new LifecycleObserverHelper(null));
            }
        }
    }

    @Override // com.spotify.mobius.android.f
    public void b(n nVar, v<T> vVar) {
        a(nVar, vVar, null);
    }

    public void d(Object obj) {
        synchronized (this.a) {
            v<T> vVar = this.d;
            if (vVar != null) {
                vVar.a(obj);
            }
        }
    }

    public void e(Queue queue) {
        synchronized (this.a) {
            v<Iterable<T>> vVar = this.e;
            if (vVar != null) {
                vVar.a(queue);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(T t) {
        synchronized (this.a) {
            if (!this.f) {
                this.b.a(new d(this, t));
            } else if (!this.c.offer(t)) {
                throw new IllegalStateException("Maximum effect queue size (" + this.c.size() + ") exceeded when posting: " + ((Object) t));
            }
        }
    }
}
