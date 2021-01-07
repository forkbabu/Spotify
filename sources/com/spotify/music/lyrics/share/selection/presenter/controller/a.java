package com.spotify.music.lyrics.share.selection.presenter.controller;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

final class a<T> implements g<Integer> {
    final /* synthetic */ LyricsSelectionController a;

    a(LyricsSelectionController lyricsSelectionController) {
        this.a = lyricsSelectionController;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Integer num) {
        Integer num2 = num;
        LyricsSelectionController lyricsSelectionController = this.a;
        h.d(num2, "index");
        LyricsSelectionController.d(lyricsSelectionController, num2.intValue());
    }
}
