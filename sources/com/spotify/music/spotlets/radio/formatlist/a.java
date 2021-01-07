package com.spotify.music.spotlets.radio.formatlist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.music.C0707R;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ RadioFormatListService a;
    public final /* synthetic */ Context b;

    public /* synthetic */ a(RadioFormatListService radioFormatListService, Context context) {
        this.a = radioFormatListService;
        this.b = context;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        RadioFormatListService radioFormatListService = this.a;
        Context context = this.b;
        Optional optional = (Optional) obj;
        radioFormatListService.getClass();
        if (optional.isPresent()) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) optional.get()));
            intent.setFlags(335544320);
            context.startActivity(intent);
        } else {
            radioFormatListService.f.c(C0707R.string.toast_unable_to_load_radio_formatlist, new Object[0]);
        }
        radioFormatListService.stopSelf();
    }
}
