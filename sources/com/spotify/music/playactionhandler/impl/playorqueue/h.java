package com.spotify.music.playactionhandler.impl.playorqueue;

import com.google.common.base.Optional;
import com.spotify.music.playactionhandler.impl.playorqueue.PlayOrQueueDialogFragment;
import io.reactivex.functions.l;

public final /* synthetic */ class h implements l {
    public static final /* synthetic */ h a = new h();

    private /* synthetic */ h() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PlayOrQueueDialogFragment.DialogResult dialogResult = PlayOrQueueDialogFragment.DialogResult.PLAY;
        return Boolean.valueOf(((Optional) obj).or(dialogResult) == dialogResult);
    }
}
