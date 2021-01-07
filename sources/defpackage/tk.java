package defpackage;

import com.google.android.exoplayer2.util.v;

/* access modifiers changed from: package-private */
/* renamed from: tk  reason: default package */
public final class tk {
    private static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c A[Catch:{ all -> 0x01de }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.um.b a(com.google.android.exoplayer2.util.v r13) {
        /*
        // Method dump skipped, instructions count: 640
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tk.a(com.google.android.exoplayer2.util.v):um$b");
    }

    private static sn b(int i, String str, v vVar) {
        int h = vVar.h();
        if (vVar.h() == 1684108385 && h >= 22) {
            vVar.L(10);
            int D = vVar.D();
            if (D > 0) {
                String p0 = je.p0("", D);
                int D2 = vVar.D();
                if (D2 > 0) {
                    p0 = p0 + "/" + D2;
                }
                return new sn(str, null, p0);
            }
        }
        ok.a(i);
        return null;
    }

    private static sn c(int i, String str, v vVar) {
        int h = vVar.h();
        if (vVar.h() == 1684108385) {
            vVar.L(8);
            return new sn(str, null, vVar.s(h - 16));
        }
        ok.a(i);
        return null;
    }

    private static on d(int i, String str, v vVar, boolean z, boolean z2) {
        int e = e(vVar);
        if (z2) {
            e = Math.min(1, e);
        }
        if (e < 0) {
            ok.a(i);
            return null;
        } else if (z) {
            return new sn(str, null, Integer.toString(e));
        } else {
            return new ln("und", str, Integer.toString(e));
        }
    }

    private static int e(v vVar) {
        vVar.L(4);
        if (vVar.h() != 1684108385) {
            return -1;
        }
        vVar.L(8);
        return vVar.x();
    }
}
