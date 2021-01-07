package defpackage;

import com.google.common.collect.ComparisonChain;
import com.spotify.music.sociallistening.models.Participant;
import java.util.Comparator;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: p8d  reason: default package */
public final class p8d<T> implements Comparator<Participant> {
    final /* synthetic */ String a;

    p8d(String str) {
        this.a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public int compare(Participant participant, Participant participant2) {
        Participant participant3 = participant;
        Participant participant4 = participant2;
        return ComparisonChain.start().compareTrueFirst(participant3.isHost(), participant4.isHost()).compareTrueFirst(h.a(participant3.getUsername(), this.a), h.a(participant4.getUsername(), this.a)).result();
    }
}
