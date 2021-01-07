package defpackage;

import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import defpackage.auc;
import kotlin.jvm.internal.h;

/* renamed from: ztc  reason: default package */
public final class ztc {
    private final auc a;
    private final String b;
    private final String c;
    private final IdentityV3$UserProfile d;

    public ztc() {
        this(null, null, null, null, 15);
    }

    public ztc(auc auc, String str, String str2, IdentityV3$UserProfile identityV3$UserProfile) {
        h.e(auc, "qnAState");
        this.a = auc;
        this.b = str;
        this.c = str2;
        this.d = identityV3$UserProfile;
    }

    public static ztc a(ztc ztc, auc auc, String str, String str2, IdentityV3$UserProfile identityV3$UserProfile, int i) {
        if ((i & 1) != 0) {
            auc = ztc.a;
        }
        if ((i & 2) != 0) {
            str = ztc.b;
        }
        String str3 = (i & 4) != 0 ? ztc.c : null;
        if ((i & 8) != 0) {
            identityV3$UserProfile = ztc.d;
        }
        ztc.getClass();
        h.e(auc, "qnAState");
        return new ztc(auc, str, str3, identityV3$UserProfile);
    }

    public final IdentityV3$UserProfile b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final auc e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztc)) {
            return false;
        }
        ztc ztc = (ztc) obj;
        return h.a(this.a, ztc.a) && h.a(this.b, ztc.b) && h.a(this.c, ztc.c) && h.a(this.d, ztc.d);
    }

    public int hashCode() {
        auc auc = this.a;
        int i = 0;
        int hashCode = (auc != null ? auc.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        IdentityV3$UserProfile identityV3$UserProfile = this.d;
        if (identityV3$UserProfile != null) {
            i = identityV3$UserProfile.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PodcastQnAModel(qnAState=");
        V0.append(this.a);
        V0.append(", draftReply=");
        V0.append(this.b);
        V0.append(", episodeUri=");
        V0.append(this.c);
        V0.append(", currentUserProfile=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }

    public ztc(auc auc, String str, String str2, IdentityV3$UserProfile identityV3$UserProfile, int i) {
        auc.a aVar = (i & 1) != 0 ? auc.a.a : null;
        int i2 = i & 2;
        str2 = (i & 4) != 0 ? null : str2;
        int i3 = i & 8;
        h.e(aVar, "qnAState");
        this.a = aVar;
        this.b = null;
        this.c = str2;
        this.d = null;
    }
}
