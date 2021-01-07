package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public abstract class DOMDeserializer<T> extends FromStringDeserializer<T> {
    private static final DocumentBuilderFactory DEFAULT_PARSER_FACTORY;
    private static final long serialVersionUID = 1;

    public static class DocumentDeserializer extends DOMDeserializer<Document> {
        private static final long serialVersionUID = 1;

        public DocumentDeserializer() {
            super(Document.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public /* bridge */ /* synthetic */ Object _deserialize(String str, DeserializationContext deserializationContext) {
            return _deserialize(str);
        }

        public Document _deserialize(String str) {
            return parse(str);
        }
    }

    public static class NodeDeserializer extends DOMDeserializer<Node> {
        private static final long serialVersionUID = 1;

        public NodeDeserializer() {
            super(Node.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public /* bridge */ /* synthetic */ Object _deserialize(String str, DeserializationContext deserializationContext) {
            return _deserialize(str);
        }

        public Node _deserialize(String str) {
            return parse(str);
        }
    }

    static {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setExpandEntityReferences(false);
        try {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Error | ParserConfigurationException unused) {
        }
        DEFAULT_PARSER_FACTORY = newInstance;
    }

    protected DOMDeserializer(Class<T> cls) {
        super(cls);
    }

    /* access modifiers changed from: protected */
    public final Document parse(String str) {
        try {
            return DEFAULT_PARSER_FACTORY.newDocumentBuilder().parse(new InputSource(new StringReader(str)));
        } catch (Exception e) {
            StringBuilder V0 = je.V0("Failed to parse JSON String as XML: ");
            V0.append(e.getMessage());
            throw new IllegalArgumentException(V0.toString(), e);
        }
    }
}
