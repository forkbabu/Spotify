package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.o;

public class e {
    private static final Map<String, n<d>> a = new HashMap();

    /* access modifiers changed from: package-private */
    public class a implements h<d> {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.airbnb.lottie.h
        public void a(d dVar) {
            e.a.remove(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements h<Throwable> {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.airbnb.lottie.h
        public void a(Throwable th) {
            e.a.remove(this.a);
        }
    }

    class c implements Callable<l<d>> {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        c(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public l<d> call() {
            return com.airbnb.lottie.network.b.b(this.a, this.b, this.c);
        }
    }

    class d implements Callable<l<d>> {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        d(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public l<d> call() {
            Context context = this.a;
            String str = this.b;
            String str2 = this.c;
            try {
                if (str.endsWith(".zip")) {
                    return e.m(new ZipInputStream(context.getAssets().open(str)), str2);
                }
                return e.f(context.getAssets().open(str), str2);
            } catch (IOException e) {
                return new l<>(e);
            }
        }
    }

    /* renamed from: com.airbnb.lottie.e$e  reason: collision with other inner class name */
    class CallableC0061e implements Callable<l<d>> {
        final /* synthetic */ WeakReference a;
        final /* synthetic */ Context b;
        final /* synthetic */ int c;

        CallableC0061e(WeakReference weakReference, Context context, int i) {
            this.a = weakReference;
            this.b = context;
            this.c = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public l<d> call() {
            Context context = (Context) this.a.get();
            if (context == null) {
                context = this.b;
            }
            return e.j(context, this.c);
        }
    }

    class f implements Callable<l<d>> {
        final /* synthetic */ InputStream a;
        final /* synthetic */ String b;

        f(InputStream inputStream, String str) {
            this.a = inputStream;
            this.b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public l<d> call() {
            return e.f(this.a, this.b);
        }
    }

    /* access modifiers changed from: package-private */
    public class g implements Callable<l<d>> {
        final /* synthetic */ d a;

        g(d dVar) {
            this.a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public l<d> call() {
            return new l<>(this.a);
        }
    }

    private static n<d> b(String str, Callable<l<d>> callable) {
        d a2 = str == null ? null : com.airbnb.lottie.model.f.b().a(str);
        if (a2 != null) {
            return new n<>(new g(a2));
        }
        if (str != null) {
            Map<String, n<d>> map = a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        n<d> nVar = new n<>(callable);
        if (str != null) {
            nVar.f(new a(str));
            nVar.e(new b(str));
            a.put(str, nVar);
        }
        return nVar;
    }

    public static n<d> c(Context context, String str) {
        String x0 = je.x0("asset_", str);
        return b(x0, new d(context.getApplicationContext(), str, x0));
    }

    public static n<d> d(Context context, String str, String str2) {
        return b(null, new d(context.getApplicationContext(), str, null));
    }

    public static n<d> e(InputStream inputStream, String str) {
        return b(str, new f(inputStream, str));
    }

    public static l<d> f(InputStream inputStream, String str) {
        try {
            return g(JsonReader.r(o.d(o.i(inputStream))), str, true);
        } finally {
            ee.b(inputStream);
        }
    }

    private static l<d> g(JsonReader jsonReader, String str, boolean z) {
        try {
            d a2 = id.a(jsonReader);
            if (str != null) {
                com.airbnb.lottie.model.f.b().c(str, a2);
            }
            l<d> lVar = new l<>(a2);
            if (z) {
                ee.b(jsonReader);
            }
            return lVar;
        } catch (Exception e) {
            l<d> lVar2 = new l<>(e);
            if (z) {
                ee.b(jsonReader);
            }
            return lVar2;
        } catch (Throwable th) {
            if (z) {
                ee.b(jsonReader);
            }
            throw th;
        }
    }

    public static n<d> h(Context context, int i) {
        return b(o(context, i), new CallableC0061e(new WeakReference(context), context.getApplicationContext(), i));
    }

    public static n<d> i(Context context, int i, String str) {
        return b(null, new CallableC0061e(new WeakReference(context), context.getApplicationContext(), i));
    }

    public static l<d> j(Context context, int i) {
        try {
            return f(context.getResources().openRawResource(i), o(context, i));
        } catch (Resources.NotFoundException e) {
            return new l<>(e);
        }
    }

    public static n<d> k(Context context, String str) {
        String x0 = je.x0("url_", str);
        return b(x0, new c(context, str, x0));
    }

    public static n<d> l(Context context, String str, String str2) {
        return b(null, new c(context, str, null));
    }

    public static l<d> m(ZipInputStream zipInputStream, String str) {
        try {
            return n(zipInputStream, str);
        } finally {
            ee.b(zipInputStream);
        }
    }

    private static l<d> n(ZipInputStream zipInputStream, String str) {
        g gVar;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            d dVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    dVar = g(JsonReader.r(o.d(o.i(zipInputStream))), null, false).b();
                } else {
                    if (!name.contains(".png")) {
                        if (!name.contains(".webp")) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (dVar == null) {
                return new l<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<g> it = dVar.i().values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        gVar = null;
                        break;
                    }
                    gVar = it.next();
                    if (gVar.b().equals(str2)) {
                        break;
                    }
                }
                if (gVar != null) {
                    gVar.f(ee.f((Bitmap) entry.getValue(), gVar.e(), gVar.c()));
                }
            }
            for (Map.Entry<String, g> entry2 : dVar.i().entrySet()) {
                if (entry2.getValue().a() == null) {
                    StringBuilder V0 = je.V0("There is no image for ");
                    V0.append(entry2.getValue().b());
                    return new l<>(new IllegalStateException(V0.toString()));
                }
            }
            if (str != null) {
                com.airbnb.lottie.model.f.b().c(str, dVar);
            }
            return new l<>(dVar);
        } catch (IOException e) {
            return new l<>(e);
        }
    }

    private static String o(Context context, int i) {
        StringBuilder V0 = je.V0("rawRes");
        V0.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        V0.append(i);
        return V0.toString();
    }
}
