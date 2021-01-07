package defpackage;

import android.content.Context;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.FrameLayoutManager;
import defpackage.e61;

/* renamed from: r51  reason: default package */
public abstract class r51 implements e61 {
    public static RecyclerView D(Context context) {
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setHasFixedSize(true);
        return recyclerView;
    }

    public static RecyclerView E(Context context) {
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setLayoutManager(new FrameLayoutManager());
        recyclerView.setHasFixedSize(true);
        return recyclerView;
    }

    public static void H(RecyclerView recyclerView, boolean z) {
        if (!z) {
            RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.k();
            }
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            recyclerView.setLayoutManager(null);
            recyclerView.setLayoutManager(layoutManager);
        }
        recyclerView.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.e61
    public void C(RecyclerView.e<?> eVar) {
        F().setAdapter(eVar);
    }

    /* access modifiers changed from: protected */
    public abstract RecyclerView F();

    /* access modifiers changed from: protected */
    public abstract RecyclerView G();

    @Override // defpackage.e61
    public Parcelable e() {
        RecyclerView.m layoutManager = F().getLayoutManager();
        layoutManager.getClass();
        Parcelable i1 = layoutManager.i1();
        RecyclerView.m layoutManager2 = G().getLayoutManager();
        layoutManager2.getClass();
        return new e61.a(i1, layoutManager2.i1());
    }

    @Override // defpackage.e61
    public void f(Parcelable parcelable) {
        if (parcelable instanceof e61.a) {
            e61.a aVar = (e61.a) parcelable;
            RecyclerView.m layoutManager = F().getLayoutManager();
            layoutManager.getClass();
            layoutManager.h1(aVar.a);
            RecyclerView.m layoutManager2 = G().getLayoutManager();
            layoutManager2.getClass();
            layoutManager2.h1(aVar.b);
        }
    }

    @Override // defpackage.e61
    public void h(int... iArr) {
        if (G().getVisibility() == 0) {
            g91.c(G(), iArr);
        }
    }

    @Override // defpackage.e61
    public void i(RecyclerView.e<?> eVar) {
        G().setAdapter(eVar);
    }

    @Override // defpackage.e61
    public void k(q61 q61) {
    }

    @Override // defpackage.e61
    public void n(int... iArr) {
        g91.c(F(), iArr);
    }

    @Override // defpackage.e61
    public void s(b91 b91) {
        H(G(), b91.overlays().size() > 0);
    }

    @Override // defpackage.e61
    public boolean w() {
        return F().getAdapter() != null;
    }
}
