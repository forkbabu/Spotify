package com.spotify.music.superbird.setup.domain;

import android.bluetooth.BluetoothDevice;
import android.content.IntentSender;

public abstract class q {

    public static final class a extends q {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends q {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends q {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends q {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public static final class e extends q {
        private final IntentSender a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(IntentSender intentSender) {
            super(null);
            kotlin.jvm.internal.h.e(intentSender, "chooserLauncher");
            this.a = intentSender;
        }

        public final IntentSender a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && kotlin.jvm.internal.h.a(this.a, ((e) obj).a);
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

    public static final class f extends q {
        public static final f a = new f();

        private f() {
            super(null);
        }
    }

    public static final class g extends q {
        private final BluetoothDevice a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(BluetoothDevice bluetoothDevice) {
            super(null);
            kotlin.jvm.internal.h.e(bluetoothDevice, "device");
            this.a = bluetoothDevice;
        }

        public final BluetoothDevice a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && kotlin.jvm.internal.h.a(this.a, ((g) obj).a);
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
            StringBuilder V0 = je.V0("StartInterAppService(device=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class h extends q {
        public static final h a = new h();

        private h() {
            super(null);
        }
    }

    private q() {
    }

    public q(kotlin.jvm.internal.f fVar) {
    }
}
