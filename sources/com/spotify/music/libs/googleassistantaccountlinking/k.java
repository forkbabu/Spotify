package com.spotify.music.libs.googleassistantaccountlinking;

import android.app.PendingIntent;
import androidx.fragment.app.Fragment;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.b;
import com.google.android.gms.tasks.e;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class k implements h {
    private final a a;
    private final d b;
    private final com.google.android.gms.auth.api.identity.a c;

    static final class a<TResult> implements e<b> {
        final /* synthetic */ Fragment a;
        final /* synthetic */ int b;

        a(Fragment fragment, int i) {
            this.a = fragment;
            this.b = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.android.gms.tasks.e
        public void onSuccess(b bVar) {
            b bVar2 = bVar;
            h.d(bVar2, "result");
            PendingIntent I1 = bVar2.I1();
            if (I1 != null) {
                Fragment fragment = this.a;
                h.d(I1, "it");
                fragment.I4(I1.getIntentSender(), this.b, null, 0, 0, 0, null);
            }
        }
    }

    public k(a aVar, d dVar, com.google.android.gms.auth.api.identity.a aVar2) {
        h.e(aVar, "consentScreenPendingIntentProvider");
        h.e(dVar, "googleAssistantServiceIdProvider");
        h.e(aVar2, "credentialSavingClient");
        this.a = aVar;
        this.b = dVar;
        this.c = aVar2;
    }

    public void a(Fragment fragment, int i) {
        h.e(fragment, "fragment");
        SaveAccountLinkingTokenRequest.a aVar = new SaveAccountLinkingTokenRequest.a();
        aVar.b(this.a.a(i));
        this.b.getClass();
        aVar.d("SPOTIFY");
        aVar.c(d.R(e.a()));
        aVar.e("auth_code");
        this.c.a(aVar.a()).h(new a(fragment, i));
    }
}
