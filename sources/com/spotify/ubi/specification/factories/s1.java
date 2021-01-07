package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.qqe;
import defpackage.rqe;

public final class s1 {
    private final rqe a;
    private final pqe b;

    public final class b {
        private final rqe a;

        b(String str, Integer num, a aVar) {
            rqe.b p = s1.this.a.p();
            je.t("category", str, num, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a(MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled, MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled) {
            nqe.b f = nqe.f();
            f.e(this.a);
            f.f(s1.this.b);
            qqe.b b2 = qqe.b();
            b2.c("disable_notification_category_in_channel");
            b2.e(1);
            b2.b("hit");
            b2.d("notification_channel_to_be_disabled", mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeDisabled.value);
            return (nqe) je.R(b2, "notification_category_to_be_disabled", mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeDisabled.value, f);
        }

        public nqe b(MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled, MobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled) {
            nqe.b f = nqe.f();
            f.e(this.a);
            f.f(s1.this.b);
            qqe.b b2 = qqe.b();
            b2.c("enable_notification_category_in_channel");
            b2.e(1);
            b2.b("hit");
            b2.d("notification_channel_to_be_enabled", mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationChannelToBeEnabled.value);
            return (nqe) je.R(b2, "notification_category_to_be_enabled", mobileNotificationSettingsChannelDetailsEventFactory$MobileNotificationSettingsChannelDetailsEnums$CategoryEnums$NotificationCategoryToBeEnabled.value, f);
        }
    }

    public s1(String str, String str2) {
        pqe pqe = pqe.b;
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-notification-settings-channel-details");
        e.m("1.0.1");
        e.e("7.0.8");
        e.g(str);
        e.j(str2);
        this.a = e.d();
        this.b = pqe;
    }

    public b c(String str, Integer num) {
        return new b(str, num, null);
    }
}
