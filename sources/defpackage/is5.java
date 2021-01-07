package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* renamed from: is5  reason: default package */
public final class is5 {
    public static ia0 a(Context context, ViewGroup viewGroup) {
        hs5 hs5 = new hs5(LayoutInflater.from(context).inflate(C0707R.layout.notificationsettings_header_category, viewGroup, false));
        hs5.getView().setTag(C0707R.id.glue_viewholder_tag, hs5);
        return hs5;
    }
}
