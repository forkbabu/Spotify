package com.spotify.music.navigation;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.d;

public class h {
    private final Context a;

    public h(Context context) {
        this.a = context;
    }

    public g a(Intent intent, s sVar) {
        d.b bVar = new d.b();
        bVar.e(sVar.D0(this.a));
        String dataString = intent.getDataString();
        String B = l0.z(dataString).B();
        if (B == null) {
            if (dataString == null) {
                dataString = "";
            }
            bVar.c(dataString);
        } else {
            bVar.c(B);
        }
        bVar.d(intent.getStringExtra("tag"));
        bVar.b(sVar.z1().getName());
        return bVar.a();
    }
}
