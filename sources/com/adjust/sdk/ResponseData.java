package com.adjust.sdk;

import org.json.JSONObject;

public class ResponseData {
    public ActivityKind activityKind;
    public String adid;
    public AdjustAttribution attribution;
    public JSONObject jsonResponse;
    public String message;
    public boolean success;
    public String timestamp;
    public TrackingState trackingState;
    public boolean willRetry;

    /* renamed from: com.adjust.sdk.ResponseData$1  reason: invalid class name */
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
                ActivityKind activityKind2 = ActivityKind.CLICK;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$adjust$sdk$ActivityKind;
                ActivityKind activityKind3 = ActivityKind.ATTRIBUTION;
                iArr3[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$adjust$sdk$ActivityKind;
                ActivityKind activityKind4 = ActivityKind.EVENT;
                iArr4[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    protected ResponseData() {
    }

    public static ResponseData buildResponseData(ActivityPackage activityPackage) {
        ResponseData responseData;
        ResponseData responseData2;
        ActivityKind activityKind2 = activityPackage.getActivityKind();
        int ordinal = activityKind2.ordinal();
        if (ordinal == 1) {
            responseData2 = new SessionResponseData(activityPackage);
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                responseData = new SdkClickResponseData();
            } else if (ordinal != 4) {
                responseData = new ResponseData();
            } else {
                responseData = new AttributionResponseData();
            }
            responseData.activityKind = activityKind2;
            return responseData;
        } else {
            responseData2 = new EventResponseData(activityPackage);
        }
        responseData = responseData2;
        responseData.activityKind = activityKind2;
        return responseData;
    }

    public String toString() {
        return Util.formatString("message:%s timestamp:%s json:%s", this.message, this.timestamp, this.jsonResponse);
    }
}
