package com.spotify.mobile.android.video.endvideo;

import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.video.drm.EncryptionType;
import java.util.EnumMap;
import java.util.Map;

public class n {
    public final long A;
    public final boolean B;
    public final long C;
    public final long D;
    public final String E;
    public final boolean F;
    public final String G;
    public final String H;
    public final int I;
    public final long J;
    public final String K;
    public final String L;
    public final long M;
    public final long N;
    public final long O;
    public final long P;
    public final long Q;
    public final long R;
    public final EncryptionType S;
    public final long T;
    private final long U;
    private final long V;
    private final long W;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final long t;
    public final long u;
    public final int v;
    public final long w;
    public final int x;
    public final long y;
    public final long z;

    public static class b {
        private static final Map<ConnectionType, String> X;
        private long A;
        private long B = -1;
        private long C = -1;
        private boolean D;
        private long E;
        private long F;
        private int G;
        private long H;
        private String I = "";
        private String J = "";
        private long K = -1;
        private long L;
        private long M;
        private long N;
        private long O;
        private long P;
        private EncryptionType Q;
        private long R;
        private long S;
        private long T;
        private long U;
        private String V;
        private String W;
        private final String a;
        private String b = "";
        private String c;
        private String d = "";
        private String e = "";
        private String f = "";
        private String g = "";
        private String h = "none";
        private String i = "";
        private String j = "";
        private String k = "";
        private String l = "";
        private String m = "";
        private String n = "unknown";
        private String o;
        private String p;
        private boolean q;
        private String r;
        private String s;
        private long t;
        private long u;
        private long v;
        private long w = -1;
        private int x;
        private long y;
        private int z;

        static {
            EnumMap enumMap = new EnumMap(ConnectionType.class);
            X = enumMap;
            enumMap.put((EnumMap) ConnectionType.CONNECTION_TYPE_UNKNOWN, (ConnectionType) "unknown");
            enumMap.put((EnumMap) ConnectionType.CONNECTION_TYPE_NONE, (ConnectionType) "none");
            enumMap.put((EnumMap) ConnectionType.CONNECTION_TYPE_GPRS, (ConnectionType) "gprs");
            enumMap.put((EnumMap) ConnectionType.CONNECTION_TYPE_EDGE, (ConnectionType) "edge");
            enumMap.put((EnumMap) ConnectionType.CONNECTION_TYPE_3G, (ConnectionType) "3g");
            enumMap.put((EnumMap) ConnectionType.CONNECTION_TYPE_4G, (ConnectionType) "4g");
            enumMap.put((EnumMap) ConnectionType.CONNECTION_TYPE_WLAN, (ConnectionType) "wlan");
            enumMap.put((EnumMap) ConnectionType.CONNECTION_TYPE_ETHERNET, (ConnectionType) "ethernet");
        }

        public b(String str) {
            str.getClass();
            this.a = str;
        }

        public b A0(int i2) {
            this.G = i2;
            return this;
        }

        public b B0(String str) {
            this.V = str;
            return this;
        }

        public b C0(String str) {
            this.p = str;
            return this;
        }

        public b D0(boolean z2) {
            this.q = z2;
            return this;
        }

        public b E0(String str) {
            str.getClass();
            this.i = str;
            return this;
        }

        public b F0(b72 b72) {
            b72.getClass();
            this.n = b72.a();
            return this;
        }

        public b G0(String str) {
            str.getClass();
            this.o = str;
            return this;
        }

        public b H0(String str) {
            str.getClass();
            this.j = str;
            return this;
        }

        public b I0(String str) {
            this.l = str;
            return this;
        }

        public b J0(String str) {
            str.getClass();
            this.k = str;
            return this;
        }

        public b K0(boolean z2) {
            this.D = z2;
            return this;
        }

        public b L0(ConnectionType connectionType) {
            String str = X.get(connectionType);
            this.I = str;
            if (str == null) {
                this.I = "unknown";
            }
            return this;
        }

        public b M0(long j2) {
            this.K = j2;
            return this;
        }

        public b N0(String str) {
            str.getClass();
            this.m = str;
            return this;
        }

        public b O0(long j2) {
            this.H = j2;
            return this;
        }

        public b P0(long j2) {
            this.S = j2;
            return this;
        }

        public b Q0(String str) {
            this.s = str;
            return this;
        }

        public b R0(String str) {
            str.getClass();
            this.c = str;
            return this;
        }

        public b S0(String str) {
            str.getClass();
            this.f = str;
            return this;
        }

        public b X(String str) {
            this.r = str;
            return this;
        }

        public b Y(String str) {
            str.getClass();
            this.g = str;
            return this;
        }

        public b Z(EncryptionType encryptionType) {
            if (this.Q == null) {
                this.Q = encryptionType;
            }
            return this;
        }

