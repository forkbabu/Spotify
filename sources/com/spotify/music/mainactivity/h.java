package com.spotify.music.mainactivity;

import android.app.Activity;
import android.content.Intent;

public final /* synthetic */ class h implements qg0 {
    public final /* synthetic */ Activity a;

    public /* synthetic */ h(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.qg0
    public final void accept(Object obj) {
        this.a.startActivity((Intent) obj);
    }
}
