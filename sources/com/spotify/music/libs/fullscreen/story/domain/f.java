package com.spotify.music.libs.fullscreen.story.domain;

import android.graphics.Color;
import com.spotify.music.libs.fullscreen.story.domain.OverlayModel;
import com.spotify.music.libs.fullscreen.story.domain.b;
import com.spotify.stories.v2.view.proto.Chapter;
import com.spotify.stories.v2.view.proto.ContextItem;
import com.spotify.stories.v2.view.proto.ContextMenu;
import com.spotify.stories.v2.view.proto.Overlay;
import com.spotify.stories.v2.view.proto.Story;
import com.spotify.stories.v2.view.proto.TrackChapter;
import com.spotify.stories.v2.view.rpc.proto.GetStoryViewResponse;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class f implements l<GetStoryViewResponse, p> {
    private final int a;
    private final int b;

    public f(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private final int a(String str, int i) {
        boolean z = true;
        if (str.length() == 0) {
            return i;
        }
        h.e(str, "$this$startsWith");
        if (str.length() <= 0 || !e.e(str.charAt(0), '#', false)) {
            z = false;
        }
        if (!z) {
            str = '#' + str;
        }
        return Color.parseColor(str);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public p apply(GetStoryViewResponse getStoryViewResponse) {
        String str;
        String str2;
        String str3;
        Iterator<T> it;
        OverlayModel overlayModel;
        b bVar;
        OverlayModel.ImageStyle imageStyle;
        OverlayModel.Type type;
        GetStoryViewResponse getStoryViewResponse2 = getStoryViewResponse;
        h.e(getStoryViewResponse2, "response");
        Story h = getStoryViewResponse2.h();
        h.d(h, "response.story");
        String m = h.m();
        h.d(m, "response.id");
        String p = h.p();
        String str4 = "response.title";
        h.d(p, str4);
        String o = h.o();
        String str5 = "response.subtitle";
        h.d(o, str5);
        String n = h.n();
        String str6 = "response.imageUri";
        h.d(n, str6);
        ContextMenu i = h.i();
        h.d(i, "response.contextMenu");
        List<ContextItem> i2 = i.i();
        h.d(i2, "contextMenu.itemsList");
        ArrayList arrayList = new ArrayList(d.e(i2, 10));
        for (T t : i2) {
            h.d(t, "it");
            String i3 = t.i();
            h.d(i3, "it.title");
            String l = t.l();
            h.d(l, "it.uri");
            String h2 = t.h();
            h.d(h2, "it.icon");
            arrayList.add(new d(i3, l, h2));
        }
        e eVar = new e(arrayList);
        List<Chapter> h3 = h.h();
        h.d(h3, "response.chaptersList");
        ArrayList arrayList2 = new ArrayList(d.e(h3, 10));
        Iterator<T> it2 = h3.iterator();
        while (it2.hasNext()) {
            T next = it2.next();
            if (h.a(next.i(), Overlay.l())) {
                overlayModel = null;
                it = it2;
                str3 = str4;
                str2 = str5;
                str = str6;
            } else {
                Overlay i4 = next.i();
                h.d(i4, "response.overlay");
                String q = i4.q();
                h.d(q, str4);
                String p2 = i4.p();
                h.d(p2, str5);
                it = it2;
                String o2 = i4.o();
                h.d(o2, str6);
                str3 = str4;
                Overlay.ImageStyle n2 = i4.n();
                str2 = str5;
                h.d(n2, "response.imageStyle");
                int ordinal = n2.ordinal();
                if (ordinal != 0) {
                    str = str6;
                    if (ordinal == 1) {
                        imageStyle = OverlayModel.ImageStyle.SQUARE;
                    } else if (ordinal == 2) {
                        imageStyle = OverlayModel.ImageStyle.CIRCULAR;
                    } else if (ordinal == 3) {
                        imageStyle = OverlayModel.ImageStyle.ROUNDED;
                    } else if (ordinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String h4 = i4.h();
                    h.d(h4, "response.backgroundColor");
                    int a2 = a(h4, this.b);
                    String m2 = i4.m();
                    h.d(m2, "response.entityUri");
                    String i5 = i4.i();
                    h.d(i5, "response.contextUri");
                    Overlay.Type r = i4.r();
                    h.d(r, "response.type");
                    switch (r.ordinal()) {
                        case 0:
                        case 7:
                            throw new IllegalStateException(("Invalid overlay type: " + r).toString());
                        case 1:
                            type = OverlayModel.Type.TRACK;
                            break;
                        case 2:
                            type = OverlayModel.Type.ALBUM;
                            break;
                        case 3:
                            type = OverlayModel.Type.ARTIST;
                            break;
                        case 4:
                            type = OverlayModel.Type.PLAYLIST;
                            break;
                        case 5:
                            type = OverlayModel.Type.EPISODE;
                            break;
                        case 6:
                            type = OverlayModel.Type.SHOW;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    overlayModel = new OverlayModel(q, p2, o2, imageStyle, a2, m2, i5, type, false);
                }
                throw new IllegalStateException(("Invalid overlay image style: " + n2).toString());
            }
            Chapter.ChapterTypeCase h5 = next.h();
            if (h5 != null) {
                int ordinal2 = h5.ordinal();
                if (ordinal2 == 0) {
                    TrackChapter l2 = next.l();
                    String n3 = l2.n();
                    h.d(n3, "trackUri");
                    String m3 = l2.m();
                    h.d(m3, "previewUri");
                    String l3 = l2.l();
                    h.d(l3, "imageUri");
                    String h6 = l2.h();
                    h.d(h6, "backgroundColor");
                    bVar = new b.a(n3, m3, l3, a(h6, this.a));
                } else if (ordinal2 == 1) {
                    String i6 = next.m().i();
                    h.d(i6, "sourceId");
                    bVar = new b.C0289b(i6);
                }
                arrayList2.add(new c(overlayModel, bVar));
                it2 = it;
                str4 = str3;
                str5 = str2;
                str6 = str;
            }
            throw new IllegalStateException("Invalid chapter case".toString());
        }
        return new p(m, p, o, n, eVar, arrayList2);
    }
}