        public b a0(ConnectionType connectionType) {
            String str = X.get(connectionType);
            this.J = str;
            if (str == null) {
                this.J = "unknown";
            }
            return this;
        }

        public b b0(String str) {
            str.getClass();
            this.d = str;
            return this;
        }

        public b c0(String str) {
            str.getClass();
            this.e = str;
            return this;
        }

        public b d0(String str) {
            str.getClass();
            this.h = str;
            return this;
        }

        public b e0(long j2) {
            this.O = j2;
            return this;
        }

        public b f0(String str) {
            this.W = str;
            return this;
        }

        public b g0(long j2) {
            this.T = j2;
            return this;
        }

        public b h0(String str) {
            str.getClass();
            this.b = str;
            return this;
        }

        public b i0(long j2) {
            this.M = j2;
            return this;
        }

        public b j0(long j2) {
            this.N = j2;
            return this;
        }

        public b k0(long j2) {
            this.P = j2;
            return this;
        }

        public b l0(long j2) {
            this.L = j2;
            return this;
        }

        public b m0(long j2) {
            this.R = j2;
            return this;
        }

        public b n0(long j2) {
            this.B = j2;
            return this;
        }

        public b o0(long j2) {
            this.w = j2;
            return this;
        }

        public b p0(long j2) {
            this.E = j2;
            return this;
        }

        public b q0(long j2) {
            this.u = j2;
            return this;
        }

        public b r0(long j2) {
            this.t = j2;
            return this;
        }

        public b s0(long j2) {
            this.U = j2;
            return this;
        }

        public b t0(long j2) {
            this.y = j2;
            return this;
        }

        public b u0(long j2) {
            this.A = j2;
            return this;
        }

        public b v0(long j2) {
            this.v = j2;
            return this;
        }

        public b w0(long j2) {
            this.C = j2;
            return this;
        }

        public b x0(long j2) {
            this.F = j2;
            return this;
        }

        public b y0(int i2) {
            this.x = i2;
            return this;
        }

        public b z0(int i2) {
            this.z = i2;
            return this;
        }
    }

    n(b bVar, a aVar) {
        this.a = bVar.b;
        this.b = bVar.a;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.g = bVar.f;
        this.f = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
        this.n = bVar.n;
        this.o = bVar.o;
        this.p = bVar.V;
        this.q = bVar.W;
        this.r = bVar.t;
        this.s = bVar.u;
        this.t = bVar.v;
        this.u = bVar.w;
        this.v = bVar.x;
        this.w = bVar.y;
        this.x = bVar.z;
        this.y = bVar.A;
        this.z = bVar.B;
        this.A = bVar.C;
        this.B = bVar.D;
        this.C = bVar.E;
        this.D = bVar.F;
        this.I = bVar.G;
        this.J = bVar.H;
        this.K = bVar.I;
        this.L = bVar.J;
        this.M = bVar.K;
        this.N = bVar.L;
        this.O = bVar.M;
        this.P = bVar.N;
        this.F = bVar.q;
        this.E = bVar.p;
        this.G = bVar.r;
        this.H = bVar.s;
        this.Q = bVar.O;
        this.R = bVar.P;
        this.S = bVar.Q;
        this.T = bVar.R;
        this.U = bVar.S;
        this.V = bVar.T;
        this.W = bVar.U;
    }

    public v91 a(long j2, String str) {
        String str2;
        long j3;
        String str3 = this.c;
        byte[] u2 = z42.u(this.a);
        byte[] u3 = z42.u(this.b);
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.g;
        String str7 = this.o;
        String str8 = this.n;
        long j4 = this.r;
        long j5 = this.s;
        long j6 = this.t;
        long j7 = this.u;
        long j8 = (long) this.v;
        long j9 = this.w;
        long j10 = (long) this.x;
        long j11 = this.y;
        long j12 = this.z;
        long j13 = this.A;
        long j14 = this.M;
        long j15 = this.N;
        long j16 = this.O;
        long j17 = this.P;
        long j18 = (long) this.I;
        boolean z2 = this.B;
        long j19 = this.C;
        long j20 = this.D;
        String str9 = this.f;
        String str10 = this.G;
        String str11 = this.H;
        String str12 = this.E;
        boolean z3 = this.F;
        String str13 = this.i;
        String str14 = this.j;
        String str15 = this.k;
        String str16 = this.l;
        String str17 = this.m;
        String str18 = this.h;
        long j21 = this.Q;
        long j22 = this.R;
        long j23 = this.J;
        EncryptionType encryptionType = this.S;
        if (encryptionType == null) {
            str2 = "none";
            j3 = j5;
        } else {
            j3 = j5;
            str2 = encryptionType == EncryptionType.WIDEVINE ? "widevine" : "";
        }
        return new v91(j2, str, str3, u2, u3, str4, str5, str6, str7, str8, j4, j3, j6, false, j7, j8, j9, j10, j11, j12, j13, j14, j15, 0, 0, j16, j17, j18, z2, j19, j20, str9, str10, str11, str12, z3, str13, str14, str15, str16, str17, str18, j21, j22, j23, -1, 0, str2, this.T, this.U, this.V, this.K, this.L, this.W, this.p, this.q);
    }

