package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class g extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<g> CREATOR = new o0();
    private static final List<String> P = Arrays.asList(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING);
    private static final int[] Q = {0, 1};
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    private final int H;
    private final int I;
    private final int J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private final b0 O;
    private final List<String> a;
    private final int[] b;
    private final long c;
    private final String f;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public static final class a {
        private List<String> a = g.P;
        private int[] b = g.Q;
        private int c = b("smallIconDrawableResId");
        private int d = b("stopLiveStreamDrawableResId");
        private int e = b("pauseDrawableResId");
        private int f = b("playDrawableResId");
        private int g = b("skipNextDrawableResId");
        private int h = b("skipPrevDrawableResId");
        private int i = b("forwardDrawableResId");
        private int j = b("forward10DrawableResId");
        private int k = b("forward30DrawableResId");
        private int l = b("rewindDrawableResId");
        private int m = b("rewind10DrawableResId");
        private int n = b("rewind30DrawableResId");
        private int o = b("disconnectDrawableResId");
        private long p = 10000;

        private static int b(String str) {
            try {
                Integer num = (Integer) Class.forName("com.google.android.gms.cast.framework.media.internal.ResourceProvider").getMethod("findResourceByName", String.class).invoke(null, str);
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        public final g a() {
            return new g(this.a, this.b, this.p, null, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, b("notificationImageSizeDimenResId"), b("castingToDeviceStringResId"), b("stopLiveStreamStringResId"), b("pauseStringResId"), b("playStringResId"), b("skipNextStringResId"), b("skipPrevStringResId"), b("forwardStringResId"), b("forward10StringResId"), b("forward30StringResId"), b("rewindStringResId"), b("rewind10StringResId"), b("rewind30StringResId"), b("disconnectStringResId"), null);
        }
    }

    public g(List<String> list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder) {
        b0 b0Var = null;
        if (list != null) {
            this.a = new ArrayList(list);
        } else {
            this.a = null;
        }
        if (iArr != null) {
            this.b = Arrays.copyOf(iArr, iArr.length);
        } else {
            this.b = null;
        }
        this.c = j;
        this.f = str;
        this.n = i;
        this.o = i2;
        this.p = i3;
        this.q = i4;
        this.r = i5;
        this.s = i6;
        this.t = i7;
        this.u = i8;
        this.v = i9;
        this.w = i10;
        this.x = i11;
        this.y = i12;
        this.z = i13;
        this.A = i14;
        this.B = i15;
        this.C = i16;
        this.D = i17;
        this.E = i18;
        this.F = i19;
        this.G = i20;
        this.H = i21;
        this.I = i22;
        this.J = i23;
        this.K = i24;
        this.L = i25;
        this.M = i26;
        this.N = i27;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            if (queryLocalInterface instanceof b0) {
                b0Var = (b0) queryLocalInterface;
            } else {
                b0Var = new d0(iBinder);
            }
        }
        this.O = b0Var;
    }

    public long A2() {
        return this.c;
    }

    public int B2() {
        return this.n;
    }

    public int C2() {
        return this.o;
    }

    public int D2() {
        return this.C;
    }

    public String E2() {
        return this.f;
    }

    public final int F2() {
        return this.A;
    }

    public final int G2() {
        return this.D;
    }

    public final int H2() {
        return this.E;
    }

    public List<String> I1() {
        return this.a;
    }

    public final int I2() {
        return this.F;
    }

    public final int J2() {
        return this.G;
    }

    public final int K2() {
        return this.H;
    }

    public final int L2() {
        return this.I;
    }

    public final int M2() {
        return this.J;
    }

    public final int N2() {
        return this.K;
    }

    public final int O2() {
        return this.L;
    }

    public final int P2() {
        return this.M;
    }

    public int Q1() {
        return this.B;
    }

    public final int Q2() {
        return this.N;
    }

    public final b0 R2() {
        return this.O;
    }

    public int[] o2() {
        int[] iArr = this.b;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int p2() {
        return this.z;
    }

    public int q2() {
        return this.u;
    }

    public int r2() {
        return this.v;
    }

    public int s2() {
        return this.t;
    }

    public int t2() {
        return this.p;
    }

    public int u2() {
        return this.q;
    }

    public int v2() {
        return this.x;
    }

    public int w2() {
        return this.y;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.V(parcel, 2, this.a, false);
        int[] iArr = this.b;
        SafeParcelReader.N(parcel, 3, Arrays.copyOf(iArr, iArr.length), false);
        SafeParcelReader.P(parcel, 4, this.c);
        SafeParcelReader.T(parcel, 5, this.f, false);
        SafeParcelReader.M(parcel, 6, this.n);
        SafeParcelReader.M(parcel, 7, this.o);
        SafeParcelReader.M(parcel, 8, this.p);
        SafeParcelReader.M(parcel, 9, this.q);
        SafeParcelReader.M(parcel, 10, this.r);
        SafeParcelReader.M(parcel, 11, this.s);
        SafeParcelReader.M(parcel, 12, this.t);
        SafeParcelReader.M(parcel, 13, this.u);
        SafeParcelReader.M(parcel, 14, this.v);
        SafeParcelReader.M(parcel, 15, this.w);
        SafeParcelReader.M(parcel, 16, this.x);
        SafeParcelReader.M(parcel, 17, this.y);
        SafeParcelReader.M(parcel, 18, this.z);
        SafeParcelReader.M(parcel, 19, this.A);
        SafeParcelReader.M(parcel, 20, this.B);
        SafeParcelReader.M(parcel, 21, this.C);
        SafeParcelReader.M(parcel, 22, this.D);
        SafeParcelReader.M(parcel, 23, this.E);
        SafeParcelReader.M(parcel, 24, this.F);
        SafeParcelReader.M(parcel, 25, this.G);
        SafeParcelReader.M(parcel, 26, this.H);
        SafeParcelReader.M(parcel, 27, this.I);
        SafeParcelReader.M(parcel, 28, this.J);
        SafeParcelReader.M(parcel, 29, this.K);
        SafeParcelReader.M(parcel, 30, this.L);
        SafeParcelReader.M(parcel, 31, this.M);
        SafeParcelReader.M(parcel, 32, this.N);
        b0 b0Var = this.O;
        SafeParcelReader.L(parcel, 33, b0Var == null ? null : b0Var.asBinder(), false);
        SafeParcelReader.m(parcel, a2);
    }

    public int x2() {
        return this.w;
    }

    public int y2() {
        return this.r;
    }

    public int z2() {
        return this.s;
    }
}
