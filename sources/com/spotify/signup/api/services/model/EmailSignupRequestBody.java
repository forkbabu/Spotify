package com.spotify.signup.api.services.model;

import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.spotify.signup.api.services.model.AutoValue_EmailSignupRequestBody;
import java.util.Locale;
import java.util.Map;

public abstract class EmailSignupRequestBody extends ForwardingMap<String, Object> {

    public static abstract class Builder {
        public abstract Builder appVersion(String str);

        public abstract Builder birthDay(int i);

        public abstract Builder birthMonth(int i);

        public abstract Builder birthYear(int i);

        public abstract EmailSignupRequestBody build();

        public abstract Builder collectPersonalInformation(Boolean bool);

        public abstract Builder creationPoint(String str);

        public abstract Builder email(String str);

        public abstract Builder gender(Gender gender);

        public abstract Builder iAgree(boolean z);

        public abstract Builder key(String str);

        public abstract Builder name(String str);

        public abstract Builder password(String str);

        public abstract Builder passwordRepeat(String str);

        public abstract Builder thirdPartyDataProvision(Boolean bool);
    }

    public enum Gender {
        MALE,
        FEMALE,
        NEUTRAL
    }

    public static Builder builder() {
        return new AutoValue_EmailSignupRequestBody.Builder();
    }

    public abstract String appVersion();

    public abstract int birthDay();

    public abstract int birthMonth();

    public abstract int birthYear();

    public abstract Boolean collectPersonalInformation();

    public abstract String creationPoint();

    public abstract String email();

    public abstract Gender gender();

    public abstract boolean iAgree();

    public abstract String key();

    public abstract String name();

    public abstract String password();

    public abstract String passwordRepeat();

    public abstract Boolean thirdPartyDataProvision();

    public abstract Builder toBuilder();

    public EmailSignupRequestBody withCreationPoint(String str) {
        return toBuilder().creationPoint(str).build();
    }

    public EmailSignupRequestBody withKey(String str) {
        return toBuilder().key(str).build();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public Map<String, Object> mo25delegate() {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("key", key() != null ? key() : jae.b);
        builder.mo51put("platform", "Android-ARM");
        builder.mo51put("email", email());
        builder.mo51put("gender", gender().toString().toLowerCase(Locale.ENGLISH));
        builder.mo51put("birth_day", Integer.valueOf(birthDay()));
        builder.mo51put("birth_month", Integer.valueOf(birthMonth()));
        builder.mo51put("birth_year", Integer.valueOf(birthYear()));
        builder.mo51put("password", password());
        builder.mo51put("password_repeat", passwordRepeat());
        builder.mo51put("iagree", Boolean.valueOf(iAgree()));
        String creationPoint = creationPoint();
        if (creationPoint != null) {
            builder.mo51put("creation_point", creationPoint);
        }
        String appVersion = appVersion();
        if (appVersion != null) {
            builder.mo51put("app_version", appVersion);
        }
        String name = name();
        if (name != null) {
            builder.mo51put("displayname", name);
        }
        Boolean collectPersonalInformation = collectPersonalInformation();
        if (collectPersonalInformation != null) {
            builder.mo51put("collectPersonalInformation", collectPersonalInformation);
        }
        Boolean thirdPartyDataProvision = thirdPartyDataProvision();
        if (thirdPartyDataProvision != null) {
            builder.mo51put("thirdpartyemail", thirdPartyDataProvision);
        }
        return mae.a(builder.build());
    }
}