    public boolean b() {
        return !a72.b.a().equals(this.o) || this.r >= 100;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaybackReport{mManifestId='");
        je.A(V0, this.a, '\'', ", mPlaybackId='");
        je.A(V0, this.b, '\'', ", mVideoSessionId='");
        je.A(V0, this.c, '\'', ", mFeatureIdentifier='");
        je.A(V0, this.d, '\'', ", mFeatureVersion='");
        je.A(V0, this.e, '\'', ", mContextUri='");
        je.A(V0, this.f, '\'', ", mViewUri='");
        je.A(V0, this.g, '\'', ", mGaiaDeviceId='");
        je.A(V0, this.h, '\'', ", mProvider='");
        je.A(V0, this.i, '\'', ", mReferrer='");
        je.A(V0, this.j, '\'', ", mReferrerVersion='");
        je.A(V0, this.k, '\'', ", mReferrerVendor='");
        je.A(V0, this.l, '\'', ", mStreamingRule='");
        je.A(V0, this.m, '\'', ", mReasonEnd='");
        je.A(V0, this.n, '\'', ", mReasonStart='");
        je.A(V0, this.o, '\'', ", mPageInstanceId='");
        je.A(V0, this.p, '\'', ", mInteractionId='");
        je.A(V0, this.q, '\'', ", mMsPlayed=");
        V0.append(this.r);
        V0.append(", mMsNominalPlayed=");
        V0.append(this.s);
        V0.append(", mMsTotalEstimated=");
        V0.append(this.t);
        V0.append(", mMsManifestLatency=");
        V0.append(this.u);
        V0.append(", mNSeekBack=");
        V0.append(this.v);
        V0.append(", mMsSeekBack=");
        V0.append(this.w);
        V0.append(", mNSeekForward=");
        V0.append(this.x);
        V0.append(", mMsSeekForward=");
        V0.append(this.y);
        V0.append(", mMsLatency=");
        V0.append(this.z);
        V0.append(", mMsUiLatency=");
        V0.append(this.A);
        V0.append(", mShuffle=");
        V0.append(this.B);
        V0.append(", mMsMaxContinuous=");
        V0.append(this.C);
        V0.append(", mMsUnionPlayed=");
        V0.append(this.D);
        V0.append(", mPlayedTrack='");
        je.A(V0, this.E, '\'', ", mPrivateSession=");
        V0.append(this.F);
        V0.append(", mAudioCodec='");
        je.A(V0, this.G, '\'', ", mVideoCodec='");
        je.A(V0, this.H, '\'', ", mNStalls=");
        V0.append(this.I);
        V0.append(", mTimeWeightedBitrate=");
        V0.append(this.J);
        V0.append(", mStartConnectionType='");
        je.A(V0, this.K, '\'', ", mEndConnectionType='");
        V0.append(this.L);
        V0.append('\'');
        V0.append(", mIsTrackingOngoing=");
        V0.append(false);
        V0.append(", mMsStalled=");
        V0.append(0L);
        V0.append(", mStartOffsetMs=");
        V0.append(this.M);
        V0.append(", mMsInitialBuffering=");
        V0.append(this.N);
        V0.append(", mMsSeekRebuffering=");
        V0.append(0L);
        V0.append(", mMaxMsSeekRebuffering=");
        V0.append(this.O);
        V0.append(", mMaxMsStalled=");
        V0.append(this.P);
        V0.append(", mPrefetchedBytesLoaded=");
        V0.append(0L);
        V0.append(", mInitialBitrate=");
        V0.append(this.Q);
        V0.append(", mMsFullscreen=");
        V0.append(this.R);
        V0.append(", mEncryptionType=");
        V0.append(this.S);
        V0.append(", mMsKeyLatency=");
        V0.append(this.T);
        V0.append(", mTotalBytesTransfered=");
        V0.append(this.U);
        V0.append(", mLocalTimeMs=");
        V0.append(this.V);
        V0.append(", mLastKnownVideoFormat=");
        V0.append((Object) null);
        V0.append(", mMsPlayedInBackground=");
        V0.append(this.W);
        V0.append(", mMarkedEmpty=");
        V0.append(false);
        V0.append('}');
        return V0.toString();
    }
}
