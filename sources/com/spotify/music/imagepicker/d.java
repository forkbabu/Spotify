package com.spotify.music.imagepicker;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.h;

public final class d implements c {
    private final Activity a;

    public d(Activity activity) {
        h.e(activity, "activity");
        this.a = activity;
    }

    @Override // com.spotify.music.imagepicker.c
    public void a(int i, boolean z, boolean z2) {
        Activity activity = this.a;
        h.e(activity, "context");
        Intent intent = new Intent(activity, ImagePickerActivity.class);
        intent.putExtra("using-camera", z);
        intent.putExtra("show-circle-overlay", z2);
        this.a.startActivityForResult(intent, i);
    }
}
