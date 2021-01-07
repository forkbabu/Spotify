package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: vba  reason: default package */
public abstract class vba extends RecyclerView.e<RecyclerView.b0> {
    private final SparseArray<qu0> c = new SparseArray<>();
    protected List<qu0> f = Collections.emptyList();

    private int X(int i) {
        for (qu0 qu0 : this.f) {
            int c2 = qu0.c();
            if (i <= c2 - 1) {
                break;
            }
            i -= c2;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        this.f.get(Y(i)).f(b0Var, X(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return this.c.get(i).b(viewGroup, i);
    }

    /* access modifiers changed from: protected */
    public int Y(int i) {
        int i2 = 0;
        for (qu0 qu0 : this.f) {
            int c2 = qu0.c();
            if (i <= c2 - 1) {
                break;
            }
            i -= c2;
            i2++;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public abstract List<qu0> Z();

    public void b0() {
        this.c.clear();
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        int i = 0;
        if (this.f.isEmpty()) {
            this.f = Z();
            SparseArray sparseArray = new SparseArray();
            for (qu0 qu0 : this.f) {
                int[] e = qu0.e();
                int length = e.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        int i3 = e[i2];
                        qu0 qu02 = (qu0) sparseArray.get(i3);
                        if (qu02 == null) {
                            sparseArray.put(i3, qu0);
                            i2++;
                        } else {
                            throw new RuntimeException(String.format("ViewType collision detected. %s is duplicating ViewType %d already used by %s", qu0.getClass().getSimpleName(), Integer.valueOf(i3), qu02.getClass().getSimpleName()));
                        }
                    }
                }
            }
        }
        for (qu0 qu03 : this.f) {
            i += qu03.c();
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return this.f.get(Y(i)).getItemId(X(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        qu0 qu0 = this.f.get(Y(i));
        int itemViewType = qu0.getItemViewType(X(i));
        if (this.c.get(itemViewType) == null) {
            this.c.put(itemViewType, qu0);
        }
        return itemViewType;
    }
}
