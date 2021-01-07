package defpackage;

import android.media.MediaRouter;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: r6  reason: default package */
public final class r6 {
    private Method a;

    public r6() {
        if (Build.VERSION.SDK_INT <= 17) {
            try {
                this.a = MediaRouter.class.getMethod("selectRouteInt", Integer.TYPE, MediaRouter.RouteInfo.class);
            } catch (NoSuchMethodException unused) {
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public void a(Object obj, int i, Object obj2) {
        Method method;
        MediaRouter mediaRouter = (MediaRouter) obj;
        MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj2;
        if ((routeInfo.getSupportedTypes() & 8388608) == 0 && (method = this.a) != null) {
            try {
                method.invoke(mediaRouter, Integer.valueOf(i), routeInfo);
                return;
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        mediaRouter.selectRoute(i, routeInfo);
    }
}
