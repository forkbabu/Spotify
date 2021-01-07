package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderV2Behavior;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import com.spotify.music.C0707R;
import defpackage.q61;
import kotlin.jvm.internal.h;

/* renamed from: ut8  reason: default package */
public final class ut8 extends r51 {
    private final RecyclerView a;
    private final RecyclerView b;
    private final GlueHeaderLayout c;
    private final FrameLayout d;
    private final Context e;

    /* renamed from: ut8$a */
    static final class a implements q61.e {
        final /* synthetic */ ut8 a;
        final /* synthetic */ q61 b;

        a(ut8 ut8, q61 q61) {
            this.a = ut8;
            this.b = q61;
        }

        @Override // defpackage.q61.e
        public final void a() {
            View e = this.b.e(this.a.c);
            if (e != null) {
                ut8.J(this.a, e);
            }
        }
    }

    public ut8(Context context, m mVar, c cVar) {
        h.e(context, "context");
        h.e(mVar, "layoutManagerFactory");
        h.e(cVar, "topicImpressionLogger");
        this.e = context;
        RecyclerView D = r51.D(context);
        D.setLayoutManager(mVar.create());
        this.a = D;
        RecyclerView E = r51.E(context);
        this.b = E;
        h.d(D, "body");
        GlueHeaderLayout glueHeaderLayout = new GlueHeaderLayout(context, null);
        glueHeaderLayout.z(D);
        this.c = glueHeaderLayout;
        h.d(E, "overlay");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(C0707R.id.hub_glue_header_layout_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.addView(glueHeaderLayout, layoutParams);
        frameLayout.addView(E, layoutParams);
        this.d = frameLayout;
        cVar.g(D);
    }

    public static final void J(ut8 ut8, View view) {
        ut8.c.setToolbarUpdater(l70.k(ut8.e));
        if (view instanceof GlueHeaderViewV2) {
            GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) view;
            ut8.c.G(glueHeaderViewV2, new GlueHeaderV2Behavior(), false);
            if (glueHeaderViewV2.getId() == -1) {
                glueHeaderViewV2.setId(C0707R.id.glue_header_layout_header);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView F() {
        RecyclerView recyclerView = this.a;
        h.d(recyclerView, "body");
        return recyclerView;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView G() {
        RecyclerView recyclerView = this.b;
        h.d(recyclerView, "overlay");
        return recyclerView;
    }

    @Override // defpackage.e61
    public View b() {
        return this.d;
    }

    @Override // defpackage.r51, defpackage.e61
    public void k(q61 q61) {
        h.e(q61, "adapter");
        q61.i(new a(this, q61));
    }
}
