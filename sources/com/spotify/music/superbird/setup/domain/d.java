package com.spotify.music.superbird.setup.domain;

import android.bluetooth.BluetoothDevice;
import android.content.IntentSender;

public abstract class d {

    public static final class a extends d {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends d {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends d {
        private final com.spotify.superbird.ota.model.g a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.spotify.superbird.ota.model.g gVar) {
            super(null);
            kotlin.jvm.internal.h.e(gVar, "update");
            this.a = gVar;
        }

        public final com.spotify.superbird.ota.model.g a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.h.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            com.spotify.superbird.ota.model.g gVar = this.a;
            if (gVar != null) {
                return gVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DownloadUpdate(update=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    /* renamed from: com.spotify.music.superbird.setup.domain.d$d  reason: collision with other inner class name */
    public static final class C0349d extends d {
        private final com.spotify.superbird.ota.model.g a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0349d(com.spotify.superbird.ota.model.g gVar) {
            super(null);
            kotlin.jvm.internal.h.e(gVar, "update");
            this.a = gVar;
        }

        public final com.spotify.superbird.ota.model.g a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C0349d) && kotlin.jvm.internal.h.a(this.a, ((C0349d) obj).a);
            }
            return true;
        }

        public int hashCode() {
            com.spotify.superbird.ota.model.g gVar = this.a;
            if (gVar != null) {
                return gVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DownloadUpdateOverWiFi(update=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class e extends d {
        private final SetupSubscriptionEvent a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(SetupSubscriptionEvent setupSubscriptionEvent) {
            super(null);
            kotlin.jvm.internal.h.e(setupSubscriptionEvent, "subscriptionEvent");
            this.a = setupSubscriptionEvent;
        }

        public final SetupSubscriptionEvent a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && kotlin.jvm.internal.h.a(this.a, ((e) obj).a);
            }
            return true;
        }

        public int hashCode() {
            SetupSubscriptionEvent setupSubscriptionEvent = this.a;
            if (setupSubscriptionEvent != null) {
                return setupSubscriptionEvent.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("NotifySubscribers(subscriptionEvent=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class f extends d {
        private final BluetoothDevice a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(BluetoothDevice bluetoothDevice) {
            super(null);
            kotlin.jvm.internal.h.e(bluetoothDevice, "device");
            this.a = bluetoothDevice;
        }

        public final BluetoothDevice a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof f) && kotlin.jvm.internal.h.a(this.a, ((f) obj).a);
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
            StringBuilder V0 = je.V0("Pair(device=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class g extends d {
        public static final g a = new g();

        private g() {
            super(null);
        }
    }

    public static final class h extends d {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    public static final class i extends d {
        public static final i a = new i();

        private i() {
            super(null);
        }
    }

    public static final class j extends d {
        private final IntentSender a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(IntentSender intentSender) {
            super(null);
            kotlin.jvm.internal.h.e(intentSender, "chooserLauncher");
            this.a = intentSender;
        }

        public final IntentSender a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof j) && kotlin.jvm.internal.h.a(this.a, ((j) obj).a);
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
            StringBuilder V0 = je.V0("ShowDevicePicker(chooserLauncher=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class k extends d {
        public static final k a = new k();

        private k() {
            super(null);
        }
    }

    public static final class l extends d {
        public static final l a = new l();

        private l() {
            super(null);
        }
    }

    public static final class m extends d {
        public static final m a = new m();

        private m() {
            super(null);
        }
    }

    public static final class n extends d {
        public static final n a = new n();

        private n() {
            super(null);
        }
    }

    public static final class o extends d {
        private final BluetoothDevice a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(BluetoothDevice bluetoothDevice) {
            super(null);
            kotlin.jvm.internal.h.e(bluetoothDevice, "device");
            this.a = bluetoothDevice;
        }

        public final BluetoothDevice a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof o) && kotlin.jvm.internal.h.a(this.a, ((o) obj).a);
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
            StringBuilder V0 = je.V0("UnpairAndPair(device=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public d(kotlin.jvm.internal.f fVar) {
    }
}
