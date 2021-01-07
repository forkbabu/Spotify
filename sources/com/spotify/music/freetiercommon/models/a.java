package com.spotify.music.freetiercommon.models;

import android.os.Parcelable;
import java.util.List;

public interface a extends Parcelable {

    /* renamed from: com.spotify.music.freetiercommon.models.a$a  reason: collision with other inner class name */
    public interface AbstractC0274a<TrackType extends a, BuilderType extends AbstractC0274a<TrackType, BuilderType>> {
        TrackType build();

        BuilderType h(boolean z);

        BuilderType i(boolean z);
    }

    AbstractC0274a<?, ?> J();

    boolean N1();

    String getImageUri();

    String getName();

    String getPreviewId();

    String getUri();

    String i2();

    boolean isExplicit();

    Boolean k0();

    boolean m1();

    List<String> x1();
}
