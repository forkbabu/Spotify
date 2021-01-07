package com.spotify.mobile.android.util.connectivity;

public enum ConnectionType {
    CONNECTION_TYPE_UNKNOWN(-1, false, false, true, "unknown"),
    CONNECTION_TYPE_NONE(0, false, false, true, "none"),
    CONNECTION_TYPE_GPRS(1, true, false, false, "gprs"),
    CONNECTION_TYPE_EDGE(2, true, false, false, "edge"),
    CONNECTION_TYPE_3G(3, true, false, false, "3g"),
    CONNECTION_TYPE_4G(4, true, false, false, "4g"),
    CONNECTION_TYPE_WLAN(5, false, true, false, "wlan"),
    CONNECTION_TYPE_ETHERNET(6, false, true, false, "ethernet"),
    CONNECTION_TYPE_COMPANION_PROXY(7, true, false, false, "companion_proxy");
    
    private final boolean mCellular;
    private final boolean mIsOffline;
    private final boolean mIsp;
    private final String mName;
    private final int mNativeConstant;

    private ConnectionType(int i, boolean z, boolean z2, boolean z3, String str) {
        this.mNativeConstant = i;
        this.mCellular = z;
        this.mIsp = z2;
        this.mIsOffline = z3;
        this.mName = str;
    }

    public int d() {
        return this.mNativeConstant;
    }

    public boolean g() {
        return this.mCellular;
    }

    public boolean h() {
        return this.mIsOffline;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.mName;
    }
}
