package com.spotify.music;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.z0;

public class q0 implements vja {
    private final z0 a;

    public q0(z0 z0Var) {
        this.a = z0Var;
    }

    @Override // defpackage.vja
    public PendingIntent a(Context context, String str, Bundle bundle) {
        z0.b bVar;
        l0 z = l0.z(str);
        if (z.q() == LinkType.PLAYER_VIEW || !l0.x(str)) {
            bVar = this.a.c(context);
        } else if (z.q() == LinkType.VOICE_RESULTS) {
            z0 z0Var = this.a;
            String B = z.B();
            B.getClass();
            bVar = z0Var.b(context, B);
            bVar.a.putExtra("extra_clear_backstack", true);
        } else {
            z0 z0Var2 = this.a;
            String B2 = z.B();
            B2.getClass();
            bVar = z0Var2.b(context, B2);
        }
        if (bundle != null) {
            bVar.a.putExtras(bundle);
        }
        return PendingIntent.getActivity(context, 9876, bVar.a, 134217728);
    }
}
