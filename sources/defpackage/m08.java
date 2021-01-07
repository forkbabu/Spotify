package defpackage;

import com.spotify.inappmessaging.ActionType;
import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.TriggerType;
import java.util.List;

/* renamed from: m08  reason: default package */
final class m08 extends e18 {
    private final List<FormatType> e;
    private final List<ActionType> f;
    private final List<TriggerType> g;

    m08(List<FormatType> list, List<ActionType> list2, List<TriggerType> list3) {
        if (list != null) {
            this.e = list;
            if (list2 != null) {
                this.f = list2;
                if (list3 != null) {
                    this.g = list3;
                    return;
                }
                throw new NullPointerException("Null triggersSupported");
            }
            throw new NullPointerException("Null actionsSupported");
        }
        throw new NullPointerException("Null formatsSupported");
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.e18
    public List<ActionType> a() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.e18
    public List<FormatType> b() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.e18
    public List<TriggerType> e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e18)) {
            return false;
        }
        e18 e18 = (e18) obj;
        if (!this.e.equals(e18.b()) || !this.f.equals(e18.a()) || !this.g.equals(e18.e())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("InAppConfiguration{formatsSupported=");
        V0.append(this.e);
        V0.append(", actionsSupported=");
        V0.append(this.f);
        V0.append(", triggersSupported=");
        return je.L0(V0, this.g, "}");
    }
}
