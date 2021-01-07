package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: u6  reason: default package */
public final class u6 implements Runnable {
    private final DisplayManager a;
    private final Handler b;
    private Method c;
    private boolean f;

    public u6(Context context, Handler handler) {
        if (Build.VERSION.SDK_INT == 17) {
            this.a = (DisplayManager) context.getSystemService("display");
            this.b = handler;
            try {
                this.c = DisplayManager.class.getMethod("scanWifiDisplays", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public void a(int i) {
        if ((i & 2) != 0) {
            if (!this.f && this.c != null) {
                this.f = true;
                this.b.post(this);
            }
        } else if (this.f) {
            this.f = false;
            this.b.removeCallbacks(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f) {
            try {
                this.c.invoke(this.a, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
            this.b.postDelayed(this, 15000);
        }
    }
}
