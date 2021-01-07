package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.o;
import com.google.protobuf.x;

public final class Entity extends GeneratedMessageLite<Entity, b> implements Object {
    private static final Entity o;
    private static volatile x<Entity> p;
    private int a = 0;
    private Object b;
    private String c = "";
    private String f = "";
    private String n = "";

    public enum EntityCase implements o.c {
        ARTIST(4),
        TRACK(5),
        ALBUM(6),
        PLAYLIST(7),
        GENRE(8),
        AUDIO_SHOW(9),
        AUDIO_EPISODE(10),
        PROFILE(11),
        TOPIC(12),
        ENTITY_NOT_SET(0);
        
        private final int value;

        private EntityCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<Entity, b> implements Object {
        private b() {
            super(Entity.o);
        }
    }

    static {
        Entity entity = new Entity();
        o = entity;
        entity.makeImmutable();
    }

    private Entity() {
    }

    public static x<Entity> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f6, code lost:
        if (r0.F(r15) == false) goto L_0x01f8;
     */
    @Override // com.google.protobuf.GeneratedMessageLite
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke r17, java.lang.Object r18, java.lang.Object r19) {
        /*
        // Method dump skipped, instructions count: 928
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.searchview.proto.Entity.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.c.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.c);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.f);
        }
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.n);
        }
        if (this.a == 4) {
            i2 += CodedOutputStream.n(4, (Artist) this.b);
        }
        if (this.a == 5) {
            i2 += CodedOutputStream.n(5, (Track) this.b);
        }
        if (this.a == 6) {
            i2 += CodedOutputStream.n(6, (Album) this.b);
        }
        if (this.a == 7) {
            i2 += CodedOutputStream.n(7, (Playlist) this.b);
        }
        if (this.a == 8) {
            i2 += CodedOutputStream.n(8, (Genre) this.b);
        }
        if (this.a == 9) {
            i2 += CodedOutputStream.n(9, (AudioShow) this.b);
        }
        if (this.a == 10) {
            i2 += CodedOutputStream.n(10, (AudioEpisode) this.b);
        }
        if (this.a == 11) {
            i2 += CodedOutputStream.n(11, (Profile) this.b);
        }
        if (this.a == 12) {
            i2 += CodedOutputStream.n(12, (Topic) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Album h() {
        if (this.a == 6) {
            return (Album) this.b;
        }
        return Album.l();
    }

    public AudioEpisode i() {
        if (this.a == 10) {
            return (AudioEpisode) this.b;
        }
        return AudioEpisode.h();
    }

    public AudioShow l() {
        if (this.a == 9) {
            return (AudioShow) this.b;
        }
        return AudioShow.h();
    }

    public EntityCase m() {
        int i = this.a;
        if (i == 0) {
            return EntityCase.ENTITY_NOT_SET;
        }
        switch (i) {
            case 4:
                return EntityCase.ARTIST;
            case 5:
                return EntityCase.TRACK;
            case 6:
                return EntityCase.ALBUM;
            case 7:
                return EntityCase.PLAYLIST;
            case 8:
                return EntityCase.GENRE;
            case 9:
                return EntityCase.AUDIO_SHOW;
            case 10:
                return EntityCase.AUDIO_EPISODE;
            case 11:
                return EntityCase.PROFILE;
            case 12:
                return EntityCase.TOPIC;
            default:
                return null;
        }
    }

    public String n() {
        return this.n;
    }

    public String o() {
        return this.f;
    }

    public Topic p() {
        if (this.a == 12) {
            return (Topic) this.b;
        }
        return Topic.h();
    }

    public Track q() {
        if (this.a == 5) {
            return (Track) this.b;
        }
        return Track.h();
    }

    public String r() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.c.isEmpty()) {
            codedOutputStream.P(1, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(2, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(3, this.n);
        }
        if (this.a == 4) {
            codedOutputStream.M(4, (Artist) this.b);
        }
        if (this.a == 5) {
            codedOutputStream.M(5, (Track) this.b);
        }
        if (this.a == 6) {
            codedOutputStream.M(6, (Album) this.b);
        }
        if (this.a == 7) {
            codedOutputStream.M(7, (Playlist) this.b);
        }
        if (this.a == 8) {
            codedOutputStream.M(8, (Genre) this.b);
        }
        if (this.a == 9) {
            codedOutputStream.M(9, (AudioShow) this.b);
        }
        if (this.a == 10) {
            codedOutputStream.M(10, (AudioEpisode) this.b);
        }
        if (this.a == 11) {
            codedOutputStream.M(11, (Profile) this.b);
        }
        if (this.a == 12) {
            codedOutputStream.M(12, (Topic) this.b);
        }
    }
}
