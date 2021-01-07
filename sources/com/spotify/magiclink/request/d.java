package com.spotify.magiclink.request;

import android.view.KeyEvent;
import android.widget.TextView;

public final /* synthetic */ class d implements TextView.OnEditorActionListener {
    public final /* synthetic */ MagicLinkRequestFragment a;

    public /* synthetic */ d(MagicLinkRequestFragment magicLinkRequestFragment) {
        this.a = magicLinkRequestFragment;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.Q4(textView, i, keyEvent);
        return false;
    }
}
