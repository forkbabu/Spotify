package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;

public final class s {
    u a;

    public s(String str, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new t(str, i, i2);
        } else {
            this.a = new u(str, i, i2);
        }
    }

    public String a() {
        return this.a.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        return this.a.equals(((s) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public s(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.a = new t(remoteUserInfo);
    }
}
