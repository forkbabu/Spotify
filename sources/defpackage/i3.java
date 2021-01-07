package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import defpackage.j3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.Callable;

/* renamed from: i3  reason: default package */
public class i3 {
    static final r1<String, Typeface> a = new r1<>(16);
    private static final j3 b = new j3("fonts", 10, 10000);
    static final Object c = new Object();
    static final t1<String, ArrayList<j3.d<g>>> d = new t1<>();
    private static final Comparator<byte[]> e = new d();
    public static final /* synthetic */ int f = 0;

    /* renamed from: i3$a */
    class a implements Callable<g> {
        final /* synthetic */ Context a;
        final /* synthetic */ h3 b;
        final /* synthetic */ int c;
        final /* synthetic */ String f;

        a(Context context, h3 h3Var, int i, String str) {
            this.a = context;
            this.b = h3Var;
            this.c = i;
            this.f = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public g call() {
            g b2 = i3.b(this.a, this.b, this.c);
            Typeface typeface = b2.a;
            if (typeface != null) {
                i3.a.c(this.f, typeface);
            }
            return b2;
        }
    }

    /* renamed from: i3$b */
    class b implements j3.d<g> {
        final /* synthetic */ p2 a;
        final /* synthetic */ Handler b;

        b(p2 p2Var, Handler handler) {
            this.a = p2Var;
            this.b = handler;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.j3.d
        public void a(g gVar) {
            g gVar2 = gVar;
            if (gVar2 == null) {
                this.a.a(1, this.b);
                return;
            }
            int i = gVar2.b;
            if (i == 0) {
                this.a.b(gVar2.a, this.b);
            } else {
                this.a.a(i, this.b);
            }
        }
    }

    /* renamed from: i3$c */
    class c implements j3.d<g> {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        /* renamed from: b */
        public void a(g gVar) {
            ArrayList<j3.d<g>> arrayList;
            synchronized (i3.c) {
                t1<String, ArrayList<j3.d<g>>> t1Var = i3.d;
                arrayList = t1Var.get(this.a);
                if (arrayList != null) {
                    t1Var.remove(this.a);
                } else {
                    return;
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).a(gVar);
            }
        }
    }

    /* renamed from: i3$d */
    class d implements Comparator<byte[]> {
        d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length != bArr4.length) {
                i2 = bArr3.length;
                i = bArr4.length;
            } else {
                for (int i3 = 0; i3 < bArr3.length; i3++) {
                    if (bArr3[i3] != bArr4[i3]) {
                        i2 = bArr3[i3];
                        i = bArr4[i3];
                    }
                }
                return 0;
            }
            return (i2 == 1 ? 1 : 0) - (i == 1 ? 1 : 0);
        }
    }

    /* renamed from: i3$e */
    public static class e {
        private final int a;
        private final f[] b;

        public e(int i, f[] fVarArr) {
            this.a = i;
            this.b = fVarArr;
        }

        public f[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* renamed from: i3$f */
    public static class f {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            uri.getClass();
            this.a = uri;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        public int a() {
            return this.e;
        }

        public int b() {
            return this.b;
        }

        public Uri c() {
            return this.a;
        }

        public int d() {
            return this.c;
        }

        public boolean e() {
            return this.d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i3$g */
    public static final class g {
        final Typeface a;
        final int b;

        g(Typeface typeface, int i) {
            this.a = typeface;
            this.b = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.i3.e a(android.content.Context r20, android.os.CancellationSignal r21, defpackage.h3 r22) {
        /*
        // Method dump skipped, instructions count: 539
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i3.a(android.content.Context, android.os.CancellationSignal, h3):i3$e");
    }

    static g b(Context context, h3 h3Var, int i) {
        try {
            e a2 = a(context, null, h3Var);
            int i2 = -3;
            if (a2.b() == 0) {
                Typeface b2 = v2.b(context, null, a2.a(), i);
                if (b2 != null) {
                    i2 = 0;
                }
                return new g(b2, i2);
            }
            if (a2.b() == 1) {
                i2 = -2;
            }
            return new g(null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    public static Typeface c(Context context, h3 h3Var, p2 p2Var, Handler handler, boolean z, int i, int i2) {
        b bVar;
        String str = h3Var.b() + "-" + i2;
        Typeface b2 = a.b(str);
        if (b2 != null) {
            if (p2Var != null) {
                p2Var.d(b2);
            }
            return b2;
        } else if (!z || i != -1) {
            a aVar = new a(context, h3Var, i2, str);
            if (z) {
                try {
                    return ((g) b.e(aVar, i)).a;
                } catch (InterruptedException unused) {
                    return null;
                }
            } else {
                if (p2Var == null) {
                    bVar = null;
                } else {
                    bVar = new b(p2Var, handler);
                }
                synchronized (c) {
                    t1<String, ArrayList<j3.d<g>>> t1Var = d;
                    ArrayList<j3.d<g>> orDefault = t1Var.getOrDefault(str, null);
                    if (orDefault != null) {
                        if (bVar != null) {
                            orDefault.add(bVar);
                        }
                        return null;
                    }
                    if (bVar != null) {
                        ArrayList<j3.d<g>> arrayList = new ArrayList<>();
                        arrayList.add(bVar);
                        t1Var.put(str, arrayList);
                    }
                    b.d(aVar, new c(str));
                    return null;
                }
            }
        } else {
            g b3 = b(context, h3Var, i2);
            if (p2Var != null) {
                int i3 = b3.b;
                if (i3 == 0) {
                    p2Var.b(b3.a, handler);
                } else {
                    p2Var.a(i3, handler);
                }
            }
            return b3.a;
        }
    }
}
