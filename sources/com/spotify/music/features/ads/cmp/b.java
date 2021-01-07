package com.spotify.music.features.ads.cmp;

import android.view.View;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ CMPActivity a;

    public /* synthetic */ b(CMPActivity cMPActivity) {
        this.a = cMPActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CMPActivity cMPActivity = this.a;
        int i = CMPWebFragment.A0;
        cMPActivity.finish();
    }
}
