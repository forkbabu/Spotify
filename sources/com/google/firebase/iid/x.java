package com.google.firebase.iid;

/* access modifiers changed from: package-private */
public final class x implements w {
    private final String a;
    private final String b;

    x(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.firebase.iid.w
    public final String getId() {
        return this.a;
    }

    @Override // com.google.firebase.iid.w
    public final String getToken() {
        return this.b;
    }
}
