package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.model.GaiaDevice;
import java.util.Arrays;

/* renamed from: gba  reason: default package */
public final class gba {
    private final int a;
    private final Optional<GaiaDevice> b;

    private gba(int i, Optional<GaiaDevice> optional) {
        this.a = i;
        this.b = optional;
    }

    public static gba a() {
        return new gba(1, Optional.absent());
    }

    public static gba b(GaiaDevice gaiaDevice) {
        return new gba(g(gaiaDevice) ? 5 : 4, Optional.of(gaiaDevice));
    }

    public static gba c(GaiaDevice gaiaDevice) {
        return new gba(g(gaiaDevice) ? 3 : 2, Optional.of(gaiaDevice));
    }

    public static gba d() {
        return new gba(0, Optional.absent());
    }

    private static boolean g(GaiaDevice gaiaDevice) {
        DeviceType type = gaiaDevice.getType();
        return DeviceType.GaiaTypes.CAST_VIDEO == type || DeviceType.GaiaTypes.CAST_AUDIO == type;
    }

    public GaiaDevice e() {
        return this.b.orNull();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gba.class != obj.getClass()) {
            return false;
        }
        gba gba = (gba) obj;
        if (this.a != gba.a || !this.b.equals(gba.b)) {
            return false;
        }
        return true;
    }

    public int f() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public String toString() {
        StringBuilder V0 = je.V0("ConnectEvent{state=");
        V0.append(this.a);
        V0.append(", device=");
        return je.H0(V0, this.b.isPresent() ? this.b.get().getName() : null, '}');
    }
}
