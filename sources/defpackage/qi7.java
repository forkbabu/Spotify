package defpackage;

import com.spotify.music.C0707R;
import com.spotify.remoteconfig.PremiumDestinationProperties;

/* renamed from: qi7  reason: default package */
public class qi7 implements y3<Integer> {
    private final PremiumDestinationProperties a;

    public qi7(PremiumDestinationProperties premiumDestinationProperties) {
        this.a = premiumDestinationProperties;
    }

    public Object a() {
        switch (this.a.b().ordinal()) {
            case 1:
                return Integer.valueOf((int) C0707R.string.premium_destination_tab_title_upgrade);
            case 2:
                return Integer.valueOf((int) C0707R.string.premium_destination_tab_title_get_premium);
            case 3:
                return Integer.valueOf((int) C0707R.string.premium_destination_tab_title_try_premium);
            case 4:
                return Integer.valueOf((int) C0707R.string.premium_destination_tab_title_subscribe);
            case 5:
                return Integer.valueOf((int) C0707R.string.premium_destination_tab_title_plans);
            case 6:
                return Integer.valueOf((int) C0707R.string.premium_destination_tab_title_premium_plans);
            default:
                return Integer.valueOf((int) C0707R.string.premium_destination_tab_title_premium);
        }
    }
}
