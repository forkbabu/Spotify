package com.spotify.music.appprotocol.superbird.crashreporting.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class CrashReportingAppProtocol implements JacksonModel {

    public static final class DeviceCrashReport extends CrashReportingAppProtocol {
        private final byte[] minidump;
        private final String serial;
        private final String versionOs;
        private final String versionSoftware;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeviceCrashReport(@JsonProperty("minidump") byte[] bArr, @JsonProperty("serial") String str, @JsonProperty("version_os") String str2, @JsonProperty("version_software") String str3) {
            super(null);
            h.e(bArr, "minidump");
            h.e(str, "serial");
            h.e(str2, "versionOs");
            h.e(str3, "versionSoftware");
            this.minidump = bArr;
            this.serial = str;
            this.versionOs = str2;
            this.versionSoftware = str3;
        }

        public static /* synthetic */ DeviceCrashReport copy$default(DeviceCrashReport deviceCrashReport, byte[] bArr, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = deviceCrashReport.minidump;
            }
            if ((i & 2) != 0) {
                str = deviceCrashReport.serial;
            }
            if ((i & 4) != 0) {
                str2 = deviceCrashReport.versionOs;
            }
            if ((i & 8) != 0) {
                str3 = deviceCrashReport.versionSoftware;
            }
            return deviceCrashReport.copy(bArr, str, str2, str3);
        }

        public final byte[] component1() {
            return this.minidump;
        }

        public final String component2() {
            return this.serial;
        }

        public final String component3() {
            return this.versionOs;
        }

        public final String component4() {
            return this.versionSoftware;
        }

        public final DeviceCrashReport copy(@JsonProperty("minidump") byte[] bArr, @JsonProperty("serial") String str, @JsonProperty("version_os") String str2, @JsonProperty("version_software") String str3) {
            h.e(bArr, "minidump");
            h.e(str, "serial");
            h.e(str2, "versionOs");
            h.e(str3, "versionSoftware");
            return new DeviceCrashReport(bArr, str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceCrashReport)) {
                return false;
            }
            DeviceCrashReport deviceCrashReport = (DeviceCrashReport) obj;
            return h.a(this.minidump, deviceCrashReport.minidump) && h.a(this.serial, deviceCrashReport.serial) && h.a(this.versionOs, deviceCrashReport.versionOs) && h.a(this.versionSoftware, deviceCrashReport.versionSoftware);
        }

        public final byte[] getMinidump() {
            return this.minidump;
        }

        public final String getSerial() {
            return this.serial;
        }

        public final String getVersionOs() {
            return this.versionOs;
        }

        public final String getVersionSoftware() {
            return this.versionSoftware;
        }

        public int hashCode() {
            byte[] bArr = this.minidump;
            int i = 0;
            int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
            String str = this.serial;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.versionOs;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.versionSoftware;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("DeviceCrashReport(minidump=");
            V0.append(Arrays.toString(this.minidump));
            V0.append(", serial=");
            V0.append(this.serial);
            V0.append(", versionOs=");
            V0.append(this.versionOs);
            V0.append(", versionSoftware=");
            return je.I0(V0, this.versionSoftware, ")");
        }
    }

    private CrashReportingAppProtocol() {
    }

    public /* synthetic */ CrashReportingAppProtocol(f fVar) {
        this();
    }
}
