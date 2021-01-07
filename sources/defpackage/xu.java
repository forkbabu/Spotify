package defpackage;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.m;
import java.util.Arrays;

/* renamed from: xu  reason: default package */
public final class xu implements a.d {
    @RecentlyNonNull
    public static final xu a = new xu();

    private xu() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xu)) {
            return false;
        }
        xu xuVar = (xu) obj;
        return m.a(null, null) && m.a(null, null) && m.a(null, null) && m.a(null, null) && m.a(null, null);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, bool, null, bool, bool, null, null, null, null});
    }
}
