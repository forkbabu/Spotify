package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.allboarding.model.v1.proto.Banner;
import com.spotify.allboarding.model.v1.proto.Pill;
import com.spotify.allboarding.model.v1.proto.SquircleArtist;
import com.spotify.allboarding.model.v1.proto.SquircleArtistMore;
import com.spotify.allboarding.model.v1.proto.SquircleShow;
import com.spotify.allboarding.model.v1.proto.SquircleShowMore;
import java.io.IOException;

public final class Item extends GeneratedMessageLite<Item, b> implements Object {
    private static final Item c;
    private static volatile x<Item> f;
    private int a = 0;
    private Object b;

    public enum ItemCase implements o.c {
        SQUIRCLEARTIST(1),
        SQUIRCLEARTISTMORE(2),
        BANNER(3),
        PILL(4),
        SQUIRCLESHOW(5),
        SQUIRCLESHOWMORE(6),
        ITEM_NOT_SET(0);
        
        private final int value;

        private ItemCase(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<Item, b> implements Object {
        private b() {
            super(Item.c);
        }
    }

    static {
        Item item = new Item();
        c = item;
        item.makeImmutable();
    }

    private Item() {
    }

    public static Item i() {
        return c;
    }

    public static x<Item> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i;
        boolean z = true;
        boolean z2 = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Item item = (Item) obj2;
                switch (item.l().ordinal()) {
                    case 0:
                        if (this.a != 1) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, item.b);
                        break;
                    case 1:
                        if (this.a != 2) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, item.b);
                        break;
                    case 2:
                        if (this.a != 3) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, item.b);
                        break;
                    case 3:
                        if (this.a != 4) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, item.b);
                        break;
                    case 4:
                        if (this.a != 5) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, item.b);
                        break;
                    case 5:
                        if (this.a != 6) {
                            z = false;
                        }
                        this.b = hVar.u(z, this.b, item.b);
                        break;
                    case 6:
                        if (this.a == 0) {
                            z = false;
                        }
                        hVar.b(z);
                        break;
                }
                if (hVar == GeneratedMessageLite.g.a && (i = item.a) != 0) {
                    this.a = i;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z2) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                SquircleArtist.b bVar = this.a == 1 ? (SquircleArtist.b) ((SquircleArtist) this.b).toBuilder() : null;
                                u o = gVar.o(SquircleArtist.parser(), kVar);
                                this.b = o;
                                if (bVar != null) {
                                    bVar.mergeFrom((SquircleArtist.b) ((SquircleArtist) o));
                                    this.b = bVar.buildPartial();
                                }
                                this.a = 1;
                            } else if (B == 18) {
                                SquircleArtistMore.b bVar2 = this.a == 2 ? (SquircleArtistMore.b) ((SquircleArtistMore) this.b).toBuilder() : null;
                                u o2 = gVar.o(SquircleArtistMore.parser(), kVar);
                                this.b = o2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((SquircleArtistMore.b) ((SquircleArtistMore) o2));
                                    this.b = bVar2.buildPartial();
                                }
                                this.a = 2;
                            } else if (B == 26) {
                                Banner.b bVar3 = this.a == 3 ? (Banner.b) ((Banner) this.b).toBuilder() : null;
                                u o3 = gVar.o(Banner.parser(), kVar);
                                this.b = o3;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((Banner.b) ((Banner) o3));
                                    this.b = bVar3.buildPartial();
                                }
                                this.a = 3;
                            } else if (B == 34) {
                                Pill.b bVar4 = this.a == 4 ? (Pill.b) ((Pill) this.b).toBuilder() : null;
                                u o4 = gVar.o(Pill.parser(), kVar);
                                this.b = o4;
                                if (bVar4 != null) {
                                    bVar4.mergeFrom((Pill.b) ((Pill) o4));
                                    this.b = bVar4.buildPartial();
                                }
                                this.a = 4;
                            } else if (B == 42) {
                                SquircleShow.b bVar5 = this.a == 5 ? (SquircleShow.b) ((SquircleShow) this.b).toBuilder() : null;
                                u o5 = gVar.o(SquircleShow.parser(), kVar);
                                this.b = o5;
                                if (bVar5 != null) {
                                    bVar5.mergeFrom((SquircleShow.b) ((SquircleShow) o5));
                                    this.b = bVar5.buildPartial();
                                }
                                this.a = 5;
                            } else if (B == 50) {
                                SquircleShowMore.b bVar6 = this.a == 6 ? (SquircleShowMore.b) ((SquircleShowMore) this.b).toBuilder() : null;
                                u o6 = gVar.o(SquircleShowMore.parser(), kVar);
                                this.b = o6;
                                if (bVar6 != null) {
                                    bVar6.mergeFrom((SquircleShowMore.b) ((SquircleShowMore) o6));
                                    this.b = bVar6.buildPartial();
                                }
                                this.a = 6;
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z2 = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d(this);
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d(this);
                        throw new RuntimeException(invalidProtocolBufferException);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new Item();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (Item.class) {
                        if (f == null) {
                            f = new GeneratedMessageLite.c(c);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return c;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.a == 1) {
            i2 = 0 + CodedOutputStream.n(1, (SquircleArtist) this.b);
        }
        if (this.a == 2) {
            i2 += CodedOutputStream.n(2, (SquircleArtistMore) this.b);
        }
        if (this.a == 3) {
            i2 += CodedOutputStream.n(3, (Banner) this.b);
        }
        if (this.a == 4) {
            i2 += CodedOutputStream.n(4, (Pill) this.b);
        }
        if (this.a == 5) {
            i2 += CodedOutputStream.n(5, (SquircleShow) this.b);
        }
        if (this.a == 6) {
            i2 += CodedOutputStream.n(6, (SquircleShowMore) this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Banner h() {
        if (this.a == 3) {
            return (Banner) this.b;
        }
        return Banner.h();
    }

    public ItemCase l() {
        switch (this.a) {
            case 0:
                return ItemCase.ITEM_NOT_SET;
            case 1:
                return ItemCase.SQUIRCLEARTIST;
            case 2:
                return ItemCase.SQUIRCLEARTISTMORE;
            case 3:
                return ItemCase.BANNER;
            case 4:
                return ItemCase.PILL;
            case 5:
                return ItemCase.SQUIRCLESHOW;
            case 6:
                return ItemCase.SQUIRCLESHOWMORE;
            default:
                return null;
        }
    }

    public SquircleArtist m() {
        if (this.a == 1) {
            return (SquircleArtist) this.b;
        }
        return SquircleArtist.h();
    }

    public SquircleArtistMore n() {
        if (this.a == 2) {
            return (SquircleArtistMore) this.b;
        }
        return SquircleArtistMore.i();
    }

    public SquircleShow o() {
        if (this.a == 5) {
            return (SquircleShow) this.b;
        }
        return SquircleShow.h();
    }

    public SquircleShowMore p() {
        if (this.a == 6) {
            return (SquircleShowMore) this.b;
        }
        return SquircleShowMore.i();
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a == 1) {
            codedOutputStream.M(1, (SquircleArtist) this.b);
        }
        if (this.a == 2) {
            codedOutputStream.M(2, (SquircleArtistMore) this.b);
        }
        if (this.a == 3) {
            codedOutputStream.M(3, (Banner) this.b);
        }
        if (this.a == 4) {
            codedOutputStream.M(4, (Pill) this.b);
        }
        if (this.a == 5) {
            codedOutputStream.M(5, (SquircleShow) this.b);
        }
        if (this.a == 6) {
            codedOutputStream.M(6, (SquircleShowMore) this.b);
        }
    }
}
