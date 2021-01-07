package com.spotify.mobile.android.webbrowser;

import android.view.View;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ AdWebViewActivity a;

    public /* synthetic */ b(AdWebViewActivity adWebViewActivity) {
        this.a = adWebViewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.finish();
    }
}
