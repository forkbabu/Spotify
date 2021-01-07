package com.adjust.sdk;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

public enum ActivityKind {
    UNKNOWN,
    SESSION,
    EVENT,
    CLICK,
    ATTRIBUTION,
    REVENUE,
    REATTRIBUTION,
    INFO,
    GDPR,
    AD_REVENUE,
    DISABLE_THIRD_PARTY_SHARING,
    SUBSCRIPTION;

    /* renamed from: com.adjust.sdk.ActivityKind$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$adjust$sdk$ActivityKind;

        static {
            ActivityKind.values();
            int[] iArr = new int[12];
            $SwitchMap$com$adjust$sdk$ActivityKind = iArr;
            try {
                ActivityKind activityKind = ActivityKind.SESSION;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$adjust$sdk$ActivityKind;
                ActivityKind activityKind2 = ActivityKind.EVENT;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$adjust$sdk$ActivityKind;
                ActivityKind activityKind3 = ActivityKind.CLICK;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$adjust$sdk$ActivityKind;
                ActivityKind activityKind4 = ActivityKind.ATTRIBUTION;
                iArr4[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$com$adjust$sdk$ActivityKind;
                ActivityKind activityKind5 = ActivityKind.INFO;
                iArr5[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = $SwitchMap$com$adjust$sdk$ActivityKind;
                ActivityKind activityKind6 = ActivityKind.GDPR;
                iArr6[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = $SwitchMap$com$adjust$sdk$ActivityKind;
                ActivityKind activityKind7 = ActivityKind.DISABLE_THIRD_PARTY_SHARING;
                iArr7[10] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = $SwitchMap$com$adjust$sdk$ActivityKind;
                ActivityKind activityKind8 = ActivityKind.AD_REVENUE;
                iArr8[9] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = $SwitchMap$com$adjust$sdk$ActivityKind;
                ActivityKind activityKind9 = ActivityKind.SUBSCRIPTION;
                iArr9[11] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static ActivityKind fromString(String str) {
        if ("session".equals(str)) {
            return SESSION;
        }
        if ("event".equals(str)) {
            return EVENT;
        }
        if ("click".equals(str)) {
            return CLICK;
        }
        if ("attribution".equals(str)) {
            return ATTRIBUTION;
        }
        if (AppProtocol.LogMessage.SEVERITY_INFO.equals(str)) {
            return INFO;
        }
        if ("gdpr".equals(str)) {
            return GDPR;
        }
        if ("disable_third_party_sharing".equals(str)) {
            return DISABLE_THIRD_PARTY_SHARING;
        }
        if ("ad_revenue".equals(str)) {
            return AD_REVENUE;
        }
        if ("subscription".equals(str)) {
            return SUBSCRIPTION;
        }
        return UNKNOWN;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        switch (ordinal()) {
            case 1:
                return "session";
            case 2:
                return "event";
            case 3:
                return "click";
            case 4:
                return "attribution";
            case 5:
            case 6:
            default:
                return "unknown";
            case 7:
                return AppProtocol.LogMessage.SEVERITY_INFO;
            case 8:
                return "gdpr";
            case 9:
                return "ad_revenue";
            case 10:
                return "disable_third_party_sharing";
            case 11:
                return "subscription";
        }
    }
}
