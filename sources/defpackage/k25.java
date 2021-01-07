package defpackage;

import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

/* renamed from: k25  reason: default package */
public final class k25 extends p25 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final l25 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k25(String str, String str2, String str3, String str4, String str5, l25 l25) {
        super(null);
        h.e(str, "id");
        h.e(str2, "title");
        h.e(str3, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(str4, "iconUrl");
        h.e(str5, "deliveryTime");
        h.e(l25, "itemContext");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = l25;
    }

    @Override // defpackage.p25
    public String a() {
        return this.a;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final l25 d() {
        return this.f;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k25)) {
            return false;
        }
        k25 k25 = (k25) obj;
        return h.a(this.a, k25.a) && h.a(this.b, k25.b) && h.a(this.c, k25.c) && h.a(this.d, k25.d) && h.a(this.e, k25.e) && h.a(this.f, k25.f);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        l25 l25 = this.f;
        if (l25 != null) {
            i = l25.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AutomatedMessagingItem(id=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", subtitle=");
        V0.append(this.c);
        V0.append(", iconUrl=");
        V0.append(this.d);
        V0.append(", deliveryTime=");
        V0.append(this.e);
        V0.append(", itemContext=");
        V0.append(this.f);
        V0.append(")");
        return V0.toString();
    }
}
