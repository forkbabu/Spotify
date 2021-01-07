package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.util.d;

public final class ha {
    private final f5 a;

    public ha(f5 f5Var) {
        this.a = f5Var;
    }

    private final boolean d() {
        if (!e()) {
            return false;
        }
        ((d) this.a.d()).getClass();
        if (System.currentTimeMillis() - this.a.w().B.a() > this.a.b().n(null, t.M0)) {
            return true;
        }
        return false;
    }

    private final boolean e() {
        return this.a.w().B.a() > 0;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.a.k().b();
        if (e()) {
            if (d()) {
                this.a.w().A.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString(Constants.MEDIUM, "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.a.E().W("auto", "_cmpx", bundle);
            } else {
                String a2 = this.a.w().A.a();
                if (TextUtils.isEmpty(a2)) {
                    this.a.l().F().a("Cache still valid but referrer not found");
                } else {
                    long a3 = ((this.a.w().B.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a2);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", a3);
                    this.a.E().W((String) pair.first, "_cmp", (Bundle) pair.second);
                }
                this.a.w().A.b(null);
            }
            this.a.w().B.b(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, Bundle bundle) {
        String str2;
        this.a.k().b();
        if (!this.a.n()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.a.w().A.b(str2);
                r4 r4Var = this.a.w().B;
                ((d) this.a.d()).getClass();
                r4Var.b(System.currentTimeMillis());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (e() && d()) {
            this.a.w().A.b(null);
        }
    }
}
