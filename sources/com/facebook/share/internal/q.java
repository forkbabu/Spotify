package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.f0;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.h;
import com.facebook.share.model.i;
import com.facebook.share.model.j;
import com.spotify.player.model.ContextTrack;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class q {
    public static final Pattern a = Pattern.compile("^(.+)\\.(facebook\\.com)$");

    private static void a(Bundle bundle, h hVar, boolean z) {
        String str;
        if (hVar != null && (hVar instanceof ShareMessengerURLActionButton)) {
            ShareMessengerURLActionButton shareMessengerURLActionButton = (ShareMessengerURLActionButton) hVar;
            if (z) {
                str = f0.t(shareMessengerURLActionButton.f());
            } else {
                str = shareMessengerURLActionButton.a() + " - " + f0.t(shareMessengerURLActionButton.f());
            }
            f0.L(bundle, "TARGET_DISPLAY", str);
            f0.M(bundle, "ITEM_URL", shareMessengerURLActionButton.f());
        }
    }

    public static void b(Bundle bundle, ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        i h = shareMessengerGenericTemplateContent.h();
        if (h.a() != null) {
            a(bundle, h.a(), false);
        } else if (h.b() != null) {
            a(bundle, h.b(), true);
        }
        f0.M(bundle, "IMAGE", h.c());
        f0.L(bundle, "PREVIEW_TYPE", "DEFAULT");
        f0.L(bundle, "TITLE", h.f());
        f0.L(bundle, "SUBTITLE", h.e());
        JSONArray jSONArray = new JSONArray();
        i h2 = shareMessengerGenericTemplateContent.h();
        JSONObject put = new JSONObject().put("title", h2.f()).put(ContextTrack.Metadata.KEY_SUBTITLE, h2.e()).put("image_url", f0.t(h2.c()));
        if (h2.a() != null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(e(h2.a()));
            put.put("buttons", jSONArray2);
        }
        if (h2.b() != null) {
            put.put("default_action", f(h2.b(), true));
        }
        JSONArray put2 = jSONArray.put(put);
        JSONObject put3 = new JSONObject().put("template_type", "generic").put("sharable", shareMessengerGenericTemplateContent.j());
        ShareMessengerGenericTemplateContent.ImageAspectRatio i = shareMessengerGenericTemplateContent.i();
        f0.K(bundle, "MESSENGER_PLATFORM_CONTENT", new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", put3.put("image_aspect_ratio", (i != null && i.ordinal() == 1) ? "square" : "horizontal").put("elements", put2))));
    }

    public static void c(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        String str;
        a(bundle, shareMessengerMediaTemplateContent.i(), false);
        f0.L(bundle, "PREVIEW_TYPE", "DEFAULT");
        f0.L(bundle, "ATTACHMENT_ID", shareMessengerMediaTemplateContent.h());
        if (shareMessengerMediaTemplateContent.k() != null) {
            String host = shareMessengerMediaTemplateContent.k().getHost();
            f0.M(bundle, (f0.C(host) || !a.matcher(host).matches()) ? "IMAGE" : "uri", shareMessengerMediaTemplateContent.k());
        }
        ShareMessengerMediaTemplateContent.MediaType j = shareMessengerMediaTemplateContent.j();
        String str2 = "video";
        if (j != null && j.ordinal() == 1) {
            str = str2;
        } else {
            str = "image";
        }
        f0.L(bundle, "type", str);
        JSONArray jSONArray = new JSONArray();
        JSONObject put = new JSONObject().put("attachment_id", shareMessengerMediaTemplateContent.h()).put("url", f0.t(shareMessengerMediaTemplateContent.k()));
        ShareMessengerMediaTemplateContent.MediaType j2 = shareMessengerMediaTemplateContent.j();
        if (j2 == null || j2.ordinal() != 1) {
            str2 = "image";
        }
        JSONObject put2 = put.put("media_type", str2);
        if (shareMessengerMediaTemplateContent.i() != null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(e(shareMessengerMediaTemplateContent.i()));
            put2.put("buttons", jSONArray2);
        }
        f0.K(bundle, "MESSENGER_PLATFORM_CONTENT", new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "media").put("elements", jSONArray.put(put2)))));
    }

    public static void d(Bundle bundle, j jVar) {
        a(bundle, jVar.h(), false);
        f0.L(bundle, "PREVIEW_TYPE", "OPEN_GRAPH");
        f0.M(bundle, "OPEN_GRAPH_URL", jVar.i());
        JSONArray jSONArray = new JSONArray();
        JSONObject put = new JSONObject().put("url", f0.t(jVar.i()));
        if (jVar.h() != null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(e(jVar.h()));
            put.put("buttons", jSONArray2);
        }
        f0.K(bundle, "MESSENGER_PLATFORM_CONTENT", new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "open_graph").put("elements", jSONArray.put(put)))));
    }

    private static JSONObject e(h hVar) {
        return f(hVar, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONObject f(com.facebook.share.model.h r4, boolean r5) {
        /*
            boolean r0 = r4 instanceof com.facebook.share.model.ShareMessengerURLActionButton
            r1 = 0
            if (r0 == 0) goto L_0x0076
            com.facebook.share.model.ShareMessengerURLActionButton r4 = (com.facebook.share.model.ShareMessengerURLActionButton) r4
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "type"
            java.lang.String r3 = "web_url"
            org.json.JSONObject r0 = r0.put(r2, r3)
            if (r5 == 0) goto L_0x0018
            r5 = r1
            goto L_0x001c
        L_0x0018:
            java.lang.String r5 = r4.a()
        L_0x001c:
            java.lang.String r2 = "title"
            org.json.JSONObject r5 = r0.put(r2, r5)
            android.net.Uri r0 = r4.f()
            java.lang.String r0 = com.facebook.internal.f0.t(r0)
            java.lang.String r2 = "url"
            org.json.JSONObject r5 = r5.put(r2, r0)
            com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio r0 = r4.g()
            if (r0 != 0) goto L_0x0037
            goto L_0x0041
        L_0x0037:
            int r0 = r0.ordinal()
            r2 = 1
            if (r0 == r2) goto L_0x0047
            r2 = 2
            if (r0 == r2) goto L_0x0044
        L_0x0041:
            java.lang.String r0 = "full"
            goto L_0x0049
        L_0x0044:
            java.lang.String r0 = "compact"
            goto L_0x0049
        L_0x0047:
            java.lang.String r0 = "tall"
        L_0x0049:
            java.lang.String r2 = "webview_height_ratio"
            org.json.JSONObject r5 = r5.put(r2, r0)
            boolean r0 = r4.c()
            java.lang.String r2 = "messenger_extensions"
            org.json.JSONObject r5 = r5.put(r2, r0)
            android.net.Uri r0 = r4.b()
            java.lang.String r0 = com.facebook.internal.f0.t(r0)
            java.lang.String r2 = "fallback_url"
            org.json.JSONObject r5 = r5.put(r2, r0)
            boolean r4 = r4.e()
            if (r4 == 0) goto L_0x006f
            java.lang.String r1 = "hide"
        L_0x006f:
            java.lang.String r4 = "webview_share_button"
            org.json.JSONObject r4 = r5.put(r4, r1)
            return r4
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.q.f(com.facebook.share.model.h, boolean):org.json.JSONObject");
    }
}
