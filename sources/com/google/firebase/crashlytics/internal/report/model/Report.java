package com.google.firebase.crashlytics.internal.report.model;

import java.io.File;
import java.util.Map;

public interface Report {

    public enum Type {
        JAVA,
        NATIVE
    }

    Map<String, String> a();

    String b();

    String c();

    File d();

    File[] e();

    Type getType();

    void remove();
}
