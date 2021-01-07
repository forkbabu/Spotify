package com.spotify.music.libs.accountlinkingnudges;

import android.content.DialogInterface;

/* access modifiers changed from: package-private */
public final class f implements DialogInterface.OnClickListener {
    final /* synthetic */ DefaultGoogleAccountLinkingNudgeAttacher a;

    f(DefaultGoogleAccountLinkingNudgeAttacher defaultGoogleAccountLinkingNudgeAttacher) {
        this.a = defaultGoogleAccountLinkingNudgeAttacher;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DefaultGoogleAccountLinkingNudgeAttacher.e(this.a);
    }
}
