package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;

class q implements Runnable {
    final /* synthetic */ p.f a;
    final /* synthetic */ int b;
    final /* synthetic */ p c;

    q(p pVar, p.f fVar, int i) {
        this.c = pVar;
        this.a = fVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        RecyclerView recyclerView = this.c.A;
        if (recyclerView != null && recyclerView.isAttachedToWindow()) {
            p.f fVar = this.a;
            if (!fVar.t && fVar.n.w() != -1) {
                RecyclerView.j itemAnimator = this.c.A.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.q(null)) {
                    p pVar = this.c;
                    int size = pVar.y.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (!pVar.y.get(i).u) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (!z) {
                        this.c.v.q(this.a.n, this.b);
                        return;
                    }
                }
                this.c.A.post(this);
            }
        }
    }
}
