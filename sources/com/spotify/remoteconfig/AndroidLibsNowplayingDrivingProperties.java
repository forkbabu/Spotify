package com.spotify.remoteconfig;

public abstract class AndroidLibsNowplayingDrivingProperties implements n0e {

    public enum DrivingDontLockWhenInCarView implements m0e {
        DONT_PREVENT_LOCKING("dont_prevent_locking"),
        PREVENT_LOCKING_WHEN_CHARGING("prevent_locking_when_charging"),
        ALWAYS_PREVENT_LOCKING("always_prevent_locking");
        
        final String value;

        private DrivingDontLockWhenInCarView(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract DrivingDontLockWhenInCarView a();

    public abstract boolean b();
}
