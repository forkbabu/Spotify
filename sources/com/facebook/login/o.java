package com.facebook.login;

import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.i;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.f;
import com.facebook.internal.h0;
import com.facebook.internal.q;
import com.facebook.k;
import com.facebook.login.LoginClient;
import com.facebook.r;
import com.spotify.music.features.ads.model.Ad;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class o {
    private static final Set<String> e = Collections.unmodifiableSet(new LoginManager$2());
    private static volatile o f;
    private LoginBehavior a = LoginBehavior.NATIVE_WITH_FALLBACK;
    private DefaultAudience b = DefaultAudience.FRIENDS;
    private final SharedPreferences c;
    private String d = "rerequest";

    class a implements CallbackManagerImpl.a {
        final /* synthetic */ i a;

        a(i iVar) {
            this.a = iVar;
        }

        @Override // com.facebook.internal.CallbackManagerImpl.a
        public boolean a(int i, Intent intent) {
            o.this.k(i, intent, this.a);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements CallbackManagerImpl.a {
        b() {
        }

        @Override // com.facebook.internal.CallbackManagerImpl.a
        public boolean a(int i, Intent intent) {
            o.this.k(i, intent, null);
            return true;
        }
    }

    private static class c implements u {
        private final Activity a;

        c(Activity activity) {
            h0.f(activity, "activity");
            this.a = activity;
        }

        @Override // com.facebook.login.u
        public Activity a() {
            return this.a;
        }

        @Override // com.facebook.login.u
        public void startActivityForResult(Intent intent, int i) {
            this.a.startActivityForResult(intent, i);
        }
    }

    private static class d implements u {
        private final q a;

        d(q qVar) {
            h0.f(qVar, "fragment");
            this.a = qVar;
        }

        @Override // com.facebook.login.u
        public Activity a() {
            return this.a.a();
        }

        @Override // com.facebook.login.u
        public void startActivityForResult(Intent intent, int i) {
            this.a.d(intent, i);
        }
    }

    /* access modifiers changed from: private */
    public static class e {
        private static n a;

        static n a(Context context) {
            n nVar;
            synchronized (e.class) {
                if (context == null) {
                    context = k.d();
                }
                if (context == null) {
                    nVar = null;
                } else {
                    if (a == null) {
                        a = new n(context, k.e());
                    }
                    nVar = a;
                }
            }
            return nVar;
        }
    }

    o() {
        h0.h();
        this.c = k.d().getSharedPreferences("com.facebook.loginManager", 0);
        if (k.n && f.a() != null) {
            g1.a(k.d(), "com.android.chrome", new b());
            g1.b(k.d(), k.d().getPackageName());
        }
    }

    public static o b() {
        if (f == null) {
            synchronized (o.class) {
                if (f == null) {
                    f = new o();
                }
            }
        }
        return f;
    }

    static boolean c(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || e.contains(str));
    }

    private void d(Context context, LoginClient.Result.Code code, Map<String, String> map, Exception exc, boolean z, LoginClient.d dVar) {
        n a2 = e.a(context);
        if (a2 != null) {
            if (dVar == null) {
                a2.g("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", "");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("try_login_activity", z ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
            a2.e(dVar.b(), hashMap, code, map, exc);
        }
    }

    private void p(u uVar, LoginClient.d dVar) {
        n a2 = e.a(uVar.a());
        if (!(a2 == null || dVar == null)) {
            a2.f(dVar);
        }
        CallbackManagerImpl.c(CallbackManagerImpl.RequestCodeOffset.Login.d(), new b());
        Intent intent = new Intent();
        intent.setClass(k.d(), FacebookActivity.class);
        intent.setAction(dVar.h().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", dVar);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        boolean z = false;
        if (k.d().getPackageManager().resolveActivity(intent, 0) != null) {
            try {
                uVar.startActivityForResult(intent, LoginClient.j());
                z = true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        if (!z) {
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            d(uVar.a(), LoginClient.Result.Code.ERROR, null, facebookException, false, dVar);
            throw facebookException;
        }
    }

    private void q(Collection<String> collection) {
        if (collection != null) {
            for (String str : collection) {
                if (c(str)) {
                    throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", str));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public LoginClient.d a(Collection<String> collection) {
        HashSet hashSet;
        LoginBehavior loginBehavior = this.a;
        if (collection == null) {
            hashSet = new HashSet();
        }
        LoginClient.d dVar = new LoginClient.d(loginBehavior, Collections.unmodifiableSet(hashSet), this.b, this.d, k.e(), UUID.randomUUID().toString());
        dVar.n(com.facebook.a.p());
        return dVar;
    }

    public void e(Activity activity, Collection<String> collection) {
        p(new c(activity), a(collection));
    }

    public void f(Fragment fragment, Collection<String> collection) {
        q qVar = new q(fragment);
        p(new d(qVar), a(collection));
    }

    public void g(androidx.fragment.app.Fragment fragment, Collection<String> collection) {
        q qVar = new q(fragment);
        p(new d(qVar), a(collection));
    }

    public void h(Activity activity, Collection<String> collection) {
        q(collection);
        p(new c(activity), a(collection));
    }

    public void i(androidx.fragment.app.Fragment fragment, Collection<String> collection) {
        q qVar = new q(fragment);
        q(collection);
        p(new d(qVar), a(collection));
    }

    public void j() {
        com.facebook.a.r(null);
        r.e(null);
        SharedPreferences.Editor edit = this.c.edit();
        edit.putBoolean("express_login_allowed", false);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public boolean k(int i, Intent intent, i<q> iVar) {
        boolean z;
        FacebookException facebookException;
        com.facebook.a aVar;
        Map<String, String> map;
        LoginClient.Result.Code code;
        LoginClient.d dVar;
        Map<String, String> map2;
        boolean z2;
        com.facebook.a aVar2;
        LoginClient.d dVar2;
        com.facebook.a aVar3;
        LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
        q qVar = null;
        if (intent != null) {
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                LoginClient.d dVar3 = result.n;
                LoginClient.Result.Code code3 = result.a;
                if (i == -1) {
                    if (code3 == LoginClient.Result.Code.SUCCESS) {
                        aVar3 = result.b;
                        facebookException = null;
                    } else {
                        facebookException = new FacebookAuthorizationException(result.c);
                        aVar3 = null;
                    }
                } else if (i == 0) {
                    facebookException = null;
                    aVar3 = null;
                    z2 = true;
                    map2 = result.o;
                    dVar2 = dVar3;
                    code2 = code3;
                    aVar2 = aVar3;
                } else {
                    facebookException = null;
                    aVar3 = null;
                }
                z2 = false;
                map2 = result.o;
                dVar2 = dVar3;
                code2 = code3;
                aVar2 = aVar3;
            } else {
                facebookException = null;
                map2 = null;
                dVar2 = null;
                aVar2 = null;
                z2 = false;
            }
            map = map2;
            aVar = aVar2;
            z = z2;
            code = code2;
            dVar = dVar2;
        } else if (i == 0) {
            code = LoginClient.Result.Code.CANCEL;
            facebookException = null;
            dVar = null;
            map = null;
            aVar = null;
            z = true;
        } else {
            code = code2;
            facebookException = null;
            dVar = null;
            map = null;
            aVar = null;
            z = false;
        }
        if (facebookException == null && aVar == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        d(null, code, map, facebookException, true, dVar);
        if (aVar != null) {
            com.facebook.a.r(aVar);
            r.b();
        }
        if (iVar != null) {
            if (aVar != null) {
                Set<String> i2 = dVar.i();
                HashSet hashSet = new HashSet(aVar.l());
                if (dVar.k()) {
                    hashSet.retainAll(i2);
                }
                HashSet hashSet2 = new HashSet(i2);
                hashSet2.removeAll(hashSet);
                qVar = new q(aVar, hashSet, hashSet2);
            }
            if (z || (qVar != null && qVar.a().size() == 0)) {
                iVar.b();
            } else if (facebookException != null) {
                iVar.a(facebookException);
            } else if (aVar != null) {
                SharedPreferences.Editor edit = this.c.edit();
                edit.putBoolean("express_login_allowed", true);
                edit.apply();
                iVar.onSuccess(qVar);
            }
        }
        return true;
    }

    public void l(com.facebook.f fVar, i<q> iVar) {
        if (fVar instanceof CallbackManagerImpl) {
            ((CallbackManagerImpl) fVar).b(CallbackManagerImpl.RequestCodeOffset.Login.d(), new a(iVar));
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    public o m(String str) {
        this.d = str;
        return this;
    }

    public o n(DefaultAudience defaultAudience) {
        this.b = defaultAudience;
        return this;
    }

    public o o(LoginBehavior loginBehavior) {
        this.a = loginBehavior;
        return this;
    }
}
