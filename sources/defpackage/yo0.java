package defpackage;

import com.spotify.inappmessaging.ActionType;

/* renamed from: yo0  reason: default package */
abstract class yo0 extends ep0 {
    private final ActionType a;
    private final String b;
    private final String c;
    private final boolean f;

    yo0(ActionType actionType, String str, String str2, boolean z) {
        if (actionType != null) {
            this.a = actionType;
            this.b = str;
            this.c = str2;
            this.f = z;
            return;
        }
        throw new NullPointerException("Null action");
    }

    @Override // defpackage.ep0
    public ActionType b() {
        return this.a;
    }

    @Override // defpackage.ep0
    public String c() {
        return this.c;
    }

    @Override // defpackage.ep0
    public String e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ep0)) {
            return false;
        }
        ep0 ep0 = (ep0) obj;
        if (!this.a.equals(ep0.b()) || ((str = this.b) != null ? !str.equals(ep0.e()) : ep0.e() != null) || ((str2 = this.c) != null ? !str2.equals(ep0.c()) : ep0.c() != null) || this.f != ep0.f()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ep0
    public boolean f() {
        return this.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ (this.f ? 1231 : 1237);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ClickAction{action=");
        V0.append(this.a);
        V0.append(", url=");
        V0.append(this.b);
        V0.append(", trackingUrl=");
        V0.append(this.c);
        V0.append(", shouldDismiss=");
        return je.P0(V0, this.f, "}");
    }
}
