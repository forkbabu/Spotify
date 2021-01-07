package com.fasterxml.jackson.core;

public abstract class ObjectCodec {
    protected ObjectCodec() {
    }

    public abstract <T extends TreeNode> T readTree(JsonParser jsonParser);

    public abstract <T> T readValue(JsonParser jsonParser, Class<T> cls);

    public abstract <T> T treeToValue(TreeNode treeNode, Class<T> cls);

    public abstract void writeValue(JsonGenerator jsonGenerator, Object obj);
}
