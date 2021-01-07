package com.spotify.signup.api.services.model;

import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.spotify.signup.api.services.model.AutoValue_IdentifierTokenSignupRequestBody;
import com.spotify.signup.api.services.model.EmailSignupRequestBody;
import java.util.Locale;
import java.util.Map;

public abstract class IdentifierTokenSignupRequestBody extends ForwardingMap<String, Object> {

    public static abstract class Builder {
        public abstract Builder appVersion(String str);

        public abstract Builder birthDay(int i);

        public abstract Builder birthMonth(int i);

        public abstract Builder birthYear(int i);

        public abstract IdentifierTokenSignupRequestBody build();

        public abstract Builder creationPoint(String str);

        public abstract Builder email(String str);

        public abstract Builder gender(EmailSignupRequestBody.Gender gender);

        public abstract Builder iAgree(boolean z);

        public abstract Builder identifierToken(String str);

        public abstract Builder key(String str);

        public abstract Builder name(String str);
    }

    public static Builder builder() {
        return new AutoValue_IdentifierTokenSignupRequestBody.Builder();
    }

    public abstract String appVersion();

    public abstract int birthDay();

    public abstract int birthMonth();

    public abstract int birthYear();

    public abstract String creationPoint();

    public abstract String email();

    public abstract EmailSignupRequestBody.Gender gender();

    public abstract boolean iAgree();

    public abstract String identifierToken();

    public abstract String key();

    public abstract String name();

    public abstract Builder toBuilder();

    public IdentifierTokenSignupRequestBody withCreationPoint(String str) {
        return toBuilder().creationPoint(str).build();
    }

    public IdentifierTokenSignupRequestBody withKey(String str) {
        return toBuilder().key(str).build();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public Map<String, Object> mo25delegate() {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("key", key() != null ? key() : jae.b);
        builder.mo51put("platform", "Android-ARM");
        builder.mo51put("identifier_token", identifierToken());
        builder.mo51put("gender", gender().toString().toLowerCase(Locale.ENGLISH));
        builder.mo51put("birth_day", Integer.valueOf(birthDay()));
        builder.mo51put("birth_month", Integer.valueOf(birthMonth()));
        builder.mo51put("birth_year", Integer.valueOf(birthYear()));
        builder.mo51put("iagree", Boolean.valueOf(iAgree()));
        String creationPoint = creationPoint();
        if (creationPoint != null) {
            builder.mo51put("creation_point", creationPoint);
        }
        String appVersion = appVersion();
        if (appVersion != null) {
            builder.mo51put("app_version", appVersion);
        }
        String email = email();
        if (email != null) {
            builder.mo51put("email", email);
        }
        String name = name();
        if (name != null) {
            builder.mo51put("displayname", name);
        }
        return mae.a(builder.build());
    }
}
