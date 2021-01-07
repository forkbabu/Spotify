package com.fasterxml.jackson.core;

import java.io.IOException;

public class JsonProcessingException extends IOException {
    static final long serialVersionUID = 123;
    protected JsonLocation _location;

    protected JsonProcessingException(String str, JsonLocation jsonLocation) {
        super(str);
        this._location = jsonLocation;
    }

    public JsonLocation getLocation() {
        return this._location;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        JsonLocation jsonLocation = this._location;
        String messageSuffix = getMessageSuffix();
        if (jsonLocation == null && messageSuffix == null) {
            return message;
        }
        StringBuilder T0 = je.T0(100, message);
        if (messageSuffix != null) {
            T0.append(messageSuffix);
        }
        if (jsonLocation != null) {
            T0.append('\n');
            T0.append(" at ");
            T0.append(jsonLocation.toString());
        }
        return T0.toString();
    }

    /* access modifiers changed from: protected */
    public String getMessageSuffix() {
        return null;
    }

    public String getOriginalMessage() {
        return super.getMessage();
    }

    public Object getProcessor() {
        return null;
    }

    @Override // java.lang.Throwable, java.lang.Object
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    protected JsonProcessingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this._location = jsonLocation;
    }

    protected JsonProcessingException(String str, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this._location = null;
    }

    protected JsonProcessingException(String str) {
        super(str);
    }
}
