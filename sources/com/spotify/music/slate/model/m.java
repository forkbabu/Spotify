package com.spotify.music.slate.model;

import android.widget.TextView;

abstract class m extends u {
    m() {
    }

    @Override // com.spotify.music.slate.model.u
    public void a(TextView textView) {
        textView.setText(e());
    }

    /* access modifiers changed from: package-private */
    public abstract CharSequence e();
}
