package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@l40(objectTypeIndication = 64, tags = {5})
/* renamed from: f40  reason: default package */
public class f40 extends g40 {
    public static Map<Integer, Integer> X = new HashMap();
    public static Map<Integer, String> Y = new HashMap();
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    byte[] W;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l = -1;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* renamed from: f40$a */
    public class a {
        public boolean a;

        public a(int i, h40 h40) {
            int i2;
            int i3;
            h40.b();
            h40.b();
            h40.b();
            h40.b();
            boolean b2 = h40.b();
            this.a = b2;
            if (b2) {
                h40.b();
                h40.b();
                switch (i) {
                    case 1:
                    case 2:
                        i3 = 1;
                        break;
                    case 3:
                        i3 = 2;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i3 = 3;
                        break;
                    case 7:
                        i3 = 4;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    h40.b();
                    h40.a(4);
                    h40.a(4);
                    h40.a(3);
                    h40.a(2);
                    boolean b3 = h40.b();
                    boolean b4 = h40.b();
                    if (b3) {
                        h40.a(2);
                        h40.b();
                        h40.a(2);
                    }
                    if (b4) {
                        h40.a(2);
                        h40.a(2);
                        h40.b();
                    }
                    h40.b();
                }
            }
            while (h40.a(4) != 0) {
                int a2 = h40.a(4);
                if (a2 == 15) {
                    i2 = h40.a(8);
                    a2 += i2;
                } else {
                    i2 = 0;
                }
                a2 = i2 == 255 ? a2 + h40.a(16) : a2;
                for (int i5 = 0; i5 < a2; i5++) {
                    h40.a(8);
                }
            }
        }
    }

    static {
        X.put(0, 96000);
        X.put(1, 88200);
        X.put(2, 64000);
        X.put(3, 48000);
        X.put(4, 44100);
        X.put(5, 32000);
        X.put(6, 24000);
        X.put(7, 22050);
        X.put(8, 16000);
        X.put(9, 12000);
        X.put(10, 11025);
        X.put(11, 8000);
        Y.put(1, "AAC main");
        Y.put(2, "AAC LC");
        Y.put(3, "AAC SSR");
        Y.put(4, "AAC LTP");
        Y.put(5, "SBR");
        Y.put(6, "AAC Scalable");
        Y.put(7, "TwinVQ");
        Y.put(8, "CELP");
        Y.put(9, "HVXC");
        Y.put(10, "(reserved)");
        Y.put(11, "(reserved)");
        Y.put(12, "TTSI");
        Y.put(13, "Main synthetic");
        Y.put(14, "Wavetable synthesis");
        Y.put(15, "General MIDI");
        Y.put(16, "Algorithmic Synthesis and Audio FX");
        Y.put(17, "ER AAC LC");
        Y.put(18, "(reserved)");
        Y.put(19, "ER AAC LTP");
        Y.put(20, "ER AAC Scalable");
        Y.put(21, "ER TwinVQ");
        Y.put(22, "ER BSAC");
        Y.put(23, "ER AAC LD");
        Y.put(24, "ER CELP");
        Y.put(25, "ER HVXC");
        Y.put(26, "ER HILN");
        Y.put(27, "ER Parametric");
        Y.put(28, "SSC");
        Y.put(29, "PS");
        Y.put(30, "MPEG Surround");
        Y.put(31, "(escape)");
        Y.put(32, "Layer-1");
        Y.put(33, "Layer-2");
        Y.put(34, "Layer-3");
        Y.put(35, "DST");
        Y.put(36, "ALS");
        Y.put(37, "SLS");
        Y.put(38, "SLS non-core");
        Y.put(39, "ER AAC ELD");
        Y.put(40, "SMR Simple");
        Y.put(41, "SMR Main");
    }

    public f40() {
        this.a = 5;
    }

    private int g(h40 h40) {
        int a2 = h40.a(5);
        return a2 == 31 ? h40.a(6) + 32 : a2;
    }

