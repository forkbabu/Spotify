package com.facebook.share.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.HttpMethod;
import com.facebook.i;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.a;
import com.facebook.internal.a0;
import com.facebook.internal.f0;
import com.facebook.internal.h0;
import com.facebook.internal.z;
import com.facebook.m;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.b;
import com.facebook.share.model.d;
import com.facebook.share.model.e;
import com.facebook.share.model.f;
import com.facebook.share.model.g;
import com.facebook.share.model.h;
import com.facebook.share.model.j;
import com.facebook.share.model.k;
import com.facebook.share.model.l;
import com.facebook.share.model.m;
import com.facebook.share.model.n;
import com.facebook.share.model.o;
import com.facebook.share.model.p;
import com.facebook.share.model.q;
import com.facebook.share.model.r;
import com.facebook.share.model.s;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    private static v a;
    private static v b;
    private static v c;

    public static JSONArray A(JSONArray jSONArray, boolean z) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = A((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = B((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    public static JSONObject B(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = B((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = A((JSONArray) obj, true);
                }
                Pair<String, String> q = q(string);
                String str = (String) q.first;
                String str2 = (String) q.second;
                if (z) {
                    if (str == null || !str.equals("fbsdk")) {
                        if (str != null) {
                            if (!str.equals("og")) {
                                jSONObject3.put(str2, obj);
                            }
                        }
                        jSONObject2.put(str2, obj);
                    } else {
                        jSONObject2.put(string, obj);
                    }
                } else if (str == null || !str.equals("fb")) {
                    jSONObject2.put(str2, obj);
                } else {
                    jSONObject2.put(string, obj);
                }
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new FacebookException("Failed to create json object from share content");
        }
    }

    public static JSONObject C(k kVar, r rVar) {
        JSONObject jSONObject = new JSONObject();
        for (String str : kVar.e()) {
            jSONObject.put(str, F(kVar.a(str), rVar));
        }
        return jSONObject;
    }

    public static JSONObject D(UUID uuid, l lVar) {
        HashSet hashSet;
        k h = lVar.h();
        ArrayList arrayList = new ArrayList();
        JSONObject C = C(h, new f0(uuid, arrayList));
        z.a(arrayList);
        if (lVar.e() != null && f0.C(C.optString("place"))) {
            C.put("place", lVar.e());
        }
        if (lVar.c() != null) {
            JSONArray optJSONArray = C.optJSONArray("tags");
            if (optJSONArray == null) {
                hashSet = new HashSet();
            } else {
                HashSet hashSet2 = new HashSet();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    hashSet2.add(optJSONArray.getString(i));
                }
                hashSet = hashSet2;
            }
            for (String str : lVar.c()) {
                hashSet.add(str);
            }
            C.put("tags", new JSONArray((Collection) hashSet));
        }
        return C;
    }

    public static JSONObject E(l lVar) {
        return C(lVar.h(), new g0());
    }

    public static Object F(Object obj, r rVar) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof o) {
            if (rVar != null) {
                return rVar.a((o) obj);
            }
            return null;
        } else if (obj instanceof m) {
            m mVar = (m) obj;
            JSONObject jSONObject = new JSONObject();
            for (String str : mVar.e()) {
                jSONObject.put(str, F(mVar.a(str), rVar));
            }
            return jSONObject;
        } else if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            for (Object obj2 : (List) obj) {
                jSONArray.put(F(obj2, rVar));
            }
            return jSONArray;
        } else {
            StringBuilder V0 = je.V0("Invalid object found for JSON serialization: ");
            V0.append(obj.toString());
            throw new IllegalArgumentException(V0.toString());
        }
    }

    private static void G(d dVar, v vVar) {
        if (dVar == null) {
            throw new FacebookException("Must provide non-null content to share");
        } else if (dVar instanceof f) {
            vVar.getClass();
            Uri j = ((f) dVar).j();
            if (!(j == null || f0.E(j))) {
                throw new FacebookException("Image Url must be an http:// or https:// url");
            }
        } else if (dVar instanceof p) {
            vVar.getClass();
            List<o> h = ((p) dVar).h();
            if (h == null || h.isEmpty()) {
                throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
            } else if (h.size() <= 6) {
                for (o oVar : h) {
                    vVar.f(oVar);
                }
            } else {
                throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", 6));
            }
        } else if (dVar instanceof s) {
            vVar.i((s) dVar);
        } else if (dVar instanceof l) {
            vVar.d((l) dVar);
        } else if (dVar instanceof g) {
            vVar.c((g) dVar);
        } else if (dVar instanceof com.facebook.share.model.c) {
            vVar.getClass();
            if (f0.C(((com.facebook.share.model.c) dVar).i())) {
                throw new FacebookException("Must specify a non-empty effectId");
            }
        } else if (dVar instanceof j) {
            vVar.getClass();
            d((j) dVar);
        } else if (dVar instanceof ShareMessengerMediaTemplateContent) {
            vVar.getClass();
            f((ShareMessengerMediaTemplateContent) dVar);
        } else if (dVar instanceof ShareMessengerGenericTemplateContent) {
            vVar.getClass();
            e((ShareMessengerGenericTemplateContent) dVar);
        } else if (dVar instanceof q) {
            vVar.g((q) dVar);
        }
    }

    public static void H(d dVar) {
        if (b == null) {
            b = new v(null);
        }
        G(dVar, b);
    }

    public static void I(d dVar) {
        if (b == null) {
            b = new v(null);
        }
        G(dVar, b);
    }

    public static void J(d dVar) {
        if (c == null) {
            c = new u(null);
        }
        G(dVar, c);
    }

    public static void K(d dVar) {
        if (a == null) {
            a = new w(null);
        }
        G(dVar, a);
    }

    private static void L(Object obj, v vVar) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            vVar.getClass();
            if (mVar != null) {
                vVar.e(mVar, true);
                return;
            }
            throw new FacebookException("Cannot share a null ShareOpenGraphObject");
        } else if (obj instanceof o) {
            vVar.f((o) obj);
        }
    }

    private static void M(o oVar) {
        if (oVar != null) {
            Bitmap c2 = oVar.c();
            Uri f = oVar.f();
            if (c2 == null && f == null) {
                throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            return;
        }
        throw new FacebookException("Cannot share a null SharePhoto");
    }

    private static void N(h hVar) {
        if (hVar != null) {
            if (f0.C(hVar.a())) {
                throw new FacebookException("Must specify title for ShareMessengerActionButton");
            } else if ((hVar instanceof ShareMessengerURLActionButton) && ((ShareMessengerURLActionButton) hVar).f() == null) {
                throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
            }
        }
    }

    static z.b a(UUID uuid, ShareMedia shareMedia) {
        Uri uri;
        Bitmap bitmap;
        if (shareMedia instanceof o) {
            o oVar = (o) shareMedia;
            bitmap = oVar.c();
            uri = oVar.f();
        } else if (shareMedia instanceof r) {
            uri = ((r) shareMedia).c();
            bitmap = null;
        } else {
            uri = null;
            bitmap = null;
        }
        if (bitmap != null) {
            return z.c(uuid, bitmap);
        }
        if (uri != null) {
            return z.d(uuid, uri);
        }
        return null;
    }

    static void b(n nVar, v vVar, boolean z) {
        for (String str : nVar.e()) {
            if (z) {
                String[] split = str.split(":");
                if (split.length >= 2) {
                    for (String str2 : split) {
                        if (str2.isEmpty()) {
                            throw new FacebookException("Invalid key found in Open Graph dictionary: %s", str);
                        }
                    }
                } else {
                    throw new FacebookException("Open Graph keys must be namespaced: %s", str);
                }
            }
            Object a2 = nVar.a(str);
            if (a2 instanceof List) {
                for (Object obj : (List) a2) {
                    if (obj != null) {
                        L(obj, vVar);
                    } else {
                        throw new FacebookException("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                    }
                }
                continue;
            } else {
                L(a2, vVar);
            }
        }
    }

    static void c(o oVar, v vVar) {
        M(oVar);
        Bitmap c2 = oVar.c();
        Uri f = oVar.f();
        if (c2 == null && f0.E(f) && !vVar.a()) {
            throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
        } else if (oVar.c() != null || !f0.E(oVar.f())) {
            Context d = com.facebook.k.d();
            h0.f(d, "context");
            String a2 = h0.a();
            PackageManager packageManager = d.getPackageManager();
            if (packageManager != null) {
                String x0 = je.x0("com.facebook.app.FacebookContentProvider", a2);
                if (packageManager.resolveContentProvider(x0, 0) == null) {
                    throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", x0));
                }
            }
        }
    }

    static void d(j jVar) {
        if (f0.C(jVar.b())) {
            throw new FacebookException("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
        } else if (jVar.i() != null) {
            N(jVar.h());
        } else {
            throw new FacebookException("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
        }
    }

    static void e(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        if (f0.C(shareMessengerGenericTemplateContent.b())) {
            throw new FacebookException("Must specify Page Id for ShareMessengerGenericTemplateContent");
        } else if (shareMessengerGenericTemplateContent.h() == null) {
            throw new FacebookException("Must specify element for ShareMessengerGenericTemplateContent");
        } else if (!f0.C(shareMessengerGenericTemplateContent.h().f())) {
            N(shareMessengerGenericTemplateContent.h().a());
        } else {
            throw new FacebookException("Must specify title for ShareMessengerGenericTemplateElement");
        }
    }

    static void f(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (f0.C(shareMessengerMediaTemplateContent.b())) {
            throw new FacebookException("Must specify Page Id for ShareMessengerMediaTemplateContent");
        } else if (shareMessengerMediaTemplateContent.k() != null || !f0.C(shareMessengerMediaTemplateContent.h())) {
            N(shareMessengerMediaTemplateContent.i());
        } else {
            throw new FacebookException("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
        }
    }

    static void g(q qVar, v vVar) {
        if (qVar == null || (qVar.i() == null && qVar.k() == null)) {
            throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (qVar.i() != null) {
            vVar.b(qVar.i());
        }
        if (qVar.k() != null) {
            vVar.f(qVar.k());
        }
    }

    static void h(o oVar, v vVar) {
        M(oVar);
    }

    public static Bundle i(f fVar) {
        Bundle n = n(fVar);
        f0.M(n, "href", fVar.a());
        f0.L(n, "quote", fVar.k());
        return n;
    }

    public static Bundle j(l lVar) {
        Bundle n = n(lVar);
        f0.L(n, "action_type", lVar.h().f());
        try {
            JSONObject B = B(C(lVar.h(), new g0()), false);
            if (B != null) {
                f0.L(n, "action_properties", B.toString());
            }
            return n;
        } catch (JSONException e) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", e);
        }
    }

    public static Bundle k(p pVar) {
        Bundle n = n(pVar);
        String[] strArr = new String[pVar.h().size()];
        f0.G(pVar.h(), new i0()).toArray(strArr);
        n.putStringArray("media", strArr);
        return n;
    }

    public static Bundle l(UUID uuid, d dVar, boolean z) {
        h0.f(dVar, "shareContent");
        h0.f(uuid, "callId");
        if (dVar instanceof f) {
            f fVar = (f) dVar;
            Bundle o = o(fVar, z);
            f0.L(o, "com.facebook.platform.extra.TITLE", fVar.i());
            f0.L(o, "com.facebook.platform.extra.DESCRIPTION", fVar.h());
            f0.M(o, "com.facebook.platform.extra.IMAGE", fVar.j());
            return o;
        } else if (dVar instanceof p) {
            p pVar = (p) dVar;
            List<String> r = r(pVar, uuid);
            Bundle o2 = o(pVar, z);
            o2.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList<>(r));
            return o2;
        } else if (dVar instanceof s) {
            s sVar = (s) dVar;
            return null;
        } else if (!(dVar instanceof l)) {
            return null;
        } else {
            l lVar = (l) dVar;
            try {
                JSONObject D = D(uuid, lVar);
                Bundle o3 = o(lVar, z);
                f0.L(o3, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", lVar.i());
                f0.L(o3, "com.facebook.platform.extra.ACTION_TYPE", lVar.h().f());
                f0.L(o3, "com.facebook.platform.extra.ACTION", D.toString());
                return o3;
            } catch (JSONException e) {
                StringBuilder V0 = je.V0("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
                V0.append(e.getMessage());
                throw new FacebookException(V0.toString());
            }
        }
    }

    public static Bundle m(UUID uuid, d dVar, boolean z) {
        Bundle bundle;
        Bundle p;
        z.b bVar;
        h0.f(dVar, "shareContent");
        h0.f(uuid, "callId");
        Bundle bundle2 = null;
        String str = null;
        List list = null;
        Bundle bundle3 = null;
        if (dVar instanceof f) {
            f fVar = (f) dVar;
            Bundle p2 = p(fVar, z);
            f0.L(p2, "TITLE", fVar.i());
            f0.L(p2, "DESCRIPTION", fVar.h());
            f0.M(p2, "IMAGE", fVar.j());
            f0.L(p2, "QUOTE", fVar.k());
            f0.M(p2, "MESSENGER_LINK", fVar.a());
            f0.M(p2, "TARGET_DISPLAY", fVar.a());
            return p2;
        } else if (dVar instanceof p) {
            p pVar = (p) dVar;
            List<String> r = r(pVar, uuid);
            Bundle p3 = p(pVar, z);
            p3.putStringArrayList("PHOTOS", new ArrayList<>(r));
            return p3;
        } else {
            if (dVar instanceof s) {
                s sVar = (s) dVar;
                if (sVar.k() != null) {
                    z.b d = z.d(uuid, sVar.k().c());
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(d);
                    z.a(arrayList);
                    str = d.g();
                }
                p = p(sVar, z);
                f0.L(p, "TITLE", sVar.i());
                f0.L(p, "DESCRIPTION", sVar.h());
                f0.L(p, "VIDEO", str);
            } else if (dVar instanceof l) {
                l lVar = (l) dVar;
                try {
                    JSONObject B = B(D(uuid, lVar), false);
                    Bundle p4 = p(lVar, z);
                    f0.L(p4, "PREVIEW_PROPERTY_NAME", (String) q(lVar.i()).second);
                    f0.L(p4, "ACTION_TYPE", lVar.h().f());
                    f0.L(p4, "ACTION", B.toString());
                    return p4;
                } catch (JSONException e) {
                    StringBuilder V0 = je.V0("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
                    V0.append(e.getMessage());
                    throw new FacebookException(V0.toString());
                }
            } else if (dVar instanceof g) {
                g gVar = (g) dVar;
                List<ShareMedia> h = gVar.h();
                if (h != null) {
                    ArrayList arrayList2 = new ArrayList();
                    list = f0.G(h, new e0(uuid, arrayList2));
                    z.a(arrayList2);
                }
                p = p(gVar, z);
                p.putParcelableArrayList("MEDIA", new ArrayList<>(list));
            } else if (dVar instanceof com.facebook.share.model.c) {
                com.facebook.share.model.c cVar = (com.facebook.share.model.c) dVar;
                b j = cVar.j();
                if (j != null) {
                    Bundle bundle4 = new Bundle();
                    ArrayList arrayList3 = new ArrayList();
                    for (String str2 : j.e()) {
                        Uri c2 = j.c(str2);
                        Bitmap b2 = j.b(str2);
                        if (b2 != null) {
                            bVar = z.c(uuid, b2);
                        } else {
                            bVar = c2 != null ? z.d(uuid, c2) : null;
                        }
                        arrayList3.add(bVar);
                        bundle4.putString(str2, bVar.g());
                    }
                    z.a(arrayList3);
                    bundle3 = bundle4;
                }
                p = p(cVar, z);
                f0.L(p, "effect_id", cVar.i());
                if (bundle3 != null) {
                    p.putBundle("effect_textures", bundle3);
                }
                try {
                    JSONObject a2 = a.a(cVar.h());
                    if (a2 != null) {
                        f0.L(p, "effect_arguments", a2.toString());
                    }
                } catch (JSONException e2) {
                    StringBuilder V02 = je.V0("Unable to create a JSON Object from the provided CameraEffectArguments: ");
                    V02.append(e2.getMessage());
                    throw new FacebookException(V02.toString());
                }
            } else if (dVar instanceof ShareMessengerGenericTemplateContent) {
                ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent = (ShareMessengerGenericTemplateContent) dVar;
                Bundle p5 = p(shareMessengerGenericTemplateContent, z);
                try {
                    q.b(p5, shareMessengerGenericTemplateContent);
                    return p5;
                } catch (JSONException e3) {
                    StringBuilder V03 = je.V0("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: ");
                    V03.append(e3.getMessage());
                    throw new FacebookException(V03.toString());
                }
            } else if (dVar instanceof j) {
                j jVar = (j) dVar;
                Bundle p6 = p(jVar, z);
                try {
                    q.d(p6, jVar);
                    return p6;
                } catch (JSONException e4) {
                    StringBuilder V04 = je.V0("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: ");
                    V04.append(e4.getMessage());
                    throw new FacebookException(V04.toString());
                }
            } else if (dVar instanceof ShareMessengerMediaTemplateContent) {
                ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent = (ShareMessengerMediaTemplateContent) dVar;
                Bundle p7 = p(shareMessengerMediaTemplateContent, z);
                try {
                    q.c(p7, shareMessengerMediaTemplateContent);
                    return p7;
                } catch (JSONException e5) {
                    StringBuilder V05 = je.V0("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: ");
                    V05.append(e5.getMessage());
                    throw new FacebookException(V05.toString());
                }
            } else if (!(dVar instanceof q)) {
                return null;
            } else {
                q qVar = (q) dVar;
                if (qVar.i() == null) {
                    bundle = null;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(qVar.i());
                    ArrayList arrayList5 = new ArrayList();
                    List G = f0.G(arrayList4, new z(uuid, arrayList5));
                    z.a(arrayList5);
                    bundle = (Bundle) G.get(0);
                }
                if (qVar.k() != null) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(qVar.k());
                    List G2 = f0.G(arrayList6, new h0(uuid));
                    List G3 = f0.G(G2, new y());
                    z.a(G2);
                    bundle2 = (Bundle) G3.get(0);
                }
                p = p(qVar, z);
                if (bundle != null) {
                    p.putParcelable("bg_asset", bundle);
                }
                if (bundle2 != null) {
                    p.putParcelable("interactive_asset_uri", bundle2);
                }
                List<String> j2 = qVar.j();
                if (!f0.D(j2)) {
                    p.putStringArrayList("top_background_color_list", new ArrayList<>(j2));
                }
                f0.L(p, "content_url", qVar.h());
            }
            return p;
        }
    }

    public static Bundle n(d dVar) {
        Bundle bundle = new Bundle();
        e g = dVar.g();
        if (g != null) {
            f0.L(bundle, "hashtag", g.a());
        }
        return bundle;
    }

    private static Bundle o(d dVar, boolean z) {
        Bundle bundle = new Bundle();
        f0.M(bundle, "com.facebook.platform.extra.LINK", dVar.a());
        f0.L(bundle, "com.facebook.platform.extra.PLACE", dVar.e());
        f0.L(bundle, "com.facebook.platform.extra.REF", dVar.f());
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List<String> c2 = dVar.c();
        if (!f0.D(c2)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList<>(c2));
        }
        return bundle;
    }

    private static Bundle p(d dVar, boolean z) {
        Bundle bundle = new Bundle();
        f0.M(bundle, "LINK", dVar.a());
        f0.L(bundle, "PLACE", dVar.e());
        f0.L(bundle, "PAGE", dVar.b());
        f0.L(bundle, "REF", dVar.f());
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        List<String> c2 = dVar.c();
        if (!f0.D(c2)) {
            bundle.putStringArrayList("FRIENDS", new ArrayList<>(c2));
        }
        e g = dVar.g();
        if (g != null) {
            f0.L(bundle, "HASHTAG", g.a());
        }
        return bundle;
    }

    public static Pair<String, String> q(String str) {
        String str2;
        int i;
        int indexOf = str.indexOf(58);
        if (indexOf == -1 || str.length() <= (i = indexOf + 1)) {
            str2 = null;
        } else {
            str2 = str.substring(0, indexOf);
            str = str.substring(i);
        }
        return new Pair<>(str2, str);
    }

    public static List<String> r(p pVar, UUID uuid) {
        List<o> h = pVar.h();
        if (h == null) {
            return null;
        }
        List G = f0.G(h, new c0(uuid));
        List<String> G2 = f0.G(G, new d0());
        z.a(G);
        return G2;
    }

    public static String s(Uri uri) {
        String uri2;
        int lastIndexOf;
        if (uri == null || (lastIndexOf = (uri2 = uri.toString()).lastIndexOf(46)) == -1) {
            return null;
        }
        return uri2.substring(lastIndexOf);
    }

    public static boolean t(int i, int i2, Intent intent, s sVar) {
        a aVar;
        boolean z;
        UUID k = a0.k(intent);
        Bundle bundle = null;
        if (k == null) {
            aVar = null;
        } else {
            aVar = a.a(k, i);
        }
        if (aVar == null) {
            return false;
        }
        z.b(aVar.b());
        Bundle j = a0.j(intent);
        if (j != null) {
            z = j.containsKey(AppProtocol.LogMessage.SEVERITY_ERROR);
        } else {
            z = intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        }
        if (z) {
            Bundle j2 = a0.j(intent);
            if (j2 != null) {
                bundle = j2.getBundle(AppProtocol.LogMessage.SEVERITY_ERROR);
            } else {
                bundle = intent.getExtras();
            }
        }
        FacebookException l = a0.l(bundle);
        if (l == null) {
            int intExtra = intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
            Bundle extras = intent.getExtras();
            if (a0.r(intExtra) && extras != null) {
                extras = extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
            }
            sVar.c(aVar, extras);
        } else if (l instanceof FacebookOperationCanceledException) {
            sVar.a(aVar);
        } else {
            sVar.b(aVar, l);
        }
        return true;
    }

    static void u(i<com.facebook.share.b> iVar) {
        x("cancelled", null);
        if (iVar != null) {
            iVar.b();
        }
    }

    static void v(i<com.facebook.share.b> iVar, FacebookException facebookException) {
        x(AppProtocol.LogMessage.SEVERITY_ERROR, facebookException.getMessage());
        if (iVar != null) {
            iVar.a(facebookException);
        }
    }

    static void w(i<com.facebook.share.b> iVar, String str) {
        x("succeeded", null);
        if (iVar != null) {
            iVar.onSuccess(new com.facebook.share.b(str));
        }
    }

    private static void x(String str, String str2) {
        com.facebook.appevents.i iVar = new com.facebook.appevents.i(com.facebook.k.d());
        Bundle E = je.E("fb_share_dialog_outcome", str);
        if (str2 != null) {
            E.putString("error_message", str2);
        }
        iVar.g("fb_share_dialog_result", E);
    }

    public static com.facebook.m y(com.facebook.a aVar, Uri uri, m.c cVar) {
        HttpMethod httpMethod = HttpMethod.POST;
        if (f0.B(uri)) {
            m.f fVar = new m.f(ParcelFileDescriptor.open(new File(uri.getPath()), 268435456), "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", fVar);
            return new com.facebook.m(aVar, "me/staging_resources", bundle, httpMethod, cVar);
        } else if (f0.z(uri)) {
            m.f fVar2 = new m.f(uri, "image/png");
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable("file", fVar2);
            return new com.facebook.m(aVar, "me/staging_resources", bundle2, httpMethod, cVar);
        } else {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
    }

    public static void z(int i) {
        CallbackManagerImpl.c(i, new b0(i));
    }
}
