package com.spotify.music.libs.assistedcuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.libs.assistedcuration.a;

public abstract class b implements Parcelable {
    public static final b a = ((a.b) a()).build();
    public static final Parcelable.Creator<b> b = new a();

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return e.CREATOR.createFromParcel(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return e.CREATOR.newArray(i);
        }
    }

    /* renamed from: com.spotify.music.libs.assistedcuration.b$b  reason: collision with other inner class name */
    public interface AbstractC0281b {
        AbstractC0281b a(int i);

        AbstractC0281b b(boolean z);

        b build();

        AbstractC0281b c(SpotifyIconV2 spotifyIconV2);

        AbstractC0281b d(Optional<String> optional);

        AbstractC0281b e(int i);
    }

    public static AbstractC0281b a() {
        a.b bVar = new a.b();
        bVar.e(100);
        a.b bVar2 = bVar;
        bVar2.f(10);
        a.b bVar3 = bVar2;
        bVar3.a(3);
        a.b bVar4 = bVar3;
        bVar4.b(true);
        a.b bVar5 = bVar4;
        bVar5.c(SpotifyIconV2.PLUS_ALT);
        a.b bVar6 = bVar5;
        bVar6.d(Optional.absent());
        return bVar6;
    }

    public abstract Optional<String> b();

    public abstract boolean c();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract AbstractC0281b h();

    public abstract SpotifyIconV2 i();
}
