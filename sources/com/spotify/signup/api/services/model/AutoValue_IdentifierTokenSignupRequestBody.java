package com.spotify.signup.api.services.model;

import com.spotify.signup.api.services.model.EmailSignupRequestBody;
import com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody;

final class AutoValue_IdentifierTokenSignupRequestBody extends IdentifierTokenSignupRequestBody {
    private final String appVersion;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String creationPoint;
    private final String email;
    private final EmailSignupRequestBody.Gender gender;
    private final boolean iAgree;
    private final String identifierToken;
    private final String key;
    private final String name;

    /* access modifiers changed from: package-private */
    public static final class Builder extends IdentifierTokenSignupRequestBody.Builder {
        private String appVersion;
        private Integer birthDay;
        private Integer birthMonth;
        private Integer birthYear;
        private String creationPoint;
        private String email;
        private EmailSignupRequestBody.Gender gender;
        private Boolean iAgree;
        private String identifierToken;
        private String key;
        private String name;

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder
        public IdentifierTokenSignupRequestBody.Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder
        public IdentifierTokenSignupRequestBody.Builder birthDay(int i) {
            this.birthDay = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder
        public IdentifierTokenSignupRequestBody.Builder birthMonth(int i) {
            this.birthMonth = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder
        public IdentifierTokenSignupRequestBody.Builder birthYear(int i) {
            this.birthYear = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder
        public IdentifierTokenSignupRequestBody build() {
            String str = this.identifierToken == null ? " identifierToken" : "";
            if (this.gender == null) {
                str = je.x0(str, " gender");
            }
            if (this.birthDay == null) {
                str = je.x0(str, " birthDay");
            }
            if (this.birthMonth == null) {
                str = je.x0(str, " birthMonth");
            }
            if (this.birthYear == null) {
                str = je.x0(str, " birthYear");
            }
            if (this.iAgree == null) {
                str = je.x0(str, " iAgree");
            }
            if (str.isEmpty()) {
                return new AutoValue_IdentifierTokenSignupRequestBody(this.identifierToken, this.email, this.name, this.gender, this.birthDay.intValue(), this.birthMonth.intValue(), this.birthYear.intValue(), this.iAgree.booleanValue(), this.key, this.creationPoint, this.appVersion);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder
        public IdentifierTokenSignupRequestBody.Builder creationPoint(String str) {
            this.creationPoint = str;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder
        public IdentifierTokenSignupRequestBody.Builder email(String str) {
            this.email = str;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder
        public IdentifierTokenSignupRequestBody.Builder gender(EmailSignupRequestBody.Gender gender2) {
            if (gender2 != null) {
                this.gender = gender2;
                return this;
            }
            throw new NullPointerException("Null gender");
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder
        public IdentifierTokenSignupRequestBody.Builder iAgree(boolean z) {
            this.iAgree = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder
        public IdentifierTokenSignupRequestBody.Builder identifierToken(String str) {
            if (str != null) {
                this.identifierToken = str;
                return this;
            }
            throw new NullPointerException("Null identifierToken");
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder
        public IdentifierTokenSignupRequestBody.Builder key(String str) {
            this.key = str;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody.Builder
        public IdentifierTokenSignupRequestBody.Builder name(String str) {
            this.name = str;
            return this;
        }

        Builder() {
        }

        private Builder(IdentifierTokenSignupRequestBody identifierTokenSignupRequestBody) {
            this.identifierToken = identifierTokenSignupRequestBody.identifierToken();
            this.email = identifierTokenSignupRequestBody.email();
            this.name = identifierTokenSignupRequestBody.name();
            this.gender = identifierTokenSignupRequestBody.gender();
            this.birthDay = Integer.valueOf(identifierTokenSignupRequestBody.birthDay());
            this.birthMonth = Integer.valueOf(identifierTokenSignupRequestBody.birthMonth());
            this.birthYear = Integer.valueOf(identifierTokenSignupRequestBody.birthYear());
            this.iAgree = Boolean.valueOf(identifierTokenSignupRequestBody.iAgree());
            this.key = identifierTokenSignupRequestBody.key();
            this.creationPoint = identifierTokenSignupRequestBody.creationPoint();
            this.appVersion = identifierTokenSignupRequestBody.appVersion();
        }
    }

    @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody
    public String appVersion() {
        return this.appVersion;
    }

    @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody
    public int birthDay() {
        return this.birthDay;
    }

    @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody
    public int birthMonth() {
        return this.birthMonth;
    }

    @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody
    public int birthYear() {
        return this.birthYear;
    }

    @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody
    public String creationPoint() {
        return this.creationPoint;
    }

    @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody
    public String email() {
        return this.email;
    }

    @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody
    public EmailSignupRequestBody.Gender gender() {
        return this.gender;
    }

    @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody
    public boolean iAgree() {
        return this.iAgree;
    }

    @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody
    public String identifierToken() {
        return this.identifierToken;
    }

    @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody
    public String key() {
        return this.key;
    }

    @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody
    public String name() {
        return this.name;
    }

    @Override // com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody
    public IdentifierTokenSignupRequestBody.Builder toBuilder() {
        return new Builder(this);
    }

    private AutoValue_IdentifierTokenSignupRequestBody(String str, String str2, String str3, EmailSignupRequestBody.Gender gender2, int i, int i2, int i3, boolean z, String str4, String str5, String str6) {
        this.identifierToken = str;
        this.email = str2;
        this.name = str3;
        this.gender = gender2;
        this.birthDay = i;
        this.birthMonth = i2;
        this.birthYear = i3;
        this.iAgree = z;
        this.key = str4;
        this.creationPoint = str5;
        this.appVersion = str6;
    }
}
