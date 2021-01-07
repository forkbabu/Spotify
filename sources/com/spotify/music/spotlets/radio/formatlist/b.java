package com.spotify.music.spotlets.radio.formatlist;

import com.spotify.music.C0707R;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ RadioFormatListService a;

    public /* synthetic */ b(RadioFormatListService radioFormatListService) {
        this.a = radioFormatListService;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        RadioFormatListService radioFormatListService = this.a;
        Throwable th = (Throwable) obj;
        radioFormatListService.f.c(C0707R.string.toast_unable_to_load_radio_formatlist, new Object[0]);
        radioFormatListService.stopSelf();
    }
}
