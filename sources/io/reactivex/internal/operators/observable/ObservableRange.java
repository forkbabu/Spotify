package io.reactivex.internal.operators.observable;

import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.s;
import io.reactivex.x;

public final class ObservableRange extends s<Integer> {
    private final int a;
    private final long b;

    static final class RangeDisposable extends BasicIntQueueDisposable<Integer> {
        private static final long serialVersionUID = 396518478098735504L;
        final x<? super Integer> downstream;
        final long end;
        boolean fused;
        long index;

        RangeDisposable(x<? super Integer> xVar, long j, long j2) {
            this.downstream = xVar;
            this.index = j;
            this.end = j2;
        }

        @Override // io.reactivex.internal.fuseable.j
        public void clear() {
            this.index = this.end;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.b
        public boolean d() {
            return get() != 0;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            set(1);
        }

        @Override // io.reactivex.internal.fuseable.f
        public int g(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.fused = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.j
        public boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.internal.fuseable.j
        public Object poll() {
            long j = this.index;
            if (j != this.end) {
                this.index = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }
    }

    public ObservableRange(int i, int i2) {
        this.a = i;
        this.b = ((long) i) + ((long) i2);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super Integer> xVar) {
        RangeDisposable rangeDisposable = new RangeDisposable(xVar, (long) this.a, this.b);
        xVar.onSubscribe(rangeDisposable);
        if (!rangeDisposable.fused) {
            x<? super Integer> xVar2 = rangeDisposable.downstream;
            long j = rangeDisposable.end;
            for (long j2 = rangeDisposable.index; j2 != j && rangeDisposable.get() == 0; j2++) {
                xVar2.onNext(Integer.valueOf((int) j2));
            }
            if (rangeDisposable.get() == 0) {
                rangeDisposable.lazySet(1);
                xVar2.onComplete();
            }
        }
    }
}
