package com.facebook;

public class FacebookDialogException extends FacebookException {
    static final long serialVersionUID = 1;
    private int errorCode;
    private String failingUrl;

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.errorCode = i;
        this.failingUrl = str2;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable, java.lang.Object
    public final String toString() {
        StringBuilder Z0 = je.Z0("{FacebookDialogException: ", "errorCode: ");
        Z0.append(this.errorCode);
        Z0.append(", message: ");
        Z0.append(getMessage());
        Z0.append(", url: ");
        return je.I0(Z0, this.failingUrl, "}");
    }
}
