package com.spotify.music.features.checkout.web;

import android.net.Uri;
import com.spotify.music.features.checkout.web.i;
import com.spotify.music.libs.viewuri.ViewUris;

/* access modifiers changed from: package-private */
public abstract class a extends i {
    private final ViewUris.SubView a;
    private final String b;
    private final Uri c;
    private final boolean f;
    private final String n;
    private final Integer o;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.checkout.web.a$a  reason: collision with other inner class name */
    public static class C0215a extends i.a {
        private ViewUris.SubView a;
        private String b;
        private Uri c;
        private Boolean d;
        private String e;
        private Integer f;

        C0215a() {
        }

        @Override // com.spotify.music.features.checkout.web.i.a
        public i a() {
            String str = this.a == null ? " subView" : "";
            if (this.c == null) {
                str = je.x0(str, " uri");
            }
            if (this.d == null) {
                str = je.x0(str, " shouldPrependMarketCode");
            }
            if (this.e == null) {
                str = je.x0(str, " applicationId");
            }
            if (this.f == null) {
                str = je.x0(str, " applicationVersion");
            }
            if (str.isEmpty()) {
                return new f(this.a, this.b, this.c, this.d.booleanValue(), this.e, this.f);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.music.features.checkout.web.i.a
        public i.a b(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null applicationId");
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.music.features.checkout.web.i.a
        public i.a c(Integer num) {
            if (num != null) {
                this.f = num;
                return this;
            }
            throw new NullPointerException("Null applicationVersion");
        }

        @Override // com.spotify.music.features.checkout.web.i.a
        public i.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.checkout.web.i.a
        public i.a f(ViewUris.SubView subView) {
            if (subView != null) {
                this.a = subView;
                return this;
            }
            throw new NullPointerException("Null subView");
        }

        @Override // com.spotify.music.features.checkout.web.i.a
        public i.a g(String str) {
            this.b = str;
            return this;
        }

        @Override // com.spotify.music.features.checkout.web.i.a
        public i.a h(Uri uri) {
            if (uri != null) {
                this.c = uri;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    a(ViewUris.SubView subView, String str, Uri uri, boolean z, String str2, Integer num) {
        if (subView != null) {
            this.a = subView;
            this.b = str;
            if (uri != null) {
                this.c = uri;
                this.f = z;
                if (str2 != null) {
                    this.n = str2;
                    if (num != null) {
                        this.o = num;
                        return;
                    }
                    throw new NullPointerException("Null applicationVersion");
                }
                throw new NullPointerException("Null applicationId");
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null subView");
    }

    @Override // com.spotify.music.features.checkout.web.i
    public String a() {
        return this.n;
    }

    @Override // com.spotify.music.features.checkout.web.i
    public Integer b() {
        return this.o;
    }

    @Override // com.spotify.music.features.checkout.web.i
    public boolean e() {
        return this.f;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.a.equals(iVar.f()) || ((str = this.b) != null ? !str.equals(iVar.g()) : iVar.g() != null) || !this.c.equals(iVar.h()) || this.f != iVar.e() || !this.n.equals(iVar.a()) || !this.o.equals(iVar.b())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.checkout.web.i
    public ViewUris.SubView f() {
        return this.a;
    }

    @Override // com.spotify.music.features.checkout.web.i
    public String g() {
        return this.b;
    }

    @Override // com.spotify.music.features.checkout.web.i
    public Uri h() {
        return this.c;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return ((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("PremiumSignUpConfiguration{subView=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", uri=");
        V0.append(this.c);
        V0.append(", shouldPrependMarketCode=");
        V0.append(this.f);
        V0.append(", applicationId=");
        V0.append(this.n);
        V0.append(", applicationVersion=");
        V0.append(this.o);
        V0.append("}");
        return V0.toString();
    }
}
