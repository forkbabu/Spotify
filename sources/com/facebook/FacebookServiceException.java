package com.facebook;

public class FacebookServiceException extends FacebookException {
    private static final long serialVersionUID = 1;
    private final FacebookRequestError error;

    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.error = facebookRequestError;
    }

    public final FacebookRequestError a() {
        return this.error;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable, java.lang.Object
    public final String toString() {
        StringBuilder Z0 = je.Z0("{FacebookServiceException: ", "httpResponseCode: ");
        Z0.append(this.error.h());
        Z0.append(", facebookErrorCode: ");
        Z0.append(this.error.b());
        Z0.append(", facebookErrorType: ");
        Z0.append(this.error.e());
        Z0.append(", message: ");
        Z0.append(this.error.c());
        Z0.append("}");
        return Z0.toString();
    }
}
