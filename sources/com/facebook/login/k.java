package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.internal.b0;
import com.facebook.internal.f0;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginFragment;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

class k extends p {
    public static final Parcelable.Creator<k> CREATOR = new b();
    private j c;

    class a implements b0.b {
        final /* synthetic */ LoginClient.d a;

        a(LoginClient.d dVar) {
            this.a = dVar;
        }

        @Override // com.facebook.internal.b0.b
        public void a(Bundle bundle) {
            k.this.l(this.a, bundle);
        }
    }

    static class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new k[i];
        }
    }

    k(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public void b() {
        j jVar = this.c;
        if (jVar != null) {
            jVar.b();
            this.c.e(null);
            this.c = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public String f() {
        return "get_token";
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public boolean k(LoginClient.d dVar) {
        j jVar = new j(this.b.f(), dVar.a());
        this.c = jVar;
        if (!jVar.f()) {
            return false;
        }
        LoginClient.b bVar = this.b.n;
        if (bVar != null) {
            ((LoginFragment.b) bVar).a.setVisibility(0);
        }
        this.c.e(new a(dVar));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void l(LoginClient.d dVar, Bundle bundle) {
        j jVar = this.c;
        if (jVar != null) {
            jVar.e(null);
        }
        this.c = null;
        LoginClient.b bVar = this.b.n;
        if (bVar != null) {
            ((LoginFragment.b) bVar).a.setVisibility(8);
        }
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> i = dVar.i();
            if (stringArrayList == null || (i != null && !stringArrayList.containsAll(i))) {
                HashSet hashSet = new HashSet();
                for (String str : i) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    a("new_permissions", TextUtils.join(",", hashSet));
                }
                dVar.m(hashSet);
            } else {
                String string = bundle.getString("com.facebook.platform.extra.USER_ID");
                if (string == null || string.isEmpty()) {
                    LoginClient.b bVar2 = this.b.n;
                    if (bVar2 != null) {
                        ((LoginFragment.b) bVar2).a.setVisibility(0);
                    }
                    f0.p(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new l(this, bundle, dVar));
                    return;
                }
                m(dVar, bundle);
                return;
            }
        }
        this.b.l();
    }

    /* access modifiers changed from: package-private */
    public void m(LoginClient.d dVar, Bundle bundle) {
        com.facebook.a aVar;
        AccessTokenSource accessTokenSource = AccessTokenSource.FACEBOOK_APPLICATION_SERVICE;
        String a2 = dVar.a();
        Date l = f0.l(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date l2 = f0.l(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
        if (f0.C(string)) {
            aVar = null;
        } else {
            aVar = new com.facebook.a(string, a2, bundle.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, null, accessTokenSource, l, new Date(), l2, bundle.getString("graph_domain"));
        }
        this.b.e(LoginClient.Result.e(this.b.p, aVar));
    }

    @Override // com.facebook.login.p, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        f0.U(parcel, this.a);
    }

    k(Parcel parcel) {
        super(parcel);
    }
}
