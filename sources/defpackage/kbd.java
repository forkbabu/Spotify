package defpackage;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.models.Participant;

/* renamed from: kbd  reason: default package */
public final /* synthetic */ class kbd implements Predicate {
    public final /* synthetic */ ImmutableList a;

    public /* synthetic */ kbd(ImmutableList immutableList) {
        this.a = immutableList;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return !this.a.contains((Participant) obj);
    }
}
