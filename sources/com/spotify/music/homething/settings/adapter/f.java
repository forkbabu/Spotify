package com.spotify.music.homething.settings.adapter;

import android.text.Editable;

class f extends l62 {
    final /* synthetic */ ft9 a;
    final /* synthetic */ HomethingSettingsAdapter b;

    f(HomethingSettingsAdapter homethingSettingsAdapter, ft9 ft9) {
        this.b = homethingSettingsAdapter;
        this.a = ft9;
    }

    @Override // defpackage.l62, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        HomethingSettingsAdapter.X(this.b).c(this.a, editable.toString());
    }
}
