package com.google.firebase.crashlytics.internal.common;

public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    
    private final int id;

    private DeliveryMechanism(int i) {
        this.id = i;
    }

    public static DeliveryMechanism d(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int g() {
        return this.id;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return Integer.toString(this.id);
    }
}
