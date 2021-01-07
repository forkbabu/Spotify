package defpackage;

import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.TriggerType;

/* renamed from: ap0  reason: default package */
abstract class ap0 extends gp0 {
    private final TriggerType b;
    private final String c;
    private final FormatType f;

    ap0(TriggerType triggerType, String str, FormatType formatType) {
        if (triggerType != null) {
            this.b = triggerType;
            if (str != null) {
                this.c = str;
                if (formatType != null) {
                    this.f = formatType;
                    return;
                }
                throw new NullPointerException("Null format");
            }
            throw new NullPointerException("Null pattern");
        }
        throw new NullPointerException("Null type");
    }

    @Override // defpackage.gp0
    public FormatType b() {
        return this.f;
    }

    @Override // defpackage.gp0
    public String c() {
        return this.c;
    }

    @Override // defpackage.gp0
    public TriggerType e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gp0)) {
            return false;
        }
        gp0 gp0 = (gp0) obj;
        if (!this.b.equals(gp0.e()) || !this.c.equals(gp0.c()) || !this.f.equals(gp0.b())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Trigger{type=");
        V0.append(this.b);
        V0.append(", pattern=");
        V0.append(this.c);
        V0.append(", format=");
        V0.append(this.f);
        V0.append("}");
        return V0.toString();
    }
}
