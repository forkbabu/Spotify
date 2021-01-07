package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.notificationsettings.combined.e;

/* renamed from: os5  reason: default package */
public abstract class os5 implements rs5 {
    public static os5 a(String str) {
        return new ms5(str);
    }

    public abstract String getName();

    @Override // defpackage.rs5
    public int getType() {
        return 0;
    }

    @Override // defpackage.rs5
    public View u0(Context context, e eVar, View view, ViewGroup viewGroup, int i) {
        int i2 = e90.i;
        ia0 ia0 = (ia0) l70.p(view, ia0.class);
        if (ia0 == null) {
            ia0 = is5.a(context, viewGroup);
        }
        ia0.setTitle(getName());
        boolean z = false;
        ia0.S(false);
        if (i == 0) {
            z = true;
        }
        ia0.V1(z);
        return ia0.getView();
    }
}
