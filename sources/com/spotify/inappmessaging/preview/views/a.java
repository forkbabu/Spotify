package com.spotify.inappmessaging.preview.views;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

public final /* synthetic */ class a implements TextView.OnEditorActionListener {
    public final /* synthetic */ View.OnClickListener a;

    public /* synthetic */ a(View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        View.OnClickListener onClickListener = this.a;
        int i2 = PreviewSubmissionView.n;
        if (i != 2 || onClickListener == null) {
            return false;
        }
        onClickListener.onClick(textView);
        return true;
    }
}
