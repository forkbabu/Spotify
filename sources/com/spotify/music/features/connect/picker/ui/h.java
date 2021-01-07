package com.spotify.music.features.connect.picker.ui;

import android.content.Context;
import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.LinkType;
import defpackage.sba;

public class h implements blb {
    private final Context a;
    private final sba.a b;

    public h(Context context, sba.a aVar) {
        this.a = context;
        this.b = aVar;
    }

    public /* synthetic */ Intent a(Intent intent, c cVar) {
        return this.b.a(this.a);
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        xkb xkb = (xkb) glb;
        xkb.h(LinkType.PLAY_DEVICEPICKER, "Redirect to device picker page", new e(this));
        xkb.h(LinkType.DEVICES, "Redirect to device picker page", new f(this));
    }

    public /* synthetic */ Intent c(Intent intent, c cVar) {
        return this.b.a(this.a);
    }
}
