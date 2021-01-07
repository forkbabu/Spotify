package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.Keep;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.common.util.d;
import com.google.android.gms.measurement.internal.a;
import com.google.android.gms.measurement.internal.f5;
import com.google.android.gms.measurement.internal.i7;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {
    private static volatile AppMeasurement d;
    private final f5 a;
    private final i7 b;
    private final boolean c;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        /* access modifiers changed from: package-private */
        public final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                f.n(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }

        ConditionalUserProperty(Bundle bundle) {
            if (bundle != null) {
                this.mAppId = (String) f.i(bundle, "app_id", String.class, null);
                this.mOrigin = (String) f.i(bundle, "origin", String.class, null);
                this.mName = (String) f.i(bundle, "name", String.class, null);
                this.mValue = f.i(bundle, "value", Object.class, null);
                this.mTriggerEventName = (String) f.i(bundle, "trigger_event_name", String.class, null);
                this.mTriggerTimeout = ((Long) f.i(bundle, "trigger_timeout", Long.class, 0L)).longValue();
                this.mTimedOutEventName = (String) f.i(bundle, "timed_out_event_name", String.class, null);
                this.mTimedOutEventParams = (Bundle) f.i(bundle, "timed_out_event_params", Bundle.class, null);
                this.mTriggeredEventName = (String) f.i(bundle, "triggered_event_name", String.class, null);
                this.mTriggeredEventParams = (Bundle) f.i(bundle, "triggered_event_params", Bundle.class, null);
                this.mTimeToLive = ((Long) f.i(bundle, "time_to_live", Long.class, 0L)).longValue();
                this.mExpiredEventName = (String) f.i(bundle, "expired_event_name", String.class, null);
                this.mExpiredEventParams = (Bundle) f.i(bundle, "expired_event_params", Bundle.class, null);
                this.mActive = ((Boolean) f.i(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
                this.mCreationTimestamp = ((Long) f.i(bundle, "creation_timestamp", Long.class, 0L)).longValue();
                this.mTriggeredTimestamp = ((Long) f.i(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
                return;
            }
            throw new NullPointerException("null reference");
        }
    }

    private AppMeasurement(f5 f5Var) {
        if (f5Var != null) {
            this.a = f5Var;
            this.b = null;
            this.c = false;
            return;
        }
        throw new NullPointerException("null reference");
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        i7 i7Var;
        if (d == null) {
            synchronized (AppMeasurement.class) {
                if (d == null) {
                    try {
                        i7Var = (i7) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    } catch (ClassNotFoundException unused) {
                        i7Var = null;
                    }
                    if (i7Var != null) {
                        d = new AppMeasurement(i7Var);
                    } else {
                        d = new AppMeasurement(f5.a(context, new com.google.android.gms.internal.measurement.f(0, 0, true, null, null, null, null), null));
                    }
                }
            }
        }
        return d;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.c) {
            this.b.d(str);
            return;
        }
        a R = this.a.R();
        ((d) this.a.d()).getClass();
        R.z(str, SystemClock.elapsedRealtime());
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.c) {
            this.b.h(str, str2, bundle);
        } else {
            this.a.E().w0(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.a.E().b0(str, str2, str3, bundle);
        throw null;
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.c) {
            this.b.k(str);
            return;
        }
        a R = this.a.R();
        ((d) this.a.d()).getClass();
        R.D(str, SystemClock.elapsedRealtime());
    }

    @Keep
    public long generateEventId() {
        if (this.c) {
            return this.b.f();
        }
        return this.a.F().y0();
    }

    @Keep
    public String getAppInstanceId() {
        if (this.c) {
            return this.b.c();
        }
        return this.a.E().i0();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> list;
        int i;
        if (this.c) {
            list = this.b.g(str, str2);
        } else {
            list = this.a.E().B(str, str2);
        }
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle bundle : list) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.a.E().C(str, str2, str3);
        throw null;
    }

    @Keep
    public String getCurrentScreenClass() {
        if (this.c) {
            return this.b.b();
        }
        return this.a.E().l0();
    }

    @Keep
    public String getCurrentScreenName() {
        if (this.c) {
            return this.b.a();
        }
        return this.a.E().k0();
    }

    @Keep
    public String getGmpAppId() {
        if (this.c) {
            return this.b.e();
        }
        return this.a.E().m0();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.c) {
            return this.b.j(str);
        }
        this.a.E();
        g.i(str);
        return 25;
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.c) {
            return this.b.l(str, str2, z);
        }
        return this.a.E().E(str, str2, z);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.a.E().D(str, str2, str3, z);
        throw null;
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.c) {
            this.b.i(str, str2, bundle);
        } else {
            this.a.E().W(str, str2, bundle);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        if (conditionalUserProperty == null) {
            throw new NullPointerException("null reference");
        } else if (this.c) {
            this.b.m(conditionalUserProperty.a());
        } else {
            this.a.E().G(conditionalUserProperty.a());
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        if (conditionalUserProperty == null) {
            throw new NullPointerException("null reference");
        } else if (this.c) {
            throw new IllegalStateException("Unexpected call on client side");
        } else {
            this.a.E().q0(conditionalUserProperty.a());
            throw null;
        }
    }

    private AppMeasurement(i7 i7Var) {
        if (i7Var != null) {
            this.b = i7Var;
            this.a = null;
            this.c = true;
            return;
        }
        throw new NullPointerException("null reference");
    }
}
