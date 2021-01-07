package com.spotify.music.internal.parnerid;

import io.reactivex.z;

public interface PartnerUserIdEndpoint {

    public enum Vendor {
        CRASHLYTICS("crashlytics"),
        ITERABLE("iterable"),
        BRANCH("branch"),
        ONETRUST("onetrust");
        
        private final String mId;

        private Vendor(String str) {
            this.mId = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mId;
        }
    }

    @zqf("partner-userid/encrypted/{vendor}")
    z<String> a(@mrf("vendor") Vendor vendor);
}
