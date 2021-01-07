package com.spotify.music.spotlets.apprater;

import android.content.Intent;
import android.view.View;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ AppRaterActivity a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ b(AppRaterActivity appRaterActivity, Intent intent) {
        this.a = appRaterActivity;
        this.b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AppRaterActivity appRaterActivity = this.a;
        appRaterActivity.startActivity(this.b);
        appRaterActivity.finish();
    }
}
