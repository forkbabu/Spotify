package com.spotify.music.sociallistening.participantlist.impl;

import android.view.View;

public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ SocialListeningActivity a;

    public /* synthetic */ f(SocialListeningActivity socialListeningActivity) {
        this.a = socialListeningActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.finish();
    }
}
