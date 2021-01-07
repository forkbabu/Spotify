package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* renamed from: o90  reason: default package */
public class o90 {
    public m90 a(Context context, ViewGroup viewGroup) {
        n90 n90 = new n90(LayoutInflater.from(context).inflate(C0707R.layout.glue_category_card, viewGroup, false));
        n90.getView().setTag(C0707R.id.glue_viewholder_tag, n90);
        return n90;
    }
}
