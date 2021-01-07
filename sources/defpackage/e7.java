package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: e7  reason: default package */
public final class e7 {
    static final c f = new a();
    private final List<e> a;
    private final List<f7> b;
    private final Map<f7, e> c = new m1();
    private final SparseBooleanArray d = new SparseBooleanArray();
    private final e e;

    /* renamed from: e7$a */
    static class a implements c {
        a() {
        }

        @Override // defpackage.e7.c
        public boolean a(int i, float[] fArr) {
            if (fArr[2] >= 0.95f) {
                return false;
            }
            if (fArr[2] <= 0.05f) {
                return false;
            }
            if (!(fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: e7$b */
    public static final class b {
        private final Bitmap a;
        private final List<f7> b;
        private int c = 16;
        private int d = 12544;
        private int e = -1;
        private final List<c> f;

        /* renamed from: e7$b$a */
        class a extends AsyncTask<Bitmap, Void, e7> {
            final /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
            /* access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public e7 doInBackground(Bitmap[] bitmapArr) {
                try {
                    return b.this.b();
                } catch (Exception e) {
                    Log.e("Palette", "Exception thrown during async generate", e);
                    return null;
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(e7 e7Var) {
                this.a.a(e7Var);
            }
        }

        public b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(e7.f);
            this.a = bitmap;
            arrayList.add(f7.d);
            arrayList.add(f7.e);
            arrayList.add(f7.f);
            arrayList.add(f7.g);
            arrayList.add(f7.h);
            arrayList.add(f7.i);
        }

        public AsyncTask<Bitmap, Void, e7> a(d dVar) {
            if (dVar != null) {
                return new a(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.a);
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        public e7 b() {
            c[] cVarArr;
            int max;
            int i;
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                double d2 = -1.0d;
                if (this.d > 0) {
                    int height = bitmap.getHeight() * bitmap.getWidth();
                    int i2 = this.d;
                    if (height > i2) {
                        double d3 = (double) i2;
                        double d4 = (double) height;
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        d2 = Math.sqrt(d3 / d4);
                    }
                } else if (this.e > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.e)) {
                    double d5 = (double) i;
                    double d6 = (double) max;
                    Double.isNaN(d5);
                    Double.isNaN(d6);
                    Double.isNaN(d5);
                    Double.isNaN(d6);
                    d2 = d5 / d6;
                }
                if (d2 > 0.0d) {
                    double width = (double) bitmap.getWidth();
                    Double.isNaN(width);
                    Double.isNaN(width);
                    int ceil = (int) Math.ceil(width * d2);
                    double height2 = (double) bitmap.getHeight();
                    Double.isNaN(height2);
                    Double.isNaN(height2);
                    bitmap = Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height2 * d2), false);
                }
                Bitmap bitmap2 = this.a;
                int width2 = bitmap.getWidth();
                int height3 = bitmap.getHeight();
                int[] iArr = new int[(width2 * height3)];
                bitmap.getPixels(iArr, 0, width2, 0, 0, width2, height3);
                int i3 = this.c;
                if (this.f.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<c> list = this.f;
                    cVarArr = (c[]) list.toArray(new c[list.size()]);
                }
                d7 d7Var = new d7(iArr, i3, cVarArr);
                if (bitmap != this.a) {
                    bitmap.recycle();
                }
                e7 e7Var = new e7(d7Var.c, this.b);
                e7Var.a();
                return e7Var;
            }
            throw new AssertionError();
        }

        public b c(int i) {
            this.c = i;
            return this;
        }
    }

    /* renamed from: e7$c */
    public interface c {
        boolean a(int i, float[] fArr);
    }

    /* renamed from: e7$d */
    public interface d {
        void a(e7 e7Var);
    }

    /* renamed from: e7$e */
    public static final class e {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private boolean f;
        private int g;
        private int h;
        private float[] i;

        public e(int i2, int i3) {
            this.a = Color.red(i2);
            this.b = Color.green(i2);
            this.c = Color.blue(i2);
            this.d = i2;
            this.e = i3;
        }

        private void a() {
            int i2;
            int i3;
            if (!this.f) {
                int d2 = s2.d(-1, this.d, 4.5f);
                int d3 = s2.d(-1, this.d, 3.0f);
                if (d2 == -1 || d3 == -1) {
                    int d4 = s2.d(-16777216, this.d, 4.5f);
                    int d5 = s2.d(-16777216, this.d, 3.0f);
                    if (d4 == -1 || d5 == -1) {
                        if (d2 != -1) {
                            i2 = s2.h(-1, d2);
                        } else {
                            i2 = s2.h(-16777216, d4);
                        }
                        this.h = i2;
                        if (d3 != -1) {
                            i3 = s2.h(-1, d3);
                        } else {
                            i3 = s2.h(-16777216, d5);
                        }
                        this.g = i3;
                        this.f = true;
                        return;
                    }
                    this.h = s2.h(-16777216, d4);
                    this.g = s2.h(-16777216, d5);
                    this.f = true;
                    return;
                }
                this.h = s2.h(-1, d2);
                this.g = s2.h(-1, d3);
                this.f = true;
            }
        }

        public float[] b() {
            if (this.i == null) {
                this.i = new float[3];
            }
            s2.a(this.a, this.b, this.c, this.i);
            return this.i;
        }

        public int c() {
            return this.e;
        }

        public int d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.e == eVar.e && this.d == eVar.d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.d * 31) + this.e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(e.class.getSimpleName());
            sb.append(" [RGB: #");
            sb.append(Integer.toHexString(this.d));
            sb.append(']');
            sb.append(" [HSL: ");
            sb.append(Arrays.toString(b()));
            sb.append(']');
            sb.append(" [Population: ");
            sb.append(this.e);
            sb.append(']');
            sb.append(" [Title Text: #");
            a();
            sb.append(Integer.toHexString(this.g));
            sb.append(']');
            sb.append(" [Body Text: #");
            a();
            sb.append(Integer.toHexString(this.h));
            sb.append(']');
            return sb.toString();
        }
    }

    e7(List<e> list, List<f7> list2) {
        this.a = list;
        this.b = list2;
        int size = list.size();
        int i = Integer.MIN_VALUE;
        e eVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar2 = this.a.get(i2);
            if (eVar2.c() > i) {
                i = eVar2.c();
                eVar = eVar2;
            }
        }
        this.e = eVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        // Method dump skipped, instructions count: 285
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e7.a():void");
    }

    public int b(f7 f7Var, int i) {
        e eVar = this.c.get(f7Var);
        return eVar != null ? eVar.d() : i;
    }

    public int c(int i) {
        return b(f7.i, i);
    }

    public int d(int i) {
        return b(f7.f, i);
    }

    public int e(int i) {
        e eVar = this.e;
        return eVar != null ? eVar.d() : i;
    }

    public int f(int i) {
        return b(f7.g, i);
    }

    public int g(int i) {
        return b(f7.d, i);
    }

    public int h(int i) {
        return b(f7.h, i);
    }

    public List<e> i() {
        return Collections.unmodifiableList(this.a);
    }

    public int j(int i) {
        return b(f7.e, i);
    }
}
