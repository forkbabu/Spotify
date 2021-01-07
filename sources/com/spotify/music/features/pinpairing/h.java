package com.spotify.music.features.pinpairing;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.android.flags.c;

public class h implements blb {
    private final Context a;
    private final gha b;

    public h(Context context, gha gha) {
        this.a = context;
        this.b = gha;
    }

    public static Intent a(h hVar, Intent intent, c cVar) {
        hVar.getClass();
        Uri data = intent.getData();
        data.getClass();
        String encodedQuery = data.getEncodedQuery();
        String str = "https://www.spotify.com/pair";
        if (!(encodedQuery != null && encodedQuery.isEmpty())) {
            str = String.format("%s?%s", str, encodedQuery);
        }
        Context context = hVar.a;
        int i = PinPairingActivity.G;
        return je.y(context, PinPairingActivity.class, "url", str);
    }

    public static Intent c(h hVar, Intent intent, c cVar) {
        hVar.getClass();
        String dataString = intent.getDataString();
        dataString.getClass();
        Context context = hVar.a;
        int i = PinPairingActivity.G;
        return je.y(context, PinPairingActivity.class, "url", dataString);
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        xkb xkb = (xkb) glb;
        xkb.e(jlb.b("spotify:pair"), "Pair inApp view by deeplink", new d(this));
        xkb.e(jlb.b("https://www.spotify.com/pair"), "Pair inApp view by URL", new e(this));
        ilb ilb = new ilb("android.nfc.action.NDEF_DISCOVERED");
        gha gha = this.b;
        gha.getClass();
        xkb.e(ilb, "NFC tag with NDEF payload", new f(gha));
    }
}
