package com.spotify.music.features.ads;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.model.AdSlot;
import com.spotify.music.features.ads.rules.AdRules;
import com.spotify.music.features.ads.rules.m;
import com.spotify.rxjava2.p;
import io.reactivex.e;
import io.reactivex.s;
import java.util.HashMap;

public class n1 implements xs2 {
    private String a = "";
    private final AdRules b;
    private final SlotApi c;
    private final s<Boolean> d;
    private final p e = new p();
    private boolean f;

    public n1(SlotApi slotApi, AdRules adRules, s<Boolean> sVar) {
        this.c = slotApi;
        this.b = adRules;
        this.d = sVar;
    }

    @Override // defpackage.xs2
    public void a(Fragment fragment, String str) {
        if (!str.equals(this.a)) {
            this.a = str;
            if (fragment instanceof com.spotify.mobile.android.ui.fragments.s) {
                this.b.b(((com.spotify.mobile.android.ui.fragments.s) fragment).z1());
            }
            if (this.b.a(m.class)) {
                l0 z = l0.z(str);
                if (z.r() != null) {
                    String[] strArr = new String[(z.p() + 1)];
                    strArr[0] = "spotify";
                    for (int i = 1; i <= z.p(); i++) {
                        String o = z.o(i - 1);
                        o.getClass();
                        if (o.equals(z.r())) {
                            o = "aduser";
                        }
                        strArr[i] = o;
                    }
                    str = TextUtils.join(":", strArr);
                }
                AdSlot.PREROLL.registerAdRequest(new t(this, str));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.e.a();
    }

    public e c(String str, Boolean bool) {
        boolean z = this.f != bool.booleanValue();
        this.f = bool.booleanValue();
        HashMap hashMap = new HashMap(2);
        hashMap.put("is_context_resume", String.valueOf(z));
        hashMap.put("context", l0.z(str).F());
        return this.c.b(AdSlot.PREROLL.getSlotId(), SlotApi.Intent.NEXT_CONTEXT, hashMap);
    }

    public void d(String str) {
        this.e.b(this.d.Y(new q(this, str)).subscribe(new s(str), new r(str)));
    }
}
