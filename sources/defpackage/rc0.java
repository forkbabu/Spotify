package defpackage;

import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.prettylist.b;
import com.spotify.music.C0707R;

/* renamed from: rc0  reason: default package */
public final class rc0 {
    public static void a(GlueHeaderView glueHeaderView, ub0 ub0) {
        oc0 b = b(glueHeaderView);
        ((pc0) b).F1(ub0);
        glueHeaderView.setContentViewBinder(b);
    }

    public static oc0 b(b bVar) {
        GlueHeaderView glueHeaderView = (GlueHeaderView) bVar;
        glueHeaderView.getClass();
        pc0 pc0 = new pc0(glueHeaderView.getContext(), (GlueHeaderView) bVar);
        pc0.getView().setTag(C0707R.id.glue_viewholder_tag, pc0);
        return pc0;
    }
}
