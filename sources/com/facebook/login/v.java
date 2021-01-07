package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.a;
import com.facebook.internal.f0;
import com.facebook.k;
import com.facebook.login.LoginClient;
import com.spotify.music.features.ads.model.Ad;
import java.util.Locale;

/* access modifiers changed from: package-private */
public abstract class v extends p {
    private String c;

    v(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: protected */
    public Bundle l(LoginClient.d dVar) {
        Bundle bundle = new Bundle();
        if (!f0.D(dVar.i())) {
            String join = TextUtils.join(",", dVar.i());
            bundle.putString("scope", join);
            a("scope", join);
        }
        bundle.putString("default_audience", dVar.e().d());
        bundle.putString("state", e(dVar.b()));
        a e = a.e();
        String n = e != null ? e.n() : null;
        String str = "1";
        if (n == null || !n.equals(this.b.f().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
            f0.e(this.b.f());
            a("access_token", Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        } else {
            bundle.putString("access_token", n);
            a("access_token", str);
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        if (!k.g()) {
            str = Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        }
        bundle.putString("ies", str);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public String m() {
        StringBuilder V0 = je.V0("fb");
        V0.append(k.e());
        V0.append("://authorize");
        return V0.toString();
    }

    /* access modifiers changed from: package-private */
    public abstract AccessTokenSource n();

    /* access modifiers changed from: protected */
    public void o(LoginClient.d dVar, Bundle bundle, FacebookException facebookException) {
        LoginClient.Result result;
        String str;
        this.c = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.c = bundle.getString("e2e");
            }
            try {
                a c2 = p.c(dVar.i(), bundle, n(), dVar.a());
                result = LoginClient.Result.e(this.b.p, c2);
                CookieSyncManager.createInstance(this.b.f()).sync();
                this.b.f().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", c2.n()).apply();
            } catch (FacebookException e) {
                result = LoginClient.Result.b(this.b.p, null, e.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            result = LoginClient.Result.a(this.b.p, "User canceled log in.");
        } else {
            this.c = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError a = ((FacebookServiceException) facebookException).a();
                str = String.format(Locale.ROOT, "%d", Integer.valueOf(a.b()));
                message = a.toString();
            } else {
                str = null;
            }
            result = LoginClient.Result.c(this.b.p, null, message, str);
        }
        if (!f0.C(this.c)) {
            g(this.c);
        }
        this.b.e(result);
    }

    v(Parcel parcel) {
        super(parcel);
    }
}
