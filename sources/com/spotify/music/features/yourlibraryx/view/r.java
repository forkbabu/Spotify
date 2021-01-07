package com.spotify.music.features.yourlibraryx.view;

import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponseEntity;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryShowExtraInfo;
import com.spotify.mobius.g;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.b;
import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.music.features.yourlibraryx.view.entities.swipe.SwipeAction;
import kotlin.reflect.c;

public interface r extends g<f, YourLibraryXEvent> {
    <T extends b> boolean B(c<? extends T> cVar);

    boolean B0(YourLibraryResponseProto$YourLibraryResponseEntity yourLibraryResponseProto$YourLibraryResponseEntity);

    boolean J0(YourLibraryResponseProto$YourLibraryResponseEntity yourLibraryResponseProto$YourLibraryResponseEntity);

    LibraryItemDescription.UpdateDate S(YourLibraryResponseProto$YourLibraryShowExtraInfo yourLibraryResponseProto$YourLibraryShowExtraInfo);

    boolean X1();

    SwipeAction Y1(YourLibraryResponseProto$YourLibraryResponseEntity yourLibraryResponseProto$YourLibraryResponseEntity);
}
