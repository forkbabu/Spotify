package com.spotify.mobile.android.video.offline;

import com.spotify.mobile.android.video.offline.f0;

final class o extends f0 {
    private final int a;

    /* access modifiers changed from: package-private */
    public static final class b extends f0.a {
        private Integer a;

        b() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.mobile.android.video.offline.f0.a
        public f0 a() {
            String str = this.a == null ? " maximumBitrate" : "";
            if (str.isEmpty()) {
                return new o(this.a.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.mobile.android.video.offline.f0.a
        public int c() {
            Integer num = this.a;
            if (num != null) {
                return num.intValue();
            }
            throw new IllegalStateException("Property \"maximumBitrate\" has not been set");
        }

        @Override // com.spotify.mobile.android.video.offline.f0.a
        public f0.a d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }
    }

    o(int i, a aVar) {
        this.a = i;
    }

    @Override // com.spotify.mobile.android.video.offline.f0
    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0) || this.a != ((f0) obj).b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a ^ 1000003;
    }

    public String toString() {
        return je.B0(je.V0("DownloadOptions{maximumBitrate="), this.a, "}");
    }
}
