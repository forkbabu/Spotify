package com.adjust.sdk;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

public class Logger implements ILogger {
    private static String formatErrorMessage = "Error formating log message: %s, with params: %s";
    private boolean isProductionEnvironment = false;
    private LogLevel logLevel;
    private boolean logLevelLocked = false;

    public Logger() {
        setLogLevel(LogLevel.INFO, false);
    }

    @Override // com.adjust.sdk.ILogger
    public void Assert(String str, Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 7) {
            try {
                Log.println(7, Constants.LOGTAG, Util.formatString(str, objArr));
            } catch (Exception unused) {
                Log.e(Constants.LOGTAG, Util.formatString(formatErrorMessage, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void debug(String str, Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 3) {
            try {
                Util.formatString(str, objArr);
            } catch (Exception unused) {
                Log.e(Constants.LOGTAG, Util.formatString(formatErrorMessage, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void error(String str, Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 6) {
            try {
                Log.e(Constants.LOGTAG, Util.formatString(str, objArr));
            } catch (Exception unused) {
                Log.e(Constants.LOGTAG, Util.formatString(formatErrorMessage, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void info(String str, Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 4) {
            try {
                Util.formatString(str, objArr);
            } catch (Exception unused) {
                Log.e(Constants.LOGTAG, Util.formatString(formatErrorMessage, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void lockLogLevel() {
        this.logLevelLocked = true;
    }

    @Override // com.adjust.sdk.ILogger
    public void setLogLevel(LogLevel logLevel2, boolean z) {
        if (!this.logLevelLocked) {
            this.logLevel = logLevel2;
            this.isProductionEnvironment = z;
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void setLogLevelString(String str, boolean z) {
        if (str != null) {
            try {
                setLogLevel(LogLevel.valueOf(str.toUpperCase(Locale.US)), z);
            } catch (IllegalArgumentException unused) {
                error("Malformed logLevel '%s', falling back to 'info'", str);
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void verbose(String str, Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 2) {
            try {
                Util.formatString(str, objArr);
            } catch (Exception unused) {
                Log.e(Constants.LOGTAG, Util.formatString(formatErrorMessage, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void warn(String str, Object... objArr) {
        if (!this.isProductionEnvironment && this.logLevel.androidLogLevel <= 5) {
            try {
                Util.formatString(str, objArr);
            } catch (Exception unused) {
                Log.e(Constants.LOGTAG, Util.formatString(formatErrorMessage, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // com.adjust.sdk.ILogger
    public void warnInProduction(String str, Object... objArr) {
        if (this.logLevel.androidLogLevel <= 5) {
            try {
                Util.formatString(str, objArr);
            } catch (Exception unused) {
                Log.e(Constants.LOGTAG, Util.formatString(formatErrorMessage, str, Arrays.toString(objArr)));
            }
        }
    }
}
