package com.spotify.music.features.tasteonboarding.logging;

import android.os.Bundle;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import java.util.UUID;

public class a implements b {
    private String a = UUID.randomUUID().toString();

    /* renamed from: com.spotify.music.features.tasteonboarding.logging.a$a  reason: collision with other inner class name */
    class C0255a extends m {
        final /* synthetic */ String a;

        C0255a(String str) {
            this.a = str;
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void c(Bundle bundle) {
            bundle.putString(this.a, a.this.a);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void d(Bundle bundle) {
            if (bundle != null) {
                a.this.a = bundle.getString(this.a, UUID.randomUUID().toString());
            }
        }
    }

    public a(String str, k kVar) {
        kVar.y0(new C0255a(str));
    }

    @Override // com.spotify.music.features.tasteonboarding.logging.b
    public String a() {
        return this.a;
    }
}
