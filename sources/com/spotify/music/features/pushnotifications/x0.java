package com.spotify.music.features.pushnotifications;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.h;
import androidx.core.app.i;
import androidx.core.app.j;
import androidx.core.app.l;
import androidx.core.app.q;
import androidx.core.content.a;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.t;
import com.spotify.music.C0707R;
import com.spotify.music.features.pushnotifications.model.RichPushData;
import com.spotify.music.features.pushnotifications.model.RichPushFields;
import com.spotify.music.notification.NotificationCategoryEnum;
import com.spotify.pushnotifications.k;
import com.squareup.picasso.Picasso;
import java.util.Iterator;
import java.util.List;

public class x0 implements k {
    private final Context a;
    private final q b;
    private final t c;
    private final m0 d;
    private final yzd e;
    private final cqe f;
    private final ObjectMapper g;
    private final t0 h;
    private final Picasso i;
    private final u0 j;

    public x0(Context context, q qVar, t tVar, m0 m0Var, yzd yzd, cqe cqe, ObjectMapper objectMapper, t0 t0Var, Picasso picasso, u0 u0Var) {
        this.a = context;
        this.b = qVar;
        this.c = tVar;
        this.d = m0Var;
        this.e = yzd;
        this.f = cqe;
        this.g = objectMapper;
        this.h = t0Var;
        this.i = picasso;
        this.j = u0Var;
    }

    static void a(x0 x0Var, String str, String str2, String str3, String str4, String str5, String str6, List list, Bitmap bitmap) {
        int g2 = g(str4);
        androidx.core.app.k kVar = new androidx.core.app.k(x0Var.a, x0Var.f(str4, str5, str6));
        kVar.j(str);
        kVar.i(str2);
        kVar.q(bitmap);
        i iVar = new i();
        iVar.k(bitmap);
        iVar.l(str);
        iVar.m(str2);
        kVar.B(iVar);
        x0Var.d.getClass();
        kVar.z(C0707R.drawable.icn_notification);
        kVar.G(x0Var.f.e().getTimeInMillis());
        kVar.d(true);
        kVar.g(a.b(x0Var.a, R.color.green_light));
        kVar.n(x0Var.d.a(g2, str4, str5));
        kVar.h(x0Var.e(g2, str3, str4, str5));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kVar.b.add((h) it.next());
        }
        x0Var.b.h(g2, kVar.a());
    }

    static void d(x0 x0Var, String str, String str2, String str3, RichPushFields richPushFields, String str4, String str5, String str6, List list, Bitmap bitmap) {
        int g2 = g(str4);
        String f2 = x0Var.f(str4, str5, str6);
        RemoteViews remoteViews = new RemoteViews(x0Var.a.getPackageName(), (int) C0707R.layout.entity_ui_layout);
        RemoteViews remoteViews2 = new RemoteViews(x0Var.a.getPackageName(), (int) C0707R.layout.entiity_ui_layout_collapsed);
        remoteViews.setTextViewText(C0707R.id.entity_ui_title, richPushFields.getTitle());
        remoteViews.setTextViewText(C0707R.id.entity_ui_subtitle, richPushFields.getSubTitle());
        remoteViews.setTextViewText(C0707R.id.title, str);
        remoteViews.setTextViewText(C0707R.id.subtitle, str2);
        remoteViews2.setTextViewText(C0707R.id.collapsed_title, str);
        remoteViews2.setTextViewText(C0707R.id.collapsed_subtitle, str2);
        remoteViews.setImageViewBitmap(C0707R.id.entity_ui_image, bitmap);
        remoteViews2.setImageViewBitmap(C0707R.id.collapsed_image, bitmap);
        remoteViews.setOnClickPendingIntent(C0707R.id.play_button, x0Var.d.e(g2, str3, str4, str5));
        androidx.core.app.k kVar = new androidx.core.app.k(x0Var.a, f2);
        kVar.j(str);
        kVar.i(str2);
        kVar.B(new l());
        kVar.k(remoteViews);
        kVar.l(remoteViews2);
        x0Var.d.getClass();
        kVar.z(C0707R.drawable.icn_notification);
        kVar.G(x0Var.f.e().getTimeInMillis());
        kVar.d(true);
        kVar.g(a.b(x0Var.a, R.color.green_light));
        kVar.n(x0Var.d.a(g2, str4, str5));
        kVar.h(x0Var.e(g2, str3, str4, str5));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kVar.b.add((h) it.next());
        }
        x0Var.b.h(g2, kVar.a());
    }

    private PendingIntent e(int i2, String str, String str2, String str3) {
        PendingIntent b2;
        PendingIntent d2 = this.d.d(i2, false, str, str2, str3);
        this.j.getClass();
        return (!(!MoreObjects.isNullOrEmpty(str) && "client:notification:action:resend_email_verification".equalsIgnoreCase(str)) || (b2 = this.d.b(i2, str2, str3)) == null) ? d2 : b2;
    }

    private String f(String str, String str2, String str3) {
        String oSId = NotificationCategoryEnum.DEFAULT.getOSId();
        boolean a2 = this.b.a();
        if (Build.VERSION.SDK_INT >= 26) {
            Optional<NotificationCategoryEnum> b2 = this.h.b(oSId);
            if (!b2.isPresent() || !a2) {
                this.e.b(str, str2, str3);
            } else {
                oSId = b2.get().getOSId();
                if (!(str == null || str2 == null || str3 == null)) {
                    this.e.a(str, str2, str3);
                }
            }
        } else if (!a2) {
            this.e.b(str, str2, str3);
        } else if (!(str == null || str2 == null || str3 == null)) {
            this.e.a(str, str2, str3);
        }
        return oSId;
    }

    private static int g(String str) {
        int hashCode;
        if (str == null || (hashCode = str.hashCode()) == -1) {
            return 0;
        }
        return hashCode;
    }

    /* access modifiers changed from: private */
    public void k(String str, String str2, String str3, String str4, String str5, String str6, List<h> list) {
        int g2 = g(str4);
        androidx.core.app.k kVar = new androidx.core.app.k(this.a, f(str4, str5, str6));
        kVar.j(str);
        kVar.i(str2);
        j jVar = new j();
        jVar.j(str2);
        kVar.B(jVar);
        this.d.getClass();
        kVar.z(C0707R.drawable.icn_notification);
        kVar.G(this.f.e().getTimeInMillis());
        kVar.d(true);
        kVar.g(a.b(this.a, R.color.green_light));
        kVar.n(this.d.a(g2, str4, str5));
        kVar.h(e(g2, str3, str4, str5));
        for (h hVar : list) {
            kVar.b.add(hVar);
        }
        this.b.h(g2, kVar.a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a4 A[SYNTHETIC, Splitter:B:23:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d9 A[SYNTHETIC, Splitter:B:32:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(java.util.Map<java.lang.String, java.lang.String> r20) {
        /*
        // Method dump skipped, instructions count: 566
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.pushnotifications.x0.h(java.util.Map):void");
    }

    public /* synthetic */ void i(RichPushData richPushData, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.i.m(richPushData.getFields().getImageUrl()).o(new v0(this, str, str2, str3, richPushData, str4, str5, str6, list));
    }

    public /* synthetic */ void j(RichPushData richPushData, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.i.m(richPushData.getFields().getImageUrl()).o(new w0(this, str, str2, str3, str4, str5, str6, list));
    }
}
