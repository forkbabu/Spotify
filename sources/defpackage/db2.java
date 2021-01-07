package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import com.spotify.music.C0707R;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: db2  reason: default package */
class db2 {
    private final Context a;

    db2(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public cb2 a(PartnerType partnerType) {
        Drawable drawable;
        Drawable drawable2 = null;
        if (partnerType == PartnerType.GOOGLE_MAPS) {
            String string = this.a.getString(C0707R.string.maps_back_banner_header_googlemaps);
            String string2 = this.a.getString(C0707R.string.maps_back_banner_subtitle_googlemaps);
            try {
                drawable2 = a.d(this.a, C0707R.drawable.app_logo_googlemaps);
            } catch (Resources.NotFoundException unused) {
            }
            return new gb2(string, string2, drawable2, "GMM");
        } else if (partnerType == PartnerType.WAZE) {
            String string3 = this.a.getString(C0707R.string.maps_back_banner_header_waze);
            try {
                drawable = a.d(this.a, C0707R.drawable.app_logo_waze);
            } catch (Resources.NotFoundException unused2) {
                drawable = null;
            }
            return new gb2(string3, null, drawable, "WAZE");
        } else {
            throw new IllegalArgumentException(partnerType + "not implemented");
        }
    }
}
