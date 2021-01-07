package com.spotify.mobile.android.spotlets.appprotocol.util;

import com.spotify.mobile.android.spotlets.appprotocol.util.OptionExtrasUtil;

/* access modifiers changed from: package-private */
public final class a extends OptionExtrasUtil.a {
    private final int a;

    a(int i) {
        this.a = i;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.util.OptionExtrasUtil.a
    public int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OptionExtrasUtil.a) || this.a != ((OptionExtrasUtil.a) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a ^ 1000003;
    }

    public String toString() {
        return je.B0(je.V0("TrackIndex{index="), this.a, "}");
    }
}
