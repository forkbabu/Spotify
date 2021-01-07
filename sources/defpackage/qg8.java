package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.hubframework.defaults.m;

/* renamed from: qg8  reason: default package */
public class qg8 extends r51 {
    private final ViewGroup a;
    private final RecyclerView b;
    private final RecyclerView c;

    public qg8(Context context, m mVar, RecyclerView.q qVar, ic8 ic8) {
        RecyclerView D = r51.D(context);
        D.setLayoutManager(mVar.create());
        qVar.getClass();
        D.n(qVar);
        this.b = D;
        RecyclerView E = r51.E(context);
        this.c = E;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(D, -1, -1);
        frameLayout.addView(E, -1, -1);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.a = frameLayout;
        ic8.e(D);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView F() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView G() {
        return this.c;
    }

    @Override // defpackage.e61
    public View b() {
        return this.a;
    }
}
