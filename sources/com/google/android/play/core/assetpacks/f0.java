package com.google.android.play.core.assetpacks;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class f0 extends b {
    private final long a;
    private final Map<String, AssetPackState> b;

    f0(long j, Map<String, AssetPackState> map) {
        this.a = j;
        this.b = map;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final Map<String, AssetPackState> a() {
        return this.b;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.b() && this.b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        return je.I0(sb, valueOf, "}");
    }
}
