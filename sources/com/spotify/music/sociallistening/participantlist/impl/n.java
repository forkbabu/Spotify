package com.spotify.music.sociallistening.participantlist.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.h;

public final class n implements scd {
    final /* synthetic */ Context a;

    n(Context context) {
        this.a = context;
    }

    @Override // defpackage.scd
    public Intent getIntent() {
        Context context = this.a;
        int i = SocialListeningActivity.H;
        Intent intent = new Intent(context, SocialListeningActivity.class);
        h.d(intent, "SocialListeningActivity.createIntent(context)");
        return intent;
    }
}
