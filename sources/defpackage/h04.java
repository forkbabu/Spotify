package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.behavior.GlueNoHeaderBehavior;
import com.spotify.android.glue.patterns.header.headers.GlueNoHeaderView;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.paste.app.d;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.music.C0707R;

/* renamed from: h04  reason: default package */
public class h04 extends r51 {
    private final RecyclerView a;
    private final RecyclerView b;
    private final FrameLayout c;
    private final GlueHeaderLayout d;

    public h04(Context context, m mVar, Fragment fragment, tk9 tk9) {
        context.getClass();
        boolean e = ToolbarConfig.e(context, fragment);
        RecyclerView D = r51.D(context);
        this.a = D;
        D.setId(C0707R.id.free_tier_album_glue_header_layout_recycler);
        D.setLayoutManager(mVar.create());
        RecyclerView E = r51.E(context);
        this.b = E;
        E.setId(C0707R.id.free_tier_album_hub_glue_header_layout_overlays);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setId(C0707R.id.free_tier_album_hub_glue_header_layout_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (e) {
            layoutParams.topMargin = d.c(context);
        }
        frameLayout.addView(E, layoutParams);
        GlueHeaderLayout glueHeaderLayout = new GlueHeaderLayout(context, null);
        glueHeaderLayout.z(D);
        glueHeaderLayout.G(new GlueNoHeaderView(context), new GlueNoHeaderBehavior(), true);
        glueHeaderLayout.setFakeActionBarWhenNoHeader(e);
        glueHeaderLayout.setToolbarUpdater(l70.k(context));
        this.d = glueHeaderLayout;
        frameLayout.addView(glueHeaderLayout, -1, -1);
        if (tk9 != null) {
            tk9.o(true);
            tk9.g(D);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView F() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView G() {
        return this.b;
    }

    @Override // defpackage.e61
    public View b() {
        return this.c;
    }

    @Override // defpackage.r51, defpackage.e61
    public void s(b91 b91) {
        b91.getClass();
        r51.H(this.b, !b91.overlays().isEmpty());
        String title = b91.title();
        if (title != null) {
            this.d.setTitle(title);
        }
    }
}
