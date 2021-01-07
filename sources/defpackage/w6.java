package defpackage;

import android.media.MediaRouter;
import defpackage.v6;

/* renamed from: w6  reason: default package */
class w6<T extends v6> extends p6<T> {
    public w6(T t) {
        super(t);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        ((v6) this.a).i(routeInfo);
    }
}
