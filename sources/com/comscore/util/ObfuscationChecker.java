package com.comscore.util;

public class ObfuscationChecker {
    private static final String a = "com.comscore.util";
    private static final String b = "ObfuscationChecker";

    public boolean isCodeObfuscated() {
        return !a.equals(getClass().getPackage().getName()) || !b.equals(getClass().getSimpleName());
    }
}
