package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: jb2  reason: default package */
class jb2 implements za2 {
    private final vla a;
    private final Context b;

    jb2(Context context, vla vla) {
        this.b = context;
        this.a = vla;
    }

    @Override // defpackage.za2
    public void a(hb2 hb2) {
        String str;
        boolean z = hb2.g() != null;
        if (z) {
            str = hb2.g();
        } else {
            str = PartnerType.GOOGLE_MAPS.d();
        }
        Intent launchIntentForPackage = this.b.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            this.a.o();
            if (z) {
                launchIntentForPackage.putExtra("com.spotify.music.external.banner.MAPS_PACKAGE_NAME", str);
            }
            this.b.startActivity(launchIntentForPackage);
        }
    }
}
