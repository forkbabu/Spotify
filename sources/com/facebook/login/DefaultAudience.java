package com.facebook.login;

public enum DefaultAudience {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");
    
    private final String nativeProtocolAudience;

    private DefaultAudience(String str) {
        this.nativeProtocolAudience = str;
    }

    public String d() {
        return this.nativeProtocolAudience;
    }
}
