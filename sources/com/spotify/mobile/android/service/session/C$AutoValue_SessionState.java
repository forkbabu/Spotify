package com.spotify.mobile.android.service.session;

import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: com.spotify.mobile.android.service.session.$AutoValue_SessionState  reason: invalid class name */
abstract class C$AutoValue_SessionState extends SessionState {
    private final boolean canConnect;
    private final boolean canStream;
    private final boolean connected;
    private final String countryCode;
    private final int currentAccountType;
    private final String currentUser;
    private final String currentUserName;
    private final boolean loggedIn;
    private final boolean loggingIn;
    private final boolean loggingOut;
    private final xa1 paymentState;
    private final String productType;

    /* renamed from: com.spotify.mobile.android.service.session.$AutoValue_SessionState$b */
    static class b extends SessionState.a {
        b() {
        }

        b(SessionState sessionState, a aVar) {
            sessionState.currentUser();
            sessionState.currentUserName();
            sessionState.loggedIn();
            sessionState.loggingIn();
            sessionState.loggingOut();
            sessionState.currentAccountType();
            sessionState.countryCode();
            sessionState.connected();
            sessionState.canConnect();
            sessionState.canStream();
            sessionState.paymentState();
            sessionState.productType();
        }
    }

    C$AutoValue_SessionState(String str, String str2, boolean z, boolean z2, boolean z3, int i, String str3, boolean z4, boolean z5, boolean z6, xa1 xa1, String str4) {
        if (str != null) {
            this.currentUser = str;
            if (str2 != null) {
                this.currentUserName = str2;
                this.loggedIn = z;
                this.loggingIn = z2;
                this.loggingOut = z3;
                this.currentAccountType = i;
                if (str3 != null) {
                    this.countryCode = str3;
                    this.connected = z4;
                    this.canConnect = z5;
                    this.canStream = z6;
                    if (xa1 != null) {
                        this.paymentState = xa1;
                        if (str4 != null) {
                            this.productType = str4;
                            return;
                        }
                        throw new NullPointerException("Null productType");
                    }
                    throw new NullPointerException("Null paymentState");
                }
                throw new NullPointerException("Null countryCode");
            }
            throw new NullPointerException("Null currentUserName");
        }
        throw new NullPointerException("Null currentUser");
    }

    @Override // com.spotify.mobile.android.service.session.SessionState
    public boolean canConnect() {
        return this.canConnect;
    }

    @Override // com.spotify.mobile.android.service.session.SessionState
    @Deprecated
    public boolean canStream() {
        return this.canStream;
    }

    @Override // com.spotify.mobile.android.service.session.SessionState
    @Deprecated
    public boolean connected() {
        return this.connected;
    }

    @Override // com.spotify.mobile.android.service.session.SessionState
    @Deprecated
    public String countryCode() {
        return this.countryCode;
    }

    @Override // com.spotify.mobile.android.service.session.SessionState
    public int currentAccountType() {
        return this.currentAccountType;
    }

    @Override // com.spotify.mobile.android.service.session.SessionState
    public String currentUser() {
        return this.currentUser;
    }

    @Override // com.spotify.mobile.android.service.session.SessionState
    public String currentUserName() {
        return this.currentUserName;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionState)) {
            return false;
        }
        SessionState sessionState = (SessionState) obj;
        if (this.currentUser.equals(sessionState.currentUser()) && this.currentUserName.equals(sessionState.currentUserName()) && this.loggedIn == sessionState.loggedIn() && this.loggingIn == sessionState.loggingIn() && this.loggingOut == sessionState.loggingOut() && this.currentAccountType == sessionState.currentAccountType() && this.countryCode.equals(sessionState.countryCode()) && this.connected == sessionState.connected() && this.canConnect == sessionState.canConnect() && this.canStream == sessionState.canStream() && this.paymentState.equals(sessionState.paymentState()) && this.productType.equals(sessionState.productType())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((((((((this.currentUser.hashCode() ^ 1000003) * 1000003) ^ this.currentUserName.hashCode()) * 1000003) ^ (this.loggedIn ? 1231 : 1237)) * 1000003) ^ (this.loggingIn ? 1231 : 1237)) * 1000003) ^ (this.loggingOut ? 1231 : 1237)) * 1000003) ^ this.currentAccountType) * 1000003) ^ this.countryCode.hashCode()) * 1000003) ^ (this.connected ? 1231 : 1237)) * 1000003) ^ (this.canConnect ? 1231 : 1237)) * 1000003;
        if (!this.canStream) {
            i = 1237;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.paymentState.hashCode()) * 1000003) ^ this.productType.hashCode();
    }

    @Override // com.spotify.mobile.android.service.session.SessionState
    public boolean loggedIn() {
        return this.loggedIn;
    }

    @Override // com.spotify.mobile.android.service.session.SessionState
    public boolean loggingIn() {
        return this.loggingIn;
    }

    @Override // com.spotify.mobile.android.service.session.SessionState
    public boolean loggingOut() {
        return this.loggingOut;
    }

    @Override // com.spotify.mobile.android.service.session.SessionState
    @Deprecated
    public xa1 paymentState() {
        return this.paymentState;
    }

    @Override // com.spotify.mobile.android.service.session.SessionState
    @Deprecated
    public String productType() {
        return this.productType;
    }

    @Override // com.spotify.mobile.android.service.session.SessionState
    public SessionState.a toBuilder() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SessionState{currentUser=");
        V0.append(this.currentUser);
        V0.append(", currentUserName=");
        V0.append(this.currentUserName);
        V0.append(", loggedIn=");
        V0.append(this.loggedIn);
        V0.append(", loggingIn=");
        V0.append(this.loggingIn);
        V0.append(", loggingOut=");
        V0.append(this.loggingOut);
        V0.append(", currentAccountType=");
        V0.append(this.currentAccountType);
        V0.append(", countryCode=");
        V0.append(this.countryCode);
        V0.append(", connected=");
        V0.append(this.connected);
        V0.append(", canConnect=");
        V0.append(this.canConnect);
        V0.append(", canStream=");
        V0.append(this.canStream);
        V0.append(", paymentState=");
        V0.append(this.paymentState);
        V0.append(", productType=");
        return je.I0(V0, this.productType, "}");
    }
}
