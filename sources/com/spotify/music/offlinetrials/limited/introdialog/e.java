package com.spotify.music.offlinetrials.limited.introdialog;

import android.view.View;

public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ LimitedOfflineSlateDialogActivity a;

    public /* synthetic */ e(LimitedOfflineSlateDialogActivity limitedOfflineSlateDialogActivity) {
        this.a = limitedOfflineSlateDialogActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.finish();
    }
}
