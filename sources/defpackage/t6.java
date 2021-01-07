package defpackage;

import android.media.MediaRouter;
import defpackage.s6;

/* access modifiers changed from: package-private */
/* renamed from: t6  reason: default package */
public class t6<T extends s6> extends MediaRouter.VolumeCallback {
    protected final T a;

    public t6(T t) {
        this.a = t;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.d(routeInfo, i);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.a(routeInfo, i);
    }
}
