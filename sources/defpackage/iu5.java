package defpackage;

import android.content.Context;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.features.nowplayingbar.view.a0;
import com.spotify.music.features.nowplayingbar.view.f0;
import com.spotify.music.features.nowplayingbar.view.v;
import com.spotify.music.features.nowplayingbar.view.w;

/* renamed from: iu5  reason: default package */
public abstract class iu5 {

    /* renamed from: iu5$a */
    public static final class a extends iu5 {
        private final GaiaDevice a;

        a(GaiaDevice gaiaDevice) {
            gaiaDevice.getClass();
            this.a = gaiaDevice;
        }

        @Override // defpackage.iu5
        public final void c(si0<c> si0, si0<a> si02, si0<b> si03, si0<d> si04) {
            ((a0) si02).a.y(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.equals(this.a);
        }

        public final GaiaDevice f() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode() + 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Connecting{device=");
            V0.append(this.a);
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: iu5$b */
    public static final class b extends iu5 {
        b() {
        }

        @Override // defpackage.iu5
        public final void c(si0<c> si0, si0<a> si02, si0<b> si03, si0<d> si04) {
            ((f0) si03).a.z(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof b;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "DevicesAvailable{}";
        }
    }

    /* renamed from: iu5$c */
    public static final class c extends iu5 {
        c() {
        }

        @Override // defpackage.iu5
        public final void c(si0<c> si0, si0<a> si02, si0<b> si03, si0<d> si04) {
            ((w) si0).a.x(this);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return 0;
        }

        public String toString() {
            return "NoDevices{}";
        }
    }

    /* renamed from: iu5$d */
    public static final class d extends iu5 {
        private final GaiaDevice a;
        private final ea2<Context, String> b;

        d(GaiaDevice gaiaDevice, ea2<Context, String> ea2) {
            gaiaDevice.getClass();
            this.a = gaiaDevice;
            ea2.getClass();
            this.b = ea2;
        }

        @Override // defpackage.iu5
        public final void c(si0<c> si0, si0<a> si02, si0<b> si03, si0<d> si04) {
            ((v) si04).a.A(this);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a.equals(this.a) || !dVar.b.equals(this.b)) {
                return false;
            }
            return true;
        }

        public final GaiaDevice f() {
            return this.a;
        }

        public int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + 0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("PlayingFrom{device=");
            V0.append(this.a);
            V0.append(", decoratedDeviceName=");
            V0.append(this.b);
            V0.append('}');
            return V0.toString();
        }
    }

    iu5() {
    }

    public static iu5 a(GaiaDevice gaiaDevice) {
        return new a(gaiaDevice);
    }

    public static iu5 b() {
        return new b();
    }

    public static iu5 d() {
        return new c();
    }

    public static iu5 e(GaiaDevice gaiaDevice, ea2<Context, String> ea2) {
        return new d(gaiaDevice, ea2);
    }

    public abstract void c(si0<c> si0, si0<a> si02, si0<b> si03, si0<d> si04);
}
