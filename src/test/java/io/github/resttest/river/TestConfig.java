package io.github.resttest.river;

import io.github.resttest.test.common.AuthType;
import io.github.resttest.test.common.WebProtocol;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestConfig {

    private WebProtocol protocl = WebProtocol.HTTP;

    private String host1 = "10.128.0.1";

    private int port = 9080;

    private String apiUrlPrefix = "/api";

    private String tempPath = "/data/temp";

    private AuthType authType = AuthType.Basic;

    private String oauth2Token = "";

    private String username = "testuser";

    private String password = "(1Su7Ovjk";

    public TestConfig() {
    }

    public String baseURI() {
        boolean isDefaultPort = (WebProtocol.HTTP.equals(protocl) && port == 80) ||
                (WebProtocol.HTTPS.equals(protocl) && port == 443);
        if (isDefaultPort) {
            return protocl.getValue() + host1 + apiUrlPrefix;
        }
        return protocl.getValue() + host1 + ":" + port + apiUrlPrefix;
    }
}
