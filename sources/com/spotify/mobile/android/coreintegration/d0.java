package com.spotify.mobile.android.coreintegration;

import android.content.Context;
import android.os.Build;
import com.google.common.base.Optional;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.mobile.android.orbit.OrbitFactory;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.o0;
import com.spotify.mobile.android.util.t;
import com.spotify.music.C0707R;
import java.util.Random;

/* access modifiers changed from: package-private */
public class d0 {
    private final Context a;
    private final OrbitFactory b;
    private final t c;
    private final Random d;
    private final o0 e;

    d0(Context context, OrbitFactory orbitFactory, t tVar, Random random, o0 o0Var) {
        this.a = context;
        this.b = orbitFactory;
        this.c = tVar;
        this.d = random;
        this.e = o0Var;
    }

    public Optional<OrbitServiceInterface> a() {
        OrbitServiceInterface orbitServiceInterface;
        String str;
        try {
            orbitServiceInterface = this.b.createService(this.a.getApplicationContext(), this.c.h(), this.c.c(), this.c.f(), this.c.a());
        } catch (RuntimeException e2) {
            Assertion.i("Failed to start orbit due to RuntimeException", e2);
        } catch (UnsatisfiedLinkError e3) {
            if (this.d.nextDouble() >= 0.9d) {
                StringBuilder V0 = je.V0("Failed to start orbit due to UnsatisfiedLinkError (throttled 90%) CPU Architecture: ");
                if (Build.VERSION.SDK_INT >= 21) {
                    StringBuilder sb = new StringBuilder(128);
                    for (String str2 : Build.SUPPORTED_ABIS) {
                        sb.append(str2);
                        sb.append('/');
                    }
                    if (sb.length() > 0) {
                        sb.setLength(sb.length() - 1);
                    }
                    str = sb.toString();
                } else {
                    str = Build.CPU_ABI + '/' + Build.CPU_ABI2;
                }
                V0.append(str);
                Assertion.i(V0.toString(), e3);
            }
            this.e.c(C0707R.string.toast_internal_error_suggest_reinstallation, new Object[0]);
        }
        return Optional.fromNullable(orbitServiceInterface);
        orbitServiceInterface = null;
        return Optional.fromNullable(orbitServiceInterface);
    }
}
