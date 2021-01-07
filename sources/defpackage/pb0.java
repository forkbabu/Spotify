package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* renamed from: pb0  reason: default package */
public final class pb0 {
    public static lb0 a(Context context, ViewGroup viewGroup) {
        mb0 mb0 = new mb0(LayoutInflater.from(context).inflate(C0707R.layout.glue_empty_state_button, viewGroup, false));
        mb0.getView().setTag(C0707R.id.glue_viewholder_tag, mb0);
        return mb0;
    }

    public static nb0 b(Context context, ViewGroup viewGroup) {
        ob0 ob0 = new ob0(LayoutInflater.from(context).inflate(C0707R.layout.glue_empty_state, viewGroup, false));
        ob0.getView().setTag(C0707R.id.glue_viewholder_tag, ob0);
        return ob0;
    }
}
