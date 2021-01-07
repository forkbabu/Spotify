package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class lb extends a implements jb {
    lb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void beginAdUnitExposure(String str, long j) {
        Parcel T = T();
        T.writeString(str);
        T.writeLong(j);
        C0(23, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel T = T();
        T.writeString(str);
        T.writeString(str2);
        v.c(T, bundle);
        C0(9, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void endAdUnitExposure(String str, long j) {
        Parcel T = T();
        T.writeString(str);
        T.writeLong(j);
        C0(24, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void generateEventId(kb kbVar) {
        Parcel T = T();
        v.b(T, kbVar);
        C0(22, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void getCachedAppInstanceId(kb kbVar) {
        Parcel T = T();
        v.b(T, kbVar);
        C0(19, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void getConditionalUserProperties(String str, String str2, kb kbVar) {
        Parcel T = T();
        T.writeString(str);
        T.writeString(str2);
        v.b(T, kbVar);
        C0(10, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void getCurrentScreenClass(kb kbVar) {
        Parcel T = T();
        v.b(T, kbVar);
        C0(17, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void getCurrentScreenName(kb kbVar) {
        Parcel T = T();
        v.b(T, kbVar);
        C0(16, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void getGmpAppId(kb kbVar) {
        Parcel T = T();
        v.b(T, kbVar);
        C0(21, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void getMaxUserProperties(String str, kb kbVar) {
        Parcel T = T();
        T.writeString(str);
        v.b(T, kbVar);
        C0(6, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void getUserProperties(String str, String str2, boolean z, kb kbVar) {
        Parcel T = T();
        T.writeString(str);
        T.writeString(str2);
        int i = v.b;
        T.writeInt(z ? 1 : 0);
        v.b(T, kbVar);
        C0(5, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void initialize(a aVar, f fVar, long j) {
        Parcel T = T();
        v.b(T, aVar);
        v.c(T, fVar);
        T.writeLong(j);
        C0(1, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel T = T();
        T.writeString(str);
        T.writeString(str2);
        v.c(T, bundle);
        T.writeInt(z ? 1 : 0);
        T.writeInt(z2 ? 1 : 0);
        T.writeLong(j);
        C0(2, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void logHealthData(int i, String str, a aVar, a aVar2, a aVar3) {
        Parcel T = T();
        T.writeInt(i);
        T.writeString(str);
        v.b(T, aVar);
        v.b(T, aVar2);
        v.b(T, aVar3);
        C0(33, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void onActivityCreated(a aVar, Bundle bundle, long j) {
        Parcel T = T();
        v.b(T, aVar);
        v.c(T, bundle);
        T.writeLong(j);
        C0(27, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void onActivityDestroyed(a aVar, long j) {
        Parcel T = T();
        v.b(T, aVar);
        T.writeLong(j);
        C0(28, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void onActivityPaused(a aVar, long j) {
        Parcel T = T();
        v.b(T, aVar);
        T.writeLong(j);
        C0(29, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void onActivityResumed(a aVar, long j) {
        Parcel T = T();
        v.b(T, aVar);
        T.writeLong(j);
        C0(30, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void onActivitySaveInstanceState(a aVar, kb kbVar, long j) {
        Parcel T = T();
        v.b(T, aVar);
        v.b(T, kbVar);
        T.writeLong(j);
        C0(31, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void onActivityStarted(a aVar, long j) {
        Parcel T = T();
        v.b(T, aVar);
        T.writeLong(j);
        C0(25, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void onActivityStopped(a aVar, long j) {
        Parcel T = T();
        v.b(T, aVar);
        T.writeLong(j);
        C0(26, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void registerOnMeasurementEventListener(c cVar) {
        Parcel T = T();
        v.b(T, cVar);
        C0(35, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel T = T();
        v.c(T, bundle);
        T.writeLong(j);
        C0(8, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void setCurrentScreen(a aVar, String str, String str2, long j) {
        Parcel T = T();
        v.b(T, aVar);
        T.writeString(str);
        T.writeString(str2);
        T.writeLong(j);
        C0(15, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void setDataCollectionEnabled(boolean z) {
        Parcel T = T();
        int i = v.b;
        T.writeInt(z ? 1 : 0);
        C0(39, T);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final void setUserProperty(String str, String str2, a aVar, boolean z, long j) {
        Parcel T = T();
        T.writeString(str);
        T.writeString(str2);
        v.b(T, aVar);
        T.writeInt(z ? 1 : 0);
        T.writeLong(j);
        C0(4, T);
    }
}
