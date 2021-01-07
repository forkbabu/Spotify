package com.spotify.mobile.android.waze.model;

import com.spotify.mobile.android.waze.model.WazeBannerModel;

final class a extends WazeBannerModel {
    private final WazeBannerModel.Type a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    static final class b extends WazeBannerModel.a {
        private WazeBannerModel.Type a;
        private Integer b;
        private Integer c;
        private String d;
        private String e;
        private String f;
        private String g;

        b() {
        }

        @Override // com.spotify.mobile.android.waze.model.WazeBannerModel.a
        public WazeBannerModel.a a(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.mobile.android.waze.model.WazeBannerModel.a
        public WazeBannerModel b() {
            String str = this.a == null ? " type" : "";
            if (this.b == null) {
                str = je.x0(str, " icon");
            }
            if (this.c == null) {
                str = je.x0(str, " action");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b.intValue(), this.c.intValue(), this.d, this.e, this.f, this.g, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.mobile.android.waze.model.WazeBannerModel.a
        public WazeBannerModel.a c(String str) {
            this.d = str;
            return this;
        }

        @Override // com.spotify.mobile.android.waze.model.WazeBannerModel.a
        public WazeBannerModel.a d(String str) {
            this.e = str;
            return this;
        }

        @Override // com.spotify.mobile.android.waze.model.WazeBannerModel.a
        public WazeBannerModel.a e(String str) {
            this.f = str;
            return this;
        }

        @Override // com.spotify.mobile.android.waze.model.WazeBannerModel.a
        public WazeBannerModel.a f(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.mobile.android.waze.model.WazeBannerModel.a
        public WazeBannerModel.a g(String str) {
            this.g = str;
            return this;
        }

        public WazeBannerModel.a h(WazeBannerModel.Type type) {
            if (type != null) {
                this.a = type;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    a(WazeBannerModel.Type type, int i, int i2, String str, String str2, String str3, String str4, C0202a aVar) {
        this.a = type;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    @Override // com.spotify.mobile.android.waze.model.WazeBannerModel
    public int a() {
        return this.c;
    }

    @Override // com.spotify.mobile.android.waze.model.WazeBannerModel
    public String c() {
        return this.d;
    }

    @Override // com.spotify.mobile.android.waze.model.WazeBannerModel
    public String d() {
        return this.e;
    }

    @Override // com.spotify.mobile.android.waze.model.WazeBannerModel
    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WazeBannerModel)) {
            return false;
        }
        WazeBannerModel wazeBannerModel = (WazeBannerModel) obj;
        if (this.a.equals(wazeBannerModel.h()) && this.b == wazeBannerModel.f() && this.c == wazeBannerModel.a() && ((str = this.d) != null ? str.equals(wazeBannerModel.c()) : wazeBannerModel.c() == null) && ((str2 = this.e) != null ? str2.equals(wazeBannerModel.d()) : wazeBannerModel.d() == null) && ((str3 = this.f) != null ? str3.equals(wazeBannerModel.e()) : wazeBannerModel.e() == null)) {
            String str4 = this.g;
            if (str4 == null) {
                if (wazeBannerModel.g() == null) {
                    return true;
                }
            } else if (str4.equals(wazeBannerModel.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.mobile.android.waze.model.WazeBannerModel
    public int f() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.waze.model.WazeBannerModel
    public String g() {
        return this.g;
    }

    @Override // com.spotify.mobile.android.waze.model.WazeBannerModel
    public WazeBannerModel.Type h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        String str = this.d;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("WazeBannerModel{type=");
        V0.append(this.a);
        V0.append(", icon=");
        V0.append(this.b);
        V0.append(", action=");
        V0.append(this.c);
        V0.append(", distance=");
        V0.append(this.d);
        V0.append(", distanceDisplay=");
        V0.append(this.e);
        V0.append(", exit=");
        V0.append(this.f);
        V0.append(", text=");
        return je.I0(V0, this.g, "}");
    }
}
