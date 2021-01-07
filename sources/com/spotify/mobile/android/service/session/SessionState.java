package com.spotify.mobile.android.service.session;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.service.session.C$AutoValue_SessionState;

@JsonDeserialize(using = SessionState_Deserializer.class)
public abstract class SessionState implements Parcelable, JacksonModel {
    @Deprecated
    public static final String PRODUCT_TYPE_FREE = "free";
    @Deprecated
    public static final String PRODUCT_TYPE_PREMIUM = "premium";

    public static abstract class a {
    }

    /* access modifiers changed from: package-private */
    public static final class b extends cpd<xa1> {
        protected b() {
            super(xa1.CREATOR);
        }
    }

    public static a builder() {
        C$AutoValue_SessionState.b bVar = new C$AutoValue_SessionState.b();
        new xa1(null);
        return bVar;
    }

    @JsonCreator
    public static SessionState create(@JsonProperty("current_user") String str, @JsonProperty("current_user_name") String str2, @JsonProperty("logged_in") boolean z, @JsonProperty("logging_in") boolean z2, @JsonProperty("logging_out") boolean z3, @JsonProperty("current_account_type") int i, @JsonProperty("country_code") String str3, @JsonProperty("connected") boolean z4, @JsonProperty("can_connect") boolean z5, @JsonProperty("can_stream") boolean z6, @JsonProperty("payment_state") String str4, @JsonProperty("product_type") String str5) {
        return new AutoValue_SessionState(str, str2, z, z2, z3, i, str3, z4, z5, z6, new xa1(str4), str5);
    }

    public abstract boolean canConnect();

    @Deprecated
    public abstract boolean canStream();

    @Deprecated
    public abstract boolean connected();

    @Deprecated
    public abstract String countryCode();

    public abstract int currentAccountType();

    public abstract String currentUser();

    public abstract String currentUserName();

    public abstract boolean loggedIn();

    public abstract boolean loggingIn();

    public abstract boolean loggingOut();

    @Deprecated
    public abstract xa1 paymentState();

    @Deprecated
    public abstract String productType();

    public abstract a toBuilder();
}
