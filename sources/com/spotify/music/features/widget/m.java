package com.spotify.music.features.widget;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import com.google.common.base.Optional;

public abstract class m {
    public static m c(Optional<Bitmap> optional, String str, String str2, f fVar, e eVar, f fVar2, PendingIntent pendingIntent) {
        return new d(optional, str, str2, fVar, eVar, fVar2, pendingIntent);
    }

    public abstract PendingIntent a();

    public abstract Optional<Bitmap> b();

    public abstract e d();

    public abstract f e();

    public abstract f f();

    public abstract String g();

    public abstract String h();
}
