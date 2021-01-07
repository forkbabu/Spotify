package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* renamed from: ga0  reason: default package */
public final class ga0 {
    public static p90 a(p90 p90) {
        View view = p90.getView();
        Drawable j = nud.j(view.getContext(), C0707R.attr.selectableItemBackground);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        view.setBackground(j);
        return p90;
    }

    public r90 b(Context context, ViewGroup viewGroup, int i) {
        s90 s90 = new s90(l70.l(context, viewGroup, C0707R.layout.glue_listtile_1));
        s90.I(i);
        s90.getView().setTag(C0707R.id.glue_viewholder_tag, s90);
        return s90;
    }

    public t90 c(Context context, ViewGroup viewGroup) {
        w90 w90 = new w90(l70.l(context, viewGroup, C0707R.layout.glue_listtile_1));
        w90.getView().setTag(C0707R.id.glue_viewholder_tag, w90);
        return w90;
    }

    public u90 d(Context context, ViewGroup viewGroup) {
        v90 v90 = new v90(l70.l(context, viewGroup, C0707R.layout.glue_listtile_1_image));
        v90.getView().setTag(C0707R.id.glue_viewholder_tag, v90);
        return v90;
    }

    public u90 e(Context context, ViewGroup viewGroup) {
        v90 v90 = new v90(l70.l(context, viewGroup, C0707R.layout.glue_listtile_1_image_small));
        v90.getView().setTag(C0707R.id.glue_viewholder_tag, v90);
        return v90;
    }

    public t90 f(Context context, ViewGroup viewGroup) {
        w90 w90 = new w90(l70.l(context, viewGroup, C0707R.layout.glue_listtile_1_small));
        w90.getView().setTag(C0707R.id.glue_viewholder_tag, w90);
        return w90;
    }

    public x90 g(Context context, ViewGroup viewGroup) {
        return h(context, viewGroup, false);
    }

    public x90 h(Context context, ViewGroup viewGroup, boolean z) {
        aa0 aa0 = new aa0(l70.l(context, viewGroup, z ? C0707R.layout.glue_listtile_2_muted : C0707R.layout.glue_listtile_2));
        aa0.getView().setTag(C0707R.id.glue_viewholder_tag, aa0);
        return aa0;
    }

    public y90 i(Context context, ViewGroup viewGroup) {
        return j(context, viewGroup, false);
    }

    public y90 j(Context context, ViewGroup viewGroup, boolean z) {
        z90 z90 = new z90(l70.l(context, viewGroup, z ? C0707R.layout.glue_listtile_2_image_muted : C0707R.layout.glue_listtile_2_image));
        z90.getView().setTag(C0707R.id.glue_viewholder_tag, z90);
        return z90;
    }

    public da0 k(Context context, ViewGroup viewGroup, boolean z) {
        ea0 ea0 = new ea0(l70.l(context, viewGroup, z ? C0707R.layout.glue_listtile_2_number_muted : C0707R.layout.glue_listtile_2_number));
        ea0.getView().setTag(C0707R.id.glue_viewholder_tag, ea0);
        return ea0;
    }
}
