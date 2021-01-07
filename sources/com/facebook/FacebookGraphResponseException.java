package com.facebook;

public class FacebookGraphResponseException extends FacebookException {
    private final q graphResponse;

    public FacebookGraphResponseException(q qVar, String str) {
        super(str);
        this.graphResponse = qVar;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable, java.lang.Object
    public final String toString() {
        q qVar = this.graphResponse;
        FacebookRequestError e = qVar != null ? qVar.e() : null;
        StringBuilder V0 = je.V0("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            V0.append(message);
            V0.append(" ");
        }
        if (e != null) {
            V0.append("httpResponseCode: ");
            V0.append(e.h());
            V0.append(", facebookErrorCode: ");
            V0.append(e.b());
            V0.append(", facebookErrorType: ");
            V0.append(e.e());
            V0.append(", message: ");
            V0.append(e.c());
            V0.append("}");
        }
        return V0.toString();
    }
}
