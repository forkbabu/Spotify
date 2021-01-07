package com.spotify.mobius.rx2;

import com.spotify.mobius.ConnectionException;

class EffectHandlerException extends ConnectionException {
    private EffectHandlerException(Throwable th) {
        super("Error in effect handler", th);
    }

    public static EffectHandlerException a(Object obj, Throwable th) {
        EffectHandlerException effectHandlerException = new EffectHandlerException(th);
        StackTraceElement[] stackTrace = effectHandlerException.getStackTrace();
        stackTrace[0] = new StackTraceElement(obj.getClass().getName(), "apply", null, -1);
        effectHandlerException.setStackTrace(stackTrace);
        return effectHandlerException;
    }
}
