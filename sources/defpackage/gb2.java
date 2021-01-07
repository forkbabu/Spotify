package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: gb2  reason: default package */
final class gb2 extends cb2 {
    private final String a;
    private final String b;
    private final Drawable c;
    private final String d;

    gb2(String str, String str2, Drawable drawable, String str3) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = drawable;
            if (str3 != null) {
                this.d = str3;
                return;
            }
            throw new NullPointerException("Null bundleKey");
        }
        throw new NullPointerException("Null title");
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cb2
    public String a() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cb2
    public Drawable b() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cb2
    public String c() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cb2
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cb2)) {
            return false;
        }
        cb2 cb2 = (cb2) obj;
        if (!this.a.equals(cb2.d()) || ((str = this.b) != null ? !str.equals(cb2.c()) : cb2.c() != null) || ((drawable = this.c) != null ? !drawable.equals(cb2.b()) : cb2.b() != null) || !this.d.equals(cb2.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Drawable drawable = this.c;
        if (drawable != null) {
            i = drawable.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ActiveSessionBannerViewModel{title=");
        V0.append(this.a);
        V0.append(", subtitle=");
        V0.append(this.b);
        V0.append(", icon=");
        V0.append(this.c);
        V0.append(", bundleKey=");
        return je.I0(V0, this.d, "}");
    }
}
