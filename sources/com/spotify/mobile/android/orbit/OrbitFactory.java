package com.spotify.mobile.android.orbit;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.spotify.core.orbit.ConnectivityCreateOptions;
import com.spotify.core.orbit.CoreCreateOptions;
import com.spotify.core.orbit.MobileDeviceInfo;
import com.spotify.core.orbit.OrbitService;
import com.spotify.core.orbit.OrbitServiceInterface;
import com.spotify.http.clienttoken.c;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.r;
import com.spotify.mobile.android.util.v;

public class OrbitFactory {
    private static boolean sNativeLoaded;
    private final c mClientTokenPersistentStorage;
    private final com.spotify.http.contentaccesstoken.c mContentAccessRefreshTokenPersistentStorage;
    private final v mDeviceId;
    private final DeviceInfo mDeviceInfo;
    private final DeviceType mLocalDeviceType;
    private final OrbitLibraryLoader mOrbitLibraryLoader;

    public OrbitFactory(OrbitLibraryLoader orbitLibraryLoader, DeviceInfo deviceInfo, v vVar, r rVar, c cVar, com.spotify.http.contentaccesstoken.c cVar2) {
        this.mOrbitLibraryLoader = orbitLibraryLoader;
        this.mDeviceInfo = deviceInfo;
        this.mDeviceId = vVar;
        this.mLocalDeviceType = rVar.a();
        this.mClientTokenPersistentStorage = cVar;
        this.mContentAccessRefreshTokenPersistentStorage = cVar2;
    }

    private void initOrbit(Context context) {
        if (!sNativeLoaded) {
            this.mOrbitLibraryLoader.waitForLibraryLoaded();
            sNativeLoaded = true;
            MobileDeviceInfo mobileDeviceInfo = new MobileDeviceInfo();
            mobileDeviceInfo.osVersion = Build.VERSION.RELEASE;
            int i = Build.VERSION.SDK_INT;
            mobileDeviceInfo.apiLevel = i;
            mobileDeviceInfo.name = this.mDeviceInfo.getName();
            mobileDeviceInfo.model = Build.MODEL;
            mobileDeviceInfo.brand = Build.BRAND;
            mobileDeviceInfo.manufacturer = Build.MANUFACTURER;
            mobileDeviceInfo.deviceType = this.mLocalDeviceType.ordinal();
            mobileDeviceInfo.volumeSteps = this.mDeviceInfo.getVolumeSteps();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                mobileDeviceInfo.screenWidth = displayMetrics.widthPixels;
                mobileDeviceInfo.screenHeight = displayMetrics.heightPixels;
                mobileDeviceInfo.smallestScreenWidthDp = context.getResources().getConfiguration().smallestScreenWidthDp;
                mobileDeviceInfo.screenDensityCurrent = displayMetrics.densityDpi;
            } else {
                mobileDeviceInfo.screenWidth = 0;
                mobileDeviceInfo.screenHeight = 0;
                mobileDeviceInfo.smallestScreenWidthDp = 0;
                mobileDeviceInfo.screenDensityCurrent = 0;
            }
            if (i >= 24) {
                mobileDeviceInfo.screenDensityStable = DisplayMetrics.DENSITY_DEVICE_STABLE;
            }
            OrbitService.setMobileDeviceInfoV2(mobileDeviceInfo);
            OrbitService.setClassLoader(OrbitService.class.getClassLoader());
        }
    }

    public OrbitServiceInterface createService(Context context, int i, String str, String str2, String str3) {
        initOrbit(context);
        String b = this.mDeviceId.b();
        CoreCreateOptions coreCreateOptions = new CoreCreateOptions();
        coreCreateOptions.versionNumber = i;
        coreCreateOptions.versionName = str;
        coreCreateOptions.versionNameShort = str2;
        coreCreateOptions.deviceId = b;
        coreCreateOptions.clientId = str3;
        coreCreateOptions.deduplicationId = gf0.f();
        coreCreateOptions.encryptedPersistedClientToken = this.mClientTokenPersistentStorage.b();
        coreCreateOptions.contentAccessRefreshToken = this.mContentAccessRefreshTokenPersistentStorage.e();
        ConnectivityCreateOptions connectivityCreateOptions = new ConnectivityCreateOptions();
        connectivityCreateOptions.versionNumber = i;
        connectivityCreateOptions.versionName = str;
        connectivityCreateOptions.versionNameShort = str2;
        connectivityCreateOptions.deviceId = b;
        connectivityCreateOptions.clientId = str3;
        connectivityCreateOptions.deduplicationId = gf0.f();
        connectivityCreateOptions.encryptedPersistedClientToken = this.mClientTokenPersistentStorage.b();
        return OrbitService.create(context, coreCreateOptions, connectivityCreateOptions);
    }
}
