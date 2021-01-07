package com.spotify.music.features.imagerecs.view;

import android.view.View;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ ImageRecsActivity a;

    public /* synthetic */ b(ImageRecsActivity imageRecsActivity) {
        this.a = imageRecsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.finish();
    }
}
