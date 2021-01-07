package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.yourlibrary.quickscroll.z;

/* access modifiers changed from: package-private */
/* renamed from: pg9  reason: default package */
public class pg9 implements z {
    final /* synthetic */ qg9 a;

    pg9(qg9 qg9) {
        this.a = qg9;
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.z
    public boolean h(int i) {
        boolean z;
        if (!(this.a.c) || !(this.a.f)) {
            return true;
        }
        Optional optional = (Optional) this.a.o.apply(Integer.valueOf(i));
        if (optional.isPresent()) {
            MusicItem musicItem = (MusicItem) optional.get();
            int ordinal = musicItem.type().ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                z = !musicItem.i();
            } else {
                z = ordinal == 11 ? musicItem.q() == null && musicItem.r() == null : !(ordinal == 15 || ordinal == 16 || ordinal == 20 || ordinal == 21);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.z
    public int m() {
        return this.a.n;
    }
}
