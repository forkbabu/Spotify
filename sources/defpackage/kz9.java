package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* renamed from: kz9  reason: default package */
public final class kz9 {

    /* renamed from: kz9$a */
    public interface a extends qa0 {
    }

    public static a a(Context context, ViewGroup viewGroup) {
        qa0 b = e90.e().b(context, viewGroup);
        TextView titleView = b.getTitleView();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) titleView.getLayoutParams();
        layoutParams.gravity = 8388611;
        titleView.setLayoutParams(layoutParams);
        TextView subtitleView = b.getSubtitleView();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) subtitleView.getLayoutParams();
        layoutParams2.gravity = 8388611;
        subtitleView.setLayoutParams(layoutParams2);
        jz9 jz9 = new jz9(b);
        jz9.getView().setTag(C0707R.id.glue_viewholder_tag, jz9);
        return jz9;
    }
}
