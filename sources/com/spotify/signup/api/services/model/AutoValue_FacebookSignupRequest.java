package com.spotify.signup.api.services.model;

import com.spotify.signup.api.services.model.EmailSignupRequestBody;
import com.spotify.signup.api.services.model.FacebookSignupRequest;

final class AutoValue_FacebookSignupRequest extends FacebookSignupRequest {
    private final Integer birthDay;
    private final Integer birthMonth;
    private final Integer birthYear;
    private final String creationPoint;
    private final String facebookAccessToken;
    private final String facebookUserId;
    private final EmailSignupRequestBody.Gender gender;
    private final Boolean iAgree;
    private final String key;
    private final String name;

    /* access modifiers changed from: package-private */
    public static final class Builder extends FacebookSignupRequest.Builder {
        private Integer birthDay;
        private Integer birthMonth;
        private Integer birthYear;
        private String creationPoint;
        private String facebookAccessToken;
        private String facebookUserId;
        private EmailSignupRequestBody.Gender gender;
        private Boolean iAgree;
        private String key;
        private String name;

        @Override // com.spotify.signup.api.services.model.FacebookSignupRequest.Builder
        public FacebookSignupRequest.Builder birthDay(Integer num) {
            this.birthDay = num;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.FacebookSignupRequest.Builder
        public FacebookSignupRequest.Builder birthMonth(Integer num) {
            this.birthMonth = num;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.FacebookSignupRequest.Builder
        public FacebookSignupRequest.Builder birthYear(Integer num) {
            this.birthYear = num;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.FacebookSignupRequest.Builder
        public FacebookSignupRequest build() {
            String str = this.facebookUserId == null ? " facebookUserId" : "";
            if (this.facebookAccessToken == null) {
                str = je.x0(str, " facebookAccessToken");
            }
            if (str.isEmpty()) {
                return new AutoValue_FacebookSignupRequest(this.facebookUserId, this.facebookAccessToken, this.key, this.creationPoint, this.name, this.iAgree, this.gender, this.birthDay, this.birthMonth, this.birthYear);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.signup.api.services.model.FacebookSignupRequest.Builder
        public FacebookSignupRequest.Builder creationPoint(String str) {
            this.creationPoint = str;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.FacebookSignupRequest.Builder
        public FacebookSignupRequest.Builder facebookAccessToken(String str) {
            if (str != null) {
                this.facebookAccessToken = str;
                return this;
            }
            throw new NullPointerException("Null facebookAccessToken");
        }

        @Override // com.spotify.signup.api.services.model.FacebookSignupRequest.Builder
        public FacebookSignupRequest.Builder facebookUserId(String str) {
            if (str != null) {
                this.facebookUserId = str;
                return this;
            }
            throw new NullPointerException("Null facebookUserId");
        }

        @Override // com.spotify.signup.api.services.model.FacebookSignupRequest.Builder
        public FacebookSignupRequest.Builder gender(EmailSignupRequestBody.Gender gender2) {
            this.gender = gender2;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.FacebookSignupRequest.Builder
        public FacebookSignupRequest.Builder iAgree(Boolean bool) {
            this.iAgree = bool;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.FacebookSignupRequest.Builder
        public FacebookSignupRequest.Builder key(String str) {
            this.key = str;
            return this;
        }

        @Override // com.spotify.signup.api.services.model.FacebookSignupRequest.Builder
        public FacebookSignupRequest.Builder name(String str) {
            this.name = str;
            return this;
        }

        Builder() {
        }

        private Builder(FacebookSignupRequest facebookSignupRequest) {
            this.facebookUserId = facebookSignupRequest.facebookUserId();
            this.facebookAccessToken = facebookSignupRequest.facebookAccessToken();
            this.key = facebookSignupRequest.key();
            this.creationPoint = facebookSignupRequest.creationPoint();
            this.name = facebookSignupRequest.name();
            this.iAgree = facebookSignupRequest.iAgree();
            this.gender = facebookSignupRequest.gender();
            this.birthDay = facebookSignupRequest.birthDay();
            this.birthMonth = facebookSignupRequest.birthMonth();
            this.birthYear = facebookSignupRequest.birthYear();
        }
    }

    @Override // com.spotify.signup.api.services.model.FacebookSignupRequest
    public Integer birthDay() {
        return this.birthDay;
    }

    @Override // com.spotify.signup.api.services.model.FacebookSignupRequest
    public Integer birthMonth() {
        return this.birthMonth;
    }

    @Override // com.spotify.signup.api.services.model.FacebookSignupRequest
    public Integer birthYear() {
        return this.birthYear;
    }

    @Override // com.spotify.signup.api.services.model.FacebookSignupRequest
    public String creationPoint() {
        return this.creationPoint;
    }

    @Override // com.spotify.signup.api.services.model.FacebookSignupRequest
    public String facebookAccessToken() {
        return this.facebookAccessToken;
    }

    @Override // com.spotify.signup.api.services.model.FacebookSignupRequest
    public String facebookUserId() {
        return this.facebookUserId;
    }

    @Override // com.spotify.signup.api.services.model.FacebookSignupRequest
    public EmailSignupRequestBody.Gender gender() {
        return this.gender;
    }

    @Override // com.spotify.signup.api.services.model.FacebookSignupRequest
    public Boolean iAgree() {
        return this.iAgree;
    }

    @Override // com.spotify.signup.api.services.model.FacebookSignupRequest
    public String key() {
        return this.key;
    }

    @Override // com.spotify.signup.api.services.model.FacebookSignupRequest
    public String name() {
        return this.name;
    }

    @Override // com.spotify.signup.api.services.model.FacebookSignupRequest
    public FacebookSignupRequest.Builder toBuilder() {
        return new Builder(this);
    }

    private AutoValue_FacebookSignupRequest(String str, String str2, String str3, String str4, String str5, Boolean bool, EmailSignupRequestBody.Gender gender2, Integer num, Integer num2, Integer num3) {
        this.facebookUserId = str;
        this.facebookAccessToken = str2;
        this.key = str3;
        this.creationPoint = str4;
        this.name = str5;
        this.iAgree = bool;
        this.gender = gender2;
        this.birthDay = num;
        this.birthMonth = num2;
        this.birthYear = num3;
    }
}
