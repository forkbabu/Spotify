package com.facebook.login;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import com.spotify.music.C0707R;
import java.util.ArrayList;

public class LoginFragment extends Fragment {
    private String g0;
    private LoginClient h0;
    private LoginClient.d i0;

    class a implements LoginClient.c {
        a() {
        }
    }

    class b implements LoginClient.b {
        final /* synthetic */ View a;

        b(LoginFragment loginFragment, View view) {
            this.a = view;
        }
    }

    static void K4(LoginFragment loginFragment, LoginClient.Result result) {
        loginFragment.i0 = null;
        int i = result.a == LoginClient.Result.Code.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (loginFragment.e3()) {
            loginFragment.B2().setResult(i, intent);
            loginFragment.B2().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        View view;
        super.H3();
        if (a3() == null) {
            view = null;
        } else {
            view = a3().findViewById(C0707R.id.com_facebook_login_fragment_progress_bar);
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public LoginClient L4() {
        return this.h0;
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        if (this.g0 == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            B2().finish();
            return;
        }
        LoginClient loginClient = this.h0;
        LoginClient.d dVar = this.i0;
        LoginClient.d dVar2 = loginClient.p;
        if (!(dVar2 != null && loginClient.b >= 0) && dVar != null) {
            if (dVar2 != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            } else if (!com.facebook.a.p() || loginClient.b()) {
                loginClient.p = dVar;
                ArrayList arrayList = new ArrayList();
                LoginBehavior h = dVar.h();
                if (h.i()) {
                    arrayList.add(new k(loginClient));
                }
                if (h.k()) {
                    arrayList.add(new m(loginClient));
                }
                if (h.h()) {
                    arrayList.add(new i(loginClient));
                }
                if (h.d()) {
                    arrayList.add(new a(loginClient));
                }
                if (h.l()) {
                    arrayList.add(new w(loginClient));
                }
                if (h.g()) {
                    arrayList.add(new g(loginClient));
                }
                p[] pVarArr = new p[arrayList.size()];
                arrayList.toArray(pVarArr);
                loginClient.a = pVarArr;
                loginClient.l();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        bundle.putParcelable("loginClient", this.h0);
    }

    @Override // androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        LoginClient loginClient = this.h0;
        if (loginClient.p != null) {
            loginClient.g().i(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        Bundle bundleExtra;
        super.s3(bundle);
        if (bundle != null) {
            LoginClient loginClient = (LoginClient) bundle.getParcelable("loginClient");
            this.h0 = loginClient;
            if (loginClient.c == null) {
                loginClient.c = this;
            } else {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
        } else {
            this.h0 = new LoginClient(this);
        }
        this.h0.f = new a();
        c B2 = B2();
        if (B2 != null) {
            ComponentName callingActivity = B2.getCallingActivity();
            if (callingActivity != null) {
                this.g0 = callingActivity.getPackageName();
            }
            Intent intent = B2.getIntent();
            if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
                this.i0 = (LoginClient.d) bundleExtra.getParcelable("request");
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.com_facebook_login_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(C0707R.id.com_facebook_login_fragment_progress_bar);
        this.h0.n = new b(this, findViewById);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void x3() {
        LoginClient loginClient = this.h0;
        if (loginClient.b >= 0) {
            loginClient.g().b();
        }
        super.x3();
    }
}
