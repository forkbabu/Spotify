package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.music.C0707R;

/* renamed from: je3  reason: default package */
public class je3 extends r51 {
    private final CoordinatorLayout a;
    private final GridLayoutManager b;
    private final RecyclerView c;
    private final RecyclerView d;
    private final int e;

    public je3(Context context, m mVar) {
        GridLayoutManager create = mVar.create();
        this.b = create;
        this.e = create.C2();
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(context, null);
        coordinatorLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        coordinatorLayout.setId(C0707R.id.hub_glue_header_layout_container);
        this.a = coordinatorLayout;
        RecyclerView D = r51.D(context);
        CoordinatorLayout.e eVar = new CoordinatorLayout.e(-1, -1);
        eVar.j(new AppBarLayout.ScrollingViewBehavior());
        D.setId(C0707R.id.glue_header_layout_recycler);
        D.setLayoutManager(create);
        D.setLayoutParams(eVar);
        this.c = D;
        RecyclerView E = r51.E(context);
        E.setId(C0707R.id.hub_glue_header_layout_overlays);
        this.d = E;
        coordinatorLayout.addView(D);
        coordinatorLayout.addView(E);
    }

    @Override // defpackage.r51
    public RecyclerView F() {
        return this.c;
    }

    @Override // defpackage.r51
    public RecyclerView G() {
        return this.d;
    }

    public void I(q61 q61) {
        View e2 = q61.e(this.a);
        if (e2 != null && this.a.findViewById(C0707R.id.glue_header_layout_header) == null) {
            e2.setId(C0707R.id.glue_header_layout_header);
            this.a.addView(e2);
        }
    }

    @Override // defpackage.e61
    public View b() {
        return this.a;
    }

    @Override // defpackage.r51, defpackage.e61
    public void k(q61 q61) {
        q61.i(new yd3(this, q61));
    }

    @Override // defpackage.r51, defpackage.e61
    public void s(b91 b91) {
        r51.H(this.d, !b91.overlays().isEmpty());
        this.b.J2(this.e);
    }
}
