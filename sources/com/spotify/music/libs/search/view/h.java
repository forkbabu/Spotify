package com.spotify.music.libs.search.view;

import android.text.Editable;

/* access modifiers changed from: package-private */
public class h extends l62 {
    final /* synthetic */ i a;

    h(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.l62, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.a.t(editable != null ? editable.toString() : null);
    }
}
