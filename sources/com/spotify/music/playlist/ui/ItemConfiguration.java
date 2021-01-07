package com.spotify.music.playlist.ui;

import com.spotify.music.playlist.ui.a0;

public abstract class ItemConfiguration {

    public enum AddedBy {
        NONE,
        FACE
    }

    public enum HeartAndBan {
        NO_HEART_OR_BAN,
        ONLY_HEART,
        HEART_AND_BAN
    }

    public enum LongClickAction {
        SHOW_CONTEXT_MENU,
        DO_NOTHING
    }

    public enum PreviewOverlay {
        NONE,
        WITH_PLAY_ICON,
        WITHOUT_PLAY_ICON
    }

    public interface a {
        a a(boolean z);

        a b(PreviewOverlay previewOverlay);

        ItemConfiguration build();

        a c(boolean z);

        a d(boolean z);

        a e(boolean z);

        a f(LongClickAction longClickAction);

        a g(boolean z);

        a h(boolean z);

        a i(boolean z);

        a j(HeartAndBan heartAndBan);

        a k(PreviewOverlay previewOverlay);

        a l(AddedBy addedBy);
    }

    public static a a() {
        a0.b bVar = new a0.b();
        bVar.e(false);
        a0.b bVar2 = bVar;
        bVar2.l(AddedBy.NONE);
        a0.b bVar3 = bVar2;
        bVar3.a(false);
        a0.b bVar4 = bVar3;
        bVar4.j(HeartAndBan.NO_HEART_OR_BAN);
        a0.b bVar5 = bVar4;
        bVar5.f(LongClickAction.DO_NOTHING);
        a0.b bVar6 = bVar5;
        bVar6.c(false);
        PreviewOverlay previewOverlay = PreviewOverlay.NONE;
        a0.b bVar7 = bVar6;
        bVar7.b(previewOverlay);
        a0.b bVar8 = bVar7;
        bVar8.k(previewOverlay);
        a0.b bVar9 = bVar8;
        bVar9.g(false);
        a0.b bVar10 = bVar9;
        bVar10.h(false);
        a0.b bVar11 = bVar10;
        bVar11.d(false);
        a0.b bVar12 = bVar11;
        bVar12.i(false);
        return bVar12;
    }

    public abstract boolean b();

    public abstract HeartAndBan c();

    public abstract boolean d();

    public abstract LongClickAction e();

    public abstract boolean f();

    public abstract AddedBy g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract PreviewOverlay k();

    public abstract PreviewOverlay l();

    public abstract a m();

    public abstract boolean n();
}
