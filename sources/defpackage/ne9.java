package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.libs.assistedcuration.model.RecsResponse;
import io.reactivex.functions.l;
import java.util.Collection;

/* renamed from: ne9  reason: default package */
public final /* synthetic */ class ne9 implements l {
    public static final /* synthetic */ ne9 a = new ne9();

    private /* synthetic */ ne9() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ge9.d(ImmutableList.copyOf((Collection) ((RecsResponse) obj).getRecommendedTracks()));
    }
}
