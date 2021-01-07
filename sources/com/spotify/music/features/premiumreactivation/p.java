package com.spotify.music.features.premiumreactivation;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.rx.w;
import com.spotify.remoteconfig.AndroidFeaturePremiumReactivationProperties;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.v;

public class p {
    private final w a;
    private final n b;
    private final o c;
    private final AndroidFeaturePremiumReactivationProperties d;

    public p(w wVar, n nVar, o oVar, AndroidFeaturePremiumReactivationProperties androidFeaturePremiumReactivationProperties) {
        this.a = wVar;
        this.b = nVar;
        this.c = oVar;
        this.d = androidFeaturePremiumReactivationProperties;
    }

    public s<q> a() {
        Logger.b("[PremiumReactivationTrigger] check whether the modal should be triggered", new Object[0]);
        String str = AndroidFeaturePremiumReactivationProperties.UserPolicy.EXPERIMENT.equals(this.d.d()) ? "payments-cancel-state-interstitial-experiment" : "payments-cancel-state-interstitial";
        Logger.b("[PremiumReactivationTrigger] userPolicy: %s", str);
        return this.a.c(str).j0(new h(this)).W(new j(this), false, Integer.MAX_VALUE).j0(new i(this));
    }

    public String b() {
        return AndroidFeaturePremiumReactivationProperties.ContentProvider.WWW_ACCOUNT_PAGES.equals(this.d.a()) ? "https://www.spotify.com/redirect/resubscribe/?platform=android" : "https://www.spotify.com/redirect/csi/?platform=android";
    }

    public v c(Boolean bool) {
        if (bool.booleanValue()) {
            return this.c.a().W(new g(this), false, Integer.MAX_VALUE);
        }
        return o.a;
    }

    public v d(Integer num) {
        Logger.b("[PremiumReactivationTrigger] daysLeft: %s", num);
        long intValue = (long) num.intValue();
        NotificationDay notificationDay = NotificationDay.ONE_DAY;
        NotificationDay notificationDay2 = null;
        if (intValue > 0) {
            if (intValue == 1) {
                notificationDay2 = NotificationDay.ONE_DAY;
            } else if (intValue <= 3) {
                notificationDay2 = NotificationDay.THREE_DAYS;
            } else if (intValue <= 5) {
                notificationDay2 = NotificationDay.FIVE_DAYS;
            }
        }
        if (notificationDay2 == null || this.b.c(notificationDay2)) {
            return o.a;
        }
        return s.i0(notificationDay2);
    }

    public /* synthetic */ Boolean e(Optional optional) {
        boolean equals = Optional.of("1").equals(optional);
        Logger.b("[PremiumReactivationTrigger] isCSI: %s", Boolean.valueOf(equals));
        if (!equals) {
            Logger.b("[PremiumReactivationTrigger] reset storage", new Object[0]);
            this.b.a();
        }
        return Boolean.valueOf(equals);
    }

    public void f(String str) {
        NotificationDay notificationDay;
        NotificationDay[] values = NotificationDay.values();
        int i = 0;
        while (true) {
            if (i >= 3) {
                notificationDay = null;
                break;
            }
            notificationDay = values[i];
            if (notificationDay.d().equals(str)) {
                break;
            }
            i++;
        }
        if (notificationDay != null) {
            this.b.b(notificationDay);
        }
    }
}
