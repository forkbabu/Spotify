package com.spotify.music.samsungpersonalization;

import android.content.Context;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.music.samsungpersonalization.customization.c;
import com.spotify.music.samsungpersonalization.customization.d;
import io.reactivex.disposables.a;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public class SamsungPersonalizationSettingsHandler implements m {
    private final a a = new a();
    private final Context b;
    private final d c;
    private final b f;
    private final c n;

    public SamsungPersonalizationSettingsHandler(Context context, d dVar, b bVar, c cVar, n nVar) {
        h.e(context, "context");
        h.e(dVar, "samsungCustomizationConsentStatus");
        h.e(bVar, "samsungPersonalizationToggleHandler");
        h.e(cVar, "samsungCustomizationClient");
        h.e(nVar, "lifecycleOwner");
        this.b = context;
        this.c = dVar;
        this.f = bVar;
        this.n = cVar;
        nVar.A().a(this);
    }

    public final boolean a() {
        return this.c.a();
    }

    public boolean b() {
        return this.n.e();
    }

    public final s<Boolean> c() {
        if (b()) {
            return this.c.b();
        }
        s<Boolean> i0 = s.i0(Boolean.FALSE);
        h.d(i0, "Observable.just(false)");
        return i0;
    }

    public final void d(int i, int i2) {
        if (!b()) {
            return;
        }
        if (i == 32232) {
            Context context = this.b;
            Toast.makeText(context, "Consent returned result code: " + i2, 1).show();
        } else if (i == 32233) {
            Context context2 = this.b;
            Toast.makeText(context2, "Withdraw returned result code: " + i2, 1).show();
        }
    }

    public final void e(boolean z) {
        if (b()) {
            this.a.b(this.f.a(z).subscribe());
        }
    }

    @w(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.a.dispose();
        this.c.destroy();
    }

    @w(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (b()) {
            this.a.b(this.c.c().subscribe());
        }
    }
}
