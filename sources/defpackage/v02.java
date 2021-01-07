package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;

/* renamed from: v02  reason: default package */
public final class v02 extends RecyclerView.e<RecyclerView.b0> {
    private final View c;
    private final boolean f;
    private FrameLayout n;
    private final int o;

    /* renamed from: v02$a */
    class a extends RecyclerView.b0 {
        a(v02 v02, View view) {
            super(view);
        }
    }

    public v02(View view, boolean z) {
        FrameLayout.LayoutParams X = X(1);
        this.c = view;
        view.setLayoutParams(X);
        this.f = z;
        U(true);
        this.o = 1;
    }

    private static FrameLayout.LayoutParams X(int i) {
        int i2 = -1;
        int i3 = i == 1 ? -1 : -2;
        if (i == 1) {
            i2 = -2;
        }
        return new FrameLayout.LayoutParams(i3, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        b0Var.a.setEnabled(this.f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        if (this.n != null) {
            Logger.b("onCreateViewHolder() was called several times. Should only be called once.", new Object[0]);
            this.n.removeAllViews();
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        this.n = frameLayout;
        frameLayout.setLayoutParams(X(this.o));
        this.n.addView(this.c);
        return new a(this, this.n);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return (long) this.c.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return this.c.hashCode();
    }

    public v02(View view, boolean z, FrameLayout.LayoutParams layoutParams, int i) {
        this.c = view;
        view.setLayoutParams(layoutParams);
        this.f = z;
        U(true);
        this.o = i;
    }
}
