package com.spotify.signup.api.services.model;

import com.spotify.signup.api.services.model.EmailSignupRequestBody;

final class AutoValue_EmailSignupRequestBody extends EmailSignupRequestBody {
    private final String appVersion;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final Boolean collectPersonalInformation;
    private final String creationPoint;
    private final String email;
    private final EmailSignupRequestBody.Gender gender;
    private final boolean iAgree;
    private final String key;
    private final String name;
    private final String password;
    private final String passwordRepeat;
    private final Boolean thirdPartyDataProvision;

    /* access modifiers changed from: package-private */
    public static final class Builder extends EmailSignupRequestBody.Builder {
        private String appVersion;
        private Integer birthDay;
        private Integer birthMonth;
        private Integer birthYear;
        private Boolean collectPersonalInformation;
        private String creationPoint;
        private String email;
        private EmailSignupRequestBody.Gender gender;
        private Boolean iAgree;
        private String key;
        private String name;
        private String password;
        private String passwordRepeat;
        private Boolean thirdPartyDataProvision;

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody.Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody.Builder birthDay(int i) {
            this.birthDay = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody.Builder birthMonth(int i) {
            this.birthMonth = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody.Builder birthYear(int i) {
            this.birthYear = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody build() {
            String str = this.email == null ? " email" : "";
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
            if (this.password == null) {
                str = je.x0(str, " password");
            }
            if (this.passwordRepeat == null) {
                str = je.x0(str, " passwordRepeat");
            }
            if (this.iAgree == null) {
                str = je.x0(str, " iAgree");
            }
            if (str.isEmpty()) {
                return new AutoValue_EmailSignupRequestBody(this.email, this.gender, this.birthDay.intValue(), this.birthMonth.intValue(), this.birthYear.intValue(), this.password, this.passwordRepeat, this.iAgree.booleanValue(), this.collectPersonalInformation, this.thirdPartyDataProvision, this.key, this.creationPoint, this.appVersion, this.name);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody.Builder collectPersonalInformation(Boolean bool) {
            this.collectPersonalInformation = bool;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody.Builder creationPoint(String str) {
            this.creationPoint = str;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody.Builder email(String str) {
            if (str != null) {
                this.email = str;
                return this;
            }
            throw new NullPointerException("Null email");
        }

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody.Builder gender(EmailSignupRequestBody.Gender gender2) {
            if (gender2 != null) {
                this.gender = gender2;
                return this;
            }
            throw new NullPointerException("Null gender");
        }

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody.Builder iAgree(boolean z) {
            this.iAgree = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody.Builder key(String str) {
            this.key = str;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody.Builder name(String str) {
            this.name = str;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody.Builder password(String str) {
            if (str != null) {
                this.password = str;
                return this;
            }
            throw new NullPointerException("Null password");
        }

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody.Builder passwordRepeat(String str) {
            if (str != null) {
                this.passwordRepeat = str;
                return this;
            }
            throw new NullPointerException("Null passwordRepeat");
        }

        @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody.Builder
        public EmailSignupRequestBody.Builder thirdPartyDataProvision(Boolean bool) {
            this.thirdPartyDataProvision = bool;
            return this;
        }

        Builder() {
        }

        private Builder(EmailSignupRequestBody emailSignupRequestBody) {
            this.email = emailSignupRequestBody.email();
            this.gender = emailSignupRequestBody.gender();
            this.birthDay = Integer.valueOf(emailSignupRequestBody.birthDay());
            this.birthMonth = Integer.valueOf(emailSignupRequestBody.birthMonth());
            this.birthYear = Integer.valueOf(emailSignupRequestBody.birthYear());
            this.password = emailSignupRequestBody.password();
            this.passwordRepeat = emailSignupRequestBody.passwordRepeat();
            this.iAgree = Boolean.valueOf(emailSignupRequestBody.iAgree());
            this.collectPersonalInformation = emailSignupRequestBody.collectPersonalInformation();
            this.thirdPartyDataProvision = emailSignupRequestBody.thirdPartyDataProvision();
            this.key = emailSignupRequestBody.key();
            this.creationPoint = emailSignupRequestBody.creationPoint();
            this.appVersion = emailSignupRequestBody.appVersion();
            this.name = emailSignupRequestBody.name();
        }
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public String appVersion() {
        return this.appVersion;
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public int birthDay() {
        return this.birthDay;
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public int birthMonth() {
        return this.birthMonth;
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public int birthYear() {
        return this.birthYear;
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public Boolean collectPersonalInformation() {
        return this.collectPersonalInformation;
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public String creationPoint() {
        return this.creationPoint;
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public String email() {
        return this.email;
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public EmailSignupRequestBody.Gender gender() {
        return this.gender;
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public boolean iAgree() {
        return this.iAgree;
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public String key() {
        return this.key;
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public String name() {
        return this.name;
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public String password() {
        return this.password;
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public String passwordRepeat() {
        return this.passwordRepeat;
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public Boolean thirdPartyDataProvision() {
        return this.thirdPartyDataProvision;
    }

    @Override // com.spotify.signup.api.services.model.EmailSignupRequestBody
    public EmailSignupRequestBody.Builder toBuilder() {
        return new Builder(this);
    }

    private AutoValue_EmailSignupRequestBody(String str, EmailSignupRequestBody.Gender gender2, int i, int i2, int i3, String str2, String str3, boolean z, Boolean bool, Boolean bool2, String str4, String str5, String str6, String str7) {
        this.email = str;
        this.gender = gender2;
        this.birthDay = i;
        this.birthMonth = i2;
        this.birthYear = i3;
        this.password = str2;
        this.passwordRepeat = str3;
        this.iAgree = z;
        this.collectPersonalInformation = bool;
        this.thirdPartyDataProvision = bool2;
        this.key = str4;
        this.creationPoint = str5;
        this.appVersion = str6;
        this.name = str7;
    }
}
