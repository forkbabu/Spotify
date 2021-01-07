package defpackage;

import com.spotify.mobile.android.util.LinkType;

@Deprecated
/* renamed from: bc4  reason: default package */
public class bc4 implements blb {
    @Override // defpackage.blb
    public void b(glb glb) {
        yb4 yb4 = yb4.a;
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.BROWSE_RELEASES, "Deprecated. This will redirect spotify:browse instead. Use spotify:genre:new-releases.", yb4);
        xkb.i(LinkType.BROWSE_NEW_RELEASES, "Deprecated. This will redirect spotify:browse instead. Use spotify:genre:new-releases.", yb4);
        xkb.i(LinkType.BROWSE_LINK, "Deprecated. This will redirect spotify:browse instead.", yb4);
        xkb.i(LinkType.BROWSE_HUBS, "Deprecated. This will redirect spotify:browse instead.", yb4);
        xkb.i(LinkType.BROWSE_IMAGESET, "Deprecated. This will redirect spotify:browse instead.", yb4);
        xkb.i(LinkType.BROWSE_TOPPODCAST, "Deprecated. This will redirect spotify:browse instead.", yb4);
    }
}
