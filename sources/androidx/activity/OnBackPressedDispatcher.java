package androidx.activity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    private final Runnable a;
    final ArrayDeque<b> b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements l, a {
        private final Lifecycle a;
        private final b b;
        private a c;

        LifecycleOnBackPressedCancellable(Lifecycle lifecycle, b bVar) {
            this.a = lifecycle;
            this.b = bVar;
            lifecycle.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.a.c(this);
            this.b.e(this);
            a aVar = this.c;
            if (aVar != null) {
                aVar.cancel();
                this.c = null;
            }
        }

        @Override // androidx.lifecycle.l
        public void p(n nVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                b bVar = this.b;
                onBackPressedDispatcher.b.add(bVar);
                a aVar = new a(bVar);
                bVar.a(aVar);
                this.c = aVar;
            } else if (event == Lifecycle.Event.ON_STOP) {
                a aVar2 = this.c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    private class a implements a {
        private final b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.a);
            this.a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    public void a(b bVar) {
        this.b.add(bVar);
        bVar.a(new a(bVar));
    }

    public void b(n nVar, b bVar) {
        Lifecycle A = nVar.A();
        if (A.b() != Lifecycle.State.DESTROYED) {
            bVar.a(new LifecycleOnBackPressedCancellable(A, bVar));
        }
    }

    public boolean c() {
        Iterator<b> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().c()) {
                return true;
            }
        }
        return false;
    }

    public void d() {
        Iterator<b> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
