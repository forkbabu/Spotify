package defpackage;

import com.spotify.inappmessaging.TriggerType;

/* access modifiers changed from: package-private */
/* renamed from: fo0  reason: default package */
public final class fo0 extends ho0 {
    private final String a;
    private final TriggerType b;

    fo0(String str, TriggerType triggerType) {
        if (str != null) {
            this.a = str;
            if (triggerType != null) {
                this.b = triggerType;
                return;
            }
            throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null pattern");
    }

    @Override // defpackage.ho0
    public String a() {
        return this.a;
    }

    @Override // defpackage.ho0
    public TriggerType b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ho0)) {
            return false;
        }
        ho0 ho0 = (ho0) obj;
        if (!this.a.equals(ho0.a()) || !this.b.equals(ho0.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PendingTrigger{pattern=");
        V0.append(this.a);
        V0.append(", type=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
