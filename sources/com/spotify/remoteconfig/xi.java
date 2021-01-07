package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ck;

/* access modifiers changed from: package-private */
public final class xi extends ck {
    private final boolean a;
    private final boolean b;

    static final class b extends ck.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public ck a() {
            String str = "";
            if (this.a == null) {
                str = je.x0(str, " drivingCarViewRecordSensorDataForClassification");
            }
            if (this.b == null) {
                str = je.x0(str, " drivingCarViewRecordSensorDataForTraining");
            }
            if (str.isEmpty()) {
                return new xi(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public ck.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public ck.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    xi(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.ck
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.ck
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ck)) {
            return false;
        }
        ck ckVar = (ck) obj;
        if (this.a == ckVar.a() && this.b == ckVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SensorRecorderProperties{drivingCarViewRecordSensorDataForClassification=");
        V0.append(this.a);
        V0.append(", drivingCarViewRecordSensorDataForTraining=");
        return je.P0(V0, this.b, "}");
    }
}
