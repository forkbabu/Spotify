package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.support.annotation.NonNull;

public abstract class AssetPackState {
    static AssetPackState b(Bundle bundle, String str, u0 u0Var, w wVar) {
        int a = wVar.a(bundle.getInt(rw.b("status", str)), str);
        int i = bundle.getInt(rw.b("error_code", str));
        long j = bundle.getLong(rw.b("bytes_downloaded", str));
        long j2 = bundle.getLong(rw.b("total_bytes_to_download", str));
        double c = u0Var.c(str);
        long j3 = bundle.getLong(rw.b("pack_version", str));
        long j4 = bundle.getLong(rw.b("pack_base_version", str));
        return c(str, a, i, j, j2, c, (a != 4 || j4 == 0 || j4 == j3) ? 1 : 2);
    }

    public static AssetPackState c(@NonNull String str, int i, int i2, long j, long j2, double d, int i3) {
        return new e0(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3);
    }

    public abstract int a();

    public abstract long d();

    public abstract int e();

    public abstract String f();

    public abstract int g();

    public abstract long h();

    public abstract int i();
}
