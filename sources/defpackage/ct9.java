package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: ct9  reason: default package */
final class ct9 extends et9 {
    private final String a;
    private final String b;

    ct9(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null value");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof et9)) {
            return false;
        }
        et9 et9 = (et9) obj;
        if (!this.a.equals(et9.value()) || !this.b.equals(et9.name())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // defpackage.et9
    @JsonProperty("name")
    public String name() {
        return this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HomethingEnumSettingValue{value=");
        V0.append(this.a);
        V0.append(", name=");
        return je.I0(V0, this.b, "}");
    }

    @Override // defpackage.et9
    @JsonProperty("value")
    public String value() {
        return this.a;
    }
}
