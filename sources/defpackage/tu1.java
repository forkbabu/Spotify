package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment;
import com.spotify.music.C0707R;
import defpackage.uu1;
import java.util.HashSet;
import java.util.Set;

/* renamed from: tu1  reason: default package */
public abstract class tu1 implements uu1 {
    private final Set<uu1.a> a;
    private View b;
    private final boolean c;

    protected tu1() {
        this.a = new HashSet(0);
        this.c = false;
    }

    @Override // defpackage.uu1
    public boolean a() {
        return true;
    }

    @Override // defpackage.uu1
    public Integer c() {
        return null;
    }

    @Override // defpackage.uu1
    public void d(uu1.a aVar) {
        this.a.add(aVar);
    }

    @Override // defpackage.uu1
    public boolean e() {
        return false;
    }

    @Override // defpackage.uu1
    public void f(ViewGroup viewGroup) {
        View view = this.b;
        if (view != null) {
            viewGroup.removeView(view);
            this.b = null;
        }
    }

    @Override // defpackage.uu1
    public Integer g() {
        return null;
    }

    @Override // defpackage.uu1
    public boolean h() {
        return true;
    }

    @Override // defpackage.uu1
    public boolean i() {
        return true;
    }

    @Override // defpackage.uu1
    public void j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(l(), viewGroup, false);
        this.b = inflate;
        inflate.getClass();
        viewGroup.addView(this.b);
        n(this.b);
        if (k()) {
            Integer g = g();
            if (g == null || g.intValue() <= 0) {
                RoundedCornerTreatment.create(this.b, (float) this.b.getResources().getDimensionPixelSize(C0707R.dimen.tooltip_corner_radius));
                return;
            }
            RoundedCornerTreatment.create(this.b, (float) g.intValue());
        }
    }

    @Override // defpackage.uu1
    public boolean k() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public abstract int l();

    /* access modifiers changed from: protected */
    public void m() {
        if (!this.a.isEmpty()) {
            for (uu1.a aVar : this.a) {
                aVar.a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void n(View view);

    protected tu1(boolean z) {
        this.a = new HashSet(0);
        this.c = z;
    }
}
