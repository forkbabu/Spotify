package defpackage;

import android.media.MediaRouter;
import defpackage.o6;

/* renamed from: p6  reason: default package */
class p6<T extends o6> extends MediaRouter.Callback {
    protected final T a;

    public p6(T t) {
        this.a = t;
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.a.j(routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.a.e(routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.c(routeInfo, routeGroup, i);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.a.g(routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.h(i, routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.b(routeInfo, routeGroup);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.f(i, routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.a.k(routeInfo);
    }
}
