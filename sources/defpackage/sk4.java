package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* renamed from: sk4  reason: default package */
public class sk4 {
    private final boolean a;
    private final boolean b;
    private final pk4 c;

    public sk4(boolean z, boolean z2, pk4 pk4) {
        this.a = z;
        this.b = z2;
        this.c = pk4;
    }

    public rk4 a(Context context, ViewGroup viewGroup) {
        rk4 rk4;
        context.getClass();
        boolean z = this.a;
        if (z && this.b) {
            rk4 = new jk4(context, viewGroup);
        } else if (z) {
            rk4 = new xk4(context);
        } else {
            rk4 = this.c.b(viewGroup);
        }
        rk4.getView().setTag(C0707R.id.glue_viewholder_tag, rk4);
        return rk4;
    }
}
