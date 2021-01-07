package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.allboarding.model.v1.proto.Item;
import com.spotify.allboarding.model.v1.proto.Logging;
import com.spotify.allboarding.model.v1.proto.NullableString;
import java.io.IOException;

public final class SearchItem extends GeneratedMessageLite<SearchItem, b> implements Object {
    private static final SearchItem r;
    private static volatile x<SearchItem> s;
    private int a;
    private String b = "";
    private String c = "";
    private NullableString f;
    private NullableString n;
    private Item o;
    private Logging p;
    private String q = "";

    public enum SearchItemType implements o.c {
        DEFAULT(0),
        ARTIST(1),
        SHOW(2),
        UNRECOGNIZED(-1);
        
        private final int value;

        private SearchItemType(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class b extends GeneratedMessageLite.b<SearchItem, b> implements Object {
        private b() {
            super(SearchItem.r);
        }
    }

    static {
        SearchItem searchItem = new SearchItem();
        r = searchItem;
        searchItem.makeImmutable();
    }

    private SearchItem() {
    }

    public static x<SearchItem> parser() {
        return r.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return r;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                SearchItem searchItem = (SearchItem) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = searchItem.a;
                if (i2 != 0) {
                    z = true;
                }
                this.a = hVar.m(z2, i, z, i2);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !searchItem.b.isEmpty(), searchItem.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !searchItem.c.isEmpty(), searchItem.c);
                this.f = (NullableString) hVar.i(this.f, searchItem.f);
                this.n = (NullableString) hVar.i(this.n, searchItem.n);
                this.o = (Item) hVar.i(this.o, searchItem.o);
                this.p = (Logging) hVar.i(this.p, searchItem.p);
                this.q = hVar.n(!this.q.isEmpty(), this.q, true ^ searchItem.q.isEmpty(), searchItem.q);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.u();
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 26) {
                                this.c = gVar.A();
                            } else if (B == 34) {
                                NullableString nullableString = this.f;
                                NullableString.b bVar = nullableString != null ? (NullableString.b) nullableString.toBuilder() : null;
                                NullableString nullableString2 = (NullableString) gVar.o(NullableString.parser(), kVar);
                                this.f = nullableString2;
                                if (bVar != null) {
                                    bVar.mergeFrom((NullableString.b) nullableString2);
                                    this.f = (NullableString) bVar.buildPartial();
                                }
                            } else if (B == 42) {
                                NullableString nullableString3 = this.n;
                                NullableString.b bVar2 = nullableString3 != null ? (NullableString.b) nullableString3.toBuilder() : null;
                                NullableString nullableString4 = (NullableString) gVar.o(NullableString.parser(), kVar);
                                this.n = nullableString4;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((NullableString.b) nullableString4);
                                    this.n = (NullableString) bVar2.buildPartial();
                                }
                            } else if (B == 50) {
                                Item item = this.o;
                                Item.b bVar3 = item != null ? (Item.b) item.toBuilder() : null;
                                Item item2 = (Item) gVar.o(Item.parser(), kVar);
                                this.o = item2;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((Item.b) item2);
                                    this.o = (Item) bVar3.buildPartial();
                                }
                            } else if (B == 58) {
                                Logging logging = this.p;
                                Logging.b bVar4 = logging != null ? (Logging.b) logging.toBuilder() : null;
                                Logging logging2 = (Logging) gVar.o(Logging.parser(), kVar);
                                this.p = logging2;
                                if (bVar4 != null) {
                                    bVar4.mergeFrom((Logging.b) logging2);
                                    this.p = (Logging) bVar4.buildPartial();
                                }
                            } else if (B == 66) {
                                this.q = gVar.A();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z = true;
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
                return new SearchItem();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (SearchItem.class) {
                        if (s == null) {
                            s = new GeneratedMessageLite.c(r);
                        }
                    }
                }
                return s;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.a != SearchItemType.DEFAULT.getNumber()) {
            i2 = 0 + CodedOutputStream.h(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        if (this.f != null) {
            i2 += CodedOutputStream.n(4, n());
        }
        if (this.n != null) {
            i2 += CodedOutputStream.n(5, i());
        }
        if (this.o != null) {
            i2 += CodedOutputStream.n(6, h());
        }
        if (this.p != null) {
            i2 += CodedOutputStream.n(7, l());
        }
        if (!this.q.isEmpty()) {
            i2 += CodedOutputStream.p(8, this.q);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Item h() {
        Item item = this.o;
        return item == null ? Item.i() : item;
    }

    public NullableString i() {
        NullableString nullableString = this.n;
        return nullableString == null ? NullableString.h() : nullableString;
    }

    public Logging l() {
        Logging logging = this.p;
        return logging == null ? Logging.i() : logging;
    }

    public String m() {
        return this.q;
    }

    public NullableString n() {
        NullableString nullableString = this.f;
        return nullableString == null ? NullableString.h() : nullableString;
    }

    public String o() {
        return this.c;
    }

    public SearchItemType p() {
        SearchItemType searchItemType;
        int i = this.a;
        if (i == 0) {
            searchItemType = SearchItemType.DEFAULT;
        } else if (i == 1) {
            searchItemType = SearchItemType.ARTIST;
        } else if (i != 2) {
            searchItemType = null;
        } else {
            searchItemType = SearchItemType.SHOW;
        }
        return searchItemType == null ? SearchItemType.UNRECOGNIZED : searchItemType;
    }

    public String q() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != SearchItemType.DEFAULT.getNumber()) {
            codedOutputStream.K(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(3, this.c);
        }
        if (this.f != null) {
            codedOutputStream.M(4, n());
        }
        if (this.n != null) {
            codedOutputStream.M(5, i());
        }
        if (this.o != null) {
            codedOutputStream.M(6, h());
        }
        if (this.p != null) {
            codedOutputStream.M(7, l());
        }
        if (!this.q.isEmpty()) {
            codedOutputStream.P(8, this.q);
        }
    }
}
