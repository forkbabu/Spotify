package com.spotify.music.playactionhandler.impl.playorqueue;

import io.reactivex.disposables.b;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ o a;
    public final /* synthetic */ PlayOrQueueDialogFragment b;

    public /* synthetic */ e(o oVar, PlayOrQueueDialogFragment playOrQueueDialogFragment) {
        this.a = oVar;
        this.b = playOrQueueDialogFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c(this.b, (b) obj);
    }
}
