package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;

/* access modifiers changed from: package-private */
/* renamed from: fm5  reason: default package */
public class fm5 extends GridLayoutManager.b {
    final /* synthetic */ int d;
    final /* synthetic */ gm5 e;

    fm5(gm5 gm5, int i) {
        this.e = gm5;
        this.d = i;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public int e(int i) {
        if (i != 0) {
            return 1;
        }
        if ((this.e.u() & 1) != 0) {
            return this.d;
        }
        return 1;
    }
}
