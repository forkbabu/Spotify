package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.qhc;
import defpackage.yrc;

/* renamed from: ohc  reason: default package */
public class ohc implements yrc {
    private final qhc.a a;

    /* renamed from: ohc$a */
    public static class a extends csc {
        int b = -1;
        View.OnClickListener c;
        boolean d;

        @Override // defpackage.csc
        public boolean b() {
            return true;
        }

        public void e(int i) {
            this.b = i;
        }

        public void f(View.OnClickListener onClickListener) {
            this.c = onClickListener;
        }

        public void g(boolean z) {
            this.d = z;
        }
    }

    /* renamed from: ohc$b */
    public static class b extends yrc.a {
        private final qhc C;

        public b(qhc qhc, View view) {
            super(view);
            this.C = qhc;
        }

        /* access modifiers changed from: package-private */
        public void h0(a aVar) {
            ((rhc) this.C).a(new qhc.b(aVar.b, aVar.d, aVar.c));
        }
    }

    public ohc(qhc.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.yrc
    public /* synthetic */ void a() {
        xrc.b(this);
    }

    @Override // defpackage.yrc
    public void c(csc csc, RecyclerView.b0 b0Var, int i) {
        ((b) b0Var).h0((a) csc);
    }

    @Override // defpackage.yrc
    public /* synthetic */ void d(csc csc, RecyclerView.b0 b0Var) {
        xrc.a(this, csc, b0Var);
    }

    @Override // defpackage.yrc
    public yrc.a e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        rhc rhc = (rhc) this.a.create();
        return new b(rhc, rhc.b(layoutInflater, viewGroup));
    }
}
