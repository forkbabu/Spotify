package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;

/* renamed from: pfc  reason: default package */
public class pfc {
    private final c a;
    private final b4<msc> b;

    public pfc(c cVar, b4<msc> b4Var) {
        this.a = cVar;
        this.b = b4Var;
    }

    public View a(Context context, msc msc) {
        return p42.d(context, this.b, msc, this.a, context.getString(C0707R.string.content_description_accessory_episode_type), msc.b());
    }
}
