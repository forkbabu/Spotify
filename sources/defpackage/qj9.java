package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: qj9  reason: default package */
final class qj9 extends tj9 {
    private final String a;
    private final String b;

    qj9(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.tj9
    @JsonProperty("end_date")
    public String endDate() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tj9)) {
            return false;
        }
        tj9 tj9 = (tj9) obj;
        String str = this.a;
        if (str != null ? str.equals(tj9.startDate()) : tj9.startDate() == null) {
            String str2 = this.b;
            if (str2 == null) {
                if (tj9.endDate() == null) {
                    return true;
                }
            } else if (str2.equals(tj9.endDate())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // defpackage.tj9
    @JsonProperty("start_date")
    public String startDate() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("BadgeCampaign{startDate=");
        V0.append(this.a);
        V0.append(", endDate=");
        return je.I0(V0, this.b, "}");
    }
}
