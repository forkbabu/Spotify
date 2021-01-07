package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public abstract class b implements m {
    protected Context a;
    protected Context b;
    protected g c;
    protected LayoutInflater f;
    private m.a n;
    private int o;
    private int p;
    protected n q;
    private int r;

    public b(Context context, int i, int i2) {
        this.a = context;
        this.f = LayoutInflater.from(context);
        this.o = i;
        this.p = i2;
    }

    public abstract void b(i iVar, n.a aVar);

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z) {
        m.a aVar = this.n;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean d(ViewGroup viewGroup, int i);

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int getId() {
        return this.r;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.n = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.appcompat.view.menu.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i(androidx.appcompat.view.menu.r r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.n
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.c
        L_0x0009:
            boolean r2 = r0.d(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.i(androidx.appcompat.view.menu.r):boolean");
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.q;
        if (viewGroup != null) {
            g gVar = this.c;
            int i = 0;
            if (gVar != null) {
                gVar.k();
                ArrayList<i> r2 = this.c.r();
                int size = r2.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i iVar = r2.get(i3);
                    if (r(i2, iVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View o2 = o(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            o2.setPressed(false);
                            o2.jumpDrawablesToCurrentState();
                        }
                        if (o2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) o2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(o2);
                            }
                            ((ViewGroup) this.q).addView(o2, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!d(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean l(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void m(Context context, g gVar) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = gVar;
    }

    public m.a n() {
        return this.n;
    }

    public View o(i iVar, View view, ViewGroup viewGroup) {
        n.a aVar;
        if (view instanceof n.a) {
            aVar = (n.a) view;
        } else {
            aVar = (n.a) this.f.inflate(this.p, viewGroup, false);
        }
        b(iVar, aVar);
        return (View) aVar;
    }

    public n p(ViewGroup viewGroup) {
        if (this.q == null) {
            n nVar = (n) this.f.inflate(this.o, viewGroup, false);
            this.q = nVar;
            nVar.a(this.c);
            j(true);
        }
        return this.q;
    }

    public void q(int i) {
        this.r = i;
    }

    public abstract boolean r(int i, i iVar);
}
