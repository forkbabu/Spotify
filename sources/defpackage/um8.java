package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: um8  reason: default package */
public abstract class um8 implements ln8 {

    /* renamed from: um8$a */
    public static abstract class a {
        public abstract um8 a();
    }

    @Override // defpackage.ln8
    public int a() {
        return d();
    }

    @Override // defpackage.ln8
    public void b(RecyclerView recyclerView) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        gridLayoutManager.getClass();
        gridLayoutManager.t2(d(), 0);
    }

    @Override // defpackage.ln8
    public void c(RecyclerView recyclerView) {
        recyclerView.I0(d());
    }

    public abstract int d();
}
