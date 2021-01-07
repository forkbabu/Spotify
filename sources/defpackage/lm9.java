package defpackage;

import io.reactivex.l;
import io.reactivex.p;
import io.reactivex.q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* renamed from: lm9  reason: default package */
public class lm9 implements q<List<mm9>, mm9> {
    private final en9 a;

    public lm9(en9 en9) {
        this.a = en9;
    }

    @Override // io.reactivex.q
    public p<mm9> a(l<List<mm9>> lVar) {
        return lVar.g(new jm9(this));
    }

    public /* synthetic */ p b(List list) {
        return this.a.a().u(new im9(this, list));
    }

    public p c(List list, Queue queue) {
        mm9 mm9;
        HashSet hashSet = new HashSet(queue.size());
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            hashSet.add(((mm9) it.next()).d());
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                mm9 = (mm9) queue.remove();
                queue.add(mm9);
                break;
            }
            mm9 = (mm9) it2.next();
            if (!hashSet.contains(mm9.d())) {
                queue.add(mm9);
                if (queue.size() > 20) {
                    queue.remove();
                }
            }
        }
        return this.a.b(queue).f(l.k(mm9));
    }
}
