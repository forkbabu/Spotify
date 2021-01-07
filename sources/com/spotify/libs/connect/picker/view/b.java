package com.spotify.libs.connect.picker.view;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.model.Tech;
import java.util.EnumSet;

/* access modifiers changed from: package-private */
public final class b extends d {
    private final ConnectManager.ConnectState b;
    private final EnumSet<Tech> c;
    private final GaiaDevice d;
    private final GaiaDevice e;

    b(ConnectManager.ConnectState connectState, EnumSet<Tech> enumSet, GaiaDevice gaiaDevice, GaiaDevice gaiaDevice2) {
        if (connectState != null) {
            this.b = connectState;
            if (enumSet != null) {
                this.c = enumSet;
                this.d = gaiaDevice;
                this.e = gaiaDevice2;
                return;
            }
            throw new NullPointerException("Null techSet");
        }
        throw new NullPointerException("Null connectState");
    }

    @Override // com.spotify.libs.connect.picker.view.d
    public GaiaDevice a() {
        return this.d;
    }

    @Override // com.spotify.libs.connect.picker.view.d
    public ConnectManager.ConnectState b() {
        return this.b;
    }

    @Override // com.spotify.libs.connect.picker.view.d
    public GaiaDevice c() {
        return this.e;
    }

    @Override // com.spotify.libs.connect.picker.view.d
    public EnumSet<Tech> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        GaiaDevice gaiaDevice;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.b.equals(dVar.b()) && this.c.equals(dVar.e()) && ((gaiaDevice = this.d) != null ? gaiaDevice.equals(dVar.a()) : dVar.a() == null)) {
            GaiaDevice gaiaDevice2 = this.e;
            if (gaiaDevice2 == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (gaiaDevice2.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        GaiaDevice gaiaDevice = this.d;
        int i = 0;
        int hashCode2 = (hashCode ^ (gaiaDevice == null ? 0 : gaiaDevice.hashCode())) * 1000003;
        GaiaDevice gaiaDevice2 = this.e;
        if (gaiaDevice2 != null) {
            i = gaiaDevice2.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ConnectButtonState{connectState=");
        V0.append(this.b);
        V0.append(", techSet=");
        V0.append(this.c);
        V0.append(", activeDevice=");
        V0.append(this.d);
        V0.append(", connectingDevice=");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}
