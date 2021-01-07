package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.a0;
import com.facebook.internal.n;
import com.facebook.k;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class h {

    public interface a {
        Bundle a();

        Bundle getParameters();
    }

    public static boolean a(g gVar) {
        return b(gVar).e() != -1;
    }

    public static a0.g b(g gVar) {
        String e = k.e();
        String d = gVar.d();
        n.a c = n.c(e, d, gVar.name());
        return a0.m(d, c != null ? c.c() : new int[]{gVar.g()});
    }

    static JSONObject c(InputStream inputStream) {
        LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
        if (inputStream.read() != 0) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            int read = inputStream.read();
            if (read == -1) {
                String str = o.g;
                int i4 = y.e;
                k.v(loggingBehavior);
                return null;
            }
            i2 = (i2 << 8) + (read & BitmapRenderer.ALPHA_VISIBLE);
        }
        byte[] bArr = new byte[i2];
        while (i < i2) {
            int read2 = inputStream.read(bArr, i, i2 - i);
            if (read2 < 1) {
                String str2 = o.g;
                StringBuilder V0 = je.V0("readHeader: stream.read stopped at ");
                V0.append(Integer.valueOf(i));
                V0.append(" when expected ");
                V0.append(i2);
                V0.toString();
                int i5 = y.e;
                k.v(loggingBehavior);
                return null;
            }
            i += read2;
        }
        try {
            Object nextValue = new JSONTokener(new String(bArr)).nextValue();
            if (nextValue instanceof JSONObject) {
                return (JSONObject) nextValue;
            }
            String str3 = o.g;
            nextValue.getClass().getCanonicalName();
            int i6 = y.e;
            k.v(loggingBehavior);
            return null;
        } catch (JSONException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static void d(a aVar, a aVar2, g gVar) {
        Bundle bundle;
        Intent u;
        Context d = k.d();
        String d2 = gVar.d();
        a0.g b = b(gVar);
        int e = b.e();
        if (e != -1) {
            if (a0.r(e)) {
                bundle = aVar2.getParameters();
            } else {
                bundle = aVar2.a();
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            String uuid = aVar.b().toString();
            Intent intent = null;
            a0.f fVar = b.a;
            if (!(fVar == null || (u = a0.u(d, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(fVar.e()).addCategory("android.intent.category.DEFAULT"))) == null)) {
                a0.s(u, uuid, d2, b.b, bundle);
                intent = u;
            }
            if (intent != null) {
                aVar.g(intent);
                return;
            }
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
    }

    public static void e(a aVar, FacebookException facebookException) {
        h0.c(k.d(), true);
        Intent intent = new Intent();
        intent.setClass(k.d(), FacebookActivity.class);
        int i = FacebookActivity.B;
        intent.setAction("PassThrough");
        a0.s(intent, aVar.b().toString(), null, a0.p(), a0.d(facebookException));
        aVar.g(intent);
    }

    public static void f(a aVar, String str, Bundle bundle) {
        h0.c(k.d(), true);
        h0.d(k.d(), true);
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        a0.s(intent, aVar.b().toString(), str, a0.p(), bundle2);
        intent.setClass(k.d(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        aVar.g(intent);
    }

    static void g(OutputStream outputStream, JSONObject jSONObject) {
        byte[] bytes = jSONObject.toString().getBytes();
        outputStream.write(0);
        outputStream.write((bytes.length >> 16) & BitmapRenderer.ALPHA_VISIBLE);
        outputStream.write((bytes.length >> 8) & BitmapRenderer.ALPHA_VISIBLE);
        outputStream.write((bytes.length >> 0) & BitmapRenderer.ALPHA_VISIBLE);
        outputStream.write(bytes);
    }
}
