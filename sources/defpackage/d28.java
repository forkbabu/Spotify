package defpackage;

import com.adjust.sdk.Constants;
import com.google.common.base.MoreObjects;
import com.spotify.ubi.specification.factories.MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled;
import com.spotify.ubi.specification.factories.MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationChannelToBeEnabled;
import com.spotify.ubi.specification.factories.n1;

/* renamed from: d28  reason: default package */
public class d28 {
    private final ere a;
    private final n1 b;

    public d28(ere ere, n1 n1Var) {
        this.a = ere;
        this.b = n1Var;
    }

    public void a(String str, String str2) {
        MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationChannelToBeEnabled mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationChannelToBeEnabled;
        if (!MoreObjects.isNullOrEmpty(str) && !MoreObjects.isNullOrEmpty(str2)) {
            String[] split = str2.split(":");
            if (split.length == 4 && "client".equalsIgnoreCase(split[0]) && !MoreObjects.isNullOrEmpty(split[1]) && !MoreObjects.isNullOrEmpty(split[2]) && "enable".equalsIgnoreCase(split[3])) {
                MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled = null;
                if ("email".equalsIgnoreCase(split[1])) {
                    mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationChannelToBeEnabled = MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationChannelToBeEnabled.EMAIL;
                } else {
                    mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationChannelToBeEnabled = Constants.PUSH.equalsIgnoreCase(split[1]) ? MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationChannelToBeEnabled.PUSH : null;
                }
                if ("newMusic".equalsIgnoreCase(split[2])) {
                    mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled = MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled.NEW_MUSIC;
                } else if ("newsAndOffers".equalsIgnoreCase(split[2])) {
                    mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled = MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled.NEWS_AND_OFFERS;
                } else if ("recommendedMusic".equalsIgnoreCase(split[2])) {
                    mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled = MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled.RECOMMENDED_MUSIC;
                } else if ("playlistUpdates".equalsIgnoreCase(split[2])) {
                    mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled = MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled.PLAYLIST_UPDATES;
                } else if ("artistUpdates".equalsIgnoreCase(split[2])) {
                    mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled = MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled.ARTIST_UPDATES;
                } else if ("productNews".equalsIgnoreCase(split[2])) {
                    mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled = MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled.PRODUCT_NEWS;
                } else if ("concertNotifications".equalsIgnoreCase(split[2])) {
                    mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled = MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled.CONCERT_NOTIFICATIONS;
                }
                if (mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled != null && mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationChannelToBeEnabled != null) {
                    this.a.a(this.b.c(str, str2).c(mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationChannelToBeEnabled, mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled));
                }
            }
        }
    }

    public void b(String str, String str2) {
        if (!MoreObjects.isNullOrEmpty(str) && !MoreObjects.isNullOrEmpty(str2)) {
            this.a.a(this.b.c(str, str2).a());
        }
    }

    public void c(String str, String str2) {
        if (!MoreObjects.isNullOrEmpty(str) && !MoreObjects.isNullOrEmpty(str2)) {
            this.a.a(this.b.c(str, str2).b(str2));
        }
    }

    public void d(String str, String str2) {
        if (!MoreObjects.isNullOrEmpty(str) && !MoreObjects.isNullOrEmpty(str2)) {
            this.a.a(this.b.c(str, str2).d(str2));
        }
    }

    public void e(String str, String str2) {
        if (!MoreObjects.isNullOrEmpty(str) && !MoreObjects.isNullOrEmpty(str2)) {
            this.a.a(this.b.c(str, str2).e(str2));
        }
    }

    public void f(String str, String str2) {
        if (!MoreObjects.isNullOrEmpty(str) && !MoreObjects.isNullOrEmpty(str2)) {
            this.a.a(this.b.c(str, str2).f(str2));
        }
    }

    public void g(String str, String str2) {
        if (!MoreObjects.isNullOrEmpty(str) && !MoreObjects.isNullOrEmpty(str2)) {
            this.a.a(this.b.c(str, str2).h(str2));
        }
    }

    public void h(String str, String str2) {
        if (!MoreObjects.isNullOrEmpty(str) && !MoreObjects.isNullOrEmpty(str2)) {
            this.a.a(this.b.c(str, str2).i());
        }
    }

    public void i(String str, String str2) {
        if (!MoreObjects.isNullOrEmpty(str) && !MoreObjects.isNullOrEmpty(str2)) {
            this.a.a(this.b.c(str, str2).j(str2));
        }
    }

    public void j(String str, String str2) {
        if (!MoreObjects.isNullOrEmpty(str) && !MoreObjects.isNullOrEmpty(str2)) {
            this.a.a(this.b.c(str, str2).k(str2));
        }
    }

    public void k(String str, String str2) {
        if (!MoreObjects.isNullOrEmpty(str) && !MoreObjects.isNullOrEmpty(str2)) {
            this.a.a(this.b.c(str, str2).g(str2));
        }
    }
}
