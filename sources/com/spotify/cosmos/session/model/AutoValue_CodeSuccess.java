package com.spotify.cosmos.session.model;

final class AutoValue_CodeSuccess extends CodeSuccess {
    private final String email;
    private final Boolean emailAlreadyRegistered;
    private final String identifierToken;
    private final String name;

    AutoValue_CodeSuccess(String str, String str2, String str3, Boolean bool) {
        this.identifierToken = str;
        this.name = str2;
        this.email = str3;
        this.emailAlreadyRegistered = bool;
    }

    @Override // com.spotify.cosmos.session.model.CodeSuccess
    public String email() {
        return this.email;
    }

    @Override // com.spotify.cosmos.session.model.CodeSuccess
    public Boolean emailAlreadyRegistered() {
        return this.emailAlreadyRegistered;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CodeSuccess)) {
            return false;
        }
        CodeSuccess codeSuccess = (CodeSuccess) obj;
        String str = this.identifierToken;
        if (str != null ? str.equals(codeSuccess.identifierToken()) : codeSuccess.identifierToken() == null) {
            String str2 = this.name;
            if (str2 != null ? str2.equals(codeSuccess.name()) : codeSuccess.name() == null) {
                String str3 = this.email;
                if (str3 != null ? str3.equals(codeSuccess.email()) : codeSuccess.email() == null) {
                    Boolean bool = this.emailAlreadyRegistered;
                    if (bool == null) {
                        if (codeSuccess.emailAlreadyRegistered() == null) {
                            return true;
                        }
                    } else if (bool.equals(codeSuccess.emailAlreadyRegistered())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.identifierToken;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.name;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.email;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Boolean bool = this.emailAlreadyRegistered;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 ^ i;
    }

    @Override // com.spotify.cosmos.session.model.CodeSuccess
    public String identifierToken() {
        return this.identifierToken;
    }

    @Override // com.spotify.cosmos.session.model.CodeSuccess
    public String name() {
        return this.name;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CodeSuccess{identifierToken=");
        V0.append(this.identifierToken);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", email=");
        V0.append(this.email);
        V0.append(", emailAlreadyRegistered=");
        V0.append(this.emailAlreadyRegistered);
        V0.append("}");
        return V0.toString();
    }
}
