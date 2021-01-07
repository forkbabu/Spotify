package com.spotify.mobile.android.video.drm;

import android.os.Build;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.drm.o;
import com.google.android.exoplayer2.drm.r;
import com.google.android.exoplayer2.drm.s;
import com.google.android.exoplayer2.drm.t;
import com.spotify.base.java.logging.Logger;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class DrmUtil {
    public static final Set<UUID> a;
    public static final UUID b;

    public static class UnexpectedDrmException extends Exception {
        private static final long serialVersionUID = -9191534019891635782L;

        public UnexpectedDrmException(Throwable th) {
            super(th);
        }
    }

    static {
        UUID fromString = UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed");
        b = fromString;
        HashSet hashSet = new HashSet();
        hashSet.add(fromString);
        a = Collections.unmodifiableSet(hashSet);
    }

    public static r<s> a() {
        if (Build.VERSION.SDK_INT < 18) {
            return new o();
        }
        int i = 2;
        while (i > 0) {
            i--;
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23) {
                    return e.a();
                }
                if (i2 >= 21) {
                    return d.a();
                }
                return b();
            } catch (UnsupportedDrmException e) {
                StringBuilder V0 = je.V0("Failed to instantiate a FrameworkMediaDrm for uuid: ");
                V0.append(b);
                V0.append(".");
                Logger.e(e, V0.toString(), new Object[0]);
                return new o();
            } catch (UnexpectedDrmException unused) {
            } catch (Exception e2) {
                StringBuilder V02 = je.V0("Failed to instantiate a FrameworkMediaDrm for uuid: ");
                V02.append(b);
                V02.append(".");
                Logger.e(e2, V02.toString(), new Object[0]);
                return new o();
            }
        }
        return new o();
    }

    static r<s> b() {
        t n = t.n(b);
        if (!"L3".equals(n.m("securityLevel"))) {
            n.o("securityLevel", "L3");
        }
        return n;
    }
}
