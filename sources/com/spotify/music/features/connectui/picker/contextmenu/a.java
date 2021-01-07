package com.spotify.music.features.connectui.picker.contextmenu;

import android.view.View;
import com.spotify.music.features.connectui.picker.contextmenu.entries.DeviceContextMenuEntry;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ f a;
    public final /* synthetic */ DeviceContextMenuEntry b;

    public /* synthetic */ a(f fVar, DeviceContextMenuEntry deviceContextMenuEntry) {
        this.a = fVar;
        this.b = deviceContextMenuEntry;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.X(this.b, view);
    }
}
