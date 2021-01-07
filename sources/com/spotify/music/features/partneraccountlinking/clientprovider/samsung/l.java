package com.spotify.music.features.partneraccountlinking.clientprovider.samsung;

import android.content.Intent;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.remoteconfig.xj;
import io.reactivex.a0;
import io.reactivex.z;
import java.util.ArrayList;

public class l {
    private final j a;
    private final sv5 b;
    private final boolean c;
    private Optional<a0<SamsungLinkingRequest>> d = Optional.absent();
    private Optional<String> e = Optional.absent();

    l(j jVar, sv5 sv5, xj xjVar) {
        this.a = jVar;
        this.b = sv5;
        sv5.d(new b(this));
        this.c = xjVar.a();
    }

    private void a(String str) {
        if (this.d.isPresent()) {
            this.d.get().onError(new RuntimeException(str));
        }
    }

    public static boolean c(l lVar, int i, int i2, Intent intent) {
        Intent intent2;
        String str;
        String str2;
        lVar.getClass();
        if (!(i == 1213 || i == 1212 || i == 1214)) {
            return false;
        }
        if (i2 != -1) {
            lVar.a("Samsung activity returns result not ok");
            return true;
        }
        switch (i) {
            case 1212:
                if (lVar.b.e(lVar.a.c(), 1213)) {
                    return true;
                }
                lVar.a("Account linking fragment is not present");
                return true;
            case 1213:
                if (lVar.c) {
                    intent2 = lVar.a.a();
                } else {
                    intent2 = lVar.a.e(lVar.e);
                }
                if (lVar.b.e(intent2, 1214)) {
                    return true;
                }
                lVar.a("Account linking fragment is not present");
                return true;
            case 1214:
                if (!lVar.d.isPresent()) {
                    return true;
                }
                boolean z = lVar.c;
                String str3 = null;
                if (intent != null) {
                    ArrayList arrayList = new ArrayList(0);
                    if (!z && !intent.hasExtra("access_token")) {
                        arrayList.add("access_token");
                    }
                    if (z && !intent.hasExtra("authcode")) {
                        arrayList.add("authcode");
                    }
                    if (!intent.hasExtra("auth_server_url")) {
                        arrayList.add("auth_server_url");
                    }
                    if (!intent.hasExtra("api_server_url")) {
                        arrayList.add("api_server_url");
                    }
                    str = !arrayList.isEmpty() ? String.format("Intent extra doesn't contain: %s", Joiner.on(", ").join(arrayList)) : null;
                } else {
                    str = "Intent is null";
                }
                if (!MoreObjects.isNullOrEmpty(str)) {
                    lVar.d.get().onError(new RuntimeException(str));
                    return true;
                }
                if (lVar.c) {
                    str2 = null;
                } else {
                    str2 = intent.getStringExtra("access_token");
                }
                if (lVar.c) {
                    str3 = intent.getStringExtra("authcode");
                }
                lVar.e = Optional.fromNullable(str2);
                lVar.d.get().onSuccess(SamsungLinkingRequest.create(str2, str3, intent.getStringExtra("auth_server_url"), intent.getStringExtra("api_server_url")));
                return true;
            default:
                return true;
        }
    }

    public z<SamsungLinkingRequest> b(boolean z) {
        if (this.d.isPresent()) {
            return z.q(new RuntimeException("Only one fetch request is allowed at a time per class instance."));
        }
        return z.g(new d(this, z));
    }

    public void d(boolean z, a0 a0Var) {
        a0Var.e(new c(this));
        this.d = Optional.of(a0Var);
        if (z) {
            if (!this.b.e(this.a.c(), 1213)) {
                a("Account linking fragment is not present");
                return;
            }
            return;
        }
        if (!this.b.e(this.a.d(), 1212)) {
            a("Account linking fragment is not present");
        }
    }

    public /* synthetic */ void e() {
        this.d = Optional.absent();
    }
}
