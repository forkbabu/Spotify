package defpackage;

import com.spotify.android.stories.view.StoriesProgressView;

/* access modifiers changed from: package-private */
/* renamed from: lhb  reason: default package */
public final class lhb implements StoriesProgressView.a {
    final /* synthetic */ jhb a;

    lhb(jhb jhb) {
        this.a = jhb;
    }

    @Override // com.spotify.android.stories.view.StoriesProgressView.a
    public final void j(int i) {
        int i2 = i + 1;
        if (i2 == jhb.m(this.a).u()) {
            i2 = 0;
        }
        jhb.o(this.a).setCurrentItem(i2);
    }
}
