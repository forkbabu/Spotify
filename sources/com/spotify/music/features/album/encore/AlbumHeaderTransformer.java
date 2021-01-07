package com.spotify.music.features.album.encore;

import com.spotify.encore.consumer.elements.playbutton.PlayState;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class AlbumHeaderTransformer implements w<b91, b91> {
    private final String a;
    private final boolean b;
    private final String c;
    private final g<PlayerState> d;
    private final CollectionStateProvider e;

    static final class a<T, R> implements l<Map<String, CollectionStateProvider.a>, Boolean> {
        final /* synthetic */ AlbumHeaderTransformer a;

        a(AlbumHeaderTransformer albumHeaderTransformer) {
            this.a = albumHeaderTransformer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(Map<String, CollectionStateProvider.a> map) {
            Map<String, CollectionStateProvider.a> map2 = map;
            h.e(map2, "state");
            if (map2.get(this.a.a) == null) {
                return Boolean.FALSE;
            }
            CollectionStateProvider.a aVar = map2.get(this.a.a);
            if (aVar != null) {
                return Boolean.valueOf(aVar.b());
            }
            return null;
        }
    }

    public AlbumHeaderTransformer(String str, boolean z, String str2, g<PlayerState> gVar, CollectionStateProvider collectionStateProvider) {
        h.e(str, "albumUri");
        h.e(str2, "contextUri");
        h.e(gVar, "playerStateFlowable");
        h.e(collectionStateProvider, "collectionStateProvider");
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = gVar;
        this.e = collectionStateProvider;
    }

    public static final PlayState c(AlbumHeaderTransformer albumHeaderTransformer) {
        if (albumHeaderTransformer.b) {
            return PlayState.PLAY_WITHOUT_SHUFFLE;
        }
        return PlayState.PLAY_WITH_SHUFFLE;
    }

    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        h.e(sVar, "viewModelObservable");
        CollectionStateProvider collectionStateProvider = this.e;
        String str = this.a;
        s<R> j0 = collectionStateProvider.b(str, str, str).j0(new a(this));
        h.d(j0, "collectionStateProvider.…InCollection else false }");
        g<PlayerState> gVar = this.d;
        s W = je.Z(gVar, gVar).W(new d(this), false, Integer.MAX_VALUE);
        h.d(W, "playerStateFlowable.toOb…          }\n            }");
        s m = s.m(sVar, j0, W, new e(new AlbumHeaderTransformer$apply$1(this)));
        h.d(m, "Observable.combineLatest…      ::combine\n        )");
        return m;
    }
}
