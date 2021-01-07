package com.spotify.mobile.android.video.events;

/* access modifiers changed from: package-private */
public final class b0 extends j0 {
    private final int a;
    private final int b;
    private final int c;
    private final float d;
    private final String e;

    b0(int i, int i2, int i3, float f, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = str;
    }

    @Override // com.spotify.mobile.android.video.events.j0
    public int a() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.video.events.j0
    public String b() {
        return this.e;
    }

    @Override // com.spotify.mobile.android.video.events.j0
    public float c() {
        return this.d;
    }

    @Override // com.spotify.mobile.android.video.events.j0
    public int d() {
        return this.c;
    }

    @Override // com.spotify.mobile.android.video.events.j0
    public int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.a == j0Var.a() && this.b == j0Var.e() && this.c == j0Var.d() && Float.floatToIntBits(this.d) == Float.floatToIntBits(j0Var.c())) {
            String str = this.e;
            if (str == null) {
                if (j0Var.b() == null) {
                    return true;
                }
            } else if (str.equals(j0Var.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int floatToIntBits = (((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d)) * 1000003;
        String str = this.e;
        return floatToIntBits ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("VideoFormat{bitrate=");
        V0.append(this.a);
        V0.append(", width=");
        V0.append(this.b);
        V0.append(", height=");
        V0.append(this.c);
        V0.append(", frameRate=");
        V0.append(this.d);
        V0.append(", codecs=");
        return je.I0(V0, this.e, "}");
    }
}
