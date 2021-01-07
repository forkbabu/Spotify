package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.music.libs.assistedcuration.model.RecsTrack;
import io.reactivex.functions.l;

/* renamed from: qe9  reason: default package */
public final /* synthetic */ class qe9 implements l {
    public final /* synthetic */ m a;
    public final /* synthetic */ String b;

    public /* synthetic */ qe9(m mVar, String str) {
        this.a = mVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        m mVar = this.a;
        String str = this.b;
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        UnmodifiableListIterator listIterator = ((ImmutableList) obj).listIterator();
        while (listIterator.hasNext()) {
            builder.mo53add((ImmutableList.Builder) mVar.o((RecsTrack) listIterator.next(), str, true, false, false, true, true, true, 0));
        }
        return builder.build();
    }
}
