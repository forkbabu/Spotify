package defpackage;

import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import io.reactivex.z;

/* renamed from: lid  reason: default package */
public interface lid {
    @zqf("sellout/v2/upsell/promoted_offer")
    z<Offer> a(@nrf("device_id") String str);
}
