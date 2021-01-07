package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: yda  reason: default package */
public class yda {
    @JsonProperty("category")
    private final String mCategory;
    @JsonProperty("client_id")
    private final String mClientId;
    @JsonProperty("company")
    private final String mCompany;
    @JsonProperty("connection_label")
    private final String mConnectionLabel = "";
    @JsonProperty("integration_type")
    private final String mIntegrationType;
    @JsonProperty("model")
    private final String mModel;
    @JsonProperty("name")
    private final String mName;
    @JsonProperty("protocol")
    private final String mProtocol;
    @JsonProperty("sender_id")
    private final String mSenderId;
    @JsonProperty("transport_type")
    private final String mTransportType;
    @JsonProperty("version")
    private final String mVersion;

    /* renamed from: yda$b */
    public static class b {
        private final String a;
        private String b = "";
        private String c = "";
        private String d = "unknown";
        private String e = "unknown";
        private String f = "";
        private String g = "";
        private String h = "";
        private String i = "";
        private String j = "";

        public b(String str) {
            this.a = str == null ? "" : str;
        }

        public yda k() {
            return new yda(this, null);
        }

        public b l(String str) {
            if (str == null) {
                str = "unknown";
            }
            this.e = str;
            return this;
        }

        public b m(String str) {
            if (str == null) {
                str = "";
            }
            this.c = str;
            return this;
        }

        public b n(String str) {
            if (str == null) {
                str = "";
            }
            this.f = str;
            return this;
        }

        public b o(String str) {
            if (str == null) {
                str = "";
            }
            this.g = str;
            return this;
        }

        public b p(String str) {
            if (str == null) {
                str = "";
            }
            this.b = str;
            return this;
        }

        public b q(String str) {
            this.i = str;
            return this;
        }

        public b r(String str) {
            if (str == null) {
                str = "";
            }
            this.j = str;
            return this;
        }

        public b s(String str) {
            if (str == null) {
                str = "unknown";
            }
            this.d = str;
            return this;
        }

        public b t(String str) {
            if (str == null) {
                str = "";
            }
            this.h = str;
            return this;
        }
    }

    yda(b bVar, a aVar) {
        this.mIntegrationType = bVar.a;
        this.mClientId = bVar.c;
        this.mName = bVar.b;
        this.mTransportType = bVar.d;
        this.mCategory = bVar.e;
        this.mCompany = bVar.f;
        this.mModel = bVar.g;
        this.mVersion = bVar.h;
        this.mProtocol = bVar.i;
        this.mSenderId = bVar.j;
    }

    public String a() {
        return this.mCategory;
    }

    public String b() {
        return this.mClientId;
    }

    public String c() {
        return this.mCompany;
    }

    public String d() {
        return this.mIntegrationType;
    }

    public String e() {
        return this.mModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yda)) {
            return false;
        }
        yda yda = (yda) obj;
        if (!this.mIntegrationType.equals(yda.mIntegrationType) || !this.mClientId.equals(yda.mClientId) || !this.mName.equals(yda.mName) || !this.mTransportType.equals(yda.mTransportType)) {
            return false;
        }
        String str = this.mConnectionLabel;
        if (str == null ? yda.mConnectionLabel != null : !str.equals(yda.mConnectionLabel)) {
            return false;
        }
        if (this.mCategory.equals(yda.mCategory) && this.mCompany.equals(yda.mCompany) && this.mModel.equals(yda.mModel) && this.mProtocol.equals(yda.mProtocol) && this.mSenderId.equals(yda.mSenderId)) {
            return this.mVersion.equals(yda.mVersion);
        }
        return false;
    }

    public String f() {
        return this.mName;
    }

    public String g() {
        return this.mProtocol;
    }

    public String h() {
        return this.mSenderId;
    }

    public int hashCode() {
        int Y0 = je.Y0(this.mTransportType, je.Y0(this.mName, je.Y0(this.mClientId, this.mIntegrationType.hashCode() * 31, 31), 31), 31);
        String str = this.mConnectionLabel;
        return this.mSenderId.hashCode() + je.Y0(this.mProtocol, je.Y0(this.mVersion, je.Y0(this.mModel, je.Y0(this.mCompany, je.Y0(this.mCategory, (Y0 + (str != null ? str.hashCode() : 0)) * 31, 31), 31), 31), 31), 31);
    }

    public String i() {
        return this.mTransportType;
    }

    public String j() {
        return this.mVersion;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ExternalAccessoryDescription{mIntegrationType='");
        je.A(V0, this.mIntegrationType, '\'', ", mClientId='");
        je.A(V0, this.mClientId, '\'', ", mName='");
        je.A(V0, this.mName, '\'', ", mTransportType='");
        je.A(V0, this.mTransportType, '\'', ", mConnectionLabel='");
        je.A(V0, this.mConnectionLabel, '\'', ", mCategory='");
        je.A(V0, this.mCategory, '\'', ", mCompany='");
        je.A(V0, this.mCompany, '\'', ", mModel='");
        je.A(V0, this.mModel, '\'', ", mVersion='");
        je.A(V0, this.mVersion, '\'', ", mProtocol='");
        je.A(V0, this.mProtocol, '\'', ", mSenderId='");
        V0.append(this.mSenderId);
        V0.append('\'');
        V0.append('}');
        return V0.toString();
    }
}
