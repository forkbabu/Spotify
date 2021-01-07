package defpackage;

import android.media.MediaRouter;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: q6  reason: default package */
public final class q6 {
    private Method a;

    public q6() {
        if (Build.VERSION.SDK_INT <= 17) {
            try {
                this.a = MediaRouter.class.getMethod("getSystemAudioRoute", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public Object a(Object obj) {
        MediaRouter mediaRouter = (MediaRouter) obj;
        Method method = this.a;
        if (method != null) {
            try {
                return method.invoke(mediaRouter, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return mediaRouter.getRouteAt(0);
    }
}
