package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

public class b {
    private static final int[] d = {0, 4, 8};
    private static SparseIntArray e;
    public static final /* synthetic */ int f = 0;
    private HashMap<String, ConstraintAttribute> a = new HashMap<>();
    private boolean b = true;
    private HashMap<Integer, a> c = new HashMap<>();

    public static class a {
        int a;
        public final d b = new d();
        public final c c = new c();
        public final C0024b d = new C0024b();
        public final e e = new e();
        public HashMap<String, ConstraintAttribute> f = new HashMap<>();

        static void b(a aVar, ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            aVar.g(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                C0024b bVar = aVar.d;
                bVar.d0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.b0 = barrier.getType();
                aVar.d.e0 = barrier.getReferencedIds();
                aVar.d.c0 = barrier.getMargin();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void f(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.a = i;
            C0024b bVar = this.d;
            bVar.h = layoutParams.d;
            bVar.i = layoutParams.e;
            bVar.j = layoutParams.f;
            bVar.k = layoutParams.g;
            bVar.l = layoutParams.h;
            bVar.m = layoutParams.i;
            bVar.n = layoutParams.j;
            bVar.o = layoutParams.k;
            bVar.p = layoutParams.l;
            bVar.q = layoutParams.p;
            bVar.r = layoutParams.q;
            bVar.s = layoutParams.r;
            bVar.t = layoutParams.s;
            bVar.u = layoutParams.z;
            bVar.v = layoutParams.A;
            bVar.w = layoutParams.B;
            bVar.x = layoutParams.m;
            bVar.y = layoutParams.n;
            bVar.z = layoutParams.o;
            bVar.A = layoutParams.P;
            bVar.B = layoutParams.Q;
            bVar.C = layoutParams.R;
            bVar.g = layoutParams.c;
            bVar.e = layoutParams.a;
            bVar.f = layoutParams.b;
            C0024b bVar2 = this.d;
            bVar2.c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            bVar2.d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            bVar2.D = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            bVar2.E = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            bVar2.F = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            bVar2.G = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            bVar2.P = layoutParams.E;
            bVar2.Q = layoutParams.D;
            bVar2.S = layoutParams.G;
            bVar2.R = layoutParams.F;
            bVar2.h0 = layoutParams.S;
            bVar2.i0 = layoutParams.T;
            bVar2.T = layoutParams.H;
            bVar2.U = layoutParams.I;
            bVar2.V = layoutParams.L;
            bVar2.W = layoutParams.M;
            bVar2.X = layoutParams.J;
            bVar2.Y = layoutParams.K;
            bVar2.Z = layoutParams.N;
            bVar2.a0 = layoutParams.O;
            bVar2.g0 = layoutParams.U;
            bVar2.K = layoutParams.u;
            bVar2.M = layoutParams.w;
            bVar2.J = layoutParams.t;
            bVar2.L = layoutParams.v;
            C0024b bVar3 = this.d;
            bVar3.O = layoutParams.x;
            bVar3.N = layoutParams.y;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar3.H = layoutParams.getMarginEnd();
                this.d.I = layoutParams.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void g(int i, Constraints.LayoutParams layoutParams) {
            f(i, layoutParams);
            this.b.d = layoutParams.m0;
            e eVar = this.e;
            eVar.b = layoutParams.p0;
            eVar.c = layoutParams.q0;
            eVar.d = layoutParams.r0;
            eVar.e = layoutParams.s0;
            eVar.f = layoutParams.t0;
            eVar.g = layoutParams.u0;
            eVar.h = layoutParams.v0;
            eVar.i = layoutParams.w0;
            eVar.j = layoutParams.x0;
            eVar.k = layoutParams.y0;
            eVar.m = layoutParams.o0;
            eVar.l = layoutParams.n0;
        }

        public void d(ConstraintLayout.LayoutParams layoutParams) {
            C0024b bVar = this.d;
            layoutParams.d = bVar.h;
            layoutParams.e = bVar.i;
            layoutParams.f = bVar.j;
            layoutParams.g = bVar.k;
            layoutParams.h = bVar.l;
            layoutParams.i = bVar.m;
            layoutParams.j = bVar.n;
            layoutParams.k = bVar.o;
            layoutParams.l = bVar.p;
            layoutParams.p = bVar.q;
            layoutParams.q = bVar.r;
            layoutParams.r = bVar.s;
            layoutParams.s = bVar.t;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bVar.D;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bVar.E;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.F;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bVar.G;
            layoutParams.x = bVar.O;
            layoutParams.y = bVar.N;
            layoutParams.u = bVar.K;
            layoutParams.w = bVar.M;
            layoutParams.z = bVar.u;
            layoutParams.A = bVar.v;
            layoutParams.m = bVar.x;
            layoutParams.n = bVar.y;
            C0024b bVar2 = this.d;
            layoutParams.o = bVar2.z;
            layoutParams.B = bVar2.w;
            layoutParams.P = bVar2.A;
            layoutParams.Q = bVar2.B;
            layoutParams.E = bVar2.P;
            layoutParams.D = bVar2.Q;
            layoutParams.G = bVar2.S;
            layoutParams.F = bVar2.R;
            layoutParams.S = bVar2.h0;
            layoutParams.T = bVar2.i0;
            layoutParams.H = bVar2.T;
            layoutParams.I = bVar2.U;
            layoutParams.L = bVar2.V;
            layoutParams.M = bVar2.W;
            layoutParams.J = bVar2.X;
            layoutParams.K = bVar2.Y;
            layoutParams.N = bVar2.Z;
            layoutParams.O = bVar2.a0;
            layoutParams.R = bVar2.C;
            layoutParams.c = bVar2.g;
            layoutParams.a = bVar2.e;
            layoutParams.b = bVar2.f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = bVar2.c;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = bVar2.d;
            String str = bVar2.g0;
            if (str != null) {
                layoutParams.U = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.d.I);
                layoutParams.setMarginEnd(this.d.H);
            }
            layoutParams.b();
        }

        /* renamed from: e */
        public a clone() {
            a aVar = new a();
            aVar.d.a(this.d);
            aVar.c.a(this.c);
            aVar.b.a(this.b);
            aVar.e.a(this.e);
            aVar.a = this.a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    public static class C0024b {
        private static SparseIntArray k0;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;
        public boolean a = false;
        public float a0 = 1.0f;
        public boolean b = false;
        public int b0 = -1;
        public int c;
        public int c0 = 0;
        public int d;
        public int d0 = -1;
        public int e = -1;
        public int[] e0;
        public int f = -1;
        public String f0;
        public float g = -1.0f;
        public String g0;
        public int h = -1;
        public boolean h0 = false;
        public int i = -1;
        public boolean i0 = false;
        public int j = -1;
        public boolean j0 = true;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public float u = 0.5f;
        public float v = 0.5f;
        public String w = null;
        public int x = -1;
        public int y = 0;
        public float z = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            k0 = sparseIntArray;
            sparseIntArray.append(39, 24);
            k0.append(40, 25);
            k0.append(42, 28);
            k0.append(43, 29);
            k0.append(48, 35);
            k0.append(47, 34);
            k0.append(21, 4);
            k0.append(20, 3);
            k0.append(18, 1);
            k0.append(56, 6);
            k0.append(57, 7);
            k0.append(28, 17);
            k0.append(29, 18);
            k0.append(30, 19);
            k0.append(0, 26);
            k0.append(44, 31);
            k0.append(45, 32);
            k0.append(27, 10);
            k0.append(26, 9);
            k0.append(60, 13);
            k0.append(63, 16);
            k0.append(61, 14);
            k0.append(58, 11);
            k0.append(62, 15);
            k0.append(59, 12);
            k0.append(51, 38);
            k0.append(37, 37);
            k0.append(36, 39);
            k0.append(50, 40);
            k0.append(35, 20);
            k0.append(49, 36);
            k0.append(25, 5);
            k0.append(38, 76);
            k0.append(46, 76);
            k0.append(41, 76);
            k0.append(19, 76);
            k0.append(17, 76);
            k0.append(3, 23);
            k0.append(5, 27);
            k0.append(7, 30);
            k0.append(8, 8);
            k0.append(4, 33);
            k0.append(6, 2);
            k0.append(1, 22);
            k0.append(2, 21);
            k0.append(22, 61);
            k0.append(24, 62);
            k0.append(23, 63);
            k0.append(55, 69);
            k0.append(34, 70);
            k0.append(12, 71);
            k0.append(10, 72);
            k0.append(11, 73);
            k0.append(13, 74);
            k0.append(9, 75);
        }

        public void a(C0024b bVar) {
            this.a = bVar.a;
            this.c = bVar.c;
            this.b = bVar.b;
            this.d = bVar.d;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.g0 = bVar.g0;
            int[] iArr = bVar.e0;
            if (iArr != null) {
                this.e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.e0 = null;
            }
            this.f0 = bVar.f0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.l);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = k0.get(index);
                if (i3 == 80) {
                    this.h0 = obtainStyledAttributes.getBoolean(index, this.h0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            int i4 = this.p;
                            int i5 = b.f;
                            int resourceId = obtainStyledAttributes.getResourceId(index, i4);
                            if (resourceId == -1) {
                                resourceId = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.p = resourceId;
                            continue;
                        case 2:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            continue;
                        case 3:
                            int i6 = this.o;
                            int i7 = b.f;
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, i6);
                            if (resourceId2 == -1) {
                                resourceId2 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.o = resourceId2;
                            continue;
                        case 4:
                            int i8 = this.n;
                            int i9 = b.f;
                            int resourceId3 = obtainStyledAttributes.getResourceId(index, i8);
                            if (resourceId3 == -1) {
                                resourceId3 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.n = resourceId3;
                            continue;
                        case 5:
                            this.w = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            continue;
                        case 7:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            continue;
                        case 8:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            int i10 = this.t;
                            int i11 = b.f;
                            int resourceId4 = obtainStyledAttributes.getResourceId(index, i10);
                            if (resourceId4 == -1) {
                                resourceId4 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.t = resourceId4;
                            continue;
                        case 10:
                            int i12 = this.s;
                            int i13 = b.f;
                            int resourceId5 = obtainStyledAttributes.getResourceId(index, i12);
                            if (resourceId5 == -1) {
                                resourceId5 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.s = resourceId5;
                            continue;
                        case 11:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        case 12:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        case 13:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        case 14:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        case 15:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            continue;
                        case 16:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        case 17:
                            this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                            continue;
                        case 18:
                            this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                            continue;
                        case 19:
                            this.g = obtainStyledAttributes.getFloat(index, this.g);
                            continue;
                        case 20:
                            this.u = obtainStyledAttributes.getFloat(index, this.u);
                            continue;
                        case 21:
                            this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                            continue;
                        case 22:
                            this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                            continue;
                        case 23:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            continue;
                        case 24:
                            int i14 = this.h;
                            int i15 = b.f;
                            int resourceId6 = obtainStyledAttributes.getResourceId(index, i14);
                            if (resourceId6 == -1) {
                                resourceId6 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.h = resourceId6;
                            continue;
                        case 25:
                            int i16 = this.i;
                            int i17 = b.f;
                            int resourceId7 = obtainStyledAttributes.getResourceId(index, i16);
                            if (resourceId7 == -1) {
                                resourceId7 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.i = resourceId7;
                            continue;
                        case 26:
                            this.C = obtainStyledAttributes.getInt(index, this.C);
                            continue;
                        case 27:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            continue;
                        case 28:
                            int i18 = this.j;
                            int i19 = b.f;
                            int resourceId8 = obtainStyledAttributes.getResourceId(index, i18);
                            if (resourceId8 == -1) {
                                resourceId8 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.j = resourceId8;
                            continue;
                        case 29:
                            int i20 = this.k;
                            int i21 = b.f;
                            int resourceId9 = obtainStyledAttributes.getResourceId(index, i20);
                            if (resourceId9 == -1) {
                                resourceId9 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.k = resourceId9;
                            continue;
                        case 30:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                                break;
                            } else {
                                continue;
                            }
                        case 31:
                            int i22 = this.q;
                            int i23 = b.f;
                            int resourceId10 = obtainStyledAttributes.getResourceId(index, i22);
                            if (resourceId10 == -1) {
                                resourceId10 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.q = resourceId10;
                            continue;
                        case 32:
                            int i24 = this.r;
                            int i25 = b.f;
                            int resourceId11 = obtainStyledAttributes.getResourceId(index, i24);
                            if (resourceId11 == -1) {
                                resourceId11 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.r = resourceId11;
                            continue;
                        case 33:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            continue;
                        case 34:
                            int i26 = this.m;
                            int i27 = b.f;
                            int resourceId12 = obtainStyledAttributes.getResourceId(index, i26);
                            if (resourceId12 == -1) {
                                resourceId12 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.m = resourceId12;
                            continue;
                        case 35:
                            int i28 = this.l;
                            int i29 = b.f;
                            int resourceId13 = obtainStyledAttributes.getResourceId(index, i28);
                            if (resourceId13 == -1) {
                                resourceId13 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.l = resourceId13;
                            continue;
                        case 36:
                            this.v = obtainStyledAttributes.getFloat(index, this.v);
                            continue;
                        case 37:
                            this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                            continue;
                        case 38:
                            this.P = obtainStyledAttributes.getFloat(index, this.P);
                            continue;
                        case 39:
                            this.R = obtainStyledAttributes.getInt(index, this.R);
                            continue;
                        case 40:
                            this.S = obtainStyledAttributes.getInt(index, this.S);
                            continue;
                        default:
                            switch (i3) {
                                case 54:
                                    this.T = obtainStyledAttributes.getInt(index, this.T);
                                    continue;
                                case 55:
                                    this.U = obtainStyledAttributes.getInt(index, this.U);
                                    continue;
                                case 56:
                                    this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    continue;
                                case 57:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    continue;
                                case 58:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    continue;
                                case 59:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    continue;
                                default:
                                    switch (i3) {
                                        case 61:
                                            int i30 = this.x;
                                            int i31 = b.f;
                                            int resourceId14 = obtainStyledAttributes.getResourceId(index, i30);
                                            if (resourceId14 == -1) {
                                                resourceId14 = obtainStyledAttributes.getInt(index, -1);
                                            }
                                            this.x = resourceId14;
                                            continue;
                                        case 62:
                                            this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                                            continue;
                                        case 63:
                                            this.z = obtainStyledAttributes.getFloat(index, this.z);
                                            continue;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.b0 = obtainStyledAttributes.getInt(index, this.b0);
                                                    continue;
                                                case 73:
                                                    this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                                    continue;
                                                case 74:
                                                    this.f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.j0 = obtainStyledAttributes.getBoolean(index, this.j0);
                                                    continue;
                                                case 76:
                                                    Integer.toHexString(index);
                                                    k0.get(index);
                                                    continue;
                                                case 77:
                                                    this.g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    Integer.toHexString(index);
                                                    k0.get(index);
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                    }
                            }
                    }
                } else {
                    this.i0 = obtainStyledAttributes.getBoolean(index, this.i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {
        private static SparseIntArray h;
        public boolean a = false;
        public int b = -1;
        public String c = null;
        public int d = -1;
        public int e = 0;
        public float f = Float.NaN;
        public float g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            h = sparseIntArray;
            sparseIntArray.append(2, 1);
            h.append(4, 2);
            h.append(5, 3);
            h.append(1, 4);
            h.append(0, 5);
            h.append(3, 6);
        }

        public void a(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.g = cVar.g;
            this.f = cVar.f;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.n);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (h.get(index)) {
                    case 1:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 2:
                        this.d = obtainStyledAttributes.getInt(index, this.d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.c = x1.c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i2 = this.b;
                        int i3 = b.f;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i2);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.b = resourceId;
                        break;
                    case 6:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.d = dVar.d;
            this.e = dVar.e;
            this.c = dVar.c;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.u);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == 0) {
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                    this.b = b.d[this.b];
                } else if (index == 4) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == 3) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {
        private static SparseIntArray n;
        public boolean a = false;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public float i = 0.0f;
        public float j = 0.0f;
        public float k = 0.0f;
        public boolean l = false;
        public float m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(6, 1);
            n.append(7, 2);
            n.append(8, 3);
            n.append(4, 4);
            n.append(5, 5);
            n.append(0, 6);
            n.append(1, 7);
            n.append(2, 8);
            n.append(3, 9);
            n.append(9, 10);
            n.append(10, 11);
        }

        public void a(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
        }

        /* access modifiers changed from: package-private */
        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.x);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (n.get(index)) {
                    case 1:
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.i = obtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 9:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.k = obtainStyledAttributes.getDimension(index, this.k);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.l = true;
                            this.m = obtainStyledAttributes.getDimension(index, this.m);
                            break;
                        } else {
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.append(77, 25);
        e.append(78, 26);
        e.append(80, 29);
        e.append(81, 30);
        e.append(87, 36);
        e.append(86, 35);
        e.append(59, 4);
        e.append(58, 3);
        e.append(56, 1);
        e.append(95, 6);
        e.append(96, 7);
        e.append(66, 17);
        e.append(67, 18);
        e.append(68, 19);
        e.append(0, 27);
        e.append(82, 32);
        e.append(83, 33);
        e.append(65, 10);
        e.append(64, 9);
        e.append(99, 13);
        e.append(102, 16);
        e.append(100, 14);
        e.append(97, 11);
        e.append(101, 15);
        e.append(98, 12);
        e.append(90, 40);
        e.append(75, 39);
        e.append(74, 41);
        e.append(89, 42);
        e.append(73, 20);
        e.append(88, 37);
        e.append(63, 5);
        e.append(76, 82);
        e.append(85, 82);
        e.append(79, 82);
        e.append(57, 82);
        e.append(55, 82);
        e.append(5, 24);
        e.append(7, 28);
        e.append(23, 31);
        e.append(24, 8);
        e.append(6, 34);
        e.append(8, 2);
        e.append(3, 23);
        e.append(4, 21);
        e.append(2, 22);
        e.append(13, 43);
        e.append(26, 44);
        e.append(21, 45);
        e.append(22, 46);
        e.append(20, 60);
        e.append(18, 47);
        e.append(19, 48);
        e.append(14, 49);
        e.append(15, 50);
        e.append(16, 51);
        e.append(17, 52);
        e.append(25, 53);
        e.append(91, 54);
        e.append(69, 55);
        e.append(92, 56);
        e.append(70, 57);
        e.append(93, 58);
        e.append(71, 59);
        e.append(60, 61);
        e.append(62, 62);
        e.append(61, 63);
        e.append(27, 64);
        e.append(107, 65);
        e.append(34, 66);
        e.append(108, 67);
        e.append(104, 79);
        e.append(1, 38);
        e.append(103, 68);
        e.append(94, 69);
        e.append(72, 70);
        e.append(31, 71);
        e.append(29, 72);
        e.append(30, 73);
        e.append(32, 74);
        e.append(28, 75);
        e.append(105, 76);
        e.append(84, 77);
        e.append(109, 78);
        e.append(54, 80);
        e.append(53, 81);
    }

    private String H(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    private int[] o(View view, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = d.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private a p(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (!(index == 1 || 23 == index || 24 == index)) {
                aVar.c.a = true;
                aVar.d.b = true;
                aVar.b.a = true;
                aVar.e.a = true;
            }
            switch (e.get(index)) {
                case 1:
                    C0024b bVar = aVar.d;
                    int resourceId = obtainStyledAttributes.getResourceId(index, bVar.p);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar.p = resourceId;
                    break;
                case 2:
                    C0024b bVar2 = aVar.d;
                    bVar2.G = obtainStyledAttributes.getDimensionPixelSize(index, bVar2.G);
                    break;
                case 3:
                    C0024b bVar3 = aVar.d;
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, bVar3.o);
                    if (resourceId2 == -1) {
                        resourceId2 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar3.o = resourceId2;
                    break;
                case 4:
                    C0024b bVar4 = aVar.d;
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, bVar4.n);
                    if (resourceId3 == -1) {
                        resourceId3 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar4.n = resourceId3;
                    break;
                case 5:
                    aVar.d.w = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    C0024b bVar5 = aVar.d;
                    bVar5.A = obtainStyledAttributes.getDimensionPixelOffset(index, bVar5.A);
                    break;
                case 7:
                    C0024b bVar6 = aVar.d;
                    bVar6.B = obtainStyledAttributes.getDimensionPixelOffset(index, bVar6.B);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C0024b bVar7 = aVar.d;
                        bVar7.H = obtainStyledAttributes.getDimensionPixelSize(index, bVar7.H);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    C0024b bVar8 = aVar.d;
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, bVar8.t);
                    if (resourceId4 == -1) {
                        resourceId4 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar8.t = resourceId4;
                    break;
                case 10:
                    C0024b bVar9 = aVar.d;
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, bVar9.s);
                    if (resourceId5 == -1) {
                        resourceId5 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar9.s = resourceId5;
                    break;
                case 11:
                    C0024b bVar10 = aVar.d;
                    bVar10.M = obtainStyledAttributes.getDimensionPixelSize(index, bVar10.M);
                    break;
                case 12:
                    C0024b bVar11 = aVar.d;
                    bVar11.N = obtainStyledAttributes.getDimensionPixelSize(index, bVar11.N);
                    break;
                case 13:
                    C0024b bVar12 = aVar.d;
                    bVar12.J = obtainStyledAttributes.getDimensionPixelSize(index, bVar12.J);
                    break;
                case 14:
                    C0024b bVar13 = aVar.d;
                    bVar13.L = obtainStyledAttributes.getDimensionPixelSize(index, bVar13.L);
                    break;
                case 15:
                    C0024b bVar14 = aVar.d;
                    bVar14.O = obtainStyledAttributes.getDimensionPixelSize(index, bVar14.O);
                    break;
                case 16:
                    C0024b bVar15 = aVar.d;
                    bVar15.K = obtainStyledAttributes.getDimensionPixelSize(index, bVar15.K);
                    break;
                case 17:
                    C0024b bVar16 = aVar.d;
                    bVar16.e = obtainStyledAttributes.getDimensionPixelOffset(index, bVar16.e);
                    break;
                case 18:
                    C0024b bVar17 = aVar.d;
                    bVar17.f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar17.f);
                    break;
                case 19:
                    C0024b bVar18 = aVar.d;
                    bVar18.g = obtainStyledAttributes.getFloat(index, bVar18.g);
                    break;
                case 20:
                    C0024b bVar19 = aVar.d;
                    bVar19.u = obtainStyledAttributes.getFloat(index, bVar19.u);
                    break;
                case 21:
                    C0024b bVar20 = aVar.d;
                    bVar20.d = obtainStyledAttributes.getLayoutDimension(index, bVar20.d);
                    break;
                case 22:
                    d dVar = aVar.b;
                    dVar.b = obtainStyledAttributes.getInt(index, dVar.b);
                    d dVar2 = aVar.b;
                    dVar2.b = d[dVar2.b];
                    break;
                case 23:
                    C0024b bVar21 = aVar.d;
                    bVar21.c = obtainStyledAttributes.getLayoutDimension(index, bVar21.c);
                    break;
                case 24:
                    C0024b bVar22 = aVar.d;
                    bVar22.D = obtainStyledAttributes.getDimensionPixelSize(index, bVar22.D);
                    break;
                case 25:
                    C0024b bVar23 = aVar.d;
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, bVar23.h);
                    if (resourceId6 == -1) {
                        resourceId6 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar23.h = resourceId6;
                    break;
                case 26:
                    C0024b bVar24 = aVar.d;
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, bVar24.i);
                    if (resourceId7 == -1) {
                        resourceId7 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar24.i = resourceId7;
                    break;
                case 27:
                    C0024b bVar25 = aVar.d;
                    bVar25.C = obtainStyledAttributes.getInt(index, bVar25.C);
                    break;
                case 28:
                    C0024b bVar26 = aVar.d;
                    bVar26.E = obtainStyledAttributes.getDimensionPixelSize(index, bVar26.E);
                    break;
                case 29:
                    C0024b bVar27 = aVar.d;
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, bVar27.j);
                    if (resourceId8 == -1) {
                        resourceId8 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar27.j = resourceId8;
                    break;
                case 30:
                    C0024b bVar28 = aVar.d;
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, bVar28.k);
                    if (resourceId9 == -1) {
                        resourceId9 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar28.k = resourceId9;
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C0024b bVar29 = aVar.d;
                        bVar29.I = obtainStyledAttributes.getDimensionPixelSize(index, bVar29.I);
                        break;
                    } else {
                        break;
                    }
                case 32:
                    C0024b bVar30 = aVar.d;
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, bVar30.q);
                    if (resourceId10 == -1) {
                        resourceId10 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar30.q = resourceId10;
                    break;
                case 33:
                    C0024b bVar31 = aVar.d;
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, bVar31.r);
                    if (resourceId11 == -1) {
                        resourceId11 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar31.r = resourceId11;
                    break;
                case 34:
                    C0024b bVar32 = aVar.d;
                    bVar32.F = obtainStyledAttributes.getDimensionPixelSize(index, bVar32.F);
                    break;
                case 35:
                    C0024b bVar33 = aVar.d;
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, bVar33.m);
                    if (resourceId12 == -1) {
                        resourceId12 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar33.m = resourceId12;
                    break;
                case 36:
                    C0024b bVar34 = aVar.d;
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, bVar34.l);
                    if (resourceId13 == -1) {
                        resourceId13 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar34.l = resourceId13;
                    break;
                case 37:
                    C0024b bVar35 = aVar.d;
                    bVar35.v = obtainStyledAttributes.getFloat(index, bVar35.v);
                    break;
                case 38:
                    aVar.a = obtainStyledAttributes.getResourceId(index, aVar.a);
                    break;
                case 39:
                    C0024b bVar36 = aVar.d;
                    bVar36.Q = obtainStyledAttributes.getFloat(index, bVar36.Q);
                    break;
                case 40:
                    C0024b bVar37 = aVar.d;
                    bVar37.P = obtainStyledAttributes.getFloat(index, bVar37.P);
                    break;
                case 41:
                    C0024b bVar38 = aVar.d;
                    bVar38.R = obtainStyledAttributes.getInt(index, bVar38.R);
                    break;
                case 42:
                    C0024b bVar39 = aVar.d;
                    bVar39.S = obtainStyledAttributes.getInt(index, bVar39.S);
                    break;
                case 43:
                    d dVar3 = aVar.b;
                    dVar3.d = obtainStyledAttributes.getFloat(index, dVar3.d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar = aVar.e;
                        eVar.l = true;
                        eVar.m = obtainStyledAttributes.getDimension(index, eVar.m);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    e eVar2 = aVar.e;
                    eVar2.c = obtainStyledAttributes.getFloat(index, eVar2.c);
                    break;
                case 46:
                    e eVar3 = aVar.e;
                    eVar3.d = obtainStyledAttributes.getFloat(index, eVar3.d);
                    break;
                case 47:
                    e eVar4 = aVar.e;
                    eVar4.e = obtainStyledAttributes.getFloat(index, eVar4.e);
                    break;
                case 48:
                    e eVar5 = aVar.e;
                    eVar5.f = obtainStyledAttributes.getFloat(index, eVar5.f);
                    break;
                case 49:
                    e eVar6 = aVar.e;
                    eVar6.g = obtainStyledAttributes.getDimension(index, eVar6.g);
                    break;
                case 50:
                    e eVar7 = aVar.e;
                    eVar7.h = obtainStyledAttributes.getDimension(index, eVar7.h);
                    break;
                case 51:
                    e eVar8 = aVar.e;
                    eVar8.i = obtainStyledAttributes.getDimension(index, eVar8.i);
                    break;
                case 52:
                    e eVar9 = aVar.e;
                    eVar9.j = obtainStyledAttributes.getDimension(index, eVar9.j);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar10 = aVar.e;
                        eVar10.k = obtainStyledAttributes.getDimension(index, eVar10.k);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    C0024b bVar40 = aVar.d;
                    bVar40.T = obtainStyledAttributes.getInt(index, bVar40.T);
                    break;
                case 55:
                    C0024b bVar41 = aVar.d;
                    bVar41.U = obtainStyledAttributes.getInt(index, bVar41.U);
                    break;
                case 56:
                    C0024b bVar42 = aVar.d;
                    bVar42.V = obtainStyledAttributes.getDimensionPixelSize(index, bVar42.V);
                    break;
                case 57:
                    C0024b bVar43 = aVar.d;
                    bVar43.W = obtainStyledAttributes.getDimensionPixelSize(index, bVar43.W);
                    break;
                case 58:
                    C0024b bVar44 = aVar.d;
                    bVar44.X = obtainStyledAttributes.getDimensionPixelSize(index, bVar44.X);
                    break;
                case 59:
                    C0024b bVar45 = aVar.d;
                    bVar45.Y = obtainStyledAttributes.getDimensionPixelSize(index, bVar45.Y);
                    break;
                case 60:
                    e eVar11 = aVar.e;
                    eVar11.b = obtainStyledAttributes.getFloat(index, eVar11.b);
                    break;
                case 61:
                    C0024b bVar46 = aVar.d;
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, bVar46.x);
                    if (resourceId14 == -1) {
                        resourceId14 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar46.x = resourceId14;
                    break;
                case 62:
                    C0024b bVar47 = aVar.d;
                    bVar47.y = obtainStyledAttributes.getDimensionPixelSize(index, bVar47.y);
                    break;
                case 63:
                    C0024b bVar48 = aVar.d;
                    bVar48.z = obtainStyledAttributes.getFloat(index, bVar48.z);
                    break;
                case 64:
                    c cVar = aVar.c;
                    int resourceId15 = obtainStyledAttributes.getResourceId(index, cVar.b);
                    if (resourceId15 == -1) {
                        resourceId15 = obtainStyledAttributes.getInt(index, -1);
                    }
                    cVar.b = resourceId15;
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        aVar.c.c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        aVar.c.c = x1.c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.c.e = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.c;
                    cVar2.g = obtainStyledAttributes.getFloat(index, cVar2.g);
                    break;
                case 68:
                    d dVar4 = aVar.b;
                    dVar4.e = obtainStyledAttributes.getFloat(index, dVar4.e);
                    break;
                case 69:
                    aVar.d.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.d.a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    C0024b bVar49 = aVar.d;
                    bVar49.b0 = obtainStyledAttributes.getInt(index, bVar49.b0);
                    break;
                case 73:
                    C0024b bVar50 = aVar.d;
                    bVar50.c0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar50.c0);
                    break;
                case 74:
                    aVar.d.f0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    C0024b bVar51 = aVar.d;
                    bVar51.j0 = obtainStyledAttributes.getBoolean(index, bVar51.j0);
                    break;
                case 76:
                    c cVar3 = aVar.c;
                    cVar3.d = obtainStyledAttributes.getInt(index, cVar3.d);
                    break;
                case 77:
                    aVar.d.g0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.b;
                    dVar5.c = obtainStyledAttributes.getInt(index, dVar5.c);
                    break;
                case 79:
                    c cVar4 = aVar.c;
                    cVar4.f = obtainStyledAttributes.getFloat(index, cVar4.f);
                    break;
                case 80:
                    C0024b bVar52 = aVar.d;
                    bVar52.h0 = obtainStyledAttributes.getBoolean(index, bVar52.h0);
                    break;
                case 81:
                    C0024b bVar53 = aVar.d;
                    bVar53.i0 = obtainStyledAttributes.getBoolean(index, bVar53.i0);
                    break;
                case 82:
                    Integer.toHexString(index);
                    e.get(index);
                    break;
                default:
                    Integer.toHexString(index);
                    e.get(index);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a q(int i) {
        if (!this.c.containsKey(Integer.valueOf(i))) {
            this.c.put(Integer.valueOf(i), new a());
        }
        return this.c.get(Integer.valueOf(i));
    }

    public void A(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.b || id != -1) {
                if (!this.c.containsKey(Integer.valueOf(id))) {
                    this.c.put(Integer.valueOf(id), new a());
                }
                a aVar = this.c.get(Integer.valueOf(id));
                if (!aVar.d.b) {
                    aVar.f(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        aVar.d.e0 = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.d.j0 = barrier.q();
                            aVar.d.b0 = barrier.getType();
                            aVar.d.c0 = barrier.getMargin();
                        }
                    }
                    aVar.d.b = true;
                }
                d dVar = aVar.b;
                if (!dVar.a) {
                    dVar.b = childAt.getVisibility();
                    aVar.b.d = childAt.getAlpha();
                    aVar.b.a = true;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 17) {
                    e eVar = aVar.e;
                    if (!eVar.a) {
                        eVar.a = true;
                        eVar.b = childAt.getRotation();
                        aVar.e.c = childAt.getRotationX();
                        aVar.e.d = childAt.getRotationY();
                        aVar.e.e = childAt.getScaleX();
                        aVar.e.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                            e eVar2 = aVar.e;
                            eVar2.g = pivotX;
                            eVar2.h = pivotY;
                        }
                        aVar.e.i = childAt.getTranslationX();
                        aVar.e.j = childAt.getTranslationY();
                        if (i2 >= 21) {
                            aVar.e.k = childAt.getTranslationZ();
                            e eVar3 = aVar.e;
                            if (eVar3.l) {
                                eVar3.m = childAt.getElevation();
                            }
                        }
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void B(b bVar) {
        for (Integer num : bVar.c.keySet()) {
            int intValue = num.intValue();
            a aVar = bVar.c.get(num);
            if (!this.c.containsKey(Integer.valueOf(intValue))) {
                this.c.put(Integer.valueOf(intValue), new a());
            }
            a aVar2 = this.c.get(Integer.valueOf(intValue));
            C0024b bVar2 = aVar2.d;
            if (!bVar2.b) {
                bVar2.a(aVar.d);
            }
            d dVar = aVar2.b;
            if (!dVar.a) {
                dVar.a(aVar.b);
            }
            e eVar = aVar2.e;
            if (!eVar.a) {
                eVar.a(aVar.e);
            }
            c cVar = aVar2.c;
            if (!cVar.a) {
                cVar.a(aVar.c);
            }
            for (String str : aVar.f.keySet()) {
                if (!aVar2.f.containsKey(str)) {
                    aVar2.f.put(str, aVar.f.get(str));
                }
            }
        }
    }

    public void C(int i, float f2) {
        q(i).b.d = f2;
    }

    public void D(int i, String str) {
        q(i).d.w = str;
    }

    public void E(boolean z) {
        this.b = z;
    }

    public void F(int i, int i2, int i3) {
        a q = q(i);
        switch (i2) {
            case 1:
                q.d.D = i3;
                return;
            case 2:
                q.d.E = i3;
                return;
            case 3:
                q.d.F = i3;
                return;
            case 4:
                q.d.G = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                q.d.I = i3;
                return;
            case 7:
                q.d.H = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void G(int i, int i2) {
        q(i).b.c = i2;
    }

    public void b(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.c.containsKey(Integer.valueOf(id))) {
                g0.c(childAt);
            } else if (this.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.c.containsKey(Integer.valueOf(id))) {
                ConstraintAttribute.g(childAt, this.c.get(Integer.valueOf(id)).f);
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        e(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        int id = constraintHelper.getId();
        if (this.c.containsKey(Integer.valueOf(id))) {
            a aVar = this.c.get(Integer.valueOf(id));
            if (constraintWidget instanceof h) {
                constraintHelper.i(aVar, (h) constraintWidget, layoutParams, sparseArray);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.c.containsKey(Integer.valueOf(id))) {
                g0.c(childAt);
            } else if (this.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1 && this.c.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                a aVar = this.c.get(Integer.valueOf(id));
                if (childAt instanceof Barrier) {
                    aVar.d.d0 = 1;
                }
                int i2 = aVar.d.d0;
                if (i2 != -1 && i2 == 1) {
                    Barrier barrier = (Barrier) childAt;
                    barrier.setId(id);
                    barrier.setType(aVar.d.b0);
                    barrier.setMargin(aVar.d.c0);
                    barrier.setAllowsGoneWidget(aVar.d.j0);
                    C0024b bVar = aVar.d;
                    int[] iArr = bVar.e0;
                    if (iArr != null) {
                        barrier.setReferencedIds(iArr);
                    } else {
                        String str = bVar.f0;
                        if (str != null) {
                            bVar.e0 = o(barrier, str);
                            barrier.setReferencedIds(aVar.d.e0);
                        }
                    }
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.b();
                aVar.d(layoutParams);
                if (z) {
                    ConstraintAttribute.g(childAt, aVar.f);
                }
                childAt.setLayoutParams(layoutParams);
                d dVar = aVar.b;
                if (dVar.c == 0) {
                    childAt.setVisibility(dVar.b);
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 17) {
                    childAt.setAlpha(aVar.b.d);
                    childAt.setRotation(aVar.e.b);
                    childAt.setRotationX(aVar.e.c);
                    childAt.setRotationY(aVar.e.d);
                    childAt.setScaleX(aVar.e.e);
                    childAt.setScaleY(aVar.e.f);
                    if (!Float.isNaN(aVar.e.g)) {
                        childAt.setPivotX(aVar.e.g);
                    }
                    if (!Float.isNaN(aVar.e.h)) {
                        childAt.setPivotY(aVar.e.h);
                    }
                    childAt.setTranslationX(aVar.e.i);
                    childAt.setTranslationY(aVar.e.j);
                    if (i3 >= 21) {
                        childAt.setTranslationZ(aVar.e.k);
                        e eVar = aVar.e;
                        if (eVar.l) {
                            childAt.setElevation(eVar.m);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.c.get(num);
            int i4 = aVar2.d.d0;
            if (i4 != -1 && i4 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C0024b bVar2 = aVar2.d;
                int[] iArr2 = bVar2.e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar2.f0;
                    if (str2 != null) {
                        bVar2.e0 = o(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.d.e0);
                    }
                }
                barrier2.setType(aVar2.d.b0);
                barrier2.setMargin(aVar2.d.c0);
                ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.p();
                aVar2.d(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.d.a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.d(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    public void f(int i, ConstraintLayout.LayoutParams layoutParams) {
        if (this.c.containsKey(Integer.valueOf(i))) {
            this.c.get(Integer.valueOf(i)).d(layoutParams);
        }
    }

    public void g(int i, int i2) {
        if (this.c.containsKey(Integer.valueOf(i))) {
            a aVar = this.c.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    C0024b bVar = aVar.d;
                    bVar.i = -1;
                    bVar.h = -1;
                    bVar.D = -1;
                    bVar.J = -1;
                    return;
                case 2:
                    C0024b bVar2 = aVar.d;
                    bVar2.k = -1;
                    bVar2.j = -1;
                    bVar2.E = -1;
                    bVar2.L = -1;
                    return;
                case 3:
                    C0024b bVar3 = aVar.d;
                    bVar3.m = -1;
                    bVar3.l = -1;
                    bVar3.F = -1;
                    bVar3.K = -1;
                    return;
                case 4:
                    C0024b bVar4 = aVar.d;
                    bVar4.n = -1;
                    bVar4.o = -1;
                    bVar4.G = -1;
                    bVar4.M = -1;
                    return;
                case 5:
                    aVar.d.p = -1;
                    return;
                case 6:
                    C0024b bVar5 = aVar.d;
                    bVar5.q = -1;
                    bVar5.r = -1;
                    bVar5.I = -1;
                    bVar5.O = -1;
                    return;
                case 7:
                    C0024b bVar6 = aVar.d;
                    bVar6.s = -1;
                    bVar6.t = -1;
                    bVar6.H = -1;
                    bVar6.N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void h(Context context, int i) {
        i((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public void i(ConstraintLayout constraintLayout) {
        NoSuchMethodException e2;
        IllegalAccessException e3;
        InvocationTargetException e4;
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        bVar.c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!bVar.b || id != -1) {
                if (!bVar.c.containsKey(Integer.valueOf(id))) {
                    bVar.c.put(Integer.valueOf(id), new a());
                }
                a aVar = bVar.c.get(Integer.valueOf(id));
                HashMap<String, ConstraintAttribute> hashMap = bVar.a;
                HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap.keySet()) {
                    ConstraintAttribute constraintAttribute = hashMap.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap2.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            try {
                                hashMap2.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (NoSuchMethodException e5) {
                                e2 = e5;
                            } catch (IllegalAccessException e6) {
                                e3 = e6;
                                e3.printStackTrace();
                            } catch (InvocationTargetException e7) {
                                e4 = e7;
                                e4.printStackTrace();
                            }
                        }
                    } catch (NoSuchMethodException e8) {
                        e2 = e8;
                        e2.printStackTrace();
                    } catch (IllegalAccessException e9) {
                        e3 = e9;
                        e3.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e4 = e10;
                        e4.printStackTrace();
                    }
                }
                aVar.f = hashMap2;
                aVar.f(id, layoutParams);
                aVar.b.b = childAt.getVisibility();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 17) {
                    aVar.b.d = childAt.getAlpha();
                    aVar.e.b = childAt.getRotation();
                    aVar.e.c = childAt.getRotationX();
                    aVar.e.d = childAt.getRotationY();
                    aVar.e.e = childAt.getScaleX();
                    aVar.e.f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        e eVar = aVar.e;
                        eVar.g = pivotX;
                        eVar.h = pivotY;
                    }
                    aVar.e.i = childAt.getTranslationX();
                    aVar.e.j = childAt.getTranslationY();
                    if (i2 >= 21) {
                        aVar.e.k = childAt.getTranslationZ();
                        e eVar2 = aVar.e;
                        if (eVar2.l) {
                            eVar2.m = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.d.j0 = barrier.q();
                    aVar.d.e0 = barrier.getReferencedIds();
                    aVar.d.b0 = barrier.getType();
                    aVar.d.c0 = barrier.getMargin();
                }
                i++;
                bVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void j(b bVar) {
        this.c.clear();
        for (Integer num : bVar.c.keySet()) {
            this.c.put(num, bVar.c.get(num).clone());
        }
    }

    public void k(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.c.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.b || id != -1) {
                if (!this.c.containsKey(Integer.valueOf(id))) {
                    this.c.put(Integer.valueOf(id), new a());
                }
                a aVar = this.c.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    a.b(aVar, (ConstraintHelper) childAt, id, layoutParams);
                }
                aVar.g(id, layoutParams);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void l(int i, int i2, int i3, int i4) {
        if (!this.c.containsKey(Integer.valueOf(i))) {
            this.c.put(Integer.valueOf(i), new a());
        }
        a aVar = this.c.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C0024b bVar = aVar.d;
                    bVar.h = i3;
                    bVar.i = -1;
                    return;
                } else if (i4 == 2) {
                    C0024b bVar2 = aVar.d;
                    bVar2.i = i3;
                    bVar2.h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(je.I0(je.V0("left to "), H(i4), " undefined"));
                }
            case 2:
                if (i4 == 1) {
                    C0024b bVar3 = aVar.d;
                    bVar3.j = i3;
                    bVar3.k = -1;
                    return;
                } else if (i4 == 2) {
                    C0024b bVar4 = aVar.d;
                    bVar4.k = i3;
                    bVar4.j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(je.I0(je.V0("right to "), H(i4), " undefined"));
                }
            case 3:
                if (i4 == 3) {
                    C0024b bVar5 = aVar.d;
                    bVar5.l = i3;
                    bVar5.m = -1;
                    bVar5.p = -1;
                    return;
                } else if (i4 == 4) {
                    C0024b bVar6 = aVar.d;
                    bVar6.m = i3;
                    bVar6.l = -1;
                    bVar6.p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(je.I0(je.V0("right to "), H(i4), " undefined"));
                }
            case 4:
                if (i4 == 4) {
                    C0024b bVar7 = aVar.d;
                    bVar7.o = i3;
                    bVar7.n = -1;
                    bVar7.p = -1;
                    return;
                } else if (i4 == 3) {
                    C0024b bVar8 = aVar.d;
                    bVar8.n = i3;
                    bVar8.o = -1;
                    bVar8.p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(je.I0(je.V0("right to "), H(i4), " undefined"));
                }
            case 5:
                if (i4 == 5) {
                    C0024b bVar9 = aVar.d;
                    bVar9.p = i3;
                    bVar9.o = -1;
                    bVar9.n = -1;
                    bVar9.l = -1;
                    bVar9.m = -1;
                    return;
                }
                throw new IllegalArgumentException(je.I0(je.V0("right to "), H(i4), " undefined"));
            case 6:
                if (i4 == 6) {
                    C0024b bVar10 = aVar.d;
                    bVar10.r = i3;
                    bVar10.q = -1;
                    return;
                } else if (i4 == 7) {
                    C0024b bVar11 = aVar.d;
                    bVar11.q = i3;
                    bVar11.r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(je.I0(je.V0("right to "), H(i4), " undefined"));
                }
            case 7:
                if (i4 == 7) {
                    C0024b bVar12 = aVar.d;
                    bVar12.t = i3;
                    bVar12.s = -1;
                    return;
                } else if (i4 == 6) {
                    C0024b bVar13 = aVar.d;
                    bVar13.s = i3;
                    bVar13.t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(je.I0(je.V0("right to "), H(i4), " undefined"));
                }
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(H(i2));
                sb.append(" to ");
                throw new IllegalArgumentException(je.I0(sb, H(i4), " unknown"));
        }
    }

    public void m(int i, int i2) {
        q(i).d.d = i2;
    }

    public void n(int i, int i2) {
        q(i).d.c = i2;
    }

    public a r(int i) {
        if (this.c.containsKey(Integer.valueOf(i))) {
            return this.c.get(Integer.valueOf(i));
        }
        return null;
    }

    public int s(int i) {
        return q(i).d.d;
    }

    public int[] t() {
        Integer[] numArr = (Integer[]) this.c.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public a u(int i) {
        return q(i);
    }

    public int v(int i) {
        return q(i).b.b;
    }

    public int w(int i) {
        return q(i).b.c;
    }

    public int x(int i) {
        return q(i).d.c;
    }

    public void y(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a p = p(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        p.d.a = true;
                    }
                    this.c.put(Integer.valueOf(p.a), p);
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        if (r0.equals("PropertySet") != false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0178, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
        // Method dump skipped, instructions count: 446
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.z(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
