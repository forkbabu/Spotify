package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: u84  reason: default package */
public class u84 {
    private final boolean a;

    u84(boolean z) {
        this.a = z;
    }

    public w84 a(Context context, ViewGroup viewGroup) {
        w84 w84;
        context.getClass();
        if (this.a) {
            w84 = new p84(context, viewGroup);
        } else {
            w84 = new q84(context, viewGroup);
        }
        w84.getView().setTag(C0707R.id.glue_viewholder_tag, w84);
        return w84;
    }
}
