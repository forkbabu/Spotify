package com.spotify.nowplaying.ui.components.controls.seekbar;

import io.reactivex.processors.PublishProcessor;

public final /* synthetic */ class a implements qg0 {
    public final /* synthetic */ PublishProcessor a;

    public /* synthetic */ a(PublishProcessor publishProcessor) {
        this.a = publishProcessor;
    }

    @Override // defpackage.qg0
    public final void accept(Object obj) {
        this.a.onNext((uqd) obj);
    }
}
