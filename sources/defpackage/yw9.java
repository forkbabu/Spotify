package defpackage;

import com.google.common.base.MoreObjects;

/* renamed from: yw9  reason: default package */
public class yw9 {
    private final boolean a;

    public yw9(boolean z, boolean z2) {
        MoreObjects.checkArgument(!z2 || z, "must have Java reporting enabled if native reporting is enabled");
        this.a = z;
    }

    public boolean a() {
        return this.a;
    }
}
