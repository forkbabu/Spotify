package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.behavior.GlueHeaderBehavior;
import com.spotify.android.glue.patterns.header.behavior.GlueNoHeaderBehavior;
import com.spotify.android.glue.patterns.header.behavior.LegacyHeaderBehavior;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.header.headers.GlueNoHeaderView;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderV2Behavior;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.paste.app.d;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;

/* renamed from: ke3  reason: default package */
public class ke3 extends r51 {
    private final Context a;
    private final ViewGroup b;
    private final GlueHeaderLayout c;
    private final GridLayoutManager d;
    private final he3 e;
    private final RecyclerView f;
    private final RecyclerView g;
    private final boolean h;
    private final int i;
    private b91 j = HubsImmutableViewModel.EMPTY;

    public ke3(Context context, m mVar, Fragment fragment, w51 w51) {
        context.getClass();
        this.a = context;
        boolean e2 = ToolbarConfig.e(context, fragment);
        this.h = e2;
        RecyclerView D = r51.D(context);
        this.f = D;
        D.setId(C0707R.id.glue_header_layout_recycler);
        GridLayoutManager create = mVar.create();
        this.d = create;
        this.i = create.C2();
        D.setLayoutManager(create);
        RecyclerView E = r51.E(context);
        this.g = E;
        E.setId(C0707R.id.hub_glue_header_layout_overlays);
        GlueHeaderLayout glueHeaderLayout = new GlueHeaderLayout(context, null);
        this.c = glueHeaderLayout;
        glueHeaderLayout.setFakeActionBarWhenNoHeader(e2);
        glueHeaderLayout.z(D);
        K();
        this.e = new he3(w51);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(C0707R.id.hub_glue_header_layout_container);
        frameLayout.addView(glueHeaderLayout, -1, -1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (e2) {
            layoutParams.topMargin = d.c(context);
        }
        frameLayout.addView(E, layoutParams);
    }

    private void K() {
        this.c.G(new GlueNoHeaderView(this.a), new GlueNoHeaderBehavior(), true);
        this.c.setFakeActionBarWhenNoHeader(this.h);
    }

    @Override // defpackage.r51
    public RecyclerView F() {
        return this.f;
    }

    @Override // defpackage.r51
    public RecyclerView G() {
        return this.g;
    }

    public /* synthetic */ void I() {
        if (!this.c.D()) {
            this.c.A(false);
        }
    }

    public void J(q61 q61) {
        View e2 = q61.e(this.c);
        boolean z = false;
        if (!(this.j.header() != null)) {
            K();
        } else if (this.c.C(true) != e2) {
            String str = "";
            String str2 = (String) x.n(this.j.title(), str);
            this.c.setToolbarUpdater(l70.k(this.a));
            this.c.setTitle(str2);
            if (e2 != null && e2.getId() == -1) {
                e2.setId(C0707R.id.glue_header_layout_header);
            }
            if (e2 instanceof GlueHeaderView) {
                this.c.G((GlueHeaderView) e2, new GlueHeaderBehavior(), false);
                this.c.setFakeActionBarWhenNoHeader(false);
            } else if (e2 instanceof PrettyHeaderView) {
                PrettyHeaderView prettyHeaderView = (PrettyHeaderView) e2;
                u k = l70.k(this.a);
                int c2 = this.h ? d.c(prettyHeaderView.getContext()) : 0;
                prettyHeaderView.setHasFixedSize(true);
                prettyHeaderView.setTopPadding(c2);
                prettyHeaderView.setToolbarUpdater(k);
                s81 header = this.j.header();
                header.getClass();
                String title = header.text().title();
                if (title != null) {
                    str = title;
                }
                prettyHeaderView.setTitle(str);
                k.setTitle(str2);
                this.c.G(prettyHeaderView, new LegacyHeaderBehavior(), false);
                this.c.setFakeActionBarWhenNoHeader(false);
            } else if (e2 instanceof GlueHeaderViewV2) {
                this.c.G((GlueHeaderViewV2) e2, new GlueHeaderV2Behavior(), false);
                this.c.setFakeActionBarWhenNoHeader(false);
            } else {
                K();
            }
        }
        s81 a2 = q61.d().a();
        if (this.j.header() != null) {
            z = true;
        }
        if (z) {
            GlueHeaderLayout glueHeaderLayout = this.c;
            glueHeaderLayout.F(this.e.b(a2, glueHeaderLayout), true);
            return;
        }
        this.c.setAccessory(null);
    }

    @Override // defpackage.e61
    public View b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003c, code lost:
        if (r4.e0(r6) != 0) goto L_0x003e;
     */
    @Override // defpackage.r51, defpackage.e61
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable e() {
        /*
            r8 = this;
            ie3 r0 = new ie3
            androidx.recyclerview.widget.RecyclerView r1 = r8.f
            androidx.recyclerview.widget.RecyclerView$m r1 = r1.getLayoutManager()
            r1.getClass()
            android.os.Parcelable r1 = r1.i1()
            androidx.recyclerview.widget.RecyclerView r2 = r8.g
            androidx.recyclerview.widget.RecyclerView$m r2 = r2.getLayoutManager()
            r2.getClass()
            android.os.Parcelable r2 = r2.i1()
            com.spotify.android.glue.patterns.header.GlueHeaderLayout r3 = r8.c
            android.os.Parcelable r3 = r3.onSaveInstanceState()
            androidx.recyclerview.widget.RecyclerView r4 = r8.f
            r5 = 0
            android.view.View r6 = r4.getChildAt(r5)
            if (r6 == 0) goto L_0x003f
            int r7 = r4.X(r6)
            if (r7 != 0) goto L_0x003e
            androidx.recyclerview.widget.RecyclerView$m r4 = r4.getLayoutManager()
            r4.getClass()
            int r4 = r4.e0(r6)
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r5 = 1
        L_0x003f:
            r0.<init>(r1, r2, r3, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke3.e():android.os.Parcelable");
    }

    @Override // defpackage.r51, defpackage.e61
    public void f(Parcelable parcelable) {
        if (parcelable instanceof ie3) {
            ie3 ie3 = (ie3) parcelable;
            RecyclerView.m layoutManager = this.f.getLayoutManager();
            layoutManager.getClass();
            layoutManager.h1(ie3.a);
            RecyclerView.m layoutManager2 = this.g.getLayoutManager();
            layoutManager2.getClass();
            layoutManager2.h1(ie3.b);
            Parcelable parcelable2 = ie3.c;
            if (parcelable2 != null) {
                this.c.onRestoreInstanceState(parcelable2);
            }
            if (ie3.f) {
                this.c.post(new ae3(this));
            }
        }
    }

    @Override // defpackage.r51, defpackage.e61
    public void k(q61 q61) {
        q61.i(new zd3(this, q61));
    }

    @Override // defpackage.r51, defpackage.e61
    public void n(int... iArr) {
        if (iArr.length > 0) {
            if (iArr[0] == 0) {
                this.c.E(false);
            } else {
                this.c.A(false);
            }
        }
        super.n(iArr);
    }

    @Override // defpackage.r51, defpackage.e61
    public void s(b91 b91) {
        b91.getClass();
        this.j = b91;
        r51.H(this.g, !b91.overlays().isEmpty());
        if (this.c.D()) {
            this.d.J2(Math.max(2, this.i / 3));
        } else {
            this.d.J2(this.i);
        }
    }
}
