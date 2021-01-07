package defpackage;

import com.google.common.base.Predicate;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* renamed from: je9  reason: default package */
public final /* synthetic */ class je9 implements Predicate {
    public static final /* synthetic */ je9 a = new je9();

    private /* synthetic */ je9() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((MusicItem) obj).o();
    }
}
