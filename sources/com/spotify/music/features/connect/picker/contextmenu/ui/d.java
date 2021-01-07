package com.spotify.music.features.connect.picker.contextmenu.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.spotify.music.features.connect.picker.contextmenu.ui.DeviceContextMenuActivity;

class d implements pud {
    final /* synthetic */ DeviceContextMenuActivity.d a;

    d(DeviceContextMenuActivity.d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.pud
    public Drawable createDrawable(Bitmap bitmap) {
        return new BitmapDrawable(DeviceContextMenuActivity.d.d(this.a).getResources(), bitmap);
    }
}
