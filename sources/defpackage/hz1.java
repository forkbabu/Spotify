package defpackage;

import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: hz1  reason: default package */
public class hz1 implements jz1 {
    private final Deque<m91> a = new LinkedBlockingDeque(1024);
    private lc1 b;

    hz1() {
    }

    @Override // defpackage.jz1
    public void a(m91 m91) {
        lc1 lc1 = this.b;
        if (lc1 != null) {
            lc1.log(m91.a());
        } else if (!this.a.offerLast(m91)) {
            this.a.removeFirst();
            this.a.addLast(m91);
        }
    }

    public void b(lc1 lc1) {
        this.b = lc1;
        Iterator<m91> it = this.a.iterator();
        while (it.hasNext()) {
            it.remove();
            this.b.log(it.next().a());
        }
    }

    public void c() {
        this.b = null;
    }
}
