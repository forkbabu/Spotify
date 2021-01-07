package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.android.flags.c;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.upsell.premiumdestination.r;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.b;
import com.spotify.music.navigation.k;
import com.spotify.remoteconfig.AndroidFeatureHomeProperties;

/* renamed from: sf5  reason: default package */
public class sf5 implements gha, blb, k {
    private static final String g;
    private static final Uri h;
    private final Context a;
    private final fm9 b;
    private final AndroidFeatureHomeProperties c;
    private final b d;
    private final vwc e;
    private final r f;

    static {
        String cVar = ViewUris.d.toString();
        g = cVar;
        h = Uri.parse(cVar);
    }

    public sf5(Context context, fm9 fm9, AndroidFeatureHomeProperties androidFeatureHomeProperties, b bVar, vwc vwc, r rVar, String str) {
        this.a = context;
        this.b = fm9;
        this.c = androidFeatureHomeProperties;
        this.d = bVar;
        this.e = vwc;
        this.f = rVar;
    }

    public static void d(sf5 sf5, Intent intent, c cVar, SessionState sessionState) {
        sf5.getClass();
        Logger.b("Unknown Intent Captured. %s, %s", intent, sf5.a);
        Intent e2 = sf5.e(intent, cVar);
        if (e2 != null) {
            sf5.d.b(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.fragment.app.Fragment, com.spotify.music.features.home.premium.PremiumHomeFragment] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.music.navigation.k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.spotify.mobile.android.ui.fragments.s a(android.content.Intent r7, com.spotify.mobile.android.util.l0 r8, java.lang.String r9, com.spotify.android.flags.c r10, com.spotify.mobile.android.service.session.SessionState r11) {
        /*
            r6 = this;
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            fm9 r1 = r6.b
            boolean r1 = r1.a(r10)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "NPT_NFT_FLAGS mFreeTierFeatureUtils.isNftEnabled(flags) = %s"
            com.spotify.base.java.logging.Logger.b(r1, r0)
            vwc r0 = r6.e
            r0.getClass()
            com.spotify.android.flags.j r0 = defpackage.uwc.c
            java.io.Serializable r0 = r10.M0(r0)
            java.lang.String r1 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            com.spotify.mobile.android.util.LinkType r7 = r8.q()
            com.spotify.mobile.android.util.LinkType r11 = com.spotify.mobile.android.util.LinkType.PREMIUM_DESTINATION_DRILLDOWN
            if (r7 != r11) goto L_0x0040
            com.spotify.mobile.android.ui.activity.upsell.premiumdestination.r r7 = r6.f
            java.lang.String r8 = r8.i()
            com.google.common.base.Optional r8 = com.google.common.base.Optional.of(r8)
            com.spotify.mobile.android.ui.fragments.s r7 = r7.b(r8, r10)
            goto L_0x00cf
        L_0x0040:
            com.spotify.mobile.android.ui.activity.upsell.premiumdestination.r r7 = r6.f
            com.google.common.base.Optional r8 = com.google.common.base.Optional.absent()
            com.spotify.mobile.android.ui.fragments.s r7 = r7.b(r8, r10)
            goto L_0x00cf
        L_0x004c:
            java.lang.String r8 = r11.currentUser()
            r11 = 0
            java.lang.String r0 = "space-id"
            if (r7 == 0) goto L_0x005a
            java.lang.String r1 = r7.getStringExtra(r0)
            goto L_0x005b
        L_0x005a:
            r1 = r11
        L_0x005b:
            fm9 r3 = r6.b
            boolean r3 = r3.a(r10)
            java.lang.String r4 = "username"
            if (r3 != 0) goto L_0x007a
            com.spotify.music.features.home.premium.PremiumHomeFragment r7 = new com.spotify.music.features.home.premium.PremiumHomeFragment
            r7.<init>()
            android.os.Bundle r8 = defpackage.je.E(r4, r8)
            if (r1 == 0) goto L_0x0073
            r8.putString(r0, r1)
        L_0x0073:
            r7.r4(r8)
            com.spotify.android.flags.d.a(r7, r10)
            goto L_0x00cf
        L_0x007a:
            java.lang.String r3 = "redirect_uri"
            if (r7 == 0) goto L_0x0082
            java.lang.String r11 = r7.getStringExtra(r3)
        L_0x0082:
            com.spotify.remoteconfig.AndroidFeatureHomeProperties r7 = r6.c
            com.spotify.remoteconfig.AndroidFeatureHomeProperties$VoiceMicPermissionPrompt r7 = r7.i()
            com.spotify.remoteconfig.AndroidFeatureHomeProperties$VoiceMicPermissionPrompt r5 = com.spotify.remoteconfig.AndroidFeatureHomeProperties.VoiceMicPermissionPrompt.CONTROL
            if (r7 == r5) goto L_0x00ae
            com.spotify.music.features.home.experimental.VoiceFreeTierHomeFragment r7 = new com.spotify.music.features.home.experimental.VoiceFreeTierHomeFragment
            r7.<init>()
            android.os.Bundle r8 = defpackage.je.E(r4, r8)
            boolean r4 = com.google.common.base.MoreObjects.isNullOrEmpty(r1)
            if (r4 != 0) goto L_0x009e
            r8.putString(r0, r1)
        L_0x009e:
            boolean r0 = com.google.common.base.MoreObjects.isNullOrEmpty(r11)
            if (r0 != 0) goto L_0x00a7
            r8.putString(r3, r11)
        L_0x00a7:
            r7.r4(r8)
            com.spotify.android.flags.d.a(r7, r10)
            goto L_0x00cf
        L_0x00ae:
            com.spotify.music.features.home.freetier.FreeTierHomeFragment r7 = new com.spotify.music.features.home.freetier.FreeTierHomeFragment
            r7.<init>()
            android.os.Bundle r8 = defpackage.je.E(r4, r8)
            boolean r4 = com.google.common.base.MoreObjects.isNullOrEmpty(r1)
            if (r4 != 0) goto L_0x00c0
            r8.putString(r0, r1)
        L_0x00c0:
            boolean r0 = com.google.common.base.MoreObjects.isNullOrEmpty(r11)
            if (r0 != 0) goto L_0x00c9
            r8.putString(r3, r11)
        L_0x00c9:
            r7.r4(r8)
            com.spotify.android.flags.d.a(r7, r10)
        L_0x00cf:
            java.lang.Object[] r8 = new java.lang.Object[r9]
            androidx.fragment.app.Fragment r9 = r7.e()
            java.lang.String r9 = r9.toString()
            r8[r2] = r9
            java.lang.String r9 = "Resolved fragment = [%s]"
            com.spotify.base.java.logging.Logger.b(r9, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf5.a(android.content.Intent, com.spotify.mobile.android.util.l0, java.lang.String, com.spotify.android.flags.c, com.spotify.mobile.android.service.session.SessionState):com.spotify.mobile.android.ui.fragments.s");
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.HOME_ROOT, "Client Home Page", this);
        xkb.i(LinkType.ACTIVATE, "Default routing for activate", this);
        xkb.i(LinkType.HOME_DRILLDOWN, "Client Home drill down destinations", this);
        xkb.g(new mf5(this));
    }

    public elb c(Intent intent, c cVar, SessionState sessionState) {
        Intent e2 = e(intent, cVar);
        if (e2 == null) {
            return elb.a();
        }
        return elb.d(a(e2, l0.z(e2.getDataString()), "fallback", cVar, sessionState));
    }

    public Intent e(Intent intent, c cVar) {
        if (intent.getBooleanExtra("is_ui_fragments_loaded", false)) {
            return null;
        }
        return new Intent(intent).setAction("android.intent.action.VIEW").setComponent(new ComponentName(this.a, "com.spotify.music.MainActivity")).setData(h).setFlags(67108864);
    }
}
