package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.features.notificationsettings.combined.e;

/* renamed from: qs5  reason: default package */
public abstract class qs5 implements rs5 {
    public static qs5 a(String str, String str2) {
        return new ns5(str, str2);
    }

    public abstract String b();

    public abstract String c();

    @Override // defpackage.rs5
    public int getType() {
        return 1;
    }

    @Override // defpackage.rs5
    public View u0(Context context, e eVar, View view, ViewGroup viewGroup, int i) {
        int i2 = e90.i;
        qa0 qa0 = (qa0) l70.p(view, qa0.class);
        js5 js5 = qa0;
        if (qa0 == null) {
            js5 js52 = new js5(LayoutInflater.from(context).inflate(C0707R.layout.notificationsettings_header_description, viewGroup, false));
            js52.getView().setTag(C0707R.id.glue_viewholder_tag, js52);
            js5 = js52;
        }
        js5.setTitle(c());
        js5.setSubtitle(b());
        js5.S(false);
        return js5.getView();
    }
}
