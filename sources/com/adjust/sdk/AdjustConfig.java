package com.adjust.sdk;

import android.content.Context;
import java.util.Arrays;
import java.util.List;

public class AdjustConfig {
    public static final String AD_REVENUE_ADDAPTR = "addapptr";
    public static final String AD_REVENUE_ADINCUBE = "adincube";
    public static final String AD_REVENUE_ADMOB = "admob";
    public static final String AD_REVENUE_ADMOST = "admost";
    public static final String AD_REVENUE_ADTOAPP = "adtoapp";
    public static final String AD_REVENUE_AERSERV = "aerserv";
    public static final String AD_REVENUE_APPODEAL = "appodeal";
    public static final String AD_REVENUE_DELTADNA = "deltadna";
    public static final String AD_REVENUE_FB_NATIVE_AD = "facebook_native_ad";
    public static final String AD_REVENUE_FLURRY = "flurry";
    public static final String AD_REVENUE_FUSE_POWERED = "fusepowered";
    public static final String AD_REVENUE_FYBER = "fyber";
    public static final String AD_REVENUE_IRONSOURCE = "ironsource";
    public static final String AD_REVENUE_MILLENNIAL_MEDITATION = "millennial_mediation";
    public static final String AD_REVENUE_MOPUB = "mopub";
    public static final String AD_REVENUE_TAPDAQ = "tapdaq";
    public static final String AD_REVENUE_UNITYADS = "unityads";
    public static final String AD_REVENUE_UPSIGHT = "upsight";
    public static final String ENVIRONMENT_PRODUCTION = "production";
    public static final String ENVIRONMENT_SANDBOX = "sandbox";
    public static final String URL_STRATEGY_CHINA = "url_strategy_china";
    public static final String URL_STRATEGY_INDIA = "url_strategy_india";
    String appSecret;
    String appToken;
    String basePath;
    Context context;
    Class deepLinkComponent;
    String defaultTracker;
    Double delayStart;
    Boolean deviceKnown;
    String environment;
    boolean eventBufferingEnabled;
    String externalDeviceId;
    String gdprPath;
    ILogger logger;
    OnAttributionChangedListener onAttributionChangedListener;
    OnDeeplinkResponseListener onDeeplinkResponseListener;
    OnEventTrackingFailedListener onEventTrackingFailedListener;
    OnEventTrackingSucceededListener onEventTrackingSucceededListener;
    OnSessionTrackingFailedListener onSessionTrackingFailedListener;
    OnSessionTrackingSucceededListener onSessionTrackingSucceededListener;
    List<IRunActivityHandler> preLaunchActionsArray;
    boolean preinstallTrackingEnabled;
    String processName;
    String pushToken;
    String sdkPrefix;
    String secretId;
    boolean sendInBackground;
    Boolean startEnabled;
    boolean startOffline;
    String subscriptionPath;
    String userAgent;

    public AdjustConfig(Context context2, String str, String str2) {
        init(context2, str, str2, false);
    }

    private boolean checkAppToken(String str) {
        if (str == null) {
            this.logger.error("Missing App Token", new Object[0]);
            return false;
        } else if (str.length() == 12) {
            return true;
        } else {
            this.logger.error("Malformed App Token '%s'", str);
            return false;
        }
    }

    private boolean checkContext(Context context2) {
        if (context2 == null) {
            this.logger.error("Missing context", new Object[0]);
            return false;
        } else if (Util.checkPermission(context2, "android.permission.INTERNET")) {
            return true;
        } else {
            this.logger.error("Missing permission: INTERNET", new Object[0]);
            return false;
        }
    }

    private boolean checkEnvironment(String str) {
        if (str == null) {
            this.logger.error("Missing environment", new Object[0]);
            return false;
        } else if (str.equals(ENVIRONMENT_SANDBOX)) {
            this.logger.warnInProduction("SANDBOX: Adjust is running in Sandbox mode. Use this setting for testing. Don't forget to set the environment to `production` before publishing!", new Object[0]);
            return true;
        } else if (str.equals(ENVIRONMENT_PRODUCTION)) {
            this.logger.warnInProduction("PRODUCTION: Adjust is running in Production mode. Use this setting only for the build that you want to publish. Set the environment to `sandbox` if you want to test your app!", new Object[0]);
            return true;
        } else {
            this.logger.error("Unknown environment '%s'", str);
            return false;
        }
    }

    private void init(Context context2, String str, String str2, boolean z) {
        this.logger = AdjustFactory.getLogger();
        if (!z || !ENVIRONMENT_PRODUCTION.equals(str2)) {
            setLogLevel(LogLevel.INFO, str2);
        } else {
            setLogLevel(LogLevel.SUPRESS, str2);
        }
        if (context2 != null) {
            context2 = context2.getApplicationContext();
        }
        this.context = context2;
        this.appToken = str;
        this.environment = str2;
        this.eventBufferingEnabled = false;
        this.sendInBackground = false;
        this.preinstallTrackingEnabled = false;
    }

