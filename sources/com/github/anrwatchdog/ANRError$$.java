package com.github.anrwatchdog;

import com.github.anrwatchdog.ANRError;
import java.io.Serializable;

/* access modifiers changed from: private */
public class ANRError$$ implements Serializable {
    private final String _name;
    private final StackTraceElement[] _stackTrace;

    /* access modifiers changed from: private */
    public class _Thread extends Throwable {
        _Thread(_Thread _thread, ANRError.a aVar) {
            super(ANRError$$.this._name, _thread);
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            setStackTrace(ANRError$$.this._stackTrace);
            return this;
        }
    }

    ANRError$$(String str, StackTraceElement[] stackTraceElementArr, ANRError.a aVar) {
        this._name = str;
        this._stackTrace = stackTraceElementArr;
    }
}
