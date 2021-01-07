package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* access modifiers changed from: package-private */
/* renamed from: gg9  reason: default package */
public class gg9 extends RecyclerView.q {
    final /* synthetic */ hg9 a;

    gg9(hg9 hg9) {
        this.a = hg9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c(RecyclerView recyclerView, int i, int i2) {
        if (i2 != this.a.h) {
            this.a.d.b(hg9.c(this.a));
            this.a.h = i2;
        }
    }
}
