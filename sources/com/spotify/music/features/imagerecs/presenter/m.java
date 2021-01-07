package com.spotify.music.features.imagerecs.presenter;

import android.content.Context;
import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.features.imagerecs.view.ImageRecsActivity;

public class m implements blb {
    private final Context a;

    public m(Context context) {
        this.a = context;
    }

    public /* synthetic */ Intent a(Intent intent, c cVar) {
        return new Intent(this.a, ImageRecsActivity.class);
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).h(LinkType.IMAGE_RECS_ROOT, "", new e(this));
    }
}
