package com.spotify.ubi.specification.factories;

import defpackage.nqe;
import defpackage.qqe;
import defpackage.rqe;

public final class n1 {
    private final rqe a;
    private final pqe b;

    public final class b {
        private final rqe a;

        b(String str, String str2, a aVar) {
            rqe.b p = n1.this.a.p();
            je.w("in_app_message_cta", str, str2, p);
            p.f(Boolean.FALSE);
            this.a = p.d();
        }

        public nqe a() {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.f(n1.this.b);
            return (nqe) je.S("create_playlist", 1, "hit", bVar);
        }

        public nqe b(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.f(n1.this.b);
            nqe.b bVar2 = bVar;
            bVar2.h(je.W("dislike", 1, "hit", "item_to_be_disliked", str));
            return (nqe) bVar2.c();
        }

        public nqe c(MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationChannelToBeEnabled mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationChannelToBeEnabled, MobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.f(n1.this.b);
            qqe.b b2 = qqe.b();
            b2.c("enable_notification_category_in_channel");
            b2.e(1);
            b2.b("hit");
            b2.d("notification_channel_to_be_enabled", mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationChannelToBeEnabled.value);
            return (nqe) je.R(b2, "notification_category_to_be_enabled", mobileInAppMessageEventFactory$MobileInAppMessageEnums$InAppMessageCtaEnums$NotificationCategoryToBeEnabled.value, bVar);
        }

        public nqe d(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.f(n1.this.b);
            nqe.b bVar2 = bVar;
            bVar2.h(je.W("follow", 1, "hit", "item_to_be_followed", str));
            return (nqe) bVar2.c();
        }

        public nqe e(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.f(n1.this.b);
            nqe.b bVar2 = bVar;
            bVar2.h(je.W("like", 1, "hit", "item_to_be_liked", str));
            return (nqe) bVar2.c();
        }

        public nqe f(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.f(n1.this.b);
            nqe.b bVar2 = bVar;
            bVar2.h(je.W("navigate_to_external_uri", 1, "hit", "destination", str));
            return (nqe) bVar2.c();
        }

        public nqe g(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.f(n1.this.b);
            nqe.b bVar2 = bVar;
            bVar2.h(je.W("navigate_to_webview_uri", 1, "hit", "destination", str));
            return (nqe) bVar2.c();
        }

        public nqe h(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.f(n1.this.b);
            nqe.b bVar2 = bVar;
            bVar2.h(je.W("play", 1, "hit", "item_to_be_played", str));
            return (nqe) bVar2.c();
        }

        public nqe i() {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.f(n1.this.b);
            return (nqe) je.S("send_email_verification", 1, "hit", bVar);
        }

        public nqe j(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.f(n1.this.b);
            nqe.b bVar2 = bVar;
            bVar2.h(je.W("ui_navigate", 1, "hit", "destination", str));
            return (nqe) bVar2.c();
        }

        public nqe k(String str) {
            nqe.b f = nqe.f();
            f.e(this.a);
            nqe.b bVar = f;
            bVar.f(n1.this.b);
            nqe.b bVar2 = bVar;
            bVar2.h(je.W("unfollow", 1, "hit", "item_to_be_unfollowed", str));
            return (nqe) bVar2.c();
        }
    }

    public n1() {
        pqe pqe = pqe.b;
        rqe.b e = rqe.e();
        e.c("music");
        e.l("mobile-in-app-message");
        e.m("7.0.8");
        e.e("7.0.8");
        this.a = e.d();
        this.b = pqe;
    }

    public b c(String str, String str2) {
        return new b(str, str2, null);
    }
}
