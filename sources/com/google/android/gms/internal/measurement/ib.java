package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public abstract class ib extends q0 implements jb {
    public ib() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static jb asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof jb) {
            return (jb) queryLocalInterface;
        }
        return new lb(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.q0
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        kb kbVar;
        boolean z = false;
        kb kbVar2 = null;
        kb kbVar3 = null;
        kb kbVar4 = null;
        c cVar = null;
        c cVar2 = null;
        c cVar3 = null;
        kb kbVar5 = null;
        kb kbVar6 = null;
        kb kbVar7 = null;
        kb kbVar8 = null;
        kb kbVar9 = null;
        kb kbVar10 = null;
        d dVar = null;
        kb kbVar11 = null;
        kb kbVar12 = null;
        kb kbVar13 = null;
        kb kbVar14 = null;
        kb kbVar15 = null;
        switch (i) {
            case 1:
                initialize(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), (f) v.a(parcel, f.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) v.a(parcel, Bundle.CREATOR), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) v.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof kb) {
                        kbVar = (kb) queryLocalInterface;
                    } else {
                        kbVar = new mb(readStrongBinder);
                    }
                    kbVar2 = kbVar;
                }
                logEventAndBundle(readString, readString2, bundle, kbVar2, parcel.readLong());
                break;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                a D3 = a.AbstractBinderC0099a.D3(parcel.readStrongBinder());
                int i3 = v.b;
                setUserProperty(readString3, readString4, D3, parcel.readInt() != 0, parcel.readLong());
                break;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                int i4 = v.b;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof kb) {
                        kbVar15 = (kb) queryLocalInterface2;
                    } else {
                        kbVar15 = new mb(readStrongBinder2);
                    }
                }
                getUserProperties(readString5, readString6, z, kbVar15);
                break;
            case 6:
                String readString7 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof kb) {
                        kbVar14 = (kb) queryLocalInterface3;
                    } else {
                        kbVar14 = new mb(readStrongBinder3);
                    }
                }
                getMaxUserProperties(readString7, kbVar14);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) v.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) v.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof kb) {
                        kbVar13 = (kb) queryLocalInterface4;
                    } else {
                        kbVar13 = new mb(readStrongBinder4);
                    }
                }
                getConditionalUserProperties(readString8, readString9, kbVar13);
                break;
            case 11:
                int i5 = v.b;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                setMeasurementEnabled(z, parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof kb) {
                        kbVar12 = (kb) queryLocalInterface5;
                    } else {
                        kbVar12 = new mb(readStrongBinder5);
                    }
                }
                getCurrentScreenName(kbVar12);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof kb) {
                        kbVar11 = (kb) queryLocalInterface6;
                    } else {
                        kbVar11 = new mb(readStrongBinder6);
                    }
                }
                getCurrentScreenClass(kbVar11);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof d) {
                        dVar = (d) queryLocalInterface7;
                    } else {
                        dVar = new g(readStrongBinder7);
                    }
                }
                setInstanceIdProvider(dVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof kb) {
                        kbVar10 = (kb) queryLocalInterface8;
                    } else {
                        kbVar10 = new mb(readStrongBinder8);
                    }
                }
                getCachedAppInstanceId(kbVar10);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof kb) {
                        kbVar9 = (kb) queryLocalInterface9;
                    } else {
                        kbVar9 = new mb(readStrongBinder9);
                    }
                }
                getAppInstanceId(kbVar9);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof kb) {
                        kbVar8 = (kb) queryLocalInterface10;
                    } else {
                        kbVar8 = new mb(readStrongBinder10);
                    }
                }
                getGmpAppId(kbVar8);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof kb) {
                        kbVar7 = (kb) queryLocalInterface11;
                    } else {
                        kbVar7 = new mb(readStrongBinder11);
                    }
                }
                generateEventId(kbVar7);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), (Bundle) v.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                a D32 = a.AbstractBinderC0099a.D3(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof kb) {
                        kbVar6 = (kb) queryLocalInterface12;
                    } else {
                        kbVar6 = new mb(readStrongBinder12);
                    }
                }
                onActivitySaveInstanceState(D32, kbVar6, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) v.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof kb) {
                        kbVar5 = (kb) queryLocalInterface13;
                    } else {
                        kbVar5 = new mb(readStrongBinder13);
                    }
                }
                performAction(bundle2, kbVar5, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), a.AbstractBinderC0099a.D3(parcel.readStrongBinder()), a.AbstractBinderC0099a.D3(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof c) {
                        cVar3 = (c) queryLocalInterface14;
                    } else {
                        cVar3 = new e(readStrongBinder14);
                    }
                }
                setEventInterceptor(cVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof c) {
                        cVar2 = (c) queryLocalInterface15;
                    } else {
                        cVar2 = new e(readStrongBinder15);
                    }
                }
                registerOnMeasurementEventListener(cVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof c) {
                        cVar = (c) queryLocalInterface16;
                    } else {
                        cVar = new e(readStrongBinder16);
                    }
                }
                unregisterOnMeasurementEventListener(cVar);
                break;
            case 37:
                initForTests(v.d(parcel));
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof kb) {
                        kbVar4 = (kb) queryLocalInterface17;
                    } else {
                        kbVar4 = new mb(readStrongBinder17);
                    }
                }
                getTestFlag(kbVar4, parcel.readInt());
                break;
            case 39:
                int i6 = v.b;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                setDataCollectionEnabled(z);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof kb) {
                        kbVar3 = (kb) queryLocalInterface18;
                    } else {
                        kbVar3 = new mb(readStrongBinder18);
                    }
                }
                isDataCollectionEnabled(kbVar3);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) v.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                break;
            case 44:
                setConsent((Bundle) v.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
