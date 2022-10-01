package properties;

import utilities.PropertyReader;

public class endPoints {
    private static final PropertyReader propertyReader = new PropertyReader();
    private static final String host = propertyReader.getHost();
    public static final String getUserUrl = String.format("%s/api/users/2",host);
}
