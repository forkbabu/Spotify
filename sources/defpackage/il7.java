package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.model.ProfileListItem;
import com.spotify.music.features.profile.model.e;
import com.spotify.music.features.profile.proto.ArtistlistResponse$Artist;
import com.spotify.music.features.profile.proto.PlaylistlistResponse$Playlist;
import com.spotify.music.features.profile.proto.ProfilelistResponse$SmallProfile;
import com.spotify.music.features.profile.proto.ProfilelistResponse$SmallProfileList;
import defpackage.ct7;
import io.reactivex.v;

/* renamed from: il7  reason: default package */
public class il7 {
    private final Context a;
    private final at7 b;

    public il7(Context context, at7 at7) {
        this.a = context;
        this.b = at7;
    }

    private String f(ct7 ct7) {
        int max = Math.max(ct7.e() ? 1 : 0, ct7.c());
        return this.a.getResources().getQuantityString(C0707R.plurals.profile_list_item_followers_count, max, Integer.valueOf(max));
    }

    private static ProfileListItem.Type g(String str) {
        int ordinal = l0.z(str).q().ordinal();
        if (ordinal == 14) {
            return ProfileListItem.Type.ARTIST;
        }
        if (ordinal != 185) {
            if (ordinal == 205) {
                return ProfileListItem.Type.PROFILE;
            }
            if (ordinal != 210) {
                je.p("Unexpected uri: ", str);
                return ProfileListItem.Type.UNKNOWN;
            }
        }
        return ProfileListItem.Type.PLAYLIST;
    }

    public ProfileListItem a(PlaylistlistResponse$Playlist playlistlistResponse$Playlist) {
        String m = playlistlistResponse$Playlist.m();
        ProfileListItem.Type g = g(m);
        String quantityString = this.a.getResources().getQuantityString(C0707R.plurals.profile_list_item_followers_count, playlistlistResponse$Playlist.h(), Integer.valueOf(playlistlistResponse$Playlist.h()));
        ProfileListItem.a a2 = ProfileListItem.a();
        a2.f(g);
        a2.g(m);
        a2.e(playlistlistResponse$Playlist.l());
        a2.d(quantityString);
        a2.c(playlistlistResponse$Playlist.i());
        a2.b(ct7.a);
        return a2.a();
    }

    public ProfileListItem b(ArtistlistResponse$Artist artistlistResponse$Artist) {
        String m = artistlistResponse$Artist.m();
        String quantityString = this.a.getResources().getQuantityString(C0707R.plurals.profile_list_item_followers_count, artistlistResponse$Artist.h(), Integer.valueOf(artistlistResponse$Artist.h()));
        ProfileListItem.a a2 = ProfileListItem.a();
        a2.f(ProfileListItem.Type.TOP_ARTIST);
        a2.g(m);
        a2.e(artistlistResponse$Artist.l());
        a2.d(quantityString);
        a2.c(artistlistResponse$Artist.i());
        a2.b(ct7.a);
        return a2.a();
    }

    public v c(e eVar) {
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        UnmodifiableListIterator<ProfileListItem> listIterator = eVar.b().listIterator();
        while (listIterator.hasNext()) {
            ProfileListItem next = listIterator.next();
            ProfileListItem.Type h = next.h();
            if (h == ProfileListItem.Type.PROFILE || h == ProfileListItem.Type.ARTIST || h == ProfileListItem.Type.TOP_ARTIST) {
                builder.mo53add((ImmutableSet.Builder) next.i());
                builder2.mo51put(next.i(), next.b());
            }
        }
        return this.b.f(builder.build(), builder2.build()).j0(new tk7(this, eVar));
    }

    public e d(ProfilelistResponse$SmallProfileList profilelistResponse$SmallProfileList) {
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (ProfilelistResponse$SmallProfile profilelistResponse$SmallProfile : profilelistResponse$SmallProfileList.h()) {
            String o = profilelistResponse$SmallProfile.o();
            ProfileListItem.Type g = g(o);
            ct7.a a2 = ct7.a();
            a2.c(profilelistResponse$SmallProfile.h());
            a2.e(profilelistResponse$SmallProfile.i());
            a2.d(profilelistResponse$SmallProfile.m());
            a2.b(false);
            ct7 a3 = a2.a();
            ProfileListItem.a a4 = ProfileListItem.a();
            a4.f(g);
            a4.g(o);
            a4.e(profilelistResponse$SmallProfile.n());
            a4.d(f(a3));
            a4.c(profilelistResponse$SmallProfile.l());
            a4.b(a3);
            builder.mo53add((ImmutableList.Builder) a4.a());
        }
        e.a a5 = e.a();
        a5.c(LoadingState.LOADED);
        a5.b(builder.build());
        return a5.a();
    }

    public ProfileListItem e(ImmutableMap immutableMap, ProfileListItem profileListItem) {
        Optional fromNullable = Optional.fromNullable(immutableMap.get(profileListItem.i()));
        if (!fromNullable.isPresent()) {
            return profileListItem;
        }
        String f = f((ct7) fromNullable.get());
        ProfileListItem.a g = profileListItem.g();
        g.d(f);
        g.b((ct7) fromNullable.get());
        return g.a();
    }
}
