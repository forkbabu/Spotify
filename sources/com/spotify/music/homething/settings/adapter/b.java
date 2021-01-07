package com.spotify.music.homething.settings.adapter;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ SwitchCompat a;

    public /* synthetic */ b(SwitchCompat switchCompat) {
        this.a = switchCompat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.toggle();
    }
}
