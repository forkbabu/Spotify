package com.spotify.music.libs.search.ondemand.editorial;

import java.io.Serializable;

public abstract class EditorialOnDemandInfo implements Serializable {
    private static final long serialVersionUID = -6869574732011201431L;

    public static EditorialOnDemandInfo a(String str, String str2) {
        return new AutoValue_EditorialOnDemandInfo(str, str2);
    }

    public abstract String b();

    public abstract String c();
}
