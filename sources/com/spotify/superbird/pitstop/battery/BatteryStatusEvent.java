package com.spotify.superbird.pitstop.battery;

import com.adjust.sdk.Constants;

public final class BatteryStatusEvent extends lpe {

    public enum PowerMode {
        LOW(Constants.LOW),
        NORMAL("normal");
        
        private final String powerModeString;

        private PowerMode(String str) {
            this.powerModeString = str;
        }

        public final String d() {
            return this.powerModeString;
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x003f: APUT  
      (r0v2 kotlin.Pair[])
      (3 ??[int, float, short, byte, char])
      (wrap: kotlin.Pair : 0x003b: CONSTRUCTOR  (r7v1 kotlin.Pair) = ("charging"), (r5v5 java.lang.String) call: kotlin.Pair.<init>(java.lang.Object, java.lang.Object):void type: CONSTRUCTOR)
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BatteryStatusEvent(com.spotify.superbird.pitstop.battery.BatteryStatusEvent.PowerMode r5, int r6, boolean r7, long r8) {
        /*
            r4 = this;
            java.lang.String r0 = "powerMode"
            kotlin.jvm.internal.h.e(r5, r0)
            r0 = 5
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r2 = "type"
            java.lang.String r3 = "phone_power_mgmt"
            r1.<init>(r2, r3)
            r2 = 0
            r0[r2] = r1
            java.lang.String r5 = r5.d()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r2 = "power_mode"
            r1.<init>(r2, r5)
            r5 = 1
            r0[r5] = r1
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.String r9 = "timestamp"
            r8.<init>(r9, r5)
            r5 = 2
            r0[r5] = r8
            if (r7 == 0) goto L_0x0035
            java.lang.String r5 = "yes"
            goto L_0x0037
        L_0x0035:
            java.lang.String r5 = "no"
        L_0x0037:
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r8 = "charging"
            r7.<init>(r8, r5)
            r5 = 3
            r0[r5] = r7
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r8 = "battery_level"
            r7.<init>(r8, r6)
            r0[r5] = r7
            java.util.Map r5 = kotlin.collections.d.y(r0)
            r4.<init>(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.superbird.pitstop.battery.BatteryStatusEvent.<init>(com.spotify.superbird.pitstop.battery.BatteryStatusEvent$PowerMode, int, boolean, long):void");
    }
}
