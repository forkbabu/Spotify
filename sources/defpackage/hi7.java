package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.premiumdestination.domain.k;
import com.spotify.remoteconfig.PremiumDestinationProperties;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: hi7  reason: default package */
public final /* synthetic */ class hi7 implements l {
    public final /* synthetic */ PremiumDestinationProperties a;

    public /* synthetic */ hi7(PremiumDestinationProperties premiumDestinationProperties) {
        this.a = premiumDestinationProperties;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        PremiumDestinationProperties premiumDestinationProperties = this.a;
        Map map = (Map) obj;
        String str = (String) map.get("type");
        Optional fromNullable = Optional.fromNullable(map.get("payment-state"));
        String str2 = (String) map.get("employee");
        Optional fromNullable2 = Optional.fromNullable(map.get("tablet-free"));
        Logger.b("ProductState Received : ProductType = %s, PaymentState = %s, TabletFree = %s, EmployeeState = %s", str, fromNullable, fromNullable2, str2);
        if (fromNullable2.isPresent() && ((String) fromNullable2.get()).equals("1") && !premiumDestinationProperties.a()) {
            return k.f("premium");
        }
        if (!"premium".equals(str)) {
            return k.f("free");
        }
        if (fromNullable.isPresent() && ((String) fromNullable.get()).startsWith("opt-in-trial")) {
            return k.f("opt-in-trial");
        }
        if ("1".equals(str2)) {
            return k.f("employee");
        }
        return k.f("premium");
    }
}
