package com.spotify.android.storage;

import android.os.Build;
import android.os.StatFs;
import java.io.IOException;

public class e {
    private StatFs a;

    public e() {
    }

    public long a() {
        long j;
        if (Build.VERSION.SDK_INT >= 18) {
            j = this.a.getAvailableBlocksLong();
        } else {
            j = (long) this.a.getAvailableBlocks();
        }
        return b() * j;
    }

    public long b() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.a.getBlockSizeLong();
        }
        return (long) this.a.getBlockSize();
    }

    public long c() {
        long j;
        if (Build.VERSION.SDK_INT >= 18) {
            j = this.a.getBlockCountLong();
        } else {
            j = (long) this.a.getBlockCount();
        }
        return b() * j;
    }

    public void d(String str) {
        try {
            StatFs statFs = this.a;
            if (statFs == null) {
                this.a = new StatFs(str);
            } else {
                statFs.restat(str);
            }
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    public e(String str) {
        try {
            this.a = new StatFs(str);
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }
}
