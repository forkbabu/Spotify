package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* renamed from: g84  reason: default package */
public class g84 {
    private final boolean a;
    private final boolean b;
    private final d84 c;

    public g84(boolean z, boolean z2, d84 d84) {
        this.a = z;
        this.b = z2;
        this.c = d84;
    }

    public f84 a(Context context, ViewGroup viewGroup) {
        f84 f84;
        context.getClass();
        boolean z = this.a;
        if (z && this.b) {
            f84 = new x74(context, viewGroup);
        } else if (z) {
            f84 = new m84(context);
        } else {
            f84 = this.c.b(viewGroup);
        }
        f84.getView().setTag(C0707R.id.glue_viewholder_tag, f84);
        return f84;
    }
}
