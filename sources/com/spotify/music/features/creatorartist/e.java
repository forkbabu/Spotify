package com.spotify.music.features.creatorartist;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

class e implements View.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ BiographyFragment c;

    e(BiographyFragment biographyFragment, String str, String str2) {
        this.c = biographyFragment;
        this.a = str;
        this.b = str2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.c.F2().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.a)));
        BiographyFragment.W4(this.c).i(BiographyFragment.V4(this.c).toString(), this.b, this.a);
    }
}
