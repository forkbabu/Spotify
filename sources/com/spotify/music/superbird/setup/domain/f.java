package com.spotify.music.superbird.setup.domain;

import android.bluetooth.BluetoothDevice;
import android.content.IntentSender;

public abstract class f {

    public static final class a extends f {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class a0 extends f {
        private final String a;
        private final com.spotify.superbird.ota.model.g b;
        private final boolean c;
        private final boolean d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a0(String str, com.spotify.superbird.ota.model.g gVar, boolean z, boolean z2) {
            super(null);
            kotlin.jvm.internal.h.e(str, "serial");
            kotlin.jvm.internal.h.e(gVar, "updatableItem");
            this.a = str;
            this.b = gVar;
            this.c = z;
            this.d = z2;
        }

        public final String a() {
            return this.a;
        }

        public final com.spotify.superbird.ota.model.g b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        public final boolean d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return kotlin.jvm.internal.h.a(this.a, a0Var.a) && kotlin.jvm.internal.h.a(this.b, a0Var.b) && this.c == a0Var.c && this.d == a0Var.d;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            com.spotify.superbird.ota.model.g gVar = this.b;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.c;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (i2 + i4) * 31;
            boolean z2 = this.d;
            if (!z2) {
                i3 = z2 ? 1 : 0;
            }
            return i7 + i3;
        }

        public String toString() {
            StringBuilder V0 = je.V0("UpdateAvailable(serial=");
            V0.append(this.a);
            V0.append(", updatableItem=");
            V0.append(this.b);
            V0.append(", isAutoUpdatable=");
            V0.append(this.c);
            V0.append(", isDownloaded=");
            return je.P0(V0, this.d, ")");
        }
    }

    public static final class b extends f {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class b0 extends f {
        private final boolean a;

        public b0(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b0) && this.a == ((b0) obj).a;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return je.P0(je.V0("WifiConnectivityStateChanged(isWifiConnected="), this.a, ")");
        }
    }

    public static final class c extends f {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends f {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public static final class e extends f {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return kotlin.jvm.internal.h.a(null, null);
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "CheckForUpdatesFailed(serial=null)";
        }
    }

    /* renamed from: com.spotify.music.superbird.setup.domain.f$f  reason: collision with other inner class name */
    public static final class C0350f extends f {
        public static final C0350f a = new C0350f();

        private C0350f() {
            super(null);
        }
    }

    public static final class g extends f {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    public static final class h extends f {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    public static final class i extends f {
        private final boolean a;

        public i(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof i) && this.a == ((i) obj).a;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return je.P0(je.V0("ConnectionStateChanged(isOnline="), this.a, ")");
        }
    }

    public static final class j extends f {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final long e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, String str3, String str4, long j) {
            super(null);
            kotlin.jvm.internal.h.e(str, "serial");
            kotlin.jvm.internal.h.e(str2, "pkg");
            kotlin.jvm.internal.h.e(str3, "version");
            kotlin.jvm.internal.h.e(str4, "hash");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = j;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final long d() {
            return this.e;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return kotlin.jvm.internal.h.a(this.a, jVar.a) && kotlin.jvm.internal.h.a(this.b, jVar.b) && kotlin.jvm.internal.h.a(this.c, jVar.c) && kotlin.jvm.internal.h.a(this.d, jVar.d) && this.e == jVar.e;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.d;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return ((hashCode3 + i) * 31) + defpackage.e.a(this.e);
        }

        public String toString() {
            StringBuilder V0 = je.V0("DownloadCompleted(serial=");
            V0.append(this.a);
            V0.append(", pkg=");
            V0.append(this.b);
            V0.append(", version=");
            V0.append(this.c);
            V0.append(", hash=");
            V0.append(this.d);
            V0.append(", size=");
            return je.E0(V0, this.e, ")");
        }
    }

