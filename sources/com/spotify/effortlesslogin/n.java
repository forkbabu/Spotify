package com.spotify.effortlesslogin;

import com.spotify.effortlesslogin.LoginState;

/* access modifiers changed from: package-private */
public final class n extends LoginState {
    private final LoginState.Type a;
    private final String b;

    n(LoginState.Type type, String str) {
        if (type != null) {
            this.a = type;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null errorMessage");
        }
        throw new NullPointerException("Null getType");
    }

    @Override // com.spotify.effortlesslogin.LoginState
    public String a() {
        return this.b;
    }

    @Override // com.spotify.effortlesslogin.LoginState
    public LoginState.Type b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoginState)) {
            return false;
        }
        LoginState loginState = (LoginState) obj;
        if (!this.a.equals(loginState.b()) || !this.b.equals(loginState.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("LoginState{getType=");
        V0.append(this.a);
        V0.append(", errorMessage=");
        return je.I0(V0, this.b, "}");
    }
}
