package com.spotify.signup.api.services.model;

import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.spotify.signup.api.services.model.AutoValue_FacebookSignupRequest;
import com.spotify.signup.api.services.model.EmailSignupRequestBody;
import java.util.Locale;
import java.util.Map;

public abstract class FacebookSignupRequest extends ForwardingMap<String, Object> {

    public static abstract class Builder {
        public abstract Builder birthDay(Integer num);

        public abstract Builder birthMonth(Integer num);

        public abstract Builder birthYear(Integer num);

        public abstract FacebookSignupRequest build();

        public abstract Builder creationPoint(String str);

        public abstract Builder facebookAccessToken(String str);

        public abstract Builder facebookUserId(String str);

        public abstract Builder gender(EmailSignupRequestBody.Gender gender);

        public abstract Builder iAgree(Boolean bool);

        public abstract Builder key(String str);

        public abstract Builder name(String str);
    }

    public static Builder builder() {
        return new AutoValue_FacebookSignupRequest.Builder();
    }

    public static FacebookSignupRequest create(String str, String str2) {
        return builder().facebookUserId(str).facebookAccessToken(str2).build();
    }

    public abstract Integer birthDay();

    public abstract Integer birthMonth();

    public abstract Integer birthYear();

    public abstract String creationPoint();

    public abstract String facebookAccessToken();

    public abstract String facebookUserId();

    public abstract EmailSignupRequestBody.Gender gender();

    public abstract Boolean iAgree();

    public abstract String key();

    public abstract String name();

    public abstract Builder toBuilder();

    public FacebookSignupRequest withCreationPoint(String str) {
        return toBuilder().creationPoint(str).build();
    }

    public FacebookSignupRequest withKey(String str) {
        return toBuilder().key(str).build();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* renamed from: delegate */
    public Map<String, Object> mo25delegate() {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("fb", 1);
        builder.mo51put("key", key() != null ? key() : jae.b);
        builder.mo51put("platform", "Android-ARM");
        builder.mo51put("facebook_name", "throwaway");
        builder.mo51put("facebook_user_id", facebookUserId());
        builder.mo51put("facebook_token", facebookAccessToken());
        String creationPoint = creationPoint();
        if (creationPoint != null) {
            builder.mo51put("creation_point", creationPoint);
        }
        Boolean iAgree = iAgree();
        if (iAgree != null) {
            builder.mo51put("iagree", iAgree);
        }
        String name = name();
        if (name != null) {
            builder.mo51put("displayname", name);
        }
        if (gender() != null) {
            builder.mo51put("gender", gender().toString().toLowerCase(Locale.ENGLISH));
        }
        Integer birthDay = birthDay();
        Integer birthMonth = birthMonth();
        Integer birthYear = birthYear();
        if (!(birthDay == null || birthMonth == null || birthYear == null)) {
            builder.mo51put("birth_day", birthDay);
            builder.mo51put("birth_month", birthMonth);
            builder.mo51put("birth_year", birthYear);
        }
        return builder.build();
    }
}
