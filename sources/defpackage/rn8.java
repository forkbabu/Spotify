package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: rn8  reason: default package */
public abstract class rn8 implements ln8 {

    /* renamed from: rn8$a */
    public static abstract class a {
        public abstract rn8 a();

        public abstract a b(int i);
    }

    @Override // defpackage.ln8
    public int a() {
        return d();
    }

    @Override // defpackage.ln8
    public void b(RecyclerView recyclerView) {
        nl8 nl8 = (nl8) recyclerView.S(e());
        nl8.getClass();
        nl8.u0(d());
    }

    @Override // defpackage.ln8
    public void c(RecyclerView recyclerView) {
        recyclerView.I0(e());
    }

    public abstract int d();

    public abstract int e();
}
