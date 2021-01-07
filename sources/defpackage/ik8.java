package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* renamed from: ik8  reason: default package */
public final class ik8 {
    public static fk8 a(Context context, ViewGroup viewGroup) {
        x90 h = e90.d().h(context, viewGroup, false);
        fk8 fk8 = new fk8(h.getView(), h);
        fk8.getView().setTag(C0707R.id.glue_viewholder_tag, fk8);
        return fk8;
    }
}
