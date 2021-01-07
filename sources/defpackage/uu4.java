package defpackage;

import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.features.creatorartist.model.Image;
import com.spotify.music.features.creatorartist.view.ArtistBiographyImageView;
import com.squareup.picasso.Picasso;

/* renamed from: uu4  reason: default package */
public class uu4 extends e<Image> {
    private final ArtistBiographyImageView C;
    private final Picasso D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public uu4(android.view.ViewGroup r3, android.content.Context r4, com.squareup.picasso.Picasso r5) {
        /*
            r2 = this;
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131624038(0x7f0e0066, float:1.8875244E38)
            r1 = 0
            android.view.View r3 = r4.inflate(r0, r3, r1)
            r2.<init>(r3)
            r4 = 2131427537(0x7f0b00d1, float:1.8476693E38)
            android.view.View r3 = r3.findViewById(r4)
            com.spotify.music.features.creatorartist.view.ArtistBiographyImageView r3 = (com.spotify.music.features.creatorartist.view.ArtistBiographyImageView) r3
            r2.C = r3
            r2.D = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu4.<init>(android.view.ViewGroup, android.content.Context, com.squareup.picasso.Picasso):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(Image image, int i) {
        this.C.a(image, this.D);
    }

    public void u0(Image image) {
        this.C.a(image, this.D);
    }
}
