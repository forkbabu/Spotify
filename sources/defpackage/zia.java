package defpackage;

import android.os.Bundle;

/* renamed from: zia  reason: default package */
final class zia extends bja {
    private final int a;
    private final Bundle b;

    zia(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    @Override // defpackage.bja
    public int a() {
        return this.a;
    }

    @Override // defpackage.bja
    public Bundle b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bja)) {
            return false;
        }
        bja bja = (bja) obj;
        if (this.a == bja.a()) {
            Bundle bundle = this.b;
            if (bundle == null) {
                if (bja.b() == null) {
                    return true;
                }
            } else if (bundle.equals(bja.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        Bundle bundle = this.b;
        return i ^ (bundle == null ? 0 : bundle.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("CommandResult{code=");
        V0.append(this.a);
        V0.append(", data=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