    public boolean isValid() {
        if (checkAppToken(this.appToken) && checkEnvironment(this.environment) && checkContext(this.context)) {
            return true;
        }
        return false;
    }

    public void setAppSecret(long j, long j2, long j3, long j4, long j5) {
        this.secretId = Util.formatString("%d", Long.valueOf(j));
        this.appSecret = Util.formatString("%d%d%d%d", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5));
    }

    public void setDeepLinkComponent(Class cls) {
        this.deepLinkComponent = cls;
    }

    public void setDefaultTracker(String str) {
        this.defaultTracker = str;
    }

    public void setDelayStart(double d) {
        this.delayStart = Double.valueOf(d);
    }

    public void setDeviceKnown(boolean z) {
        this.deviceKnown = Boolean.valueOf(z);
    }

    public void setEventBufferingEnabled(Boolean bool) {
        if (bool == null) {
            this.eventBufferingEnabled = false;
        } else {
            this.eventBufferingEnabled = bool.booleanValue();
        }
    }

    public void setExternalDeviceId(String str) {
        this.externalDeviceId = str;
    }

    public void setLogLevel(LogLevel logLevel) {
        setLogLevel(logLevel, this.environment);
    }

    public void setOnAttributionChangedListener(OnAttributionChangedListener onAttributionChangedListener2) {
        this.onAttributionChangedListener = onAttributionChangedListener2;
    }

    public void setOnDeeplinkResponseListener(OnDeeplinkResponseListener onDeeplinkResponseListener2) {
        this.onDeeplinkResponseListener = onDeeplinkResponseListener2;
    }

    public void setOnEventTrackingFailedListener(OnEventTrackingFailedListener onEventTrackingFailedListener2) {
        this.onEventTrackingFailedListener = onEventTrackingFailedListener2;
    }

    public void setOnEventTrackingSucceededListener(OnEventTrackingSucceededListener onEventTrackingSucceededListener2) {
        this.onEventTrackingSucceededListener = onEventTrackingSucceededListener2;
    }

    public void setOnSessionTrackingFailedListener(OnSessionTrackingFailedListener onSessionTrackingFailedListener2) {
        this.onSessionTrackingFailedListener = onSessionTrackingFailedListener2;
    }

    public void setOnSessionTrackingSucceededListener(OnSessionTrackingSucceededListener onSessionTrackingSucceededListener2) {
        this.onSessionTrackingSucceededListener = onSessionTrackingSucceededListener2;
    }

    public void setPreinstallTrackingEnabled(boolean z) {
        this.preinstallTrackingEnabled = z;
    }

    public void setProcessName(String str) {
        this.processName = str;
    }

    @Deprecated
    public void setReadMobileEquipmentIdentity(boolean z) {
        this.logger.warn("This method has been deprecated and shouldn't be used anymore", new Object[0]);
    }

    public void setSdkPrefix(String str) {
        this.sdkPrefix = str;
    }

    public void setSendInBackground(boolean z) {
        this.sendInBackground = z;
    }

    public void setUrlStrategy(String str) {
        if (str == null || str.isEmpty()) {
            this.logger.error("Invalid url strategy", new Object[0]);
        } else if (str.equals(URL_STRATEGY_CHINA)) {
            AdjustFactory.setBaseUrl(Constants.BASE_URL_CN);
            AdjustFactory.setGdprUrl(Constants.GDPR_URL_CN);
            AdjustFactory.setSubscriptionUrl(Constants.SUBSCRIPTION_URL_CN);
            AdjustFactory.setFallbackBaseUrls(Arrays.asList(Constants.FALLBACK_BASE_URLS_CN));
            AdjustFactory.setFallbackGdprUrls(Arrays.asList(Constants.FALLBACK_GDPR_URLS_CN));
            AdjustFactory.setFallbackSubscriptionUrls(Arrays.asList(Constants.FALLBACK_SUBSCRIPTION_URLS_CN));
        } else if (!str.equals(URL_STRATEGY_INDIA)) {
            this.logger.warn("Unrecognised url strategy %s", str);
        } else {
            AdjustFactory.setBaseUrl(Constants.BASE_URL_IN);
            AdjustFactory.setGdprUrl(Constants.GDPR_URL_IN);
            AdjustFactory.setSubscriptionUrl(Constants.SUBSCRIPTION_URL_IN);
            AdjustFactory.setFallbackBaseUrls(Arrays.asList(Constants.FALLBACK_BASE_URLS_IN));
            AdjustFactory.setFallbackGdprUrls(Arrays.asList(Constants.FALLBACK_GDPR_URLS_IN));
            AdjustFactory.setFallbackSubscriptionUrls(Arrays.asList(Constants.FALLBACK_SUBSCRIPTION_URLS_IN));
        }
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    private void setLogLevel(LogLevel logLevel, String str) {
        this.logger.setLogLevel(logLevel, ENVIRONMENT_PRODUCTION.equals(str));
    }

    public AdjustConfig(Context context2, String str, String str2, boolean z) {
        init(context2, str, str2, z);
    }
}
