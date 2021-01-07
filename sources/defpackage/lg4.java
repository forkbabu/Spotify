package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderV2Behavior;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.music.C0707R;
import defpackage.rg4;

/* renamed from: lg4  reason: default package */
public class lg4 extends r51 implements kg4 {
    private final Activity a;
    private final rg4 b;
    private final m c;
    private final pb4 d;
    private final dc4 e;
    private final jg4 f;
    private final xf4 g;
    private final boolean h;
    private RecyclerView i;
    private GlueHeaderLayout j;
    private RecyclerView k;
    private ViewGroup l;
    private b91 m;
    private q61 n;

    public lg4(Activity activity, rg4 rg4, m mVar, pb4 pb4, dc4 dc4, jg4 jg4, xf4 xf4, boolean z) {
        this.a = activity;
        this.b = rg4;
        this.c = mVar;
        this.d = pb4;
        this.e = dc4;
        jg4.getClass();
        this.f = jg4;
        this.g = xf4;
        this.h = z;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView F() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView G() {
        return this.k;
    }

    public /* synthetic */ void I() {
        this.j.A(false);
    }

    public void J() {
        String str;
        View e2 = this.n.e(this.j);
        this.j.setToolbarUpdater(l70.k(this.a));
        if (e2 instanceof GlueHeaderViewV2) {
            GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) e2;
            this.j.G(glueHeaderViewV2, new GlueHeaderV2Behavior(), false);
            this.j.setFakeActionBarWhenNoHeader(false);
            if (glueHeaderViewV2.getId() == -1) {
                glueHeaderViewV2.setId(C0707R.id.glue_header_layout_header);
            }
        }
        GlueHeaderLayout glueHeaderLayout = this.j;
        xf4 xf4 = this.g;
        b91 b91 = this.m;
        xf4.getClass();
        if (b91 != null) {
            s81 header = b91.header();
            str = header != null ? header.text().title() : b91.title();
        } else {
            str = null;
        }
        if (MoreObjects.isNullOrEmpty(str)) {
            str = "";
        }
        glueHeaderLayout.setTitle(str);
        s81 a2 = this.n.d().a();
        this.f.a(this.j, a2);
        this.d.h(a2);
        this.a.invalidateOptionsMenu();
    }

    @Override // defpackage.kg4
    public boolean a() {
        GlueHeaderLayout glueHeaderLayout = this.j;
        if (glueHeaderLayout == null || !(glueHeaderLayout.C(true) instanceof GlueHeaderViewV2)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.e61
    public View b() {
        ViewGroup viewGroup = this.l;
        viewGroup.getClass();
        return viewGroup;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r0 == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r3.e0(r0) != 0) goto L_0x0026;
     */
    @Override // defpackage.r51, defpackage.e61
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable e() {
        /*
            r5 = this;
            boolean r0 = r5.h
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            rg4 r0 = r5.b
            androidx.recyclerview.widget.RecyclerView r3 = r5.i
            r0.getClass()
            android.view.View r0 = r3.getChildAt(r2)
            if (r0 == 0) goto L_0x0028
            int r4 = r3.X(r0)
            if (r4 != 0) goto L_0x0026
            androidx.recyclerview.widget.RecyclerView$m r3 = r3.getLayoutManager()
            r3.getClass()
            int r0 = r3.e0(r0)
            if (r0 == 0) goto L_0x0028
        L_0x0026:
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            rg4$a r0 = new rg4$a
            androidx.recyclerview.widget.RecyclerView r2 = r5.i
            androidx.recyclerview.widget.RecyclerView$m r2 = r2.getLayoutManager()
            r2.getClass()
            android.os.Parcelable r2 = r2.i1()
            androidx.recyclerview.widget.RecyclerView r3 = r5.k
            androidx.recyclerview.widget.RecyclerView$m r3 = r3.getLayoutManager()
            r3.getClass()
            android.os.Parcelable r3 = r3.i1()
            com.spotify.android.glue.patterns.header.GlueHeaderLayout r4 = r5.j
            android.os.Parcelable r4 = r4.onSaveInstanceState()
            r0.<init>(r2, r3, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg4.e():android.os.Parcelable");
    }

    @Override // defpackage.r51, defpackage.e61
    public void f(Parcelable parcelable) {
        if (parcelable instanceof rg4.a) {
            rg4.a aVar = (rg4.a) parcelable;
            RecyclerView.m layoutManager = this.i.getLayoutManager();
            layoutManager.getClass();
            layoutManager.h1(aVar.a);
            RecyclerView.m layoutManager2 = this.k.getLayoutManager();
            layoutManager2.getClass();
            layoutManager2.h1(aVar.b);
            Parcelable parcelable2 = aVar.c;
            if (parcelable2 != null) {
                this.j.onRestoreInstanceState(parcelable2);
            }
            GlueHeaderLayout glueHeaderLayout = this.j;
            boolean z = true;
            if (glueHeaderLayout == null || !(glueHeaderLayout.C(true) instanceof GlueHeaderViewV2)) {
                z = false;
            }
            if (z && aVar.f) {
                this.j.post(new eg4(this));
            }
        }
    }

    @Override // defpackage.r51, defpackage.e61
    public void k(q61 q61) {
        this.n = q61;
        q61.i(new dg4(this));
    }

    @Override // defpackage.kg4
    public View p(Context context) {
        rg4 rg4 = this.b;
        m mVar = this.c;
        rg4.getClass();
        GridLayoutManager create = mVar.create();
        RecyclerView D = r51.D(context);
        D.setId(C0707R.id.glue_header_layout_recycler);
        D.setLayoutManager(create);
        this.i = D;
        D.n(this.e);
        rg4 rg42 = this.b;
        RecyclerView recyclerView = this.i;
        rg42.getClass();
        GlueHeaderLayout glueHeaderLayout = new GlueHeaderLayout(context, null);
        glueHeaderLayout.z(recyclerView);
        glueHeaderLayout.setFakeActionBarWhenNoHeader(false);
        this.j = glueHeaderLayout;
        RecyclerView E = r51.E(context);
        this.k = E;
        rg4 rg43 = this.b;
        GlueHeaderLayout glueHeaderLayout2 = this.j;
        rg43.getClass();
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.addView(glueHeaderLayout2, layoutParams);
        frameLayout.addView(E, layoutParams);
        this.l = frameLayout;
        this.d.g(this.i);
        this.d.g(this.k);
        return this.l;
    }

    @Override // defpackage.r51, defpackage.e61
    public void s(b91 b91) {
        b91.getClass();
        this.m = b91;
        r51.H(this.k, !b91.overlays().isEmpty());
    }
}
