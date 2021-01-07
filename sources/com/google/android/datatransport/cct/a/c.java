package com.google.android.datatransport.cct.a;

import com.google.android.datatransport.cct.a.a;

/* access modifiers changed from: package-private */
public final class c extends a {
    private final Integer a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    /* access modifiers changed from: package-private */
    public static final class a extends a.AbstractC0084a {
        private Integer a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;

        a() {
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC0084a
        public a.AbstractC0084a a(Integer num) {
            this.a = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC0084a
        public a.AbstractC0084a b(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC0084a
        public a c() {
            return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC0084a
        public a.AbstractC0084a d(String str) {
            this.h = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC0084a
        public a.AbstractC0084a e(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC0084a
        public a.AbstractC0084a f(String str) {
            this.g = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC0084a
        public a.AbstractC0084a g(String str) {
            this.b = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC0084a
        public a.AbstractC0084a h(String str) {
            this.f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.a.AbstractC0084a
        public a.AbstractC0084a i(String str) {
            this.e = str;
            return this;
        }
    }

    /* synthetic */ c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    @Override // com.google.android.datatransport.cct.a.a
    public String b() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.a.a
    public String c() {
        return this.h;
    }

    @Override // com.google.android.datatransport.cct.a.a
    public String d() {
        return this.c;
    }

    @Override // com.google.android.datatransport.cct.a.a
    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        Integer num = this.a;
        if (num != null ? num.equals(((c) obj).a) : ((c) obj).a == null) {
            String str = this.b;
            if (str != null ? str.equals(((c) obj).b) : ((c) obj).b == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(((c) obj).c) : ((c) obj).c == null) {
                    String str3 = this.d;
                    if (str3 != null ? str3.equals(((c) obj).d) : ((c) obj).d == null) {
                        String str4 = this.e;
                        if (str4 != null ? str4.equals(((c) obj).e) : ((c) obj).e == null) {
                            String str5 = this.f;
                            if (str5 != null ? str5.equals(((c) obj).f) : ((c) obj).f == null) {
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(((c) obj).g) : ((c) obj).g == null) {
                                    String str7 = this.h;
                                    if (str7 == null) {
                                        if (((c) obj).h == null) {
                                            return true;
                                        }
                                    } else if (str7.equals(((c) obj).h)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.a.a
    public String f() {
        return this.b;
    }

    @Override // com.google.android.datatransport.cct.a.a
    public String g() {
        return this.f;
    }

    @Override // com.google.android.datatransport.cct.a.a
    public String h() {
        return this.e;
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 ^ i;
    }

    @Override // com.google.android.datatransport.cct.a.a
    public Integer i() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidClientInfo{sdkVersion=");
        V0.append(this.a);
        V0.append(", model=");
        V0.append(this.b);
        V0.append(", hardware=");
        V0.append(this.c);
        V0.append(", device=");
        V0.append(this.d);
        V0.append(", product=");
        V0.append(this.e);
        V0.append(", osBuild=");
        V0.append(this.f);
        V0.append(", manufacturer=");
        V0.append(this.g);
        V0.append(", fingerprint=");
        return je.I0(V0, this.h, "}");
    }
}
