package com.spotify.effortlesslogin;

import android.view.View;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ EffortlessLoginActivity a;

    public /* synthetic */ a(EffortlessLoginActivity effortlessLoginActivity) {
        this.a = effortlessLoginActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EffortlessLoginActivity effortlessLoginActivity = this.a;
        effortlessLoginActivity.setResult(0);
        effortlessLoginActivity.finish();
    }
}
