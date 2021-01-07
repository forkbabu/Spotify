package com.spotify.music.libs.thestage;

import android.view.View;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ TheStageActivity a;

    public /* synthetic */ b(TheStageActivity theStageActivity) {
        this.a = theStageActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TheStageActivity theStageActivity = this.a;
        int i = TheStageFragment.A0;
        theStageActivity.finish();
    }
}
