package defpackage;

import android.media.MediaRouter;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: x6  reason: default package */
public final class x6 {
    private Method a;
    private int b;

    public x6() {
        if (Build.VERSION.SDK_INT == 17) {
            try {
                this.b = MediaRouter.RouteInfo.class.getField("STATUS_CONNECTING").getInt(null);
                this.a = MediaRouter.RouteInfo.class.getMethod("getStatusCode", new Class[0]);
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException unused) {
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public boolean a(Object obj) {
        MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) obj;
        Method method = this.a;
        if (method == null) {
            return false;
        }
        try {
            if (((Integer) method.invoke(routeInfo, new Object[0])).intValue() == this.b) {
                return true;
            }
            return false;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
