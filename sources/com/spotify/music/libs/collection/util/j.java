package com.spotify.music.libs.collection.util;

import com.google.common.collect.ImmutableList;
import com.spotify.metadata.proto.Metadata$Album;
import com.spotify.metadata.proto.Metadata$Disc;
import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.q;
import io.reactivex.functions.l;

public final /* synthetic */ class j implements l {
    public static final /* synthetic */ j a = new j();

    private /* synthetic */ j() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (Metadata$Disc metadata$Disc : ((Metadata$Album) obj).l()) {
            for (Metadata$Track metadata$Track : metadata$Disc.h()) {
                String B = l0.I(q.c(metadata$Track.l().A())).B();
                if (B != null) {
                    builder.mo53add((ImmutableList.Builder) B);
                }
            }
        }
        return builder.build();
    }
}
