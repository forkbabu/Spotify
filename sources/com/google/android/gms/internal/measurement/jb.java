package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.a;
import java.util.Map;

public interface jb extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(kb kbVar);

    void getAppInstanceId(kb kbVar);

    void getCachedAppInstanceId(kb kbVar);

    void getConditionalUserProperties(String str, String str2, kb kbVar);

    void getCurrentScreenClass(kb kbVar);

    void getCurrentScreenName(kb kbVar);

    void getGmpAppId(kb kbVar);

    void getMaxUserProperties(String str, kb kbVar);

    void getTestFlag(kb kbVar, int i);

    void getUserProperties(String str, String str2, boolean z, kb kbVar);

    void initForTests(Map map);

    void initialize(a aVar, f fVar, long j);

    void isDataCollectionEnabled(kb kbVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, kb kbVar, long j);

    void logHealthData(int i, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j);

    void onActivityDestroyed(a aVar, long j);

    void onActivityPaused(a aVar, long j);

    void onActivityResumed(a aVar, long j);

    void onActivitySaveInstanceState(a aVar, kb kbVar, long j);

    void onActivityStarted(a aVar, long j);

    void onActivityStopped(a aVar, long j);

    void performAction(Bundle bundle, kb kbVar, long j);

    void registerOnMeasurementEventListener(c cVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setCurrentScreen(a aVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(c cVar);

    void setInstanceIdProvider(d dVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(c cVar);
}
