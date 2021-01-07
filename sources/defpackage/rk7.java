package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.profile.model.ProfileListItem;

/* renamed from: rk7  reason: default package */
public final /* synthetic */ class rk7 implements Function {
    public final /* synthetic */ il7 a;
    public final /* synthetic */ ImmutableMap b;

    public /* synthetic */ rk7(il7 il7, ImmutableMap immutableMap) {
        this.a = il7;
        this.b = immutableMap;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return this.a.e(this.b, (ProfileListItem) obj);
    }
}
