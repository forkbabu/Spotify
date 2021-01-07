package com.spotify.superbird.ota.logger.pitstopevents;

public final class OtaEvent extends lpe {

    public enum Event {
        CHECK_FOR_UPDATES("check_for_updates"),
        CHECK_FOR_UPDATES_ERROR("check_for_updates_error"),
        DOWNLOAD_START("download_start"),
        DOWNLOAD_COMPLETE("download_complete"),
        DOWNLOAD_ERROR("download_error");
        
        private final String value;

        private Event(String str) {
            this.value = str;
        }

        public final String d() {
            return this.value;
        }
    }

    public enum Trigger {
        MOBILE("Mobile"),
        CAR_THING("Car Thing");
        
        private final String value;

        private Trigger(String str) {
            this.value = str;
        }

        public final String d() {
            return this.value;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OtaEvent(com.spotify.superbird.ota.logger.pitstopevents.OtaEvent.Event r5, java.lang.String r6, long r7, java.lang.String r9, java.lang.String r10, java.lang.String r11, com.spotify.superbird.ota.logger.pitstopevents.OtaEvent.Trigger r12, int r13) {
        /*
            r4 = this;
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0006
            java.lang.String r10 = ""
        L_0x0006:
            r0 = r13 & 32
            r1 = 0
            if (r0 == 0) goto L_0x000c
            r11 = r1
        L_0x000c:
            r13 = r13 & 64
            if (r13 == 0) goto L_0x0011
            r12 = r1
        L_0x0011:
            java.lang.String r13 = "event"
            kotlin.jvm.internal.h.e(r5, r13)
            java.lang.String r0 = "packageName"
            kotlin.jvm.internal.h.e(r6, r0)
            java.lang.String r0 = "fromVersion"
            kotlin.jvm.internal.h.e(r9, r0)
            java.lang.String r0 = "toVersion"
            kotlin.jvm.internal.h.e(r10, r0)
            r0 = 6
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r2 = "type"
            java.lang.String r3 = "ota"
            r1.<init>(r2, r3)
            r2 = 0
            r0[r2] = r1
            r1 = 1
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r3 = "package_name"
            r2.<init>(r3, r6)
            r0[r1] = r2
            r6 = 2
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.String r1 = "timestamp"
            r8.<init>(r1, r7)
            r0[r6] = r8
            r6 = 3
            java.lang.String r5 = r5.d()
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r13, r5)
            r0[r6] = r7
            r5 = 4
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r7 = "from_version"
            r6.<init>(r7, r9)
            r0[r5] = r6
            r5 = 5
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r7 = "to_version"
            r6.<init>(r7, r10)
            r0[r5] = r6
            java.util.Map r5 = kotlin.collections.d.A(r0)
            if (r11 == 0) goto L_0x0077
            java.lang.String r6 = "error"
            r5.put(r6, r11)
        L_0x0077:
            if (r12 == 0) goto L_0x0082
            java.lang.String r6 = r12.d()
            java.lang.String r7 = "trigger"
            r5.put(r7, r6)
        L_0x0082:
            r4.<init>(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.superbird.ota.logger.pitstopevents.OtaEvent.<init>(com.spotify.superbird.ota.logger.pitstopevents.OtaEvent$Event, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, com.spotify.superbird.ota.logger.pitstopevents.OtaEvent$Trigger, int):void");
    }
}
