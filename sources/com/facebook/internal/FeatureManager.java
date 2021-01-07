package com.facebook.internal;

import android.content.SharedPreferences;
import com.facebook.internal.m;
import com.facebook.k;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.util.HashMap;
import java.util.Map;

public final class FeatureManager {
    private static final Map<Feature, String[]> a = new HashMap();

    public enum Feature {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        Monitoring(196608),
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        Share(33554432),
        Places(50331648);
        
        private final int code;

        private Feature(int i) {
            this.code = i;
        }

        static Feature d(int i) {
            Feature[] values = values();
            for (int i2 = 0; i2 < 22; i2++) {
                Feature feature = values[i2];
                if (feature.code == i) {
                    return feature;
                }
            }
            return Unknown;
        }

        public Feature g() {
            int i = this.code;
            if ((i & BitmapRenderer.ALPHA_VISIBLE) > 0) {
                return d(i & -256);
            }
            if ((65280 & i) > 0) {
                return d(i & -65536);
            }
            if ((16711680 & i) > 0) {
                return d(i & -16777216);
            }
            return d(0);
        }

        /* access modifiers changed from: package-private */
        public String h() {
            StringBuilder V0 = je.V0("FBSDKFeature");
            V0.append(toString());
            return V0.toString();
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            switch (ordinal()) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "AAM";
                case 6:
                    return "PrivacyProtection";
                case 7:
                    return "SuggestedEvents";
                case 8:
                    return "IntelligentIntegrity";
                case 9:
                    return "ModelRequest";
                case 10:
                    return "EventDeactivation";
                case 11:
                    return "Instrument";
                case 12:
                    return "CrashReport";
                case 13:
                    return "CrashShield";
                case 14:
                    return "ThreadCheck";
                case 15:
                    return "ErrorReport";
                case 16:
                    return "Monitoring";
                case 17:
                    return "LoginKit";
                case 18:
                    return "ChromeCustomTabsPrefetching";
                case 19:
                    return "IgnoreAppSwitchToLoggedOut";
                case 20:
                    return "ShareKit";
                case 21:
                    return "PlacesKit";
                default:
                    return "unknown";
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class a implements m.c {
        final /* synthetic */ b a;
        final /* synthetic */ Feature b;

        a(b bVar, Feature feature) {
            this.a = bVar;
            this.b = feature;
        }

        @Override // com.facebook.internal.m.c
        public void a() {
            this.a.a(FeatureManager.e(this.b));
        }
    }

    public interface b {
        void a(boolean z);
    }

    public static void a(Feature feature, b bVar) {
        m.h(new a(bVar, feature));
    }

    public static void b(Feature feature) {
        SharedPreferences.Editor edit = k.d().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit();
        String h = feature.h();
        boolean z = k.n;
        edit.putString(h, "7.1.0").apply();
    }

    public static Feature c(String str) {
        Map<Feature, String[]> map;
        synchronized (FeatureManager.class) {
            map = a;
            if (map.isEmpty()) {
                map.put(Feature.AAM, new String[]{"com.facebook.appevents.aam."});
                map.put(Feature.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                map.put(Feature.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                map.put(Feature.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                map.put(Feature.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                map.put(Feature.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                map.put(Feature.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                map.put(Feature.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                map.put(Feature.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
            }
        }
        for (Map.Entry<Feature, String[]> entry : map.entrySet()) {
            String[] value = entry.getValue();
            int length = value.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (str.startsWith(value[i])) {
                        return entry.getKey();
                    }
                    i++;
                }
            }
        }
        return Feature.Unknown;
    }

    private static boolean d(Feature feature) {
        boolean z;
        switch (feature.ordinal()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
                z = false;
                break;
            case 17:
            default:
                z = true;
                break;
        }
        return m.g(feature.h(), k.e(), z);
    }

    public static boolean e(Feature feature) {
        if (Feature.Unknown == feature) {
            return false;
        }
        if (Feature.Core == feature) {
            return true;
        }
        String string = k.d().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(feature.h(), null);
        if (string != null) {
            boolean z = k.n;
            if (string.equals("7.1.0")) {
                return false;
            }
        }
        Feature g = feature.g();
        if (g == feature) {
            return d(feature);
        }
        if (!e(g) || !d(feature)) {
            return false;
        }
        return true;
    }
}
