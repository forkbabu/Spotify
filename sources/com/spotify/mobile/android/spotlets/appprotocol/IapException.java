package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.s;

public class IapException extends RuntimeException {
    public static final /* synthetic */ int a = 0;
    private static final long serialVersionUID = 0;
    public final String errorUri;
    public final Object reason;

    public IapException(Throwable th, Object obj, String str) {
        super(th);
        this.reason = obj;
        this.errorUri = str;
    }

    public static IapException a(String str, String str2) {
        return new IapException(new AppProtocol.Message(str), str2);
    }

    public static <T> s<T> b(String str) {
        return s.P(a(str, "wamp.error"));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.errorUri;
    }

    @Override // java.lang.Throwable, java.lang.Object
    public String toString() {
        return String.format("IapException{%s %s}", this.errorUri, this.reason);
    }

    public IapException(Object obj, String str) {
        this.reason = obj;
        this.errorUri = str;
    }
}
