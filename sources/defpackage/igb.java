package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.i;
import com.spotify.music.navigation.w;
import com.spotify.music.sociallistening.participantlist.impl.m;

/* renamed from: igb  reason: default package */
public final /* synthetic */ class igb implements w {
    public final /* synthetic */ i a;

    public /* synthetic */ igb(i iVar) {
        this.a = iVar;
    }

    @Override // com.spotify.music.navigation.w
    public final void a(s sVar, Intent intent) {
        yn0 yn0;
        ifd a2 = kfd.a(this.a.u());
        if (intent.hasExtra("referer")) {
            c cVar = (c) intent.getParcelableExtra("referer");
            if (cVar == null) {
                Assertion.p("Did you pass the referrer as a string by mistake?");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("referer", cVar);
            Bundle D2 = sVar.e().D2();
            if (D2 == null) {
                D2 = new Bundle();
                sVar.e().r4(D2);
            }
            D2.putAll(bundle);
        }
        if (bu9.w.equals((yn0) intent.getParcelableExtra("FeatureIdentifier.InternalReferrer")) || a2 == null) {
            yn0 = yn0.a(sVar.z1());
        } else {
            yn0 = yn0.a(a2);
        }
        m.d(sVar.e(), yn0);
    }
}