    private void i(int i2, i40 i40) {
        if (i2 >= 32) {
            i40.a(31, 5);
            i40.a(i2 - 32, 6);
            return;
        }
        i40.a(i2, 5);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.g40
    public int a() {
        int i2 = (this.e > 30 ? 11 : 5) + 4;
        if (this.f == 15) {
            i2 += 24;
        }
        int i3 = i2 + 4;
        int i4 = this.d;
        if (i4 == 5 || i4 == 29) {
            i3 += 4;
            if (this.l == 15) {
                i3 += 24;
            }
        }
        if (i4 == 22) {
            i3 += 4;
        }
        if (this.G) {
            int i5 = (this.w == 1 ? 16 : 2) + 1;
            if (this.h != 0) {
                if (i4 == 6 || i4 == 20) {
                    i5 += 3;
                }
                if (this.y == 1) {
                    if (i4 == 22) {
                        i5 = i5 + 5 + 11;
                    }
                    if (i4 == 17 || i4 == 19 || i4 == 20 || i4 == 23) {
                        i5 = i5 + 1 + 1 + 1;
                    }
                    i5++;
                    if (this.F == 1) {
                        throw new RuntimeException("Not implemented");
                    }
                }
                i3 += i5;
            } else {
                throw new UnsupportedOperationException("can't parse program_config_element yet");
            }
        }
        int i6 = this.u;
        if (i6 >= 0) {
            i3 += 11;
            if (i6 == 695) {
                i3 += 5;
                int i7 = this.i;
                if (i7 > 30) {
                    i3 += 6;
                }
                if (i7 == 5) {
                    i3++;
                    if (this.j) {
                        i3 += 4;
                        if (this.l == 15) {
                            i3 += 24;
                        }
                        int i8 = this.t;
                        if (i8 >= 0) {
                            i3 += 11;
                            if (i8 == 1352) {
                                i3++;
                            }
                        }
                    }
                }
                if (i7 == 22) {
                    int i9 = i3 + 1;
                    if (this.j) {
                        i9 += 4;
                        if (this.l == 15) {
                            i9 += 24;
                        }
                    }
                    i3 = i9 + 4;
                }
            }
        }
        double d2 = (double) i3;
        Double.isNaN(d2);
        return (int) Math.ceil(d2 / 8.0d);
    }

    @Override // defpackage.g40
    public void e(ByteBuffer byteBuffer) {
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.b);
        byteBuffer.position(byteBuffer.position() + this.b);
        byte[] bArr = new byte[this.b];
        this.W = bArr;
        slice.get(bArr);
        slice.rewind();
        h40 h40 = new h40(slice);
        int g2 = g(h40);
        this.d = g2;
        this.e = g2;
        int a2 = h40.a(4);
        this.f = a2;
        if (a2 == 15) {
            this.g = h40.a(24);
        }
        this.h = h40.a(4);
        int i2 = this.d;
        if (i2 == 5 || i2 == 29) {
            this.i = 5;
            this.j = true;
            if (i2 == 29) {
                this.k = true;
            }
            int a3 = h40.a(4);
            this.l = a3;
            if (a3 == 15) {
                this.m = h40.a(24);
            }
            int g3 = g(h40);
            this.d = g3;
            if (g3 == 22) {
                this.n = h40.a(4);
            }
        } else {
            this.i = 0;
        }
        int i3 = this.d;
        switch (i3) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                int i4 = this.h;
                this.v = h40.a(1);
                int a4 = h40.a(1);
                this.w = a4;
                if (a4 == 1) {
                    this.x = h40.a(14);
                }
                this.y = h40.a(1);
                if (i4 != 0) {
                    if (i3 == 6 || i3 == 20) {
                        this.z = h40.a(3);
                    }
                    if (this.y == 1) {
                        if (i3 == 22) {
                            this.A = h40.a(5);
                            this.B = h40.a(11);
                        }
                        if (i3 == 17 || i3 == 19 || i3 == 20 || i3 == 23) {
                            this.C = h40.b();
                            this.D = h40.b();
                            this.E = h40.b();
                        }
                        int a5 = h40.a(1);
                        this.F = a5;
                        if (a5 == 1) {
                            throw new RuntimeException("not yet implemented");
                        }
                    }
                    this.G = true;
                    break;
                } else {
                    throw new UnsupportedOperationException("can't parse program_config_element yet");
                }
            case 8:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                int a6 = h40.a(1);
                this.H = a6;
                if (a6 != 1) {
                    int a7 = h40.a(1);
                    this.T = a7;
                    if (a7 == 1) {
                        this.U = h40.a(2);
                        break;
                    }
                } else {
                    int a8 = h40.a(2);
                    this.I = a8;
                    if (a8 != 1) {
                        this.K = h40.a(1);
                        this.L = h40.a(2);
                        int a9 = h40.a(1);
                        this.M = a9;
                        if (a9 == 1) {
                            this.N = h40.a(1);
                        }
                    }
                    if (this.I != 0) {
                        this.O = h40.a(1);
                        this.P = h40.a(8);
                        this.Q = h40.a(4);
                        this.R = h40.a(12);
                        this.S = h40.a(2);
                    }
                    this.J = h40.a(1);
                    this.V = true;
                    break;
                }
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.o = h40.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.p = h40.a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                new a(this.h, h40);
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i5 = this.d;
        if (!(i5 == 17 || i5 == 39)) {
            switch (i5) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    if (this.i != 5 && h40.c() >= 16) {
                        int a10 = h40.a(11);
                        this.s = a10;
                        this.u = a10;
                        if (a10 == 695) {
                            int g4 = g(h40);
                            this.i = g4;
                            if (g4 == 5) {
                                boolean b = h40.b();
                                this.j = b;
                                if (b) {
                                    int a11 = h40.a(4);
                                    this.l = a11;
                                    if (a11 == 15) {
                                        this.m = h40.a(24);
                                    }
                                    if (h40.c() >= 12) {
                                        int a12 = h40.a(11);
                                        this.s = a12;
                                        this.t = a12;
                                        if (a12 == 1352) {
                                            this.k = h40.b();
                                        }
                                    }
                                }
                            }
                            if (this.i == 22) {
                                boolean b2 = h40.b();
                                this.j = b2;
                                if (b2) {
                                    int a13 = h40.a(4);
                                    this.l = a13;
                                    if (a13 == 15) {
                                        this.m = h40.a(24);
                                    }
                                }
                                this.n = h40.a(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
            }
        }
        int a14 = h40.a(2);
        this.q = a14;
        if (a14 == 2 || a14 == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (a14 == 3) {
            int a15 = h40.a(1);
            this.r = a15;
            if (a15 == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        if (this.i != 5) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f40.class != obj.getClass()) {
            return false;
        }
        f40 f40 = (f40) obj;
        return this.D == f40.D && this.C == f40.C && this.E == f40.E && this.d == f40.d && this.h == f40.h && this.x == f40.x && this.w == f40.w && this.r == f40.r && this.q == f40.q && this.M == f40.M && this.i == f40.i && this.n == f40.n && this.y == f40.y && this.F == f40.F && this.m == f40.m && this.l == f40.l && this.p == f40.p && this.v == f40.v && this.G == f40.G && this.S == f40.S && this.T == f40.T && this.U == f40.U && this.R == f40.R && this.P == f40.P && this.O == f40.O && this.Q == f40.Q && this.L == f40.L && this.K == f40.K && this.H == f40.H && this.z == f40.z && this.B == f40.B && this.A == f40.A && this.J == f40.J && this.I == f40.I && this.V == f40.V && this.k == f40.k && this.o == f40.o && this.g == f40.g && this.f == f40.f && this.j == f40.j && this.s == f40.s && this.N == f40.N && Arrays.equals(this.W, f40.W);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.nio.ByteBuffer h() {
        /*
        // Method dump skipped, instructions count: 642
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f40.h():java.nio.ByteBuffer");
    }

    public int hashCode() {
        byte[] bArr = this.W;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((bArr != null ? Arrays.hashCode(bArr) : 0) * 31) + this.d) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + this.F) * 31) + (this.G ? 1 : 0)) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + (this.V ? 1 : 0);
    }

    @Override // defpackage.g40
    public String toString() {
        StringBuilder Z0 = je.Z0("AudioSpecificConfig", "{configBytes=");
        Z0.append(me.a(this.W));
        Z0.append(", audioObjectType=");
        Z0.append(this.d);
        Z0.append(" (");
        Z0.append(Y.get(Integer.valueOf(this.d)));
        Z0.append(")");
        Z0.append(", samplingFrequencyIndex=");
        Z0.append(this.f);
        Z0.append(" (");
        Z0.append(X.get(Integer.valueOf(this.f)));
        Z0.append(")");
        Z0.append(", samplingFrequency=");
        Z0.append(this.g);
        Z0.append(", channelConfiguration=");
        Z0.append(this.h);
        if (this.i > 0) {
            Z0.append(", extensionAudioObjectType=");
            Z0.append(this.i);
            Z0.append(" (");
            Z0.append(Y.get(Integer.valueOf(this.i)));
            Z0.append(")");
            Z0.append(", sbrPresentFlag=");
            Z0.append(this.j);
            Z0.append(", psPresentFlag=");
            Z0.append(this.k);
            Z0.append(", extensionSamplingFrequencyIndex=");
            Z0.append(this.l);
            Z0.append(" (");
            Z0.append(X.get(Integer.valueOf(this.l)));
            Z0.append(")");
            Z0.append(", extensionSamplingFrequency=");
            Z0.append(this.m);
            Z0.append(", extensionChannelConfiguration=");
            Z0.append(this.n);
        }
        Z0.append(", syncExtensionType=");
        Z0.append(this.s);
        if (this.G) {
            Z0.append(", frameLengthFlag=");
            Z0.append(this.v);
            Z0.append(", dependsOnCoreCoder=");
            Z0.append(this.w);
            Z0.append(", coreCoderDelay=");
            Z0.append(this.x);
            Z0.append(", extensionFlag=");
            Z0.append(this.y);
            Z0.append(", layerNr=");
            Z0.append(this.z);
            Z0.append(", numOfSubFrame=");
            Z0.append(this.A);
            Z0.append(", layer_length=");
            Z0.append(this.B);
            Z0.append(", aacSectionDataResilienceFlag=");
            Z0.append(this.C);
            Z0.append(", aacScalefactorDataResilienceFlag=");
            Z0.append(this.D);
            Z0.append(", aacSpectralDataResilienceFlag=");
            Z0.append(this.E);
            Z0.append(", extensionFlag3=");
            Z0.append(this.F);
        }
        if (this.V) {
            Z0.append(", isBaseLayer=");
            Z0.append(this.H);
            Z0.append(", paraMode=");
            Z0.append(this.I);
            Z0.append(", paraExtensionFlag=");
            Z0.append(this.J);
            Z0.append(", hvxcVarMode=");
            Z0.append(this.K);
            Z0.append(", hvxcRateMode=");
            Z0.append(this.L);
            Z0.append(", erHvxcExtensionFlag=");
            Z0.append(this.M);
            Z0.append(", var_ScalableFlag=");
            Z0.append(this.N);
            Z0.append(", hilnQuantMode=");
            Z0.append(this.O);
            Z0.append(", hilnMaxNumLine=");
            Z0.append(this.P);
            Z0.append(", hilnSampleRateCode=");
            Z0.append(this.Q);
            Z0.append(", hilnFrameLength=");
            Z0.append(this.R);
            Z0.append(", hilnContMode=");
            Z0.append(this.S);
            Z0.append(", hilnEnhaLayer=");
            Z0.append(this.T);
            Z0.append(", hilnEnhaQuantMode=");
            Z0.append(this.U);
        }
        Z0.append('}');
        return Z0.toString();
    }
}
