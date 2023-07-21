package common;

import java.io.File;
import java.net.URL;

public class ResourceFileFinder {
    public static String getResourceFilePath(String fileName) {
        ClassLoader classLoader = ResourceFileFinder.class.getClassLoader();
        URL resourceUrl = classLoader.getResource(fileName);

        if (resourceUrl != null) {
            File file = new File(resourceUrl.getFile());
            return file.getAbsolutePath();
        } else {
            System.err.println("File not found in the resource folder: " + fileName);
            return null;
        }
    }
}
