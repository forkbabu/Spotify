package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.prettylist.b;
import com.spotify.music.C0707R;

/* renamed from: tb0  reason: default package */
public final class tb0 {
    public static ub0 a(b bVar) {
        GlueHeaderView glueHeaderView = (GlueHeaderView) bVar;
        glueHeaderView.getClass();
        vb0 vb0 = new vb0(LayoutInflater.from(glueHeaderView.getContext()).inflate(C0707R.layout.glue_header_content_set_title, (ViewGroup) ((GlueHeaderView) bVar), false));
        vb0.getView().setTag(C0707R.id.glue_viewholder_tag, vb0);
        return vb0;
    }

    public static yb0 b(b bVar) {
        GlueHeaderView glueHeaderView = (GlueHeaderView) bVar;
        glueHeaderView.getClass();
        zb0 zb0 = new zb0(LayoutInflater.from(glueHeaderView.getContext()).inflate(C0707R.layout.glue_header_content_set_cover_art, (ViewGroup) ((GlueHeaderView) bVar), false));
        zb0.getView().setTag(C0707R.id.glue_viewholder_tag, zb0);
        return zb0;
    }

    public static ac0 c(b bVar) {
        GlueHeaderView glueHeaderView = (GlueHeaderView) bVar;
        glueHeaderView.getClass();
        bc0 bc0 = new bc0(LayoutInflater.from(glueHeaderView.getContext()).inflate(C0707R.layout.glue_header_content_set_cover_art, (ViewGroup) ((GlueHeaderView) bVar), false));
        bc0.getView().setTag(C0707R.id.glue_viewholder_tag, bc0);
        return bc0;
    }

    public static wb0 d(b bVar) {
        GlueHeaderView glueHeaderView = (GlueHeaderView) bVar;
        glueHeaderView.getClass();
        xb0 xb0 = new xb0(LayoutInflater.from(glueHeaderView.getContext()).inflate(C0707R.layout.glue_header_content_set_cover_art, (ViewGroup) ((GlueHeaderView) bVar), false));
        xb0.getView().setTag(C0707R.id.glue_viewholder_tag, xb0);
        return xb0;
    }

    public static cc0 e(b bVar) {
        GlueHeaderView glueHeaderView = (GlueHeaderView) bVar;
        glueHeaderView.getClass();
        dc0 dc0 = new dc0(LayoutInflater.from(glueHeaderView.getContext()).inflate(C0707R.layout.glue_header_content_set_multiline, (ViewGroup) ((GlueHeaderView) bVar), false));
        dc0.getView().setTag(C0707R.id.glue_viewholder_tag, dc0);
        return dc0;
    }

    public static ec0 f(b bVar) {
        GlueHeaderView glueHeaderView = (GlueHeaderView) bVar;
        glueHeaderView.getClass();
        hc0 hc0 = new hc0(LayoutInflater.from(glueHeaderView.getContext()).inflate(C0707R.layout.glue_header_content_set_two_lines, (ViewGroup) ((GlueHeaderView) bVar), false));
        hc0.getView().setTag(C0707R.id.glue_viewholder_tag, hc0);
        return hc0;
    }

    public static fc0 g(b bVar) {
        GlueHeaderView glueHeaderView = (GlueHeaderView) bVar;
        glueHeaderView.getClass();
        gc0 gc0 = new gc0(LayoutInflater.from(glueHeaderView.getContext()).inflate(C0707R.layout.glue_header_content_set_two_lines_and_metadata, (ViewGroup) ((GlueHeaderView) bVar), false));
        gc0.getView().setTag(C0707R.id.glue_viewholder_tag, gc0);
        return gc0;
    }
}
