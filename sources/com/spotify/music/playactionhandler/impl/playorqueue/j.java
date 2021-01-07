package com.spotify.music.playactionhandler.impl.playorqueue;

import android.view.View;
import com.spotify.music.playactionhandler.impl.playorqueue.PlayOrQueueDialogFragment;

public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ PlayOrQueueDialogFragment a;
    public final /* synthetic */ String b;

    public /* synthetic */ j(PlayOrQueueDialogFragment playOrQueueDialogFragment, String str) {
        this.a = playOrQueueDialogFragment;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlayOrQueueDialogFragment playOrQueueDialogFragment = this.a;
        String str = this.b;
        x9d x9d = playOrQueueDialogFragment.v0;
        str.getClass();
        x9d.m(str);
        playOrQueueDialogFragment.w0.onNext(PlayOrQueueDialogFragment.DialogResult.PLAY);
        playOrQueueDialogFragment.M4();
    }
}
