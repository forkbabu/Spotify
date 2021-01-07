package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.f0;
import com.facebook.internal.i0;
import com.facebook.login.LoginClient;

class w extends v {
    public static final Parcelable.Creator<w> CREATOR = new b();
    private i0 f;
    private String n;

    class a implements i0.f {
        final /* synthetic */ LoginClient.d a;

        a(LoginClient.d dVar) {
            this.a = dVar;
        }

        @Override // com.facebook.internal.i0.f
        public void a(Bundle bundle, FacebookException facebookException) {
            w.this.o(this.a, bundle, facebookException);
        }
    }

    static class b implements Parcelable.Creator<w> {
        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public w createFromParcel(Parcel parcel) {
            return new w(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public w[] newArray(int i) {
            return new w[i];
        }
    }

    static class c extends i0.d {
        private String g;
        private String h;
        private String i = "fbconnect://success";
        private LoginBehavior j = LoginBehavior.NATIVE_WITH_FALLBACK;

        public c(Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
        }

        @Override // com.facebook.internal.i0.d
        public i0 a() {
            Bundle e = e();
            e.putString("redirect_uri", this.i);
            e.putString("client_id", b());
            e.putString("e2e", this.g);
            e.putString("response_type", "token,signed_request,graph_domain");
            e.putString("return_scopes", "true");
            e.putString("auth_type", this.h);
            e.putString("login_behavior", this.j.name());
            return i0.o(c(), "oauth", e, 0, d());
        }

        public c g(String str) {
            this.h = str;
            return this;
        }

        public c h(String str) {
            this.g = str;
            return this;
        }

        public c i(boolean z) {
            this.i = z ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public c j(LoginBehavior loginBehavior) {
            this.j = loginBehavior;
            return this;
        }
    }

    w(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public void b() {
        i0 i0Var = this.f;
        if (i0Var != null) {
            i0Var.cancel();
            this.f = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public String f() {
        return "web_view";
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public boolean h() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public boolean k(LoginClient.d dVar) {
        Bundle l = l(dVar);
        a aVar = new a(dVar);
        String h = LoginClient.h();
        this.n = h;
        a("e2e", h);
        androidx.fragment.app.c f2 = this.b.f();
        boolean y = f0.y(f2);
        c cVar = new c(f2, dVar.a(), l);
        cVar.h(this.n);
        cVar.i(y);
        cVar.g(dVar.c());
        cVar.j(dVar.h());
        cVar.f(aVar);
        this.f = cVar.a();
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.B4(true);
        facebookDialogFragment.c5(this.f);
        facebookDialogFragment.Y4(f2.v0(), "FacebookDialogFragment");
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.v
    public AccessTokenSource n() {
        return AccessTokenSource.WEB_VIEW;
    }

    @Override // com.facebook.login.p, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        f0.U(parcel, this.a);
        parcel.writeString(this.n);
    }

    w(Parcel parcel) {
        super(parcel);
        this.n = parcel.readString();
    }
}
