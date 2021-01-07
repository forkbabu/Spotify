package defpackage;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

/* renamed from: gzd  reason: default package */
public class gzd implements zyd {
    private boolean a;
    private boolean b;

    public gzd(String str, String str2) {
    }

    private boolean e() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.preinstall.path", "null");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            str = "";
        }
        if (str == null || str.isEmpty()) {
            return false;
        }
        return new File(str, "spotify_channel.txt").exists();
    }

    @Override // defpackage.zyd
    public String a() {
        return d() ? "vivo_in_preload" : "";
    }

    @Override // defpackage.zyd
    public String b() {
        return d() ? "vivo_in_preload" : "";
    }

    @Override // defpackage.zyd
    public boolean c() {
        return false;
    }

    @Override // defpackage.zyd
    public boolean d() {
        synchronized (this) {
            if (!this.b) {
                this.a = e();
            }
            this.b = true;
        }
        return this.a;
    }
}
