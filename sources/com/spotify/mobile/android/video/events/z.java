package com.spotify.mobile.android.video.events;

/* access modifiers changed from: package-private */
public final class z extends y {
    private final int a;
    private final String b;

    z(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // com.spotify.mobile.android.video.events.y
    public int a() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.video.events.y
    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.a == yVar.a()) {
            String str = this.b;
            if (str == null) {
                if (yVar.b() == null) {
                    return true;
                }
            } else if (str.equals(yVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("AudioFormat{bitrate=");
        V0.append(this.a);
        V0.append(", codecs=");
        return je.I0(V0, this.b, "}");
    }
}
