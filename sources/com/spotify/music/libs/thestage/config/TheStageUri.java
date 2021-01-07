package com.spotify.music.libs.thestage.config;

import android.net.Uri;
import com.google.common.base.Optional;

public enum TheStageUri {
    TEST("https://the-stage-test.appspot.com/"),
    TEST_RAC("https://stage-test-rac.appspot.com/"),
    MCD_2020_JUNE("https://mcd-the-stage.appspot.com/");
    
    private final Uri mUri;

    static {
        values();
    }

    private TheStageUri(String str) {
        this.mUri = Uri.parse(str);
    }

    public static Optional<TheStageUri> d(Uri uri) {
        String host = uri.getHost();
        if (host == null) {
            return Optional.absent();
        }
        TheStageUri[] values = values();
        for (int i = 0; i < 3; i++) {
            TheStageUri theStageUri = values[i];
            if (host.equalsIgnoreCase(theStageUri.mUri.getHost())) {
                return Optional.of(theStageUri);
            }
        }
        return Optional.absent();
    }

    public Uri g() {
        return this.mUri;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.mUri.toString();
    }
}
