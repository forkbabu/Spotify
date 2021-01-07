package com.spotify.music.libs.search.view;

import android.view.KeyEvent;
import android.widget.TextView;

public final /* synthetic */ class b implements TextView.OnEditorActionListener {
    public final /* synthetic */ i a;

    public /* synthetic */ b(i iVar) {
        this.a = iVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return this.a.e(textView, i, keyEvent);
    }
}
