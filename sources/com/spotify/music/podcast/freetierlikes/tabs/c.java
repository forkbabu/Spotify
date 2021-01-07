package com.spotify.music.podcast.freetierlikes.tabs;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.podcast.freetierlikes.tabs.b;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

public abstract class c {

    public interface a {
    }

    public static a b() {
        b.C0325b bVar = new b.C0325b();
        bVar.e("");
        b.C0325b bVar2 = bVar;
        bVar2.d("");
        b.C0325b bVar3 = bVar2;
        bVar3.c("");
        b.C0325b bVar4 = bVar3;
        bVar4.a(ImmutableList.of());
        return bVar4;
    }

    public abstract ImmutableList<LinkType> a();

    public abstract String c();

    public abstract CharSequence d();

    public abstract String e();

    public abstract YourLibraryPageId f();

    public abstract String g();
}
