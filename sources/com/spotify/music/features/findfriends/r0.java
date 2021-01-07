package com.spotify.music.features.findfriends;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.glue.dialogs.d;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.m;
import com.spotify.music.C0707R;

public class r0 {
    private final Context a;
    private d b;

    public r0(Context context) {
        this.a = context;
    }

    public void a(int i, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        d dVar = this.b;
        if (!(dVar != null && dVar.b().isShowing())) {
            String quantityString = this.a.getResources().getQuantityString(C0707R.plurals.find_friends_flow_confirm_desc, i, Integer.valueOf(i));
            Context context = this.a;
            f c = m.c(context, context.getString(C0707R.string.find_friends_flow_confirm_title), quantityString);
            c.f(this.a.getString(C0707R.string.find_friends_flow_confirm_positive), onClickListener);
            c.e(this.a.getString(C0707R.string.find_friends_flow_confirm_negative), onClickListener2);
            d b2 = c.b();
            this.b = b2;
            b2.a();
            this.b.b().isShowing();
        }
    }
}
