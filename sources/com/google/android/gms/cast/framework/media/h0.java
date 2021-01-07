package com.google.android.gms.cast.framework.media;

import android.graphics.Bitmap;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.cast.framework.media.internal.a;

final class h0 implements a {
    private final /* synthetic */ MediaNotificationService.a a;
    private final /* synthetic */ MediaNotificationService b;

    h0(MediaNotificationService mediaNotificationService, MediaNotificationService.a aVar) {
        this.b = mediaNotificationService;
        this.a = aVar;
    }

    @Override // com.google.android.gms.cast.framework.media.internal.a
    public final void a(Bitmap bitmap) {
        MediaNotificationService.a aVar = this.a;
        aVar.b = bitmap;
        MediaNotificationService.d(this.b, aVar);
        MediaNotificationService.f(this.b);
    }
}
