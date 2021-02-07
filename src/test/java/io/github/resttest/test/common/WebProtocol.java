package io.github.resttest.test.common;

public enum WebProtocol {

    HTTP("HTTP", "http://"), HTTPS("HTTPS", "https://");

    WebProtocol(final String name, final String value) {
        this.name = name;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    String name;
    String value;
}