    public static final class k extends f {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final long e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, String str3, String str4, long j) {
            super(null);
            kotlin.jvm.internal.h.e(str, "serial");
            kotlin.jvm.internal.h.e(str2, "pkg");
            kotlin.jvm.internal.h.e(str3, "version");
            kotlin.jvm.internal.h.e(str4, "hash");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return kotlin.jvm.internal.h.a(this.a, kVar.a) && kotlin.jvm.internal.h.a(this.b, kVar.b) && kotlin.jvm.internal.h.a(this.c, kVar.c) && kotlin.jvm.internal.h.a(this.d, kVar.d) && this.e == kVar.e;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.d;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return ((hashCode3 + i) * 31) + defpackage.e.a(this.e);
        }

        public String toString() {
            StringBuilder V0 = je.V0("DownloadFailed(serial=");
            V0.append(this.a);
            V0.append(", pkg=");
            V0.append(this.b);
            V0.append(", version=");
            V0.append(this.c);
            V0.append(", hash=");
            V0.append(this.d);
            V0.append(", size=");
            return je.E0(V0, this.e, ")");
        }
    }

    public static final class l extends f {
        public static final l a = new l();

        private l() {
            super(null);
        }
    }

    public static final class m extends f {
        public static final m a = new m();

        private m() {
            super(null);
        }
    }

    public static final class n extends f {
        private final Mount a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(Mount mount) {
            super(null);
            kotlin.jvm.internal.h.e(mount, "mount");
            this.a = mount;
        }

        public final Mount a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof n) && kotlin.jvm.internal.h.a(this.a, ((n) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Mount mount = this.a;
            if (mount != null) {
                return mount.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("MountSelected(mount=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class o extends f {
        public static final o a = new o();

        private o() {
            super(null);
        }
    }

    public static final class p extends f {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(null);
            kotlin.jvm.internal.h.e(str, "serial");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof p) && kotlin.jvm.internal.h.a(this.a, ((p) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("NoUpdateAvailable(serial="), this.a, ")");
        }
    }

    public static final class q extends f {
        public static final q a = new q();

        private q() {
            super(null);
        }
    }

    public static final class r extends f {
        public static final r a = new r();

        private r() {
            super(null);
        }
    }

    public static final class s extends f {
        public static final s a = new s();

        private s() {
            super(null);
        }
    }

    public static final class t extends f {
        public static final t a = new t();

        private t() {
            super(null);
        }
    }

    public static final class u extends f {
        public static final u a = new u();

        private u() {
            super(null);
        }
    }

    public static final class v extends f {
        public static final v a = new v();

        private v() {
            super(null);
        }
    }

    public static final class w extends f {
        public static final w a = new w();

        private w() {
            super(null);
        }
    }

    public static final class x extends f {
        private final boolean a;

        public x(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof x) && this.a == ((x) obj).a;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return je.P0(je.V0("SuperbirdConnected(isConnected="), this.a, ")");
        }
    }

    public static final class y extends f {
        private final IntentSender a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public y(IntentSender intentSender) {
            super(null);
            kotlin.jvm.internal.h.e(intentSender, "chooserLauncher");
            this.a = intentSender;
        }

        public final IntentSender a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof y) && kotlin.jvm.internal.h.a(this.a, ((y) obj).a);
            }
            return true;
        }

        public int hashCode() {
            IntentSender intentSender = this.a;
            if (intentSender != null) {
                return intentSender.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SuperbirdFound(chooserLauncher=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class z extends f {
        private final BluetoothDevice a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public z(BluetoothDevice bluetoothDevice) {
            super(null);
            kotlin.jvm.internal.h.e(bluetoothDevice, "selectedDevice");
            this.a = bluetoothDevice;
        }

        public final BluetoothDevice a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof z) && kotlin.jvm.internal.h.a(this.a, ((z) obj).a);
            }
            return true;
        }

        public int hashCode() {
            BluetoothDevice bluetoothDevice = this.a;
            if (bluetoothDevice != null) {
                return bluetoothDevice.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("SuperbirdSelected(selectedDevice=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    private f() {
    }

    public f(kotlin.jvm.internal.f fVar) {
    }
}
