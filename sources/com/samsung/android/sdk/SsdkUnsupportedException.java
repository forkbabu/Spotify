package com.samsung.android.sdk;

public class SsdkUnsupportedException extends Exception {
    private String mPackageName = null;
    private int mType = 0;
    private int mVersionCode = 0;

    public SsdkUnsupportedException(String str, int i) {
        super(str);
        this.mType = i;
    }

    public int a() {
        return this.mType;
    }
}
