package com.google.android.exoplayer2.upstream;

import com.adjust.sdk.Constants;
import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class t implements v {
    private final int a;

    public t() {
        this.a = -1;
    }

    public long a(int i, long j, IOException iOException, int i2) {
        if (!(iOException instanceof HttpDataSource.InvalidResponseCodeException)) {
            return -9223372036854775807L;
        }
        int i3 = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode;
        if (i3 == 404 || i3 == 410 || i3 == 416) {
            return 60000;
        }
        return -9223372036854775807L;
    }

    public int b(int i) {
        int i2 = this.a;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    public long c(int i, long j, IOException iOException, int i2) {
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof Loader.UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((i2 - 1) * Constants.ONE_SECOND, (int) CrashReportManager.TIME_WINDOW);
    }

    public t(int i) {
        this.a = i;
    }
}
