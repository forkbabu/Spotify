package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: rf0  reason: default package */
public class rf0 implements Iterable<wf0> {
    private final Deque<wf0> a = new ArrayDeque();
    private final int b;
    private final int c;

    public rf0(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public wf0 c(long j) {
        wf0 removeFirst = this.a.size() >= this.c ? this.a.removeFirst() : null;
        while (true) {
            wf0 peekFirst = this.a.peekFirst();
            if (peekFirst == null || peekFirst.f >= j - ((long) this.b)) {
                break;
            }
            removeFirst = this.a.removeFirst();
        }
        if (removeFirst == null) {
            removeFirst = new wf0();
        }
        removeFirst.f = j;
        this.a.addLast(removeFirst);
        return removeFirst;
    }

    @Override // java.lang.Iterable
    public Iterator<wf0> iterator() {
        return this.a.iterator();
    }
}